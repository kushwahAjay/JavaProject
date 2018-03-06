package abc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenBrowser {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		//System.setProperty("webdriver.gecko.driver", "./driver/geckodriver");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		 driver.get("https://www.stage.com/");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//div[@data-visible-user='guest']/p//a[text()='Sign in']")).click();
		 driver.findElement(By.id("email")).sendKeys("ajay.sati09@gmail.com");
		 driver.findElement(By.name("sign-in-pass")).sendKeys("ajay@11861");
		 driver.findElement(By.xpath("//input[@id='loginuser']")).click();
		 WebElement menu = driver.findElement(By.xpath("//nav[@class='site-nav']/ul[@class='nav-tlc']//li/a[text()='Men']"));
		 Actions action=new Actions(driver);
		 action.moveToElement(menu).perform();
		 driver.findElement(By.xpath("//div[@class='m-menu__level-3']//ul//a[text()='Shirts']")).click();
		 

	}

}
