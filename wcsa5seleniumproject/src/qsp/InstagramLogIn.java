package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogIn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.cssSelector("input[@name='username']")).sendKeys("varsha");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[@name='password']")).sendKeys("varsha@1");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("loginButton")).click();
		
		
	}

}
