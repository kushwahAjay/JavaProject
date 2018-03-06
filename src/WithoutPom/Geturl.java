package WithoutPom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Geturl {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver");
	}
 public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://demo.actitime.com/");
	 //WebElement d = driver.findElement(By.xpath("//a[@class='forgotPasswordLink']"));
	/* String url = d.getAttribute("href");
	 String f = d.getAttribute("class");
	 String t = d.getTagName();
	 System.out.println(f);
	 System.out.println(url);
	 System.out.println(t);*/
	 JavascriptExecutor j=(JavascriptExecutor) driver;
	  String myjs = "document .getElementById('LicenseLink').click()";
	  j.executeScript(myjs);

	}

}
