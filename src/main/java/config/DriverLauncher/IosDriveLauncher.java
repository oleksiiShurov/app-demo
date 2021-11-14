package config.DriverLauncher;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class IosDriveLauncher implements WebDriverProvider {
    @Override
    public WebDriver createDriver(DesiredCapabilities capabilities) {
        capabilities.setCapability("deviceName", "iPhone Simulator");
        capabilities.setCapability("udid", "00008030-001C4CCE0E86802E");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "14.5");
        capabilities.setCapability("bundleId", "");
        capabilities.setCapability("skipUnlock", "true");
        capabilities.setCapability("noReset", "false");
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("xcodeOrgId", "4TTFAF9357");
        capabilities.setCapability("xcodeSigningId", "Apple Developer");


        try {
            return new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
