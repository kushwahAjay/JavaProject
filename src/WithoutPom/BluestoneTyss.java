package WithoutPom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BluestoneTyss {
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
	Thread.sleep(9000);
	 WebElement menu = driver.findElement(By.xpath("//span[.='Earrings ']"));
	 Actions actions=new Actions(driver);
	 actions.moveToElement(menu).perform();
     driver.findElement(By.xpath("//span[.=' Sui Dhaga ']")).click();
 	Thread.sleep(9000);
     driver.findElement(By.xpath("//a[@id='pid_25792']/img[@class='hc img-responsive center-block']")).click();
     driver.findElement(By.xpath("//div[@class='buynow-block col-xs-6']/input[@name='Submit']")).click();
     driver.findElement(By.xpath("//div/a[.='Place Order']")).click();
     driver.findElement(By.xpath("//span[@class='btn btn-block btn-new delivery-page-proceed']"));
 

}
}