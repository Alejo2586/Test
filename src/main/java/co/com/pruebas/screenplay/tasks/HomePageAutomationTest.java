package co.com.pruebas.screenplay.tasks;


import co.com.pruebas.screenplay.ui.AutomationPracticeRealPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class HomePageAutomationTest implements Task {

    private AutomationPracticeRealPage automationPracticeRealPage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Open.browserOn(automationPracticeRealPage));

    }
    public static HomePageAutomationTest onContact(){
        return Tasks.instrumented(HomePageAutomationTest.class);
    }
}
