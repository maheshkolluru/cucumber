
package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepompage {
	@FindBy(xpath="//title[text()=' Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM']")
	private WebElement titlehead;
	public homepompage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}
	public WebElement getTitlehead() {
		return titlehead;
	}

}
