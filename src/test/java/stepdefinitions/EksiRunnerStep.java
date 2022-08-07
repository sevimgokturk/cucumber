package stepdefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 class EksiSozlukPage {
    public EksiSozlukPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@class='entry-author']")
    public List<WebElement> authorsNicks;
    @FindBy(xpath = "(//select)[3]")
    public WebElement pages;
    @FindBy(xpath = "//ul[@class='topic-list partial']//li//a")
    public List<WebElement> gundemBasliks;
}
public class EksiRunnerStep {
    static EksiSozlukPage eksiSozlukPage =new EksiSozlukPage();
    public static void main(String[] args) {
        Driver.getDriver().get("https://eksisozluk.com/");
        List<String> gundemBasliksList= new ArrayList<>();
        int i=0;
        for (WebElement w: eksiSozlukPage.gundemBasliks){
            gundemBasliksList.add(i+"  -  "+w.getText());
            i++;
        }
        System.out.println(gundemBasliksList);
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of header:");
        int numberOfHeader=scanner.nextInt();
        eksiSozlukPage.gundemBasliks.get(numberOfHeader).click();
        Select select = new Select(eksiSozlukPage.pages);
        List<WebElement> selectOptionsList = select.getOptions();
        int size =selectOptionsList.size();
        List<String> autoursNameList= new ArrayList<>();
        for (int m=1; m<size; m++){
            select.selectByIndex(m);
            for (WebElement w : eksiSozlukPage.authorsNicks){
                if(!autoursNameList.contains(w.getText())){
                    autoursNameList.add(w.getText());
                }
            }
        }
        System.out.println(autoursNameList);
        Driver.closeDriver();
    }
}
