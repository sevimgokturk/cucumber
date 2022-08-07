package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaRegistrationPage {
    public MedunnaRegistrationPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssnBox;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firsNameBox;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastNameBox;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement userNameBox;









}
