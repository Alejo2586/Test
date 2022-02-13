package co.com.pruebas.screenplay.questions;

import co.com.pruebas.screenplay.ui.AutomationTestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class MensajeInvalidEmailTest implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return (Text.of(AutomationTestPage.txt_invalid_format).viewedBy(actor).asString());
    }

    public static MensajeInvalidEmailTest esCorrecto() {
        return new MensajeInvalidEmailTest();
    }
}
