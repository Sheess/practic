package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moseOver2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\azizr\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).submit();
		
		WebElement admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
		WebElement userMngmnt = driver.findElement(By.id("menu_admin_UserManagement"));
		WebElement user = driver.findElement(By.id("menu_admin_viewSystemUsers"));
		
		Actions act = new Actions (driver);
		
		act.moveToElement(admin).build().perform();
		act.moveToElement(userMngmnt).build().perform();
		act.moveToElement(user).click().build().perform();
		
	}

}
