package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
import pages.US12And13Pages;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US12Stepdefinition {
    US12And13Pages us12And13Pages = new US12And13Pages();
    @Then("Doctor verifies that the Create or Edit an Appointment page is displayed")
    public void doctor_verifies_that_the_create_or_edit_an_appointment_page_is_displayed() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(us12And13Pages.createOrEditAnAppointementHeading.isDisplayed());
    }
    @Then("Doctor clicks on the Request A Test button.")
    public void doctor_clicks_on_the_request_a_test_button() throws InterruptedException {
        Thread.sleep(2000);
        Driver.waitAndClick(us12And13Pages.requestATestButton);
    }
    @Then("Doctor verifies that the Test Items page is displayed")
    public void doctor_verifies_that_the_test_items_page_is_displayed() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(us12And13Pages.testItemHeading.isDisplayed());
    }

    @Then("Doctor can choose the test item:Sodium")
    public void doctor_can_choose_the_test_item_sodium() throws InterruptedException {
        Thread.sleep(2000);
        us12And13Pages.sodium.click();
        Assert.assertTrue(us12And13Pages.sodium.isSelected());
    }
    @Then("Doctor can choose the test item:Hemoglobin")
    public void doctor_can_choose_the_test_item_hemoglobin() {
        us12And13Pages.hemoglobin.click();
        Assert.assertTrue(us12And13Pages.hemoglobin.isSelected());
    }
    @Then("Doctor can choose the test item:Urea")
    public void doctor_can_choose_the_test_item_urea() {
        us12And13Pages.urea.click();
        Assert.assertTrue(us12And13Pages.urea.isSelected());
    }
    @Then("Doctor can choose the test item:Albumin")
    public void doctor_can_choose_the_test_item_albumin() throws IOException {
        Actions actions = new Actions(Driver.getDriver());
        WebElement s = Driver.getDriver().findElement(By.xpath("//input[@name='36056']"));
        Driver.clickWithJS(s);
       Driver.clickWithJS(us12And13Pages.albumin);
       ReusableMethods.getScreenshot("albumin");
        Assert.assertTrue(us12And13Pages.albumin.isSelected());


    }

    @Then("Doctor clicks on save tests button")
    public void doctor_clicks_on_save_tests_button() throws InterruptedException {
            Actions actions = new Actions(Driver.getDriver());
            actions.sendKeys(Keys.PAGE_DOWN).build().perform();
            Thread.sleep(5000);
            Driver.clickWithJS(us12And13Pages.saveTestButton);
    }

    @Then("Doctor verifies A new Test  is cereated with identifier message  is displayed")
    public void doctor_verifies_a_new_test_is_cereated_with_identifier_message_is_displayed() throws InterruptedException {
        Thread.sleep(9000);
        Driver.waitForVisibility(us12And13Pages.testIsCreatedAlertMessage,10000);
        Assert.assertTrue(us12And13Pages.testIsCreatedAlertMessage.isDisplayed());
    }
    @Then("Doctor verifies Test item list can not be empty message  is displayed")
    public void doctor_verifies_test_item_list_can_not_be_empty_message_is_displayed() {
       // Driver.waitForVisibility(us12And13Pages.testIsNotCreatedAlertErrorMessage,1000);
        Assert.assertTrue(us12And13Pages.testIsNotCreatedAlertErrorMessage.isDisplayed());
    }


}
