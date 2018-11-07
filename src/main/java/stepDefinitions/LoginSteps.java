package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utils.DriverFactory;

public class LoginSteps extends DriverFactory {

    @Given("^user opens ECOWeb$")
    public void user_opens() throws Throwable {
        loginPage.openWebsite();
    }

    @Then("^verifies website is opened$")
    public void verifies_website_is_opened() throws Throwable {
        loginPage.confirmWebsiteOpened();
    }


    @Given("^clicks login button$")
    public void clicks_login_button() throws Throwable {
        loginPage.clicksLoginButton();

    }

    @Given("^user inserts email$")
    public void user_inserts_email() throws Throwable {
        loginPage.insertsEmailAddress();

    }

    @Given("^user clicks next button$")
    public void user_clicks_next_button() throws Throwable {
        loginPage.clicksNextButton();
    }

    @Given("^user inserts password$")
    public void user_inserts_password() throws Throwable {
        loginPage.insertPassword();
    }

    @Given("^user clicks Sign In$")
    public void user_clicks_Sign_In() throws Throwable {
        loginPage.clickSignIn();
    }

    @Given("^user clicks StaySignedIn$")
    public void user_clicks_StaySignedIn() throws Throwable {
        loginPage.clickStaySignedInYes();
    }

    @Then("^verifies user is logged In successfully$")
    public void verifies_user_is_logged_In_successfully() throws Throwable {
        loginPage.loginVerification();
    }
}
