package abc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTestloginByTitle {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		VerifyLoginPage l=new VerifyLoginPage(driver);
		l.clicklogin();
		l.setEmailid("ajay16.dhruv@gmail.com");
		l.setPassword("123456");
		l.clickloginBtn();
        l.verifyTitle(driver,"Online Jewellery Shopping Store India | Buy Gold and Diamond jewellery with Latest Designs 2017 | BlueStone.com");
	}

}
