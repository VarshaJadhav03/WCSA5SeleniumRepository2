package srollbar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentJavaScript {

	public static void main(String[] args) {
		System.setProperty("wedriver.chrome.driver", "./driver.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("D:\\SeleniumHTMLprogram\\Documentselenium.html");
		//identify webElement
		driver.findElement(By.id("i1")).sendKeys("admin");
		//driver.findElement(By.id("i2")).sendKeys("manager");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('i2').value='manager'");
	}

}
