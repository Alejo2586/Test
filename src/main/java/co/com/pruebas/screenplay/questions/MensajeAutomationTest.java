package co.com.pruebas.screenplay.questions;

import co.com.pruebas.screenplay.ui.AutomationTestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class MensajeAutomationTest implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return (Text.of(AutomationTestPage.txt_validate_message).viewedBy(actor).asString());
    }

    public static MensajeAutomationTest esCorrecto() {
        return new MensajeAutomationTest();
    }
}
