package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    WebDriver driver= new FirefoxDriver();

    @FindBy(xpath = "//*[@id=\"FirstName\"]")
    public WebElement firstName;

    @FindBy(xpath = "//*[@id=\"LastName\"]")
    public WebElement lastName;

    @FindBy(xpath = "//*[@id=\"Email\"]")
    public WebElement emailId;

    @FindBy(xpath = "//*[@id=\"ConfirmEmail\"]")
    public WebElement confirmEmail;

    @FindBy(xpath = "//*[@id=\"Username\"]")
    public WebElement userName;

    @FindBy(xpath = "//*[@id=\"check-availability-button\"]")
    public WebElement checkBtn;

    RegisterPage(WebDriver d) {
        driver=d;
        PageFactory.initElements(d,this);
    }

    public void setFirstName(String fName) {
        firstName.sendKeys(fName);
    }


    public void setLastName(String lName) {
        lastName.sendKeys(lName);
    }

    public void setEmailId(String email) {
        emailId.sendKeys(email);
    }

    public void setConfirmEmail(String email) {
        confirmEmail.sendKeys(email);
    }

    public void setUserName(String uName) {
        userName.sendKeys(uName);
    }

    public void clickBtn() {
        checkBtn.click();
    }
}
