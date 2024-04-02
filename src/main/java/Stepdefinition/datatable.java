package Stepdefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Genericlib.Iconstant;
import Genericlib.Propertycutils;
import Genericlib.webdriverutils;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom.Loginpomclass;

public class datatable {
	String actval="You must specify a valid username and password.";
	webdriverutils wd;
	Propertycutils p;
	WebDriver driver;
	Loginpomclass lp;
	@Given("login page must be display")
	public void login_page_must_be_display() throws Throwable {
		wd = new webdriverutils();	
		p= new Propertycutils();
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		wd.openapp(driver, p.filedatafetch(Iconstant.propath, "url"));
	}

	@When("enter the following fields")
	public void enter_the_following_fields(DataTable dataTable) {
List<String> userlist=	dataTable.asList(String.class);
	for(String o:userlist)
	{
		System.out.println(o);
		
	}
	    
	}

	@When("click on in login")
	public void click_on_in_login() {
		lp= new Loginpomclass(driver);
	   
	    lp.getLoginbtn().click();
	}

	@Then("error message must display in login page")
	public void error_message_must_display_in_login_page() {
		lp= new Loginpomclass(driver);
		String expec	=lp.getError().getText();
		Assert.assertEquals(actval, expec);
		System.out.println("error message displayed and validated");
	}
}
