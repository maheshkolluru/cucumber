package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpomclass {
	@FindBy(name ="user_name")
	private WebElement usertext;
	@FindBy(name="user_password")
	private WebElement passtext;
	@FindBy(id="submitButton")
	private WebElement loginbtn;
	@FindBy(css="div[class='errorMessage']")
	private WebElement error;
	public Loginpomclass(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getUsertext() {
		return usertext;
	}
	public WebElement getPasstext() {
		return passtext;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	public WebElement getError() {
		return error;
	}
			

}
