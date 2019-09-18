package fragments;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomepageFragment {
    AndroidDriver<MobileElement> driver;
    private MobileElement toolbar;

    public HomepageFragment(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public void initElements(){
        toolbar = driver.findElement(By.id("com.sololearn:id/toolbar"));
    }

    public MobileElement getToolbar() {
        return toolbar;
    }
}
