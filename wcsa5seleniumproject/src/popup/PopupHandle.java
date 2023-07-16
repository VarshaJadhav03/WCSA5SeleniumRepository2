package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandle {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("wedriver.chrome.driver", "./driver.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///D:/SeleniumHTMLprogram/Alert.html");
		//To generate pop up click on button
		driver.findElement(By.xpath("//button[@type='button']")).click();
		//handle pop up By using Robot class
//		Robot robot=new Robot();
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);
		
		//Handle alert pop up by using switchto 
         Alert al=driver.switchTo().alert();
		Thread.sleep(2000);
    	al.accept(); //for accept the alert popup
//		al.dismiss(); //for dismiss the alert popup
		//System.out.println(al.getText());//return the text to alert popup
		
		
		
		

	}

}
