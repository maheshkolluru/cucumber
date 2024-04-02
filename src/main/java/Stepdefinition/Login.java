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
import pom.homepompage;

public class Login {
	WebDriver driver;
	Propertycutils p;
	Loginpomclass lp;
	webdriverutils wd;
	String act=" Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
	
	@Given("login page must display")
	public void login_page_must_display() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		wd= new webdriverutils();
		p=new Propertycutils();
		wd.openapp(driver,p.filedatafetch(Iconstant.propath,"url"));
		
		
	   
	}

	@When("enter correct userid and correct password")
	public void enter_correct_userid_and_correct_password() throws Throwable {
		lp=new Loginpomclass(driver);
		p=new Propertycutils();
		lp.getUsertext().sendKeys(p.filedatafetch(Iconstant.propath,"user"));
		lp.getPasstext().sendKeys(p.filedatafetch(Iconstant.propath, "pass"));
		
	    
	}

	@When("click on login")
	public void click_on_login() {
		lp=new Loginpomclass(driver);
		
		lp.getLoginbtn().click();
	   
	}

	@Then("home page must dsiplay")
	public void home_page_must_dsiplay() {
		wd=new webdriverutils();
		homepompage hp= new homepompage(driver);
		Assert.assertEquals(act,hp.getTitlehead().getText() );
		System.out.println("validated");
		
	}

	@When("enter wrong userid and correct password")
	public void enter_wrong_userid_and_correct_password() {
		lp=new Loginpomclass(driver);
		lp.getUsertext().sendKeys("adminn");
		lp.getPasstext().sendKeys("root");
	}

	@Then("home page must not dsiplay")
	public void home_page_must_not_dsiplay() {
	   
	}

	@When("enter correct userid and wrong password")
	public void enter_correct_userid_and_wrong_password() {
		lp=new Loginpomclass(driver);
		lp.getUsertext().sendKeys("admin");
		lp.getPasstext().sendKeys("rooot");
	}

	@When("fill blank userid and password")
	public void fill_blank_userid_and_password() {
		lp=new Loginpomclass(driver);
		lp.getUsertext().sendKeys("     ");
		lp.getPasstext().sendKeys("    ");
	}


}
