package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moseOver {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\azizr\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).submit();
		
		
		Actions act = new Actions (driver);
		
		WebElement Admin = driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
		WebElement user_manager = driver.findElement(By.xpath("//a[contains(text(),'User Management')]"));
		WebElement users = driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
		
		/*
		MoveToElement ()  ==> use for mouse over  
		
		act.moveToElement(Admin).build().perform();            // mouse over to Admin Tab
		act.moveToElement(user_manager).build().perform();     // mouse over to user manager tab
		act.moveToElement(users).click().build().perform(); // mose over and then click on the tab
		
		NOTE: we can do all to gather as you can see below
		
		*/
		Thread.sleep(2000);
		
		act.moveToElement(Admin).moveToElement(user_manager).moveToElement(users).click().build().perform(); //All in one Step
	}

}
