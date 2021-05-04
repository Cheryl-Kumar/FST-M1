package automationFramework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity9_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver = new FirefoxDriver();
		Driver.get("https://training-support.net/selenium/selects");
		Driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		WebElement Chosen = Driver.findElement(By.xpath("//select[@id='single-select']"));
		
		Select SingleSelect = new Select(Driver.findElement(By.id("single-select")));
		
		SingleSelect.selectByVisibleText("Option 2");
		WebDriverWait wait = new WebDriverWait (Driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='single-select']/option[3]")));
		System.out.println(Driver.findElement(By.xpath("//h3[@id='single-value']")).getText());
		
		SingleSelect.selectByIndex(3);
		Thread.sleep(3000);
		System.out.println(Driver.findElement(By.xpath("//h3[@id='single-value']")).getText());
		
		SingleSelect.selectByValue("4");
		Thread.sleep(3000);
		System.out.println(Driver.findElement(By.xpath("//h3[@id='single-value']")).getText());
				
		System.out.println(Chosen.getText());
        //List<WebElement> Options = SingleSelect.getOptions();
        
        //for(WebElement option : Options) {
            //System.out.println("Option: " + option.getText());}
		Driver.close();
	}}


