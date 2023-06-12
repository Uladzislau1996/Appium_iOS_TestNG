package App.UIKitCatalog.PageObjects;

import App.UIKitCatalog.iOSActions.IOSActions;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MainScreen extends IOSActions {

    IOSDriver driver;
    AlertViewsScreen alertViewsScreen;

    public MainScreen(IOSDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSXCUITFindBy(accessibility = "Alert Views")
    private WebElement alertViews;

    @Step("Click on Alert Views button ")
    public AlertViewsScreen clickAlertViews() {
        alertViews.click();
        return new AlertViewsScreen(driver);
    }
}
