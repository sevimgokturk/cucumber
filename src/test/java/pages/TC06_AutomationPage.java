package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC06_AutomationPage {
    public TC06_AutomationPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (linkText = "Contact Us")
    public WebElement contactUs;

    @FindBy(xpath = "//h2[text()='Get In Touch']")
    public WebElement getInTouch;

    @FindBy(name = "name")
    public WebElement name;

    @FindBy(name = "upload_file")
    public WebElement chooseFile;

    @FindBy(name= "submit")
    public WebElement submit;

    @FindBy(xpath = "//div[@class='status alert alert-success']")
    public WebElement successMessage;

    @FindBy(xpath = "//a[@class=\"btn btn-success\"]")
    public WebElement homeButton;











}
