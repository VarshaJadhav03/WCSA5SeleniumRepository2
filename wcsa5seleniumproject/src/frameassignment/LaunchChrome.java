package frameassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("wedriver.chrome.driver", "./driver.chromedriver.exe");
			//launch the browser
			WebDriver driver=new ChromeDriver();
			//Maximize window
			driver.manage().window().maximize();	
			//Apply implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			//Launch the web apllication
			driver.get("https://www.google.com/");
			driver.findElement(By.xpath("//a[@class='gb_d']")).click();
			Thread.sleep(2000);
			WebElement we=  driver.findElement(By.xpath("//iframe[@name='app']"));
			driver.switchTo().frame(we);
			WebElement target=driver.findElement(By.xpath("//a[@href='https://maps.google.com/']"));
			target.click();
		}
			
			

	}
