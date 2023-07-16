package assignmentpackage;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class BlueStone {

	public static void main(String[] args) throws AWTException {
		System.setProperty("wedriver.chrome.driver", "./driver.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[text()='Allow']")).click();
        driver.findElement(By.xpath("//span[text()='Offers ']")).click();
        WebElement coins=  driver.findElement(By.xpath("//a[text()='Coins ']"));
        driver.findElement(By.xpath("//span[text()='25% Off your first Gold Mine installment']")).click();
        Actions act=new Actions(driver);
        act.moveToElement(coins).perform();
        driver.findElement(By.xpath("//span[text()='20 Gram']")).click();
        driver.findElement(By.xpath("//a[text()='Coins ']"));
        driver.findElement(By.xpath("//span[text()='weight (Gram)']")).click();
        Robot robot=new Robot();
        for(int i=1;i<4;i++);
        {
        	robot.keyPress(KeyEvent.VK_TAB);
        	robot.keyRelease(KeyEvent.VK_TAB);
        }
           robot.keyPress(KeyEvent.VK_ENTER);
           robot.keyRelease(KeyEvent.VK_ENTER);
           
        
        }

	
	}

        
        
        
        
        
	

	
