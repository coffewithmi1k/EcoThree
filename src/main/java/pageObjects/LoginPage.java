package pageObjects;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class LoginPage extends BasePage {
    public @FindBy(id = "login-button") WebElement loginButtonElement;
    public @FindBy(xpath = "//input[@type='email']") WebElement emailFieldElement;
    public @FindBy(xpath = "//input[@type='submit']") WebElement proceedToPasswordElement;
    public @FindBy(xpath = "//input[@name='passwd']") WebElement passwordElement;
    public @FindBy(xpath = "//input[@type='submit']") WebElement signInElement;
    public @FindBy(xpath = "//input[@type='submit']") WebElement staySignedInElement;
    public @FindBy(xpath = "//span[@class='username long']") WebElement loginVerificationElement;//contains ykurylo

    public LoginPage() throws IOException {
        super();
    }

//////////////////////////
    public LoginPage openWebsite() throws Throwable {
        getDriver().get("");
        return new LoginPage();
    }

    public LoginPage confirmWebsiteOpened() throws Throwable {
        Assert.assertTrue(getDriver().getTitle().contains("ECOHZ Online"));
        return new LoginPage();
    }

    public LoginPage clicksLoginButton() throws IOException, InterruptedException {
        waitAndClickElement(loginButtonElement);
        return new LoginPage();
    }
//////////////////////////////////////////
    public LoginPage insertsEmailAddress() throws Exception {
sendKeysToWebElement(emailFieldElement,"");
        return new LoginPage();
    }
    public LoginPage clicksNextButton() throws Exception {
        waitAndClickElement(proceedToPasswordElement);
        return new LoginPage();
    }
    /////////////////////////////
    public LoginPage insertPassword() throws Exception {
        sendKeysToWebElement(passwordElement,"");
        return new LoginPage();
    }
    public LoginPage clickSignIn() throws Exception {
waitAndClickElement(signInElement);        return new LoginPage();
    }

    public LoginPage clickStaySignedInYes() throws Exception {
        waitAndClickElement(staySignedInElement);
        return new LoginPage();
    }
    public LoginPage loginVerification() throws Exception {
        WaitUntilWebElementIsVisible(loginVerificationElement);
        Assert.assertTrue(getDriver().findElement(By.xpath("//span[@class='username long']")).getText().contains("ykurylo"));
        return new LoginPage();
    }
}
