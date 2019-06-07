package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Refresh {

	public static void main(String[] args) 
	   {
		WebDriver driver=new ChromeDriver();
		driver.get("http://amazon.in");
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("sony");
		Actions a=new Actions(driver);
		a.keyDown(Keys.CONTROL);
		a.sendKeys(Keys.F5);
		a.keyUp(Keys.CONTROL);
		a.build().perform();
	   }

}
