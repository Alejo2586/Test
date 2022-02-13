package co.com.pruebas.screenplay.stepdefinitions;

import co.com.pruebas.screenplay.questions.MensajeAutomationTest;
import co.com.pruebas.screenplay.questions.MensajeInicioSesionEsperado;
import co.com.pruebas.screenplay.tasks.*;
import co.com.pruebas.screenplay.ui.AutomationTestPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class AutomationTestStepDefinition {

    @Managed(driver="chrome")
    private WebDriver browser;
    private Actor user = Actor.named("Usuario");

    @Given("^The user is on the Main Homepage$")
    public void theUserIsOnTheMainHomepage() {
        user.wasAbleTo(HomePageAutomationTest.onContact());
    }

    @When("^The user go to lets talk$")
    public void theUserGoToLetsTalk() {
        user.wasAbleTo(AutomationTestFirstPage.theFirstPage());
    }

    @When("^the user type the \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
    public void theUserTypeTheAnd(String firstName, String lastName, String email, String companyName, String phoneNumber, String message) {
        user.wasAbleTo(AutomationTestSubmitMessage.withData(firstName,lastName,email,companyName,phoneNumber,message));
    }

    @When("^the user type the \"([^\"]*)\" \"([^\"]*)\" with an invalid \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
    public void the_user_type_the_with_an_invalid_and(String firstName, String lastName, String email, String companyName, String phoneNumber, String message) {
        // Write code here that turns the phrase above into concrete actions
        user.wasAbleTo(AutomationTestSubmitMessage.withData(firstName,lastName,email,companyName,phoneNumber,message));
    }


    @Then("^The user validates the message \"([^\"]*)\"$")
    public void the_user_validates_the_message(String validationMessage) {
        user.should(seeThat(MensajeAutomationTest.esCorrecto(),equalTo(validationMessage)));

    }

}