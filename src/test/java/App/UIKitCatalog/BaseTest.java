package App.UIKitCatalog;

import App.UIKitCatalog.PageObjects.MainScreen;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {

    public IOSDriver driver;
    public AppiumDriverLocalService service;
    public MainScreen mainScreen;

    @BeforeMethod
    public void configureAppium() throws MalformedURLException {
        //code to start appium server
        service = new AppiumServiceBuilder()
                .withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
                .withIPAddress("127.0.0.1")
                .usingPort(4723).build();
        service.start();

        //Set capabilities
        XCUITestOptions options = new XCUITestOptions();
        options.setDeviceName("iPhone 12");
        options.setApp("/Users/test/Library/Developer/Xcode/DerivedData/UIKitCatalog-ezdxdvsykkatqgcdhbavrcxlptcp/Build/Products/Debug-iphonesimulator/UIKitCatalog.app");
        options.setPlatformVersion("15.4");
        options.setWdaLaunchTimeout(Duration.ofSeconds(30));

        //Init Android driver
        driver = new IOSDriver(new URL("http://127.0.0.1:4723/"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        mainScreen = new MainScreen(driver);
    }


    //stop driver and server
    @AfterMethod
    public void tearDown() {
        driver.quit();
        service.stop();
    }


}
