package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {
public static void main(String[] args) {
	// Setting the Chrome Driver
	WebDriverManager.chromedriver().setup();
	// Launch the browser
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("http://leafground.com/pages/Edit.html");
	
	driver.manage().window().maximize();
	
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("gsuganyakrishnan@gmail.com");
	email.sendKeys("Suganya",Keys.TAB);
	
	//Get the entered text
	String text = driver.findElement(By.name("username")).getAttribute("value");
	System.out.println("Text Enetered : " +text);
	
	//Clear the text
	driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
	
	//make sure the edit field is disabled
	System.out.println("Is it enabled : " +driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input")).isEnabled());
	
}
}
