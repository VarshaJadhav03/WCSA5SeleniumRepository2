package methodsOfWebElement;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("wedriver.chrome.driver", "./driver.chromedriver.exe");
		//launch the browser
		WebDriver driver=new ChromeDriver();
		//Maximize window
		driver.manage().window().maximize();
		//Apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Launch the web apllication
		driver.get("http://omayo.blogspot.com/");
		//get the handle oe address of current or parent window
		String parenthandle=driver.getWindowHandle();
		System.out.println("Adress of parent window:"+parenthandle);
		
		//Handle chiled Window
		driver.findElement(By.partialLinkText("open a pop up window")).click();
		Thread.sleep(2000);
		//get the handle or address of child window only
		Set<String> allhandles=driver.getWindowHandles();
		
		//Read address by using looping statement
		for(String wh:allhandles)
		{
			System.out.println(wh);
		}


	}

}
