package abc;



import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ScreenShot {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
	}

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		TakesScreenshot t=(TakesScreenshot)driver;
	 File srcfile = t.getScreenshotAs(OutputType.FILE);
	 String dt=new Date().toString().replaceAll(".", "-");
	File destifile = new File("./photo/"+dt+"login.png");
	FileUtils.copyFile(srcfile, destifile);
	driver.close();

	}

}
