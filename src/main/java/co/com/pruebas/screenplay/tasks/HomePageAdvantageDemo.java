package co.com.pruebas.screenplay.tasks;


import co.com.pruebas.screenplay.ui.AdvantageDemoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class HomePageAdvantageDemo implements Task {

    private AdvantageDemoPage advantageDemoPage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Open.browserOn(advantageDemoPage));
    }

    public static HomePageAdvantageDemo onEcommerce(){ return Tasks.instrumented(HomePageAdvantageDemo.class);
    }
}
