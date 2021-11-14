package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.assertTrue;


public class LoginPage {
    static CommonElements commonElements = new CommonElements();


    public static WebElement getTitle() {
        return $(By.id(commonElements.appPrefix + ":id/title"));
    }

    public static WebElement getProceednButton() {
        return $(By.id(commonElements.appPrefix + ":id/btnProceed"));
    }
    public static WebElement getEmailField() {
        return $(By.id(commonElements.appPrefix + ":id/editTextEmail"));
    }
    public static WebElement getFirstName() {
        return $(By.id(commonElements.appPrefix + ":id/editTextFirstNameSignIn"));
    }
    public static WebElement getLastName() {
        return $(By.id(commonElements.appPrefix + ":id/editTextLastNameSignIn"));
    }
    public static WebElement getSetPassword() {
        return $(By.id(commonElements.appPrefix + ":id/editTextFirstPassSignIn"));
    }
    public static WebElement getSetConfPassword() {
        return $(By.id(commonElements.appPrefix + ":id/editTextSecondPassSignIn"));
    }
    public static WebElement getSignUpBtn() {
        return $(By.id(commonElements.appPrefix + ":id/btnSignUp"));
    }
    public static WebElement getLogPass() {
        return $(By.id(commonElements.appPrefix + ":id/editTextPassword"));
    }
    public static WebElement getBtnLogin() {
        return $(By.id(commonElements.appPrefix + ":id/btnLogin"));
    }


}
