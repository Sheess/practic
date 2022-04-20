package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\azizr\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement source = driver.findElement(By.id("box1"));
		WebElement target = driver.findElement(By.id("box103"));
		
		
		Thread.sleep(2000);
		Actions act = new Actions (driver);
		// we have three action in drag and drop (clickAndHold() MoveToElement() and Release() to perform the action.
		
		// TWO WAYS of drag and drop 
		// (1)
		//act.clickAndHold(source).moveToElement(target).release().build().perform(); 
		
		//(2)
		act.dragAndDrop(source, target).build().perform();
		
	}

}
