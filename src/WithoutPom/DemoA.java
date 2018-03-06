package WithoutPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoA {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver");
	}
 public static void main(String[] args) throws InterruptedException {
	 //WebDriver driver=new FirefoxDriver();
	 WebDriver driver=new ChromeDriver();
	 driver.get("http://www.google.com");
	// Thread.sleep(2000);
	 driver.navigate().to("http://www.yahoo.com");
	 Thread.sleep(2000);
	 driver.navigate().back();
	 driver.navigate().forward();
	 driver.navigate().refresh();

	}

}
