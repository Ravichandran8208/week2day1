package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText( "CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Find Contacts")).click();
		driver.findElement(By.linkText("Email")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("babu@gmail.com");
		driver.findElement(By.linkText("Find Contacts")).click();
		String heading = driver.getTitle();
		System.out.println(heading);
		driver.close();
		//WebElement findElement = driver.findElement(By.className("x-tool x-tool-toggle "));
		//Select select=new Select("findelement");
		//select.selectByValue(value);
		//WebElement element = driver.findElement(By.className("x-tool x-tool-toggle "));
		//Select select=new Select( element);
	//select.selectByValue(by.);
		
		
		
		
		

	}

}
