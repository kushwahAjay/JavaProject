package WithoutPom;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestionBluestne {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver");
	}

	public static void main(String[] args) throws InterruptedException {
		
		//Scanner sc=new Scanner(System.in);
		//String input = sc.nextLine();
		String input="ju";
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).sendKeys(input);
		//Thread.sleep(2000);
		//String xp="//a[contains(@data-value='The%20Kartyayni%20Jhumki')]";
		//String xp="//a[href='undefined?search_category=suggestion-click&search_query=The Judith Earrings&search_type=auto-suggestion&cleverTapId=f0afd7c2c4d34a828817c931dfac8397&_eventId=searched_for_product']";
         String xp="html/body/header/div[1]/div[2]/div/div/div[2]/div/div/div/div/form/div/div/div[1]/a[@data-value='The%20Julius%20Ring']";
		
		System.out.println(xp);
		List<WebElement> AllAst = driver.findElements(By.xpath(xp));
		 int count =AllAst.size();
		 System.out.println(count);
		 for(WebElement ast:AllAst)
		 {
			 String text = ast.getText();
			 System.out.println(text);
		 }
		
           Thread.sleep(2000);
           AllAst.get(0).click();
	}

}
