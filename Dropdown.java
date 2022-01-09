package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	public static void main(String[] args) {
		// Setting the Chrome Driver
		WebDriverManager.chromedriver().setup();
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
	    //Selecting from the dropdown using Index
		Select training = new Select(driver.findElement(By.id("dropdown1")));
		training.selectByIndex(1);
		//Select using text from the dropdown
		Select text = new Select(driver.findElement(By.name("dropdown2")));
		text.selectByVisibleText("Selenium");
		//Select using value from the dropdown
		Select value = new Select(driver.findElement(By.id("dropdown3")));
		value.selectByValue("1");
		//Getting the number of options
		Select options = new Select(driver.findElement(By.className("dropdown")));
		int num = options.getOptions().size();
		System.out.println("The number of options are : "+num);
		//Select value selenium from dropdown
		driver.findElement(By.xpath("//div[@class='example'][5]//option[2]")).click();
		//Select the value
		driver.findElement(By.xpath("//div[@class='example'][6]//option[2]")).click();
	}

}
