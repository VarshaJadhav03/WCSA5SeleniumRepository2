package popup;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class NotificationPopup {
	static WebDriver driver;

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in); 
	 System.out.println("Enter browservalue");
	 String browserValue=sc.next();
	 if(browserValue.equalsIgnoreCase("chrome"))
	 {	 
		System.setProperty("wedriver.chrome.driver", "./driver.chromedriver.exe");
		//handle notification Popup
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.easemytrip.com/");
	}
	else if(browserValue.equalsIgnoreCase("Edge"))
	{
		System.setProperty("wedriver.edge.driver", "./driver.edgedriver.exe");
		//handle notification Popup
				EdgeOptions eo=new EdgeOptions();
				eo.addArguments("--disable-notifications");
			     driver=new EdgeDriver(eo);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get("https://www.easemytrip.com");
	}
//	else if(browserValue.equalsIgnoreCase("Firefox"))
//	{
//		System.setProperty("wedriver.gecko.driver", "./driver.geckodriver.exe");
//		//handle notification Popup
//				GeckoOptions go=new GeckoOptions();
//				go.addArguments("--disable-notifications");
//			     driver=new GeckoDriver(eo);
//				driver.manage().window().maximize();
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//				driver.get("https://www.easemytrip.com");
//	}
	else
	{
		System.out.println("Enter valid browserValue");
	}
		
		

	}
	}

