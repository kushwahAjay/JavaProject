package WithoutPom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestVtigerLogin {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.vtiger.com/");
		VtigerLoginPage l=new VtigerLoginPage(driver);
		WebDriverWait wait=new WebDriverWait(driver,10);
		//wait.until(ExpectedCondition.TitleContains(""));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		l.setUsername("admin");
		l.setpassword("admin");
		l.clicklogin();

	}

}
