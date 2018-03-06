package WithoutPom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteValuefromTB {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver");
	}
 public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
		driver.get("https://demo.vtiger.com/");
		WebElement e = driver.findElement(By.id("username"));
		e.sendKeys(Keys.CONTROL+"a");
		e.sendKeys(Keys.DELETE);

	}

}
