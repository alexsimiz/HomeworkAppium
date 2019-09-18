package fragments;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class SignInFragment {
    AndroidDriver<MobileElement> driver;
    private MobileElement mailSuggestions;
    private MobileElement cancelSuggestions;
    private MobileElement emailField;
    private MobileElement passwordField;
    private MobileElement signInButton;
    private MobileElement displayedNamed;

    public SignInFragment(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public void initFirstElements(){
        mailSuggestions = driver.findElement(By.id("com.google.android.gms:id/credential_picker_layout"));
        cancelSuggestions = driver.findElement(By.id("com.google.android.gms:id/cancel"));
    }

    public void initSecondElements(){
        emailField = driver.findElement(By.id("com.sololearn:id/input_email"));
        passwordField = driver.findElement(By.id("com.sololearn:id/input_password"));
        signInButton = driver.findElement(By.id("com.sololearn:id/login_button"));
    }

    public void initThirdElements(){
        displayedNamed = driver.findElement(By.id("com.sololearn:id/user_name"));
    }

    public MobileElement getMailSuggestions() {
        return mailSuggestions;
    }

    public MobileElement getCancelSuggestions() {
        return cancelSuggestions;
    }

    public MobileElement getEmailField() {
        return emailField;
    }

    public MobileElement getPasswordField() {
        return passwordField;
    }

    public MobileElement getSignInButton() {
        return signInButton;
    }

    public MobileElement getDisplayedNamed() {
        return displayedNamed;
    }
}
