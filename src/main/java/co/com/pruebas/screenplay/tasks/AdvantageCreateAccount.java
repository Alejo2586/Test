package co.com.pruebas.screenplay.tasks;


import co.com.pruebas.screenplay.ui.AdvantageDemoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AdvantageCreateAccount implements Task {

    private AdvantageDemoPage advantageDemoPage;

    String username;
    String email;
    String password;

    public AdvantageCreateAccount(String username, String email, String password){
        this.username=username;
        this.email=email;
        this.password=password;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Click.on(advantageDemoPage.btn_register_user),
                Click.on(advantageDemoPage.create_new_account),
                Enter.theValue(username).into(advantageDemoPage.txt_user_name),
                Enter.theValue(email).into(advantageDemoPage.txt_email),
                Enter.theValue(password).into(advantageDemoPage.txt_passwword),
                Enter.theValue(password).into(advantageDemoPage.txt_confirm_passwword));

    }

    public static AdvantageCreateAccount onEcommerce(String username, String email, String password){
        return Tasks.instrumented(AdvantageCreateAccount.class,username,email,password);
    }
}
