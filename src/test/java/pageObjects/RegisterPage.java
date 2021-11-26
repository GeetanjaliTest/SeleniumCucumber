package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    public WebDriver ldriver;

    public RegisterPage(WebDriver rdriver) {
        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }


    @FindBy(xpath = "//*[@id=\"FirstName\"]")
    @CacheLookup
    public WebElement firstName;

    @FindBy(xpath = "//*[@id=\"LastName\"]")
    @CacheLookup
    public WebElement lastName;

    @FindBy(xpath = "//*[@id=\"Email\"]")
    @CacheLookup
    public WebElement emailId;

    @FindBy(xpath = "//*[@id=\"ConfirmEmail\"]")
    @CacheLookup
    public WebElement confirmEmail;

    @FindBy(xpath = "//*[@id=\"Username\"]")
    @CacheLookup
    public WebElement userName;

    @FindBy(xpath = "//*[@id=\"check-availability-button\"]")
    @CacheLookup
    public WebElement checkBtn;


    public void setFirstName(String fName) {
        firstName.clear();
        firstName.sendKeys(fName);
    }


    public void setLastName(String lName) {
        lastName.clear();
        lastName.sendKeys(lName);
    }

    public void setEmailId(String email) {
        emailId.clear();
        emailId.sendKeys(email);
    }

    public void setConfirmEmail(String email) {
        confirmEmail.clear();
        confirmEmail.sendKeys(email);
    }

    public void setUserName(String uName) {
        userName.clear();
        userName.sendKeys(uName);
    }

    public void clickBtn() {
        checkBtn.click();
    }
}
