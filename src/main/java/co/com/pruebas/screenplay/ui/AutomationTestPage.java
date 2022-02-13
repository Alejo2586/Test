package co.com.pruebas.screenplay.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://adkcw-wp.adkalpha.com/")
public class AutomationTestPage extends PageObject {

    public static final Target btn_lets_talk = Target.the("Lets talk").located(By.xpath("/html/body/header/div/nav/a[2]/span[1]"));
    public static final Target txt_first_name = Target.the("Lets talk").located(By.id("firstname"));
    public static final Target txt_last_name = Target.the("Lets talk").located(By.id("lastname"));
    public static final Target txt_email = Target.the("Lets talk").located(By.id("email"));
    public static final Target txt_company_name = Target.the("Company").located(By.id("company"));
    public static final Target txt_phone_number = Target.the("Phone Number").located(By.id("phone"));
    public static final Target txt_message = Target.the("Message").located(By.id("message"));
    public static final Target btn_submit = Target.the("Lets talk").located(By.xpath("/html/body/main/section/div/div/div/div[1]/form/button/span"));
    public static final Target txt_validate_message =Target.the("Message").located(By.xpath("/html/body/main/section[1]/div/div/div[2]/div/div/h2"));
    public static final Target txt_invalid_format =Target.the("Invalid format").located(By.xpath("/html/body/main/section/div/div/div/div[1]/form/div/div[3]/span"));



}