package week2day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneCountryCode")).clear();
		driver.findElement(By.name("phoneCountryCode")).sendKeys("");
		driver.findElement(By.name("phoneAreaCode")).sendKeys("");
		driver.findElement(By.name("phoneNumber")).sendKeys("8925416830");
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();		
		Thread.sleep(1200);
		WebElement leadFirst = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		String lead = leadFirst.getText();
		System.out.println(lead);
		leadFirst.click();
		//driver.findElement(By.xpath("//a[text()='14937']/ancestor::td")).click();
		//driver.findElement(By.linkText("Delete")).click();
		//driver.findElement(By.linkText("Find Leads")).click();
        
	}

}
