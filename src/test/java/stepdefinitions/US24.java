package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.US12And13Pages;
import pages.US24Page;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class US24 {
    US12And13Pages us12And13Pages = new US12And13Pages();
    US24Page us24Page= new US24Page();
    @Then("User signs in as a patient.")
    public void user_signs_in_as_a_patient() {
       us12And13Pages.accountMenu.click();
       us12And13Pages.loginItem.click();
       us12And13Pages.username.sendKeys("team87_patient");
       us12And13Pages.password.sendKeys("1234567");
       us12And13Pages.signinButton.click();

    }
    @Then("Patient clicks on My Page")
    public void patient_clicks_on_my_page() {
        us24Page.myPage.click();
    }
    @Then("Patient clicks on My Appointments")
    public void patient_clicks_on_my_appointments() {
       us24Page.myAppointments.click();
    }
    @Then("Patient clicks on one of the Show Tests")
    public void patient_clicks_on_one_of_the_show_tests() {
        us24Page.showTests.click();
    }
    @Then("Patient clicks on one of the View Results")
    public void patient_clicks_on_one_of_the_view_results() {
        us24Page.viewResults.click();
    }
    @Then("Patient verifies test results header is displayed")
    public void patient_verifies_test_results_header_is_displayed() {
        List<String> expectedHeaderList = Arrays.asList("ID", "Name", "Result", "Default Min. Value", "Default Max. Value","Test","Description","Date","");
        List<String> actualHeaderList= new ArrayList<>();
        for (WebElement w: us24Page.testHeader){
            actualHeaderList.add(w.getText());
        }
        Assert.assertEquals(expectedHeaderList,actualHeaderList);
    }
    @Then("Patient verifies all test items are displayed.")
    public void patient_verifies_all_test_items_are_displayed() {
        for (WebElement w: us24Page.testBody){
            Assert.assertTrue(w.isDisplayed());
        }
    }
    @Then("Patent  closes the browser")
    public void patent_closes_the_browser() {
        Driver.closeDriver();
    }

}
