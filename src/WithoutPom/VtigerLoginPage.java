package WithoutPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VtigerLoginPage {
	private WebElement UnTb;
	private WebElement PwTb;
	private WebElement loginBTN;
	
	public VtigerLoginPage(WebDriver driver)
	{
		UnTb=driver.findElement(By.id("username"));
		PwTb=driver.findElement(By.name("password"));
		loginBTN=driver.findElement(By.xpath("//button[text()='Sign in']"));
	}
	public void setUsername(String un)
	{
		UnTb.sendKeys(un);
	}
	public void setpassword(String pw) {
		PwTb.sendKeys(pw);
	}
	public void clicklogin()
	{
		loginBTN.click();
	}

}
