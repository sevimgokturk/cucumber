package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.TC06_AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.security.Key;

public class TC06AutomationExcercisesStepDef {
    TC06_AutomationPage tc06_automationPage ;

    @Given("usr lunches the browser")
    public void usr_lunches_the_browser() {
        Driver.getDriver();
    }

    @When("user navigate to url")
    public void user_navigate_to_url() {

        Driver.getDriver().get(ConfigReader.getProperty("automation_excercise_url"));
    }

    @Then("user verify home page is visible successfully")
    public void user_verify_home_page_is_visible_successfully() {
        Assert.assertEquals("https://automationexercise.com/",Driver.getDriver().getCurrentUrl());
    }

    @When("user clicks on Contact Us button")
    public void user_clicks_on_contact_us_button() throws InterruptedException {
        Thread.sleep(2000);
        tc06_automationPage.contactUs.click();
        //WebElement contactUs = tc06_automationPage.contactUs;
        //Actions actions = new Actions(Driver.getDriver());
        //actions.click(contactUs);
        //JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());
        //jsexecutor.executeScript("arguments[0].click();", contactUs);

    }
    @And("user verify GET IN TOUCH is visible")
    public void user_verify_is_visible(String string) {
        Assert.assertTrue(tc06_automationPage.getInTouch.isDisplayed());

    }
    @And("user  enters name, email, subject and message")
    public void user_enters_name_email_subject_and_message() {
        Actions actions = new Actions(Driver.getDriver());
       WebElement boxes =  tc06_automationPage.name;
       actions.sendKeys(boxes,"sevim").
               sendKeys(Keys.TAB).
               sendKeys("svmldg@gmail.com").
               sendKeys(Keys.TAB).
               sendKeys("upload file").
               sendKeys(Keys.TAB).
               sendKeys("Hello!!").perform();
    }
    @And("user uploads file")
    public void user_uploads_file() {
        String path = "//Users/osmangok/Desktop/coordinats.docx";
        Driver.waitAndSendText(tc06_automationPage.chooseFile,path);

    }
    @And("user clicks Submit button")
    public void user_clicks_submit_button() {
        tc06_automationPage.submit.click();

    }
    @When("user clicks OK button")
    public void user_clicks_ok_button() {
        Driver.getDriver().switchTo().alert().accept();
    }
    @And("user verifies success message Success! Your details have been submitted successfully. is visible")
    public void user_verifies_success_message_success_your_details_have_been_submitted_successfully_is_visible() {
    Assert.assertTrue(tc06_automationPage.successMessage.isDisplayed());
    }
    @And("user clicks Home button and verify that landed to home page successfully")
    public void user_clicks_button_and_verify_that_landed_to_home_page_successfully(String string) {
    tc06_automationPage.homeButton.click();
        String actuelURL= Driver.getDriver().getCurrentUrl();
        String expectedURL= "https://automationexercise.com/";
        Assert.assertTrue(actuelURL.equals(expectedURL));

    }

}
