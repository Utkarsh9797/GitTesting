package GitTesting.GitTesting;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdityaKendo_Palindrome {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demos.telerik.com/kendo-ui/dropdownlist/index");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement dropdown = driver.findElement(
				By.xpath("//span[contains(text(),'Find restaurants in your area')]/following-sibling::span"));
		dropdown.click();
		List<WebElement> cities = driver.findElements(By.cssSelector("#kd-place-chooser_listbox li"));
//		StringBuilder sb =new StringBuilder();
//		sb.reverse();
		
		//int count = cities.size();

		for (int i = 0; i < cities.size(); i++) 
		{
			String city = cities.get(i).getText();
			System.out.println(city);
			StringBuilder sb =new StringBuilder(city);
			String revCity = sb.reverse().toString();

			if (city.equalsIgnoreCase("Oslo")) {
				cities.get(i).click();
			}
			if (city.equals(revCity)) 
			{
				System.out.println(city + " is palindrom");
			}
			else {
				System.out.println(city + " is not palindrom");
			}
		}

	}

}
