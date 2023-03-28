import org.openqa.selenium.remote.DesiredCapabilities;

public class CalTest {
    public static void main(String[] args) {

    }
    public static void openCal(){
        DesiredCapabilities cap = new DesiredCapabilities();
        //device name
        cap.setCapability("deviceName","Xiaomi");
        //udid
        cap.setCapability("udid","Xiaomi");
        //platform name
        cap.setCapability("platformName","Android");
        //platform version
        cap.setCapability("platformVersion","Xiaomi");
        //app package
        cap.setCapability("appPackage","Xiaomi");
        //app activity
        cap.setCapability("appActivity","Xiaomi");

    }
}
