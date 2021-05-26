package activities;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity3 {
	WebDriver Driver;

	  @BeforeClass
	  public void beforeClass() {
		  Driver = new ChromeDriver();
		  Driver.get("https://www.training-support.net/selenium/login-form");
	  }
	    
  @Test
  public void f() {
	  WebElement userName = Driver.findElement(By.id("username"));
	  userName.sendKeys("admin");
	  
	  WebElement Password = Driver.findElement(By.id("password"));
	  Password.sendKeys("password");
	  
	  Driver.findElement(By.xpath("(//button[@type = 'submit'])[1]")).click();
	  
	  String ConfMsg = Driver.findElement(By.id("action-confirmation")).getText();
	  
	  Assert.assertEquals(ConfMsg, "Welcome Back, admin");
  }


  @AfterClass
  public void afterClass() {
	  Driver.close();
  }

}
