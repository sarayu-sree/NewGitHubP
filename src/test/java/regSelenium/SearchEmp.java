package regSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepti's laptop\\Downloads\\Selenium jars\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[contains(@class,'orangehrm-login-button')]")).click();
		
		driver.findElement(By.xpath("//*[@class='oxd-sidepanel-body']/*[@class='oxd-main-menu']/li[@class='oxd-main-menu-item-wrapper'][2]")).click();
		
		WebElement txt = driver.findElement(By.xpath("//*[normalize-space()='Employee Name']//input[@placeholder='Type for hints...'][1]"));
		
		txt.sendKeys("stef");
		txt.sendKeys(Keys.DOWN);
		txt.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		try {
		if(driver.findElement(By.xpath("//span[starts-with(.,'No')]")).isDisplayed())
		{
			System.out.println("No results");
		}}
		catch(NoSuchElementException e)
		{ if(driver.findElement(By.xpath("//span[starts-with(.,'(')]")).isDisplayed())
		
			System.out.println("results");
		}
		//else System.out.println("Nothing");
		
		driver.close();
	}

}
