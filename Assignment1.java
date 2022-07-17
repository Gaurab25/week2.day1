package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) 
	{
		//Lunch URL "http://leaftaps.com/opentaps/control/login
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		// Enter UserName and Password Using Id Locator
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click on Login Button using Class Locator
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		
		// Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();
		
		//Click on Create Lead 
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Mphasis");
		
		// Enter FirstName and LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gaurab");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Barad");
		
		//Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Lipun");
		
		//Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing the follwings");
		
		//Enter Description Field Using any Locator of your choice 
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("barad.gaurab@gmail.com");
		
		//Enter your email in the E-mail address Field using the locator of your choice
		WebElement dropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		//Select State/Province as NewYork Using Visible Text
		Select select=new Select(dropdown);
		select.selectByVisibleText("New York");
		
		//Click on Create Button
		driver.findElement(By.name("submitButton")).click();
		
		//Get the Title of Resulting Page
		System.out.println("the title is :"+ driver.getTitle());
	}

}
