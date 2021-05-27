package co.com.pruebas.screenplay.tasks;


import co.com.pruebas.screenplay.ui.AutomationPracticeRealPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class HomePageRealPage implements Task {

    private AutomationPracticeRealPage automationPracticeRealPage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Open.browserOn(automationPracticeRealPage));

    }
    public static HomePageRealPage onEcommerce(){
        return Tasks.instrumented(HomePageRealPage.class);
    }
}
