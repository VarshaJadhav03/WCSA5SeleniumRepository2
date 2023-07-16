package frameassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameUsernameDemo {

	public static void main(String[] args) {
		System.setProperty("wedriver.chrome.driver", "./driver.chromedriver.exe");
		//launch the browser
		WebDriver driver=new ChromeDriver();
		//Maximize window
		driver.manage().window().maximize();	
		//Apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Launch the web apllication
		driver.get("file:///D:/SeleniumHTMLprogram/textframe.html");
		driver.findElement(By.xpath("//input[@id='i1']")).sendKeys("varsha");
		WebElement we=driver.findElement(By.xpath("//iframe[@id=iframeId']"));
		driver.switchTo().frame(we);
		WebElement target=driver.findElement(By.xpath("//input[@id='i2']"));
		target.sendKeys("1234");

	}

}
