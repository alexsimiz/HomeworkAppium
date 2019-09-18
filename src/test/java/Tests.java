import configs.BaseClass;
import fragments.*;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Tests extends BaseClass {

    @Test
    public void verifyLogoWelcomePage(){
        WelcomeFragment welcomeFragment = new WelcomeFragment(driver);
        welcomeFragment.initFirstElements();
        Assert.assertTrue(welcomeFragment.getLogo().isDisplayed());
    }

    @Test
    public void verifySignUp(){
        WelcomeFragment welcomeFragment = new WelcomeFragment(driver);
        welcomeFragment.initFirstElements();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.invisibilityOf(welcomeFragment.getLoading()));
        welcomeFragment.initSecondElements();
        welcomeFragment.getSignUp().click();

        SignUpFragment signUpFragment = new SignUpFragment(driver);
        signUpFragment.initFirstElements();
        wait.until(ExpectedConditions.visibilityOf(signUpFragment.getMailSuggestions()));
        signUpFragment.getCancelSuggestions().click();

        signUpFragment.initSecondElements();
        signUpFragment.getEmailField().sendKeys("testtester010@gmail.com");
        signUpFragment.getNameField().sendKeys("AXStest");
        signUpFragment.getPasswordField().sendKeys("asdd1233");
        signUpFragment.getSignUpButton().click();

        signUpFragment.initThirdElements();
        Assert.assertEquals(signUpFragment.getDisplayedNamed().getText(), "AXStest");

        SubscriptionFragment subscriptionFragment = new SubscriptionFragment(driver);
        subscriptionFragment.initElements();
        Assert.assertEquals("Choose your plan:", subscriptionFragment.getTitle().getText());
        Assert.assertTrue(subscriptionFragment.getSubsOptions().isDisplayed());
        subscriptionFragment.getClosePage();
    }

    @Test
    public void verifySignIn(){
        WelcomeFragment welcomeFragment = new WelcomeFragment(driver);
        welcomeFragment.initFirstElements();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.invisibilityOf(welcomeFragment.getLoading()));
        welcomeFragment.initSecondElements();
        welcomeFragment.getSignIn().click();

        SignInFragment signInFragment = new SignInFragment(driver);
        signInFragment.initFirstElements();
        wait.until(ExpectedConditions.visibilityOf(signInFragment.getMailSuggestions()));
        signInFragment.getCancelSuggestions().click();

        signInFragment.initSecondElements();
        signInFragment.getEmailField().sendKeys("testtester010@gmail.com");
        signInFragment.getPasswordField().sendKeys("asdd1233");
        signInFragment.getSignInButton().click();

        signInFragment.initThirdElements();
        Assert.assertEquals("AXStest", signInFragment.getDisplayedNamed().getText());

        HomepageFragment homepageFragment = new HomepageFragment(driver);
        homepageFragment.initElements();
        Assert.assertTrue(homepageFragment.getToolbar().isDisplayed());
    }
}
