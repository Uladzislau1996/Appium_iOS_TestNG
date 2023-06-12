package App.UIKitCatalog;

import App.UIKitCatalog.PageObjects.AlertViewsScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class iOSTest extends BaseTest {

    @Test
    public void iOSBasicTest() {
        AlertViewsScreen alertViews = mainScreen.clickAlertViews();
        alertViews.openAlert();
        alertViews.enterText("Hello TestQA!");
        alertViews.clickOk();
        alertViews.clickConfirmCancel();
        String message = alertViews.getTextMessage();
        Assert.assertEquals(message, "A message should be a short, complete sentence.", "Incorrect text");
        alertViews.clickConfirm();
    }

}
