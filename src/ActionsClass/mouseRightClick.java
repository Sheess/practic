package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseRightClick {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\azizr\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions atc = new Actions (driver);
		
		
		Thread.sleep(2000);
		// contextClick() ==> is use for the Right click on elements
		WebElement button = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		atc.contextClick(button).build().perform();  // Right click
		
		driver.findElement(By.xpath("/html/body/ul/li[3]")).click();
		
		
		// we switch to Alert box (switchTo) and (getText) to print it. 
	
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		
		
	}

}
