package activities;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Activity2 {
	
	WebDriver Driver;
	
	  @BeforeClass
	  public void beforeTest() {
		  Driver = new ChromeDriver();
		  Driver.get("https://www.training-support.net/selenium/target-practice");
	  }
	  
	  
  @Test 
  public void Test1() {
	  String Title = Driver.getTitle();
	  Assert.assertEquals(Title, "Target Practice");
  }

  @Test 
  public void Test2() {
	  WebElement BlackButton = Driver.findElement(By.xpath("//button[@class = 'ui black button']"));
	  Assert.assertTrue(BlackButton.isSelected());
  }
  
  @Test (enabled=false)
  public void Test3() {
	 System.out.println("This test is skipped") ;
  }
  
  @Test 
  public void Test4() throws SkipException {
	  throw new SkipException("Skipping - This is not ready for testing ");
  }
  
  @AfterClass
  public void afterTest() {
	  Driver.close();
  }

}
