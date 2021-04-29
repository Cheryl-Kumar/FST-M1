package automationFramework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity_1 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver Driver = new ChromeDriver();
	Driver.get("https:\\www.training-support.net");
Thread.sleep(2000);
Driver.close();
	}

}
