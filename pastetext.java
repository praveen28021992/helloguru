package Actions;



import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class pastetext 
 {
  public static void main(String[] args) throws Exception
  {
	StringSelection str=new StringSelection("selenium");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str,null);
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.google.com");
	WebElement txt=driver.findElement(By.name("q"));
	Actions a=new Actions(driver);
	a.contextClick(txt);
	Thread.sleep(4000);
	a.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();;
	
}

}


