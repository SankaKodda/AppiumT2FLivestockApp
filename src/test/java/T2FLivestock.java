import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileCommand;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class T2FLivestock {
    //    WebDriver dirver;

    static AppiumDriver driver;

    //    AndroidDriver driver;
    public static void main(String[] args) {
        try {
//            t2fSettingUp();

            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");//Phone
            cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
            cap.setCapability(MobileCapabilityType.UDID, "326f0a6e");//Phone
            //app package
            cap.setCapability("appPackage", "com.trade2farm.t2f");
            //app activity
            cap.setCapability("appActivity", "com.trade2farm.t2f.MainActivity");

            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AppiumDriver(url, cap);
            driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);

            WebElement loginLabel = driver.findElement(new MobileBy.ByAccessibilityId("Login"));
            loginLabel.click();
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

            /*driver.findElement(
                    By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
                            "android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/" +
                            "android.view.View/android.view.View/android.view.View/android.view.View/" +
                            "android.view.View/android.view.View/android.widget.EditText[1]")).clear();*/
            enterEmail();
            enterPassword();

//            driver.findElement(MobileBy.AndroidUIAutomator());
//            loginLabel.click();

        } catch (Exception e) {
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void t2fSettingUp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        //device name
//         cap.setCapability("deviceName", "sdk_gphone64");//Emulator
        cap.setCapability("deviceName", "Bike Lover");//Phone
        //udid
//        cap.setCapability("udid", "emulator-5554");//Emulator
        cap.setCapability("udid", "326f0a6e");//Phone
        //platform name
//        cap.setCapability("platformName", "Android");//Emulator
        cap.setCapability("platformName", "Android");//Phone
        //platform version
//        cap.setCapability("platformVersion", "13");//Emulator
//        cap.setCapability("platformVersion", "12");//Phone
        //app package
        cap.setCapability("appPackage", "com.trade2farm.t2f");
        //app activity
        cap.setCapability("appActivity", "com.trade2farm.t2f.MainActivity");
        cap.setCapability("automationName", "UiAutomator2");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
//        driver = new AppiumDriver<>(url, cap);
        System.out.println("Application Started.....");

    }

    public static void enterEmail() throws InterruptedException {
        WebElement emailField = driver.findElement(
                By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
                        "android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/" +
                        "android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
        Thread.sleep(2000);

        emailField.click();
        Thread.sleep(2000);
        emailField.sendKeys("rusanka123@gmail.com");
    }

    public static void enterPassword() throws InterruptedException {
        WebElement passwordField = driver.findElement(
                By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
                        "android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/" +
                        "android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));

        Thread.sleep(2000);
        passwordField.click();
        Thread.sleep(2000);
        passwordField.sendKeys("sanka075");
    }
}
