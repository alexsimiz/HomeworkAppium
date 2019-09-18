package configs;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CapabilitiesClass {
    public AndroidDriver getLocalDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Galaxy Note5");
        capabilities.setCapability("udid", "857553474f443656");
        capabilities.setCapability("app", "C:\\\\Users\\\\asimiz\\\\OneDrive - ENDAVA\\\\Desktop\\\\Presentation\\\\Week 9 - Appium\\\\sololearn.apk");
        capabilities.setCapability("appPackage", "com.sololearn");
        capabilities.setCapability("appActivity", "com.sololearn.app.activities.LauncherActivity");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "Appium");

        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        AndroidDriver driver = new AndroidDriver(url, capabilities);

        return driver;
    }
}
