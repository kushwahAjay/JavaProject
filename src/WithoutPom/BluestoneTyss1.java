package WithoutPom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BluestoneTyss1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver");
	}
 public static void main(String[] args) throws InterruptedException {
	 //WebDriver driver=new FirefoxDriver();
	WebDriver driver=new ChromeDriver();
	 driver.get("https://www.bluestone.com/");
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//span[text()='Log In']")).click();
	 driver.findElement(By.xpath("//input[@id='email-id']")).sendKeys("ajay16.dhruv@gmail.com");
	 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
	 driver.findElement(By.xpath("//input[@id='edit-login-account']")).click();

	}

}
