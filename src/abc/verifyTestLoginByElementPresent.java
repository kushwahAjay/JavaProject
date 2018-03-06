package abc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class verifyTestLoginByElementPresent {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		//System.setProperty("WebDriver.gecko.driver", "./driver/geckodriver");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		VerifyLoginPage l=new VerifyLoginPage(driver);
		l.clicklogin();
		l.setEmailid("ajay16.dhruv@gmail.com");
		l.setPassword("123456");
		l.clickloginBtn();
		VerifyLoginPage.verifyElementpresent(driver, "//img[@alt='BlueStone']");

}
}
