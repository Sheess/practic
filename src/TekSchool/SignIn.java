package TekSchool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignIn {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\azizr\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver ();
		
		driver.get("http://tek-school.com/retail/");
		
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("jamalKhan@yahoo.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
	}

}
