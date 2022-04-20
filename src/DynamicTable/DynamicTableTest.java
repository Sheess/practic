package DynamicTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\azizr\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
	/*	
		 //*[@id="customers"]/tbody/tr[2]/td[1]
		 //*[@id="customers"]/tbody/tr[3]/td[1]
		 //*[@id="customers"]/tbody/tr[4]/td[1]
		 //*[@id="customers"]/tbody/tr[7]/td[1]
		
		String beforeXpath = "//*[@id='customers']/tbody/tr[";
		String afterXpath = "]/td[1]";
		 
		 for (int i = 2; i <= 7; i++)
		 {
			 String actualXpath = beforeXpath + i + afterXpath;
			WebElement element =  driver.findElement(By.xpath(actualXpath));
			System.out.println();
			
			 
		 } */
		 
		// here we retrieve the data of the rows only [tr]
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println(rows.size());
		for (WebElement ele: rows)
		{
			System.out.println(ele.getText());
		}
		
		// this prints all the table because we select the table data [td]
		System.out.println("=========================================================================");
		List <WebElement> colums = driver.findElements(By.xpath("//table[@id='customers']//td"));
		System.out.println(colums.size());
		for (WebElement ele2: colums)
		{
		System.out.println(ele2.getText());
		}
		
	}

}
