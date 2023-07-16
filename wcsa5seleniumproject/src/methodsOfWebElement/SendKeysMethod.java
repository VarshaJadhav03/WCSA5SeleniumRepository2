package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {
	public static void main(String[] args) {
		System.setProperty("wedriver.chrome.driver", "./driver.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Using method chaining
		//driver.findElement(By.name("username")).sendKeys("admin");

		//Using reference variable
		WebElement usnTB=driver.findElement(By.name("username"));
		usnTB.sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("manager");
		driver.findElement(By.id("//button[@class'-login-button']")).click();
	}

}
