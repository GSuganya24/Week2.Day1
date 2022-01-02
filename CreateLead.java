package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
public static void main(String[] args) {
	// Open the browser
	// Setup the driver
	WebDriverManager.chromedriver().setup();
	// Launch the browser
	ChromeDriver driver = new ChromeDriver();
	// Load the url
	driver.get("http://leaftaps.com/opentaps/control/login");
	// Maximize the browser
	driver.manage().window().maximize();
	// Enter the username
			WebElement userName = driver.findElement(By.id("username"));
			userName.sendKeys("DemoSalesManager");

			// Enter the password
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			
			// Click on login button
			driver.findElement(By.className("decorativeSubmit")).click();

			// Click on CRM/SFA link
			driver.findElement(By.linkText("CRM/SFA")).click();
			
			//go to leads tab
			driver.findElement(By.linkText("Leads")).click();
			
			//Click Create Lead
			driver.findElement(By.linkText("Create Lead")).click();
			
			//Fill the details of all the fields in Leadtab
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("IBM");
			driver.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("Company");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Suganya");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Gopalakrishnan");
			//Selecting the value for Source field from the dropdown
			WebElement dd = driver.findElement(By.id("createLeadForm_dataSourceId"));
			Select source = new Select(dd);
			source.selectByVisibleText("Employee");
			//Selecting the value for Marketing Campaign field from the dropdown
			WebElement mc = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
			Select marketCamp = new Select(mc);
			marketCamp.selectByIndex(5);
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Suganya");
			driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Gopalakrishnan");
			driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Senior Tester");
			driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("10/24/91");
			driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Senior Engineer");
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Marketing");
			driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("650cr");
			//Selecting Industry from the dropdown
			WebElement in = driver.findElement(By.id("createLeadForm_industryEnumId"));
		    Select industry = new Select(in);
////		    industry.selectByValue("8");
		    int size = industry.getOptions().size();
		    industry.selectByIndex(size-10);
		    driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("15");
		    //Select ownership from the dropdown
		    WebElement own = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		    Select owner = new Select(own);
		    owner.selectByVisibleText("Partnership");
		    driver.findElement(By.id("createLeadForm_description")).sendKeys("We are planning to have a successful Marketing Strategy");
		    
		    //Filling the values of Contact Information
		    driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("702");
		    driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9886337375");
		    driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("56378");
		    driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Suganya");
		    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gsuganyakrishnan@gmail.com");
		    
		    //Filling Primary Address
		    //Getting the firstname from the above field
		    WebElement fname = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		    String firstname = fname.getAttribute("value");
		    //Sending the value to the field To Name
		    driver.findElement(By.id("createLeadForm_generalToName")).sendKeys(firstname);
		    driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("8,Park Avenue");
		    driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Houston");
		    //Selecting City from the dropdown
		    WebElement ct = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		    Select city = new Select(ct);
		    int size1 = city.getOptions().size();
		    city.selectByIndex(size1-9);
		    driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("77005");
		    driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("713-77005-88587");
		    driver.findElement(By.className("smallSubmit")).click();
		    //Printing the title of the page after clicking submit
		    String title = driver.getTitle();
		    System.out.println(title);
		    

			
			
			
}
}
