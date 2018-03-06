package WithoutPom;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {
	static 
	{
	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");	
	}

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement e = driver.switchTo().activeElement();
		e.sendKeys(Keys.CONTROL+"P");
		Runtime.getRuntime().exec(" ");

	}

}
