package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyLoginPage {
  private WebElement login;
  private WebElement emailid;
  private WebElement password;
  private WebElement loginBtn;
  
  public VerifyLoginPage(WebDriver driver)
  {
	  login=driver.findElement(By.xpath("//span[text()='Log In']"));
	  emailid=driver.findElement(By.xpath("//input[@id='email-id']"));
	  password=driver.findElement(By.xpath("//input[@id='password']"));
	  loginBtn=driver.findElement(By.xpath("//input[@id='edit-login-account']"));
  }
   public void clicklogin()
   {
	   login.click();
   }
   public void setEmailid(String email)
   {
	   emailid.sendKeys(email);
   }
   public void setPassword(String pw)
   {
	   password.sendKeys(pw);
   }
   public void clickloginBtn()
   {
	   loginBtn.click();
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
}
