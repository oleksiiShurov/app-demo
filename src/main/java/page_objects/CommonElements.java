package page_objects;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class CommonElements {
    static String appPrefix = "";

    public WebElement getLogo() {
        return $(By.id(appPrefix + ":id/textViewTitleAltar"));
    }

    public static WebElement confirmLeave() {
        return $(By.id(appPrefix + ":id/btnPositiveButton")).shouldBe(Condition.visible);
    }
    public static WebElement logOut() {
        return $(By.id(appPrefix + ":id/imageViewBtnLogout")).shouldBe(Condition.visible);
    }

}
