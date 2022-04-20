package DynamicTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTAble1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\azizr\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/search?q=html+table");
		
		
		
		// we print out the rows of the table
		List <WebElement> row = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		for (WebElement el: row)
		{
			System.out.println(el.getText());
		}
		System.out.println("========================================================================");
		
		
		
		// We print out the columns of the table 
		List<WebElement> colunms = driver.findElements(By.xpath("//table[@id='customers']//tr//td"));
		for (WebElement ele1 : colunms)
		{
			System.out.println(ele1.getText());
		}
	}

}
