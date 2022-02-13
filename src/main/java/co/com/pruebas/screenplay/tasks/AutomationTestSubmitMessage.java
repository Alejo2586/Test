package co.com.pruebas.screenplay.tasks;


import co.com.pruebas.screenplay.ui.AutomationTestPage;
import co.com.pruebas.screenplay.ui.SmartFormularioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AutomationTestSubmitMessage implements Task {


    private AutomationTestPage automationTestPage;
    private String firstName;
    private String lastName;
    private String email;
    private String companyName;
    private String phoneNumber;
    private String message;

    public AutomationTestSubmitMessage(String firstName,String lastName,String email,String companyName,String phoneNumber,String message){
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.companyName=companyName;
        this.phoneNumber=phoneNumber;
        this.message=message;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.wasAbleTo(
                Enter.theValue(firstName).into(AutomationTestPage.txt_first_name),
                Enter.theValue(lastName).into(AutomationTestPage.txt_last_name),
                Enter.theValue(email).into(AutomationTestPage.txt_email),
                Enter.theValue(companyName).into(AutomationTestPage.txt_company_name),
                Enter.theValue(phoneNumber).into(AutomationTestPage.txt_phone_number),
                Enter.theValue(message).into(AutomationTestPage.txt_message),
                Click.on(AutomationTestPage.btn_submit)
                );
    }

    public static AutomationTestSubmitMessage withData(String firstName,String lastName,String email,String companyName,String phoneNumber,String message){
        return Tasks.instrumented(AutomationTestSubmitMessage.class,firstName,lastName,email,companyName,phoneNumber,message);
    }
}
