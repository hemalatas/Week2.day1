package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadsinleaftapsapplication {

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
     WebElement ele = driver.findElement(By.id("createLeadForm_dataSourceId"));
     Select dd=new Select(ele);
     dd.selectByVisibleText("Employee");
     WebElement ele1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
     Select dd1=new Select(ele1);
     dd1.selectByVisibleText("Automobile");
     driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Hema");
     driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Latha");
     driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mrs");
     driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("03/07/1990");
     driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Software Testing");
     driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation");
     driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("75,000");
     WebElement ele2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
     Select dd2=new Select(ele2);
     dd2.selectByIndex(2);
     WebElement ele3 = driver.findElement(By.id("createLeadForm_currencyUomId"));
     Select dd3=new Select(ele3);
     dd3.selectByValue("INR");
     driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("180");
     WebElement ele4 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
     Select dd4=new Select(ele4);
     dd4.selectByVisibleText("Corporation");
     driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("20");
     driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("true");
     driver.findElement(By.id("createLeadForm_description")).sendKeys("Very Enthusiastic");
     driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("91");
     driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9234567895");
    driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("080");
    driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Latha");
    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("hemalathasigamani@gmail.com");	
    driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("gmail.com");	
    driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Hema");
    driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Latha");		
    driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Allanahalli");	
    driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Mysore");
    driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Mandya District"); 	
     WebElement ele5 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
    Select dd5=new Select(ele5);
    dd5.selectByValue("Indiana");
    driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("56011");
    driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("56011");
     WebElement ele6 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
    Select dd6=new Select(ele6);
    dd6.selectByValue("IND");
    driver.findElement(By.className("submitButton")).click();
    String text=driver.findElement(By.id("viewLead_firstName_sp")).getText();
    String title = driver.getTitle();
    System.out.println(text);
	}

}

