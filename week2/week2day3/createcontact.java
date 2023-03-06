package week2day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class createcontact {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String title=driver.getTitle();
        System.out.println(title);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Ishwarya");
		driver.findElement(By.id("lastNameField")).sendKeys("RameshBabu");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Thiyagu");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Kalyanam");
		driver.findElement(By.name("departmentName")).sendKeys("ComputerScience");
		driver.findElement(By.name("description")).sendKeys("abhdjddnjfdh");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("ishwaryarameshbabu@gmail.com");
		WebElement con = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
        Select opt=new Select(con);
        opt.selectByVisibleText("Arkansas");
        driver.findElement(By.className("smallSubmit")).click();
        driver.findElement(By.linkText("Edit")).click();
        driver.findElement(By.id("updateContactForm_description")).clear();
        driver.findElement(By.name("importantNote")).sendKeys("jkdsimndnvjvhvnjvn");
        driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		  String title1=driver.getTitle();
	        System.out.println(title1);
      
	}

}
