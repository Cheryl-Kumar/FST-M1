package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver = new FirefoxDriver();
		Driver.get("https://www.training-support.net/selenium/input-events");
		Driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		System.out.println(Driver.getTitle());
		
		Actions MouseActions = new Actions(Driver);
		WebElement Cube = Driver.findElement(By.id("wrapD3Cube"));
		MouseActions.click(Cube);
		Thread.sleep(2000);
		System.out.println("Cubevalue is " + Cube.getText());
		
		
		WebElement CubeVal = Driver.findElement(By.xpath("//div[@class='active']"));
		String Value = CubeVal.getText();
		System.out.println("the value of the cube is " + Value);
		
		//Double click
		MouseActions.doubleClick(Cube);
		CubeVal = Driver.findElement(By.className("active"));
        System.out.println("Double Click: " + CubeVal.getText());
        
        //Right click        
        MouseActions.contextClick(Cube).perform();
        CubeVal = Driver.findElement(By.className("active"));
        System.out.println("Right Click: " + CubeVal.getText());
		
Driver.close();
	}

}
