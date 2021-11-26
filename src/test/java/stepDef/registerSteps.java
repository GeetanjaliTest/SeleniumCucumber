package stepDef;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.RegisterPage;


public class registerSteps {

    public WebDriver driver;
    public RegisterPage rpage;

    @Given("User Launch Chrome Browser")
    public void user_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver","C://Users//USER//IdeaProjects//SeleniumCucumber//src//Drivers//chromedriver.exe");
        driver= new ChromeDriver();
        rpage= new RegisterPage(driver);

    }

    @When("User opens URL {string}")
    public void user_opens_url(String string) {

    }

    @When("User enters First Name as {string}")
    public void user_enters_first_name_as(String f_name) {

    }

    @When("User enters Last Name as {string}")
    public void user_enters_last_name_as(String l_name) {

    }

    @When("close browser")
    public void close_browser() {

    }


}
