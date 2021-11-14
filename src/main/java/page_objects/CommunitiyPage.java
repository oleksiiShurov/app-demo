package page_objects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static page_objects.CommonElements.appPrefix;

public class CommunitiyPage {
    public static WebElement getLeaveEventTrigger() {
        return $(By.id(appPrefix + ":id/textViewLeaveEvent")).shouldBe(Condition.visible);
    }
    public static WebElement getReturnToCommunities() {
        return $(By.id(appPrefix + ":id/imageViewChurchMeetings")).shouldBe(Condition.visible);
    }

}
