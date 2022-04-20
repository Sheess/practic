package DynamicDropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdownPractice {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\azizr\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.aa.com/homePage.do");

		WebElement from = driver.findElement(By.id("reservationFlightSearchForm.originAirport"));
		from.clear();
		from.sendKeys("wash");
		List<WebElement> fromAirport = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		System.out.println(fromAirport.size());
		for (WebElement element : fromAirport) {
			if (element.getText().contains("IAD")) {
				element.click();
			}
		}

	}

}
