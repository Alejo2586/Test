package co.com.pruebas.screenplay.tasks;


import co.com.pruebas.screenplay.ui.AutomationTestPage;
import co.com.pruebas.screenplay.ui.CodigosPage;
import co.com.pruebas.screenplay.util.UtilidadTiempo;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class AutomationTestFirstPage implements Task {

    public AutomationTestFirstPage(){
            }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Click.on(AutomationTestPage.btn_lets_talk));
    }

    public static AutomationTestFirstPage theFirstPage(){
        return Tasks.instrumented(AutomationTestFirstPage.class);
    }
}
