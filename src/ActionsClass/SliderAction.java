package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderAction {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\azizr\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://jqueryui.com/resizable/");
		
		driver.switchTo().frame(0);
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		
		// we moved the element slide to the left side 
		Actions act = new Actions (driver);
		act.moveToElement(slider).dragAndDropBy(slider, 400, 0).build().perform();
	}

}
