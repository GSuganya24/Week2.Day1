package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindContacts {
	public static void main(String[] args) {
		// Open the browser
				// Setup the driver
				WebDriverManager.chromedriver().setup();
				// Launch the browser
				ChromeDriver driver = new ChromeDriver();
				// Load the url
				driver.get("http://leaftaps.com/opentaps/");
				// Maximise the browser
				driver.manage().window().maximize();
				// Enter the username
				WebElement userName = driver.findElement(By.id("username"));
				userName.sendKeys("DemoSalesManager");

				// Enter the password
				driver.findElement(By.id("password")).sendKeys("crmsfa");

				// Click on login button
				driver.findElement(By.className("decorativeSubmit")).click();
				
				//Click on CRM/SFA link
						driver.findElement(By.linkText("CRM/SFA")).click();
						
				//Click Contacts Tab
					driver.findElement(By.linkText("Contacts")).click();

				//Click Find Contacts
					driver.findElement(By.linkText("Find Contacts")).click();
					
				//Go to Email Tab
					driver.findElement(By.linkText("Email")).click();
				
				//Type email address as babu@testleaf.com
				WebElement emailAddress = driver.findElement(By.name("emailAddress"));
				emailAddress.sendKeys("babu@testleaf.com");
				
				//Click find contacts
				driver.findElement(By.linkText("Find Contacts")).click();
				
				//Close the browser
				driver.close();
				
				
				
	}

}
