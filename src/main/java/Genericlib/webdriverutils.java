package Genericlib;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.time.Duration;
import java.util.Set;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class webdriverutils {

	
		/**
		 * 
		 * @param driver it will store the id of current page
		 * @param url App which we want to open
		 */
		public void openapp(WebDriver driver,String url)
		{
			driver.get(url);
		}
		/**
		 * 
		 * @param driver it will store the id of current page
		 *  This method will help to  maximize the browser
		 */
		public void maximizewindow(WebDriver driver)
		{
			driver.manage().window().maximize();;
		}
		/**
		 * 
		 * @param driver it will store the id of current page
		 *  This method will help to  minimize the browser
		 */
		public void minimizewindow(WebDriver driver)
		{
			driver.manage().window().minimize();;
		}
		/**
		 * 
		 * @param driver it will store the id of current page
		 *  This method will help to  resize  the browser
		 */
		public void resizewindow(WebDriver driver,int w ,int h)
		{
			driver.manage().window().setSize(new org.openqa.selenium.Dimension(w, h));
		}
		/**
		 * 
		 * @param driver it will store the id of current page
		 *  This method will help to setposition from where  the browser to start
		 */
		public void setposition(WebDriver driver,int x ,int y)
		{
			driver.manage().window().setPosition(new org.openqa.selenium.Point(x, y));
		}
		/**
		 * 
		 * @param driver it will store the id of current page
		 *  This method will help to refresh  the webpage
		 */
		public void refreshbrowser(WebDriver driver)
		{
			driver.navigate().refresh();
		}
		/**
		 * 
		 * @param driver it will store the id of current page
		 *  This method will help to back to  the webpage
		 */
		public void backward(WebDriver driver)
		{
			driver.navigate().back();
		}
		/**
		 * 
		 * @param driver it will store the id of current page
		 *  This method will help to forward to the webpage
		 */
		public void forward(WebDriver driver)
		{
			driver.navigate().forward();
		}
		/**
		 * 
		 * @param driver it will store the id of current page
		 *  This method will help to open the application
		 */
		public void openappwithnavigate(WebDriver driver,String url)
		{
			driver.navigate().to(url);
		}
		/**
		 * 
		 * @param locator it is used to find  the address of element
		 * @param driver it will store the id of current page
		 * @return it will return the address of  element
		 */
		public WebElement locators(By locator,WebDriver driver)
		{
			return driver.findElement(locator);
		}
		/**
		 * 
		 * @param locator it is used to find  the address of elements
		 * @param driver it will store the id of current page
		 */
		public void multiele( String matchingdata,java.util.List<WebElement> mulele)
		{
			
			for(WebElement e :mulele)
			{
			String data =	e.getText();
			if(data.contains(matchingdata))
			{
			 System.out.println("validated");
			}
				
			}
			 
		}
		/**
		 * 
		 * @param ele store the address of the element
		 * these methods is used to validate checkbox and radiobutton
		 * @return true or false 
		 */
		public boolean checkboxandradiobutton(WebElement ele)
		{
			return ele.isSelected();
		}
		/**
		 * 
		 * @param ele store the address of the element
		 * these methods is used to validate messages  is displayed or not
		 * @return true or false 
		 */
		public boolean  messageisdisaplyedornot(WebElement ele)
		{
			return ele.isDisplayed();
		}
		/**
		 * 
		 * @param driver it will store the id of current page
		 * @param ele store the address of the element
		 * this method will help to rightclick 
		 */
		public void rightclick(WebDriver driver,WebElement ele)
		{
			Actions act = new Actions(driver);
			act.contextClick(ele).perform();
		}
		/**
		 * 
		 * @param driver it will store the id of current page
		 * @param ele store the address of the element
		 * this method will help to move to particular element
		 */
		public void movetoelement(WebDriver driver,WebElement ele)
		{
			Actions act = new Actions(driver);
			act.moveToElement(ele).perform();
		}
		/**
		 * 
		 * @param driver it will store the id of current page
		 * @param ele store the address of the element
		 * this method will help to doubleclick  on element
		 */
		public void doubleclick(WebDriver driver,WebElement ele)
		{
			Actions act = new Actions(driver);
			act.doubleClick(ele).perform();
		}
		/**
		 * 
		 * @param driver it will store the id of current page
		 * @param ele store the address of the element
		 * this method will help to draganddrop by source
		 */
		public void dragndropbysrc(WebDriver driver,WebElement ele,int x,int y)
		{
			Actions act = new Actions(driver);
			act.dragAndDropBy(ele, x, y).perform();
		}
		/**
		 * 
		 * @param driver it will store the id of current page
		 * @param ele store the address of the element
		 * this method will help to draganddrop by source n target
		 */
		public void dragndropbysrc(WebDriver driver,WebElement ele,WebElement ele1)
		{
			Actions act = new Actions(driver);
			act.dragAndDrop(ele, ele1).perform();
		}
		/**
		 * 
		 * @param driver it will store the id of current page
		 * @param ele store the address of the element
		 * this method will help to click n hold the element
		 */
		public void clicknhold(WebDriver driver,WebElement ele)
		{
			Actions act = new Actions(driver);
			act.clickAndHold(ele).perform();
		}
		
		/**
		 * 
		 * @param driver it will store the id of current page
		 */
		public void multiwindow(WebDriver driver,String matchingtitle)
		{
		   Set<String> multi = driver.getWindowHandles();
		   for(String s :multi)
		   {
			   String title= driver.switchTo().window(s).getCurrentUrl();
			 
			   if(title.equals(matchingtitle))
			   {
				   break;
			   }
		   }
				
		} 
		/**
		 * 
		 * @param driver it will store the id of current page
		 * @param By using this method  overcome synchhronisation issue
		 */
		public void implicitwait(WebDriver driver,int time)
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		}
		/**
		 * 
		 * @param ele store the address of the element
		 * @param n index number of dropdown
		 * this method is used to select the dropdown by index value.
		 */
		 public void dropdownbyindex(WebElement ele,int n)
		 {
			 Select s = new Select(ele);
			 s.selectByIndex(n);
		 }
		 /**
		  * 
		  * @param ele store the address of the element
		  * @param value value which we want to select in dropdown
		  * this method is used to select the dropdown by value.
		  */
			 public void dropdownbyvalue(WebElement ele, String value)
			 {
				 Select s = new Select(ele);
				 s.selectByValue(value);
			 }
			 /**
				 * 
				 * @param ele store the address of the element
				 * @param n index number of dropdown
				 * this method is used to deselect the dropdown by index value.
				 */
				 public void deselectdropdownbyindex(WebElement ele,int n)
				 {
					 Select s = new Select(ele);
					 s.deselectByIndex(n);
				 }
				 /**
				  * 
				  * @param ele store the address of the element
				  * @param value  which we want to select in dropdown
				  * this method is used to deselect the dropdown by value.
				  */
					 public void deselectdropdownbyvalue(WebElement ele, String value)
					 {
						 Select s = new Select(ele);
						 s.deselectByValue(value);
					 }
					 /**
					  * 
					  * @param driver it will store the id of current page
					  * @param path where we want to store the screenshot
					 * @return 
					  * @throws Throwable
					  * this method  is used to takescreenshot when our testcase fail 
					  */
					 public String screenshot(WebDriver driver,String path) throws Throwable
					 {
						 TakesScreenshot sh = (TakesScreenshot)driver;
						 File src = sh.getScreenshotAs(OutputType.FILE);
						 File dist=new File(path);
						 Files.copy(src, dist);	 
						return dist.getAbsolutePath();
					 }
					 /**
					  * 
					  * @param driver it will store the id of current page
					  * By using these method we can switch from main page to alert page
					  * @return 
					  */
					 public Alert alertpopup(WebDriver driver)
					 {
						return driver.switchTo().alert();
					 }
					 /**
					  * this method helps if we want to switch from main page to frame
					  * by using index number
					  * and also from parent frame to child frame
					  * 
					  */
					 public void switchframebyindex(WebDriver driver,int n)
					 {
						 driver.switchTo().frame(n);
					 }
					 /**
					  * this method helps if we want to switch from main page to frame
					  * by using webelement ref variable
					  * 
					  */
					 public void switchframebyele(WebDriver driver,WebElement ele)
					 {
						 driver.switchTo().frame(ele);
					 }
					 /**
					  * this method helps to handle the nested frame
					  *
					  * 
					  */
					 public void nestedframe(WebDriver driver,int parent,int child)
					 {
						 driver.switchTo().frame(parent).switchTo().frame(child);
					 }
					 /**
					  * this method will help to handle the notification popup
					 * @return 
					  */
					 public ChromeOptions notificationpopup()
					 {
					return new  ChromeOptions().addArguments("--disable-notification");
					 }
					 /**
					  * 
					  * @param path of the file which we want to upload
					  */
					 public void toolkitwithrobot(String path)
					 {
						 StringSelection s = new StringSelection(path);
						 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
					 }
					 /**
					  * 
					  * this methods is used to scroll the page
					  * @param ele is the address of element(where we want to scroll)
					  */
					 public void scrolling(WebDriver driver,WebElement ele)
					 {
						 JavascriptExecutor jse =(JavascriptExecutor)driver;
						 jse.executeScript("arguments[0].scrollIntoView(true);",ele);
					 }
					 
		


	

}
