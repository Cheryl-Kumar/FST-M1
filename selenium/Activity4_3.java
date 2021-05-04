package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity4_3 {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		Driver.navigate().to("https://www.training-support.net/selenium/target-practice");
		System.out.println(Driver.findElement(By.xpath("//h3[@id='third-header']")).getText());
		
		String H5Color= Driver.findElement(By.xpath("//h5")).getCssValue("color");
		System.out.println(H5Color);

		String Violet = Driver.findElement(By.xpath("//button[contains (text(), 'Violet')]")).getAttribute("class");
		System.out.println("Class atrributes of Voilet Button are " + Violet);
		
		String Grey = Driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
		System.out.println("Text of Grey Button are " + Grey);
	Driver.close();
	}

}
