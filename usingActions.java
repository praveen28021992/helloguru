package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class usingActions 
{
  public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://ebay.com");
		driver.findElement(By.id("gh-ac")).sendKeys("LG");
		Actions a=new Actions(driver);
		a.sendKeys(Keys.ENTER);
		a.build().perform();

	}

}
