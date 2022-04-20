package DynamicDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleClassDropDown {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\azizr\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("testing");
		List<WebElement>elm = driver.findElements(By.xpath("(//ul[@role='listbox']//li/descendant::div[@class='wM6W7d'])[1]"));
		System.out.println(elm.size());
		
		for (WebElement element: elm)
		{
			if (element.getText().contains("testing"))
			{
				element.click();
			}
		}
	}

}
