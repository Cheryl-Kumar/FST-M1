package project;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Project_Activity1 {
	AndroidDriver<MobileElement> Driver = null;
	WebDriverWait wait;
	
	  @BeforeTest
	  public void beforeTest() throws MalformedURLException {
		  DesiredCapabilities caps = new DesiredCapabilities();
		    //DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		    caps.setCapability("deviceName", "Pixel_4_Emulator");
		    caps.setCapability("platformName", "android");
		    caps.setCapability("automationName", "UiAutomator2");
		    caps.setCapability("appPackage", "com.google.android.apps.tasks");
		    caps.setCapability("appActivity", "com.google.android.apps.tasks.ui.TaskListsActivity");
		    caps.setCapability("noReset", true);

		    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

		    Driver = new AndroidDriver<MobileElement>(remoteUrl, caps);
		    wait = new WebDriverWait(Driver, 30);
	  }
	  
	  
  @Test
  public void f1() {
	  Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  MobileElement Add = Driver.findElementByAccessibilityId("Create new task");
	  Add.click();
	  MobileElement AddTitle = Driver.findElementById("add_task_title");
	  AddTitle.sendKeys("Complete Activity with Google Tasks");
	  Driver.findElementById("add_task_done").click();
  }

  @Test
  public void f2() {
	  Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  MobileElement Add1 = Driver.findElementByAccessibilityId("Create new task");
	  Add1.click();
	  MobileElement AddTitle = Driver.findElementById("add_task_title");
	  AddTitle.sendKeys("Complete Activity with Google Keep");
	  Driver.findElementById("add_task_done").click();
  }

  @Test
  public void f3() {
	  Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  MobileElement Add2 = Driver.findElementByAccessibilityId("Create new task");
	  Add2.click();
	  MobileElement AddTitle = Driver.findElementById("add_task_title");
	  AddTitle.sendKeys("Complete the second Activity Google Keep");
	  Driver.findElementById("add_task_done").click();
  }
  
  @Test
  public void f4() {
	  //assertions
	  List<MobileElement> Count = Driver.findElementsById("task_name");
	  Assert.assertEquals(3, Count.size());
  }
  
  
  @AfterTest
  public void afterTest() {
	  Driver.quit();
  }

}
