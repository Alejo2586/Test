package co.com.pruebas.screenplay.stepdefinitions;

import co.com.pruebas.screenplay.tasks.AdvantageCreateAccount;
import co.com.pruebas.screenplay.tasks.HomePageAdvantageDemo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class AdvantageDemoStepDefinition {

    @Managed(driver="chrome")
    private WebDriver browser;
    private Actor charles = Actor.named("Usuario");

    @Given("^The user is on the Homepage$")
    public void theUserIsOnTheHomepage() {
        charles.wasAbleTo(HomePageAdvantageDemo.onEcommerce());
    }

    @When("^the user wants to create an account with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" $")
    public void theUserWantsToCreateAnAccountWithAnd(String user, String email, String password) {
        charles.wasAbleTo(AdvantageCreateAccount.onEcommerce(user, email ,password));
    }

}