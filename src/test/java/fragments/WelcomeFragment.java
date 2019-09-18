package fragments;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class WelcomeFragment {
    AndroidDriver<MobileElement> driver;
    private MobileElement logo;
    private MobileElement signUp;
    private MobileElement loading;
    private MobileElement signIn;

    public WelcomeFragment(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public void initFirstElements() {
        logo = driver.findElement(By.id("com.sololearn:id/logo"));
        loading = driver.findElement(By.id("com.sololearn:id/loading_view_progressbar"));
    }

    public void initSecondElements() {
        signUp = driver.findElement(By.id("com.sololearn:id/register_button"));
        signIn = driver.findElement(By.id("com.sololearn:id/login_button"));
    }

    public MobileElement getLogo() {
        return logo;
    }

    public MobileElement getSignUp() {
        return signUp;
    }

    public MobileElement getLoading() {
        return loading;
    }

    public MobileElement getSignIn() {
        return signIn;
    }
}
