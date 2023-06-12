package App.UIKitCatalog.PageObjects;

import App.UIKitCatalog.iOSActions.IOSActions;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AlertViewsScreen extends IOSActions {

    IOSDriver driver;

    public AlertViewsScreen(IOSDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == 'Text Entry'`]")
    private WebElement textEntry;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeCell")
    private WebElement alertTextField;

    @iOSXCUITFindBy(accessibility = "OK")
    private WebElement okButton;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND value == 'Confirm / Cancel'")
    private WebElement confirmCancel;

    @iOSXCUITFindBy(iOSNsPredicate = "name BEGINSWITH[c] 'A message'")
    private WebElement textMessage;

    @iOSXCUITFindBy(iOSNsPredicate = "name BEGINSWITH[c] 'A message'")
    private WebElement confirm;

    @Step("Open Alert in Text Entry field")
    public void openAlert() {
        textEntry.click();
    }

    @Step("Enter text in alert text field")
    public void enterText(String text) {
        alertTextField.sendKeys(text);
    }

    @Step("Click OK")
    public void clickOk() {
        okButton.click();
    }

    @Step("Click confirm/cancel button")
    public void clickConfirmCancel() {
        confirmCancel.click();
    }

    @Step("Get text message")
    public String getTextMessage() {
        return textMessage.getText();
    }

    @Step("Click confirm button")
    public void clickConfirm() {
        confirm.click();
    }

}
