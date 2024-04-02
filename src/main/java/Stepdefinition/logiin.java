package Stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Genericlib.Iconstant;
import Genericlib.Propertycutils;
import Genericlib.webdriverutils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom.Loginpomclass;

public class logiin {
	String actval="You must specify a valid username and password.";
	webdriverutils wd;
	Propertycutils p;
	WebDriver driver;
	Loginpomclass lp;

@Given("login page should display")
public void login_page_should_display() throws Throwable {
wd = new webdriverutils();	
p= new Propertycutils();
WebDriverManager.chromedriver().setup();
driver= new ChromeDriver();
wd.openapp(driver, p.filedatafetch(Iconstant.propath, "url"));
    
}

@When("enter {string} in user field")
public void enter_in_user_field(String username) {
    lp= new Loginpomclass(driver);
    lp.getUsertext().sendKeys(username);
}

@When("enter {string} in passwordfield and click on login")
public void enter_in_passwordfield_and_click_on_login(String password) {
	lp= new Loginpomclass(driver);
    lp.getPasstext().sendKeys(password);
    lp.getLoginbtn().click();
}

@Then("failed error message must display")
public void failed_error_message_must_display() {
	lp= new Loginpomclass(driver);
String expec	=lp.getError().getText();
Assert.assertEquals(actval, expec);
System.out.println("error message displayed and validated");
   
}

	

}
