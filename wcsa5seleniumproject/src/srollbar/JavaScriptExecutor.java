package srollbar;

import java.time.Duration;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("wedriver.chrome.driver", "./driver.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		//Right Scroll
		jse.executeScript("window.scrollBy(5000,0)");
		Thread.sleep(2000);
		//Left Scroll
		jse.executeScript("window.scrollBy(-5000,0)");
		//Down scroll
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		//Up scroll
		jse.executeScript("window.scrollBy(0,-500)");
		
	
		
	}

}
