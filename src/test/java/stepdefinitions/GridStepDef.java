package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import utilities.ConfigReader;
import utilities.Driver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class GridStepDef {
   WebDriver driver;

    @Given("user is on the app_url with chrome")
    public void user_is_on_the_app_url_with_chrome() throws MalformedURLException {
        //WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver();
        driver= new RemoteWebDriver(new URL("http://192.168.1.102:4444"),new ChromeOptions());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.bluerentalcars.com/");
    }
    @Given("verify the title of the page is {string}")
    public void verify_the_title_of_the_page_is(String title) throws InterruptedException {
        String actualTitle= driver.getTitle();
        Thread.sleep(5);
        String expectedTitle= title;
        Assert.assertTrue(expectedTitle.equals(actualTitle));
    }
    @Then("close the remote driver")
    public void close_the_remote_driver() {
        driver.quit();

    }

    @Given("user is on the app_url with frifox")
    public void user_is_on_the_app_url_with_frifox() throws MalformedURLException {
        driver= new RemoteWebDriver(new URL("http://192.168.1.102:4444"),new FirefoxOptions());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://www.bluerentalcars.com/");
    }
}
