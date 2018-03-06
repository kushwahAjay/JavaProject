package WithoutPom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WishList {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//span[text()='Log In']")).click();
		 driver.findElement(By.xpath("//input[@id='email-id']")).sendKeys("ajay16.dhruv@gmail.com");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		 driver.findElement(By.xpath("//input[@id='edit-login-account']")).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath("//span[@class='icon-img hs wishlist-icon']")).click();
		driver.findElement(By.xpath("//div[@class='title']/a[@href='https://www.bluestone.com/earrings/the-sia-earrings~520.html']")).click();
		 driver.findElement(By.xpath("//div[@class='buynow-block col-xs-6']/input[@name='Submit']")).click();
		 Thread.sleep(9000);
	     driver.findElement(By.xpath("//a[@title='Place Order']")).click();
	     driver.findElement(By.xpath("//span[@title='Proceed to Payment']"));
	}
	

}
