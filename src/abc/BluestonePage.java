package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BluestonePage {
	@FindBy(xpath="//span[text()='Log In']")
	private WebElement Logbtn;
	@FindBy(xpath="//input[@id='email-id']")
	private WebElement emailid;
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	@FindBy(xpath="//input[@id='edit-login-account']")
	private WebElement loginBTN;
	@FindBy(xpath="//li/a[@href='https://www.bluestone.com/jewellery/diamond-earrings.html']/span[text()='Earrings']")
	private WebElement Earings;		
			

	
	public BluestonePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickLogbtn()
	{
		Logbtn.click();
	}
	
	public void setemailId(String email)
	{
		emailid.sendKeys(email);
	}
	public void setPassword(String pw)
	{
		password.sendKeys(pw);
	}
	public void clickLogin()
	{
		loginBTN.click();
	}
	

}
