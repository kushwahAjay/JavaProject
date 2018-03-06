package WithoutPom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortBy {

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
    WebElement e = driver.findElement(By.xpath("//span[@class='view-by-wrap title style-outline i-right']/i[@class='icon-ion-chevron-down']"));
    Actions actions1=new Actions(driver);
    actions1.moveToElement(e).perform();
    Thread.sleep(9000);
    driver.findElement(By.xpath("//a[contains(.,'Price High to Low')]")).click();
	}

}
