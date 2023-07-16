package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("wedriver.chrome.driver", "./driver.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///D:/SeleniumHTMLprogram/Confirmationpopup.html");
	     //To generate confirmation popup
		 driver.findElement(By.tagName("input")).click();
		 //To handle confirmation popup by using switchTo
		 Thread.sleep(2000);
		 Alert al=driver.switchTo().alert();
		 al.accept();//for accept confirmation popup
		 al.dismiss();//for dismiss confirmation popup
		 System.out.println("getText");

	}

}
