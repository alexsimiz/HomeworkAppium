package fragments;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class SignUpFragment {
    AndroidDriver<MobileElement> driver;
    private MobileElement mailSuggestions;
    private MobileElement cancelSuggestions;
    private MobileElement emailField;
    private MobileElement nameField;
    private MobileElement passwordField;
    private MobileElement signUpButton;
    private MobileElement loading;
    private MobileElement displayedNamed;

    public SignUpFragment(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public void initFirstElements(){
        mailSuggestions = driver.findElement(By.id("com.google.android.gms:id/credential_picker_layout"));
        cancelSuggestions = driver.findElement(By.id("com.google.android.gms:id/cancel"));
    }

    public void initSecondElements(){
        emailField = driver.findElement(By.id("com.sololearn:id/input_email"));
        nameField = driver.findElement(By.id("com.sololearn:id/input_name"));
        passwordField = driver.findElement(By.id("com.sololearn:id/input_password"));
        signUpButton = driver.findElement(By.id("com.sololearn:id/register_button"));
    }

    public void initThirdElements(){
        loading = driver.findElement(By.id("com.sololearn:id/loading_view_progressbar"));
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

    public MobileElement getNameField() {
        return nameField;
    }

    public MobileElement getPasswordField() {
        return passwordField;
    }

    public MobileElement getSignUpButton() {
        return signUpButton;
    }

    public MobileElement getLoading() {
        return loading;
    }

    public MobileElement getDisplayedNamed() {
        return displayedNamed;
    }
}
