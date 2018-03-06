package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger {

	 static
	 {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
	 }
	public static void main(String[] args) {
		
     WebDriver driver=new ChromeDriver();
     driver.get("https://demo.vtiger.com");
    WebElement un = driver.findElement(By.id("username"));
     String tag = un.getTagName();
     String attri = un.getAttribute("value");
     System.out.println(tag);
     System.out.println(attri);
    String tooltip = un.getAttribute("title");
    System.out.println(tooltip);
	}

}
