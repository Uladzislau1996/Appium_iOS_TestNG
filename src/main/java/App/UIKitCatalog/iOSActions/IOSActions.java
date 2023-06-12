package App.UIKitCatalog.iOSActions;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.openqa.selenium.By.xpath;

public class IOSActions {

    IOSDriver driver;

    public IOSActions(IOSDriver driver) {
        this.driver = driver;
    }

    public void scrollToElement(WebElement element) {
        Map<String, Object> params = new HashMap<>();
        params.put("element", ((RemoteWebElement) element).getId());
        params.put("direction", "down");
        driver.executeScript("mobile:scroll", params);
    }

    public void LongPress(WebElement element) {
        Map<String, Object> params = new HashMap<>();
        params.put("element", ((RemoteWebElement) element).getId());
        params.put("duration", 5);
        driver.executeScript("mobile:touchAndHold", params);
    }

    public void Swipe(List<WebElement> elements) {
        driver.findElement(xpath("//XCUIElementTypeCell[1]")).click();
        for (int i = 0; i < elements.size(); i++) {
            Map<String, Object> params1 = new HashMap<>();
            params1.put("direction", "left");
            driver.executeScript("mobile:swipe", params1);
        }
    }


}
