package abc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		//System.setProperty("WebDriver.gecko.driver", "./driver/geckodriver");
	}

	public static void verifyTitle(WebDriver driver, String eTitle) {
		System.out.println("Expected:" + eTitle);
		String aTitle = driver.getTitle();
		System.out.println(aTitle);
		if (aTitle.equals(eTitle)) {
			System.out.println("pass: req page is displayed");
		} else {
			System.out.println("fail: req page is not displayed");
		}
	}

    public static void verifyUrl(WebDriver driver,String eurl)
     {
     System.out.println("Expected:"+eurl);	
     String aurl = driver.getCurrentUrl();
     System.out.println(aurl);
     if(aurl.contains(eurl))
     {
    	 System.out.println("pass:req page is displayed");
     }
     else
     {
    	 System.out.println("fail:req page is not displayed");
     }
}
     public static void verifyElementpresent(WebDriver driver,String xp)
     {
    	 try
    	 {
    		WebElement e = driver.findElement(By.xpath(xp));
    		System.out.println("pass: Element is present");
    		if(e.isDisplayed())
    		{
    			System.out.println("pass: element is displayed");
    		}
    		else
    		{
    			System.out.println("fail: element is not displayed");
    		}
    	 }
    	catch(Exception e)
    	{
    		System.out.println("fail: element is not present");
    	}
    		 
    	 
    	 
     }

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='Log In']")).click();
		driver.findElement(By.xpath("//input[@id='email-id']")).sendKeys("ajay16.dhruv@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='edit-login-account']")).click();
		verifyTitle(driver,
				"Online Jewellery Shopping Store India | Buy Gold and Diamond jewellery with Latest Designs 2017 | BlueStone.com");
        verifyUrl(driver,"https://www.bluestone.com/");
        verifyElementpresent(driver,"//img[@alt='BlueStone']");
	}

}
