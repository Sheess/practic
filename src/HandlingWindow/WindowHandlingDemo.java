package HandlingWindow;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\azizr\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		 driver.get("https://www.salesforce.com/au/");
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//a[@class='btn btn-lg btn-nav salesforce-sans-regular ']")).click();
		 Set<String> windowhandles = driver.getWindowHandles();
		 System.out.println(windowhandles);
		 
		 Iterator<String> it = windowhandles.iterator();
		 String parentWin = it.next(); // by this time the corsor move to the parent  window and 0 index of the set
		 String childWin = it.next();  // the corsor move to the child window and  first index of the set 
		 
		 driver.switchTo().window(childWin);
		 driver.findElement(By.name("UserFirstName")).sendKeys("ahmad");
		 driver.findElement(By.name("UserLastName")).sendKeys("jan");
		 //Thread.sleep(4000);
		 //driver.switchTo().window(parentWin);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 /*  http://demo.automationtesting.in/Windows.html
		driver.findElement(By.id("newWindowBtn")).click();
		
		String parentHandle = driver.getWindowHandle();
		System.out.println("parenet handle" + parentHandle);
		Set<String> Handle = driver.getWindowHandles();
		for (String handle : Handle)
		{
			System.out.println(handle);
		}
		Thread.sleep(2000);
		driver.quit();
		*/
		
		
		
		
		
		
		
	}

}
