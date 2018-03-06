package TySS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBroser {
	static
	{
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver");
	}
 public static void main(String[] args) {
	 WebDriver driver=new FirefoxDriver();
	// WebDriver driver=new ChromeDriver();
	 driver.get("https://www.bluestone.com/");

	 
}
}
