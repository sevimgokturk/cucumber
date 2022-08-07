package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US24Page {
    public US24Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[normalize-space()='MY PAGES(PATIENT)']")
    public WebElement myPage;
    @FindBy(xpath = "//span[normalize-space()='My Appointments']")
    public WebElement myAppointments;
    @FindBy(xpath = "(//span[contains(text(),'Show Tests')])[1]")
    public WebElement showTests;
    @FindBy(xpath = "(//span[contains(text(),'View Results')])[1]")
    public WebElement viewResults;
    @FindBy(xpath = "//body//div//th")
    public List<WebElement> testHeader;
    @FindBy(xpath = "//tbody")
    public List<WebElement> testBody;


}
