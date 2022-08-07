package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.MedunnaHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class medunnaStepDef {
    MedunnaHomePage medunnaHomePage= new MedunnaHomePage();

    @Given("doctor is on the login page Medunna")
    public void doctor_is_on_the_login_page_medunna() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaURL"));
    }
    @Then("doctor clicks on account menu")
    public void doctor_clicks_on_account_menu() {
        medunnaHomePage.accountMenu.click();
    }
    @Then("doctor clicks on signin")
    public void doctor_clicks_on_signin() {
        medunnaHomePage.loginItem.click();
    }
    @Then("doctor enters username")
    public void doctor_enters_username() {
        medunnaHomePage.username.sendKeys(ConfigReader.getProperty("user_doctor"));
    }
    @Then("doctor enters password")
    public void doctor_enters_password() {
        medunnaHomePage.password.sendKeys(ConfigReader.getProperty("user_password"));
    }
    @Then("doctor clicks on signin button")
    public void doctor_clicks_on_signin_button() {
        medunnaHomePage.signinButton.click();
    }
    @Then("doctor verifies that hs page is displayed")
    public void doctor_verifies_that_hs_page_is_displayed() {
        Assert.assertTrue(medunnaHomePage.doctorAccount.isDisplayed());
    }
    @Then("doctor clicks on mypage")
    public void doctor_clicks_on_mypage() {
        medunnaHomePage.myPage.click();
    }
    @Then("doctor clicks on myaccountement")
    public void doctor_clicks_on_myaccountement() {
        medunnaHomePage.myAppointement.click();
    }
    @Then("doctor verifies Appointement page is displayed")
    public void doctor_verifies_appointement_page_is_displayed() {
        Assert.assertTrue(medunnaHomePage.myAppointmentHeading.isDisplayed());

    }
    @Then("doctor clicks on Edit button")
    public void doctor_clicks_on_edit_button() {
       medunnaHomePage.editButton.click();
    }

    @Then("User verifies that the Create or Edit an Appointment page is displayed")
    public void user_verifies_that_the_create_or_edit_an_appointment_page_is_displayed() {
      Assert.assertTrue( medunnaHomePage.createOrEditAnAppointementHeading.isDisplayed());
    }

    @Then("User clicks on the Request A Test button.")
    public void user_clicks_on_the_request_a_test_button() throws InterruptedException {
        Thread.sleep(500);
        medunnaHomePage.requestATestButton.click();

    }

    @Then("User verifies that the Test Items page is displayed")
    public void user_verifies_that_the_test_items_page_is_displayed() {
        Assert.assertTrue(medunnaHomePage.testItemHeading.isDisplayed());
    }

    @Then("User can choose the test item:team87Sodium")
    public void user_can_choose_the_test_item_team87sodium() throws InterruptedException {
        WebElement sodium = medunnaHomePage.sodium;
        Actions actions = new Actions(Driver.getDriver());
        Thread.sleep(2000);
        actions.moveToElement(sodium).sendKeys(Keys.TAB).click();
        WebElement sodiumClickButton = (WebElement) actions.moveToElement(sodium).sendKeys(Keys.TAB);
        Thread.sleep(2000);
        ReusableMethods.selectCheckBox(sodiumClickButton,false);
        Assert.assertTrue(sodiumClickButton.isSelected());

        //ReusableMethods.selectCheckBox(sodium,false);
    }

    @Then("User can choose the test item:team87Potassium")
    public void user_can_choose_the_test_item_team87potassium() {


    }
    @Then("User can choose the test item:team87Hemoglobin")
    public void user_can_choose_the_test_item_team87hemoglobin() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User can choose the test item:team87Cholesterol")
    public void user_can_choose_the_test_item_team87cholesterol() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User can choose the test item:team87Urea")
    public void user_can_choose_the_test_item_team87urea() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User can choose the test item:team87TotalProtein")
    public void user_can_choose_the_test_item_team87total_protein() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User can choose the test item:team87Albumin")
    public void user_can_choose_the_test_item_team87albumin() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User can choose the test item:team87Vitamin D")
    public void user_can_choose_the_test_item_team87vitamin_d() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User can choose the test item:team87Albimo")
    public void user_can_choose_the_test_item_team87albimo() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User click on save button")
    public void user_click_on_save_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user close the browser")
    public void user_close_the_browser() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
