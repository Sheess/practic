package ActionsClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeAble {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\azizr\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://jqueryui.com/resizable/");
		
		driver.switchTo().frame(0);
		
		WebElement resizeAble = driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		
		// resizing of the element 
		Actions act = new Actions (driver);
		act.moveToElement(resizeAble).dragAndDropBy(resizeAble, 150, 100).build().perform();
		Thread.sleep(200);
	}

}
