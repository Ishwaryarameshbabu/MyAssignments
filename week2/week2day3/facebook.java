package week2day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Ishwarya");
		driver.findElement(By.name("lastname")).sendKeys("RameshBabu");
		//driver.findElement(By.xpath("//div[contains(text(),'Mobile number or email')]")).sendKeys("ishwaryarameshbabu@gmail.com");
		driver.findElement(By.name("reg_email__")).sendKeys("ishwaryarameshbabu@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("ishwaryarameshbabu@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("ishwarya28795");
		//select by visible text
		WebElement fac = driver.findElement(By.id("month"));
		Select opt=new Select(fac);
		opt.selectByVisibleText("Jul");
		//select by value
		Select opt1=new Select(driver.findElement(By.id("day")));
		opt1.selectByValue("28");
		//select by value
		Select opt2=new Select(driver.findElement(By.id("year")));
		opt2.selectByValue("1995");
		driver.findElement(By.name("sex")).click();
		//driver.findElement(By.name("websubmit")).click();
		
		
        
	}

}
