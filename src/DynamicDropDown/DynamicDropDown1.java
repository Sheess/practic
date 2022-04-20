package DynamicDropDown;

import java.util.List;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropDown1 {

	public static void main(String[] args) {
		
		// how to handle dynamic dropDown and calendars
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\azizr\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.aa.com/homePage.do");
		
		// we need to find locator of UI element
		WebElement from = driver.findElement(By.id("reservationFlightSearchForm.originAirport"));
		
		// we need to clear the existing value 
		from.clear();
		from.sendKeys("Wash");
		// we are storing list if elements from dropdown into a list using driver,findElemenst method of selenium
		List<WebElement> fromAirports = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		System.out.println(fromAirports.size());
		
		// we are writting forEach loop to itterate throwgh list and we are writting
		// If condition to get text of webElements from list and condition meets 
		// we will write. click on method to click on elements.
		
		for (WebElement element : fromAirports )
		{
			if (element.getText().contains("IAD"))
				element.click();
		}
		
		WebElement To = driver.findElement(By.id("reservationFlightSearchForm.destinationAirport"));
		To.clear();
		To.sendKeys("new");
		
		List <WebElement> ToAirport = driver.findElements(By.xpath("//ul[@id='ui-id-2']/li"));
		
		for (WebElement element1: ToAirport)
		{
			if (element1.getText().contains("SAF"))
				element1.click();
			{
				
				WebElement numberOfPassengers = driver.findElement(By.id("flightSearchForm.adultOrSeniorPassengerCount"));
				// we will create the object of the select clss to handle static dropdown
				
				Select selct = new Select (numberOfPassengers);
				selct.selectByVisibleText("9");
				
				WebElement departureDate = driver.findElement(By.id("aa-leavingOn"));
				WebElement arrivalDate = driver.findElement(By.id("aa-returningFrom"));
				
				// we need to pass the date we are leaving coming back. 
				// using javascript we need to remember we need to pass proper format is mm/dd/yyyy we have to pass this
				// formate if format is mm-dd-yyyy then we have to pass this formate
				
				String depDate = "07/16/2021"; // if format was july-16 i should pass that format
				String arrDate = "07/18/2021";
				
				// in order to automat dalendare in selenium we need to use JavaExecuter
				
				JavascriptExecutor js = ((JavascriptExecutor)driver);
				js.executeScript("arguments[0].setAttribute('value','" +depDate+ "')", departureDate);
				// we can find all java script document in this webSite : selenium documentation javaExecutor
				js.executeScript("arguments[0].setAttribute('value','" +arrDate+ "')", arrivalDate);
				
			}
		}
		
		
		
}
}