package abc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBluestone {
      static 
      {
    	System.setProperty("Webdriver.gecko.driver","./driver/geckodriver" ) ; 
    	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
      }
      public static void main(String[] args) {
    	  
    	  //WebDriver driver=new FirefoxDriver();
    	  WebDriver driver=new ChromeDriver();
    	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	  driver.get("https://www.bluestone.com/");
    	  BluestonePage l=new BluestonePage(driver);
    	  l.clickLogbtn();
    	  l.setemailId("ajay16.dhruv@gmail.com");
    	  l.setPassword("123456");
    	  l.clickLogin();
		
	}
}
