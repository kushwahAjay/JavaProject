package abc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
	}

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://www.google.com");
		String t = driver.getTitle();
		String p = driver.getPageSource();
	
        String url = driver.getCurrentUrl();
        
        System.out.println(p);
        System.out.println(url);
        System.out.println(t);
        driver.close();
	}

}
