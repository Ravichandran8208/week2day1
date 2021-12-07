package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText( "CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Armsoftecpvt ltd");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ravi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("pasupathi");
		WebElement elementdropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select select=new Select(elementdropdown);
		select.selectByValue("LEAD_EMPLOYEE");
		
		driver.findElement(By.name("submitButton")).click();
		//driver.get("http://leaftaps.com/crmsfa/control/viewLead?partyId=10526");
		
		String heading = driver.getTitle();
		System.out.println(heading);
		
		
		//System.out.println(title);
		
	}
	



	
		
		

	}


