package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Activity10_2 {

	public static void main(String[] args) {
		WebDriver Driver = new FirefoxDriver();
		
		Driver.get("https://www.training-support.net/selenium/input-events");
		
		Driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		System.out.println(Driver.getTitle());
		Actions actions = new Actions(Driver);
		
		WebElement KeyPressed = Driver.findElement(By.id("keyPressed"));
		
        Action actionSequence1 = actions.sendKeys("C").build();
        actionSequence1.perform();
        String pressedKeyText = KeyPressed.getText();
        System.out.println("Pressed key is: " + pressedKeyText);
        
        
        //Create action sequence for Spacebar
        Action actionSequence2 = actions
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .sendKeys("c")
                .keyUp(Keys.CONTROL)
                .build();
        actionSequence2.perform();
        pressedKeyText = KeyPressed.getText();
        System.out.println("Pressed key is: " + pressedKeyText);
 
        //Close browser
        Driver.close();
		
		
		

	}

}
