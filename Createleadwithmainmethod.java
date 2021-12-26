package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Createleadwithmainmethod {

	public static void main(String[] args) {
		WebDriverManager .chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
     driver.findElement(By.linkText("Leads")).click();
     driver.findElement(By.linkText("Create Lead")).click();
     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test leaf");
     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hema");	
     driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Latha");
     driver.findElement(By.className("smallSubmit")).click();
     String title1 = driver.getTitle();
     
     System.out.println(title1);
     
     
     }

	}

