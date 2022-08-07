package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaHomePage {

    public MedunnaHomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id ="account-menu")
    public WebElement accountMenu;

    @FindBy(id="login-item")
    public WebElement loginItem;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@class=\"btn btn-primary\"]")
    public WebElement signinButton;



    @FindBy(xpath = "//span[normalize-space()='team87doctor team87doctor']")
    public WebElement doctorAccount;

    @FindBy(xpath = "//span[text()='MY PAGES']")
    public WebElement myPage;

    @FindBy(partialLinkText = "My Appointments")
    public WebElement myAppointement;




    @FindBy(id="appointment-heading")
    public WebElement myAppointmentHeading;

    @FindBy(xpath = "(//span[@class=\"d-none d-md-inline\"])[1]")
    public WebElement editButton;

    @FindBy(xpath = "//h2[@id=\"hospitalmsappfrontendApp.appointment.home.createOrEditLabel\"]")
    public WebElement createOrEditAnAppointementHeading;

    @FindBy(xpath = "//a[normalize-space()='Request A Test']")
    public WebElement requestATestButton;

    @FindBy(xpath = "//h2[@id=\"c-test-item-heading\"]")
    public WebElement testItemHeading;

    @FindBy(xpath = "//a[normalize-space()='99006']")
    public WebElement sodium;

    @FindBy(id = "99007")
    public WebElement potassium;

    @FindBy(id = "99008")
    public WebElement hemoglobin;

    @FindBy(id = "99009")
    public WebElement cholesterol;

    @FindBy(id = "99011")
    public WebElement urea;

    @FindBy(id = "99012")
    public WebElement totalProtein;

    @FindBy(id = "990013")
    public WebElement albumin;

    @FindBy(id = "99014")
    public WebElement vitaminD;

    @FindBy(id = "99015")
    public WebElement albimo;

    @FindBy(xpath = "//button[@id=\"save-entity\"]")
    public WebElement saveTestButton;

    @FindBy(xpath = "//div[@class=\"Toastify__toast-body\"]")
    public WebElement testIsCreatedAlertMessage;

    @FindBy(xpath = "//div[@class=\"Toastify__toast Toastify__toast--error toastify-toast\"]")
    public WebElement testIsNotCreatedAlertErrorMessage;





    @FindBy(xpath = "//button[@class=\"btn btn-warning btn-sm\"")
    public WebElement requestInpatientButton;

    @FindBy(xpath = "//div[@class=\"Toastify__toast-body\"]")
    public WebElement InpatientRequestDoneAlertErrorMessage;




    @FindBy (xpath = "//a[@class=\"btn btn-danger btn-sm\"]")
    public WebElement showTheTestResultButton;


    @FindBy(xpath = "//h2")
    public WebElement testsPageHeading;


    @FindBy(xpath = "//span[@class=\"d-none d-md-inline\"]")
    public WebElement viewResultButton; //==> bu bana bir tane liste verecek!! size bul==> random sec!!! Unutmaaaa





    @FindBy(xpath = "//span[normalize-space()='ID']")
    public WebElement idOfTestHeading;

    @FindBy(xpath = "//span[normalize-space()='Name']")
    public WebElement nameOfTestHeading;

    @FindBy(xpath = "//span[normalize-space()='Result']")
    public WebElement ResultOfTestHeading;

    @FindBy(xpath = "//span[normalize-space()='Default Min. Value']")
    public WebElement defaultMinValueOfTestHeading;

    @FindBy(xpath = "//span[normalize-space()='Default Max. Value']")
    public WebElement defaultMaxValueOfTestHeading;

    @FindBy(xpath = "//span[normalize-space()='Test']")
    public WebElement testOfTestHeading;

    @FindBy(xpath = "//span[normalize-space()='Description']")
    public WebElement descriptionOfTestHeading;

    @FindBy(xpath = "//span[normalize-space()='Test']")
    public WebElement TestOfTestHeading;

    @FindBy(xpath = "///span[normalize-space()='Date']")
    public WebElement DateOfTestHeading;










































}
