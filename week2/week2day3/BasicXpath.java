package week2day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicXpath {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[contains(@id,'createLeadForm_companyName')]")).sendKeys("TCS");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[3]")).sendKeys("Ishwarya");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[4]")).sendKeys("RameshBabu");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("ishwaryarameshbabu@gmail.com");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("8925416830");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

	}

}
