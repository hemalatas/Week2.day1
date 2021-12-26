package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverManager {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver  driver=new  ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps"); 
        driver.manage().window().maximize();  
        String title = driver.getTitle();
        System.out.println(title);
        
     driver.findElement(By.id("Username")).sendKeys("DemoSalesManager");
     driver.findElement(By.id("Password")).sendKeys("crmsfa");
     driver.findElement(By.className("decorative Submit")).click();
     driver.findElement(By.linkText("CRM/SFA")).click();
     driver.findElement(By.linkText("Leads")).click();
     driver.findElement(By.linkText("Create Leads")).click();
     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test leaf");
     driver.findElement(By.id("createLeadForm_FirstName")).sendKeys("Hema");	
     driver.findElement(By.id("createLeadForm_LastName")).sendKeys("Latha");
     driver.findElement(By.className("smallSubmit")).click();
     String title2 = driver.getTitle();
	}

}
