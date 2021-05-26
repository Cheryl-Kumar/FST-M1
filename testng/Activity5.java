package activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity5 {
	WebDriver Driver;
	
	@BeforeClass (alwaysRun = true)
	public void beforeClass() {
	Driver = new ChromeDriver();
	Driver.get("https://www.training-support.net/selenium/target-practice");
	  }
	
  @Test (groups = {"Headers", "Buttons"})
  public void Test1() {
	  String Title = Driver.getTitle();
	  System.out.println("Title of the page is: " + Title);
	  Assert.assertEquals(Title, "Target Practice");
  }

  @Test (groups = {"Headers"}, dependsOnMethods = {"Test1"})
  public void Test2() {
	  String Header3 = Driver.findElement(By.id("third-header")).getText();
	  Assert.assertEquals(Header3, "Third header");
  }
  
  @Test (groups = {"Headers"}, dependsOnMethods = {"Test1"} )
  public void Test3() {
	  WebElement Header5 = Driver.findElement(By.cssSelector("h5.ui"));
	  Assert.assertEquals(Header5.getCssValue("color"), "rgba(33, 186, 69, 1)");
  }
  
  @Test (groups = {"Buttons"}, dependsOnMethods = {"Test1"} )
  public void Test4() {
	  WebElement Button1 = Driver.findElement(By.cssSelector("button.olive"));
	  Assert.assertEquals(Button1.getText(), "Olive");
  }
  
  @Test (groups = {"Buttons"}, dependsOnMethods = {"Test1"} )
  public void Test5() {
	  WebElement Button2 = Driver.findElement(By.cssSelector(".brown"));
	  Assert.assertEquals(Button2.getCssValue("color"), "rgba(255, 255, 255, 1)");
  }
  
  @AfterClass (alwaysRun = true)
  
  public void afterClass() {
	  Driver.quit();
  }

}
