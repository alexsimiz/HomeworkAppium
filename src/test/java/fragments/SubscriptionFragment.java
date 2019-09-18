package fragments;

import com.sun.org.apache.bcel.internal.generic.MONITORENTER;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class SubscriptionFragment {
    AndroidDriver<MobileElement> driver;
    private MobileElement closePage;
    private MobileElement title;
    private MobileElement subsOptions;

    public SubscriptionFragment(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public void initElements(){
        closePage = driver.findElement(By.id("com.sololearn:id/close_button"));
        title = driver.findElement(By.id("com.sololearn:id/subscriptions_title"));
        subsOptions = driver.findElement(By.id("com.sololearn:id/recycler_view"));
    }

    public MobileElement getClosePage() {
        return closePage;
    }

    public MobileElement getTitle() {
        return title;
    }

    public MobileElement getSubsOptions() {
        return subsOptions;
    }
}
