package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSignUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("input[id^='e']")).sendKeys("9049349714");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("input[class$='inputtext _55r1 _6luy _9npi']")).sendKeys("381997");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("button[name='login']")).click();
    Thread.sleep(2000);
    
    
	}   
    
	}


