package co.com.pruebas.screenplay.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://advantageonlineshopping.com/")
public class AdvantageDemoPage extends PageObject {

    public static final Target btn_register_user = Target.the("Registrar usuario").located(By.xpath("/html/body/header/nav/ul/li[3]/a/a/svg"));
    public static final Target create_new_account = Target.the("Registrar usuario").located(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]"));
    public static final Target txt_user_name = Target.the("Usuario").located(By.name("passwordRegisterPage"));
    public static final Target txt_email = Target.the("email").located(By.name("emailRegisterPage"));
    public static final Target txt_passwword = Target.the("email").located(By.name("passwordRegisterPage"));
    public static final Target txt_confirm_passwword = Target.the("email").located(By.name("confirm_passwordRegisterPage"));

}