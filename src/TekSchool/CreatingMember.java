package TekSchool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CreatingMember {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\azizr\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tek-school.com/retail/");
		
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("jamal");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("khan");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("jamalKhan@yahoo.com");
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("//input[@id='input-telephone']");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("1234");
		driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).click();
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
	}

}
