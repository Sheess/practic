package DynamicTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable2 {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\azizr\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/search?q=html+table");
		
		List <WebElement> allHeader = driver.findElements(By.xpath("//table[@id='customers']//th"));
		System.out.println(allHeader.size());
		for (WebElement ele : allHeader )
		{
			String value = ele.getText();
			System.out.println(value);
		}
		System.out.println("==========================================================");
		
		
		List <WebElement> numberOfRows = driver.findElements(By.xpath("//table[contains(@id,'cust')]//tr"));
		System.out.println(numberOfRows.size());
		for (WebElement ele2 : numberOfRows)
		{
			String value2 = ele2.getText();
			System.out.println(value2);
		}
		System.out.println("=========================================================");
		
		
		
		List <WebElement> AllData = driver.findElements(By.xpath("//table[contains(@id,'cust')]//td"));
		System.out.println(AllData.size());
		for (WebElement ele3 : AllData)
		{
			System.out.println(ele3.getText());
		}
		driver.findElement(By.xpath("//td[contains(text(),'Selenium')]//preceding-sibling::td//input")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//td[contains(text(),'Selenium')]//following-sibling::td[3]")).click();
	}

}
