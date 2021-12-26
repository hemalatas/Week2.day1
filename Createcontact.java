package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createcontact {

	private static char[] text;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager .chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Hema");
	    driver.findElement(By.id("lastNameField")).sendKeys("Latha");
	    driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Hema");
	    driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Latha");
	    driver.findElement(By.id("createContactForm_description")).sendKeys("Interesting");
	    driver.findElement(By.name("departmentName")).sendKeys("Automation");
	    driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("hemalathasigamani@gmail.com");
        WebElement ele = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
        Select dd= new Select(ele);
        dd.selectByVisibleText("Alabama");
	    driver.findElement(By.className("smallSubmit")).click();
	    driver.findElement(By.id("viewContact_firstName_sp")).getText();
	    driver.findElement(By.linkText("Edit")).click();
	    driver.findElement(By.id("updateContactForm_description")).clear();
	    driver.findElement(By.name("importantNote")).sendKeys("Very Interesting");
	    driver.findElement(By.className("smallSubmit")).click();
	    String title = driver.getTitle();
	    
	    System.out.println(title);
	
}














}
        

	

