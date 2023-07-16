package popup;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleMethod {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("wedriver.chrome.driver", "./driver.chromedriver.exe");
		//launch the browser
		WebDriver driver=new ChromeDriver();
		//Maximize window
		driver.manage().window().maximize();
		//Apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Launch the web apllication
		
		driver.get("http://admin-pc/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Settings']/ancestor::a")).click();
		driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
		driver.findElement(By.id("uploadNewLogoOption")).click();
		WebElement target=driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.doubleClick(target).perform();
		
		File dest=new File("./Autoitprograms/FileUp.exe");
		String sba = dest.getAbsolutePath();
		Runtime.getRuntime().exec(sba);
		
		Thread.sleep(2000);
		driver.quit();
		

	}

}
