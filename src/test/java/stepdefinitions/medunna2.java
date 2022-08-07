package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage111;
import utilities.ConfigReader;
import utilities.Driver;

public class medunna2 {
    HomePage111 homePage = new HomePage111();

    @Given("user is on the login page1")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaURL"));


    }

    @Then("user click on accountMenu")
    public void user_click_on_account_menu() {
        homePage.accountMenu.click();

    }

    @Then("user click on signinButton")
    public void user_click_on_signin_button() {
        homePage.signInButton.click();

    }
}
