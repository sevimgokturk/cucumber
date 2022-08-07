package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage111 {
    public HomePage111(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//li[@id=\"account-menu\"]")
    public WebElement accountMenu;
    @FindBy(xpath="//a[@id=\"login-item\"]")
    public WebElement signInButton;
}
