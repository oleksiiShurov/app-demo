package helpers;

import com.codeborne.selenide.Configuration;
import config.DriverLauncher.AndroidDriverLauncher;
import page_objects.CommonElements;
import page_objects.LoginPage;
import utils.EmailGenerator;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertTrue;


public class LoginHelper {

    public LoginHelper openMainPage() {
        closeWebDriver();
        Configuration.startMaximized = false;
        Configuration.browserSize = null;
        Configuration.browser = AndroidDriverLauncher.class.getName();
        open();
        return this;
    }


    public LoginHelper setEmail(String Email) {
        LoginPage.getEmailField().sendKeys(Email);
        return this;
    }
    public LoginHelper setPassword(String Password) {
        LoginPage.getLogPass().sendKeys(Password);
        return this;
    }
    public LoginHelper btnClick() {
        LoginPage.getProceednButton().click();
        return this;
    }

    public  LoginHelper login(String Platform) {
        this.openMainPage();
        this.setEmail("test@test.com");
        this.btnClick();
        this.setPassword("test");
        LoginPage.getBtnLogin().click();
        return this;
    }
    public LoginHelper setPersonalData (String Fname, String Lname, String SetPasswd, String ConfirmPassWd){
        LoginPage.getFirstName().sendKeys(Fname);
        LoginPage.getLastName().sendKeys(Lname);
        LoginPage.getSetPassword().sendKeys(SetPasswd);
        LoginPage.getSetConfPassword().sendKeys(ConfirmPassWd);
        return this;
    }

    public  LoginHelper signUp(String Platform) {
        this.openMainPage();
        this.setEmail(EmailGenerator.getEmailString()+"@test.com");
        this.btnClick();
        this.setPersonalData("Test1","Test1","Testtest1","Testtest1");
        LoginPage.getSignUpBtn().click();

        return this;

    }
    public  LoginHelper logOut(String Platform) {
        CommonElements.logOut().click();
        CommonElements.confirmLeave().click();

        return this;

    }


}
