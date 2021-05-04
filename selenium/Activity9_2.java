package automationFramework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_2 {

	public static void main(String[] args) {
		WebDriver Driver = new FirefoxDriver();
		Driver.get("https://training-support.net/selenium/selects");
		Driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		WebElement Chosen = Driver.findElement(By.xpath("//select[@id='multi-select']"));
		
		Select MultiSelect = new Select (Chosen);
		if (MultiSelect.isMultiple())
		{
			MultiSelect.selectByVisibleText("Javascript");
			System.out.println(Driver.findElement(By.xpath(" //h3[@id='multi-value']")).getText());
			
			MultiSelect.selectByValue("node");
			System.out.println(Driver.findElement(By.xpath(" //h3[@id='multi-value']")).getText());
			
			MultiSelect.selectByIndex(4);
			MultiSelect.selectByIndex(5);
			MultiSelect.selectByIndex(6);
			System.out.println(Driver.findElement(By.xpath(" //h3[@id='multi-value']")).getText());
			
			MultiSelect.deselectByValue("node");
			System.out.println(Driver.findElement(By.xpath(" //h3[@id='multi-value']")).getText());
			
			MultiSelect.deselectByIndex(7);
			System.out.println(Driver.findElement(By.xpath(" //h3[@id='multi-value']")).getText());
			
			String First = MultiSelect.getFirstSelectedOption().getText();
			System.out.println("Fisrt selected Element is " + First);
			
			
            List<WebElement> SelectedOptions = MultiSelect.getAllSelectedOptions();
            //Print all selected options
            for(WebElement selectedOption : SelectedOptions) {
                System.out.println("Selected option: " + selectedOption.getText());
            }
            
            //Deselect all options
            MultiSelect.deselectAll();
            System.out.println(Chosen.getText());
			
				}
		
		Driver.close();	
	}

}
