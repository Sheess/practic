package DynamicDropDown;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\azizr\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aa.com/homePage.do");
		driver.manage().window().maximize();
		WebElement from = driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.originAirport']"));
		from.clear();
		from.sendKeys("wash");
		List<WebElement> fromAirport = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		System.out.println(fromAirport.size());
		for (WebElement element1 : fromAirport) {
			if (element1.getText().contains("IAD")) {
				element1.click();
			}
		}

	}

}
