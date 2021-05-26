package activities;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Activity1 {
	WebDriver Driver;
	
	  @BeforeMethod
	  public void beforeMethod() {
		  Driver = new ChromeDriver();
		  Driver.get("https://www.training-support.net");
	  }
  @Test
  public void fActivity1() {
	  
	  String Title = Driver.getTitle();
	  System.out.println("Title of the first page is " + Title);
	  
	  Assert.assertEquals(Title, "Training Support");
	  
	  Driver.findElement(By.id("about-link")).click();
	  
	  String NewTitle = Driver.getTitle();
	  System.out.println("Title of the new page is " + NewTitle);
	  
	  Assert.assertEquals(NewTitle, "About Training Support");
	  
  }


  @AfterMethod
  public void afterMethod() {
	  Driver.close();
  }

}
