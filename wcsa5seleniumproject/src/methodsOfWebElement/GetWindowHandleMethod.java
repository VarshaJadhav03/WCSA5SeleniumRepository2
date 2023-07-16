package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleMethod {

	public static void main(String[] args) {
		System.setProperty("wedriver.chrome.driver", "./driver.chromedriver.exe");
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Launch the web apllication
		driver.get("http://omayo.blogspot.com/");
		WebElement childwindow=driver.findElement(By.partialLinkText("open a pop up window"));
		
		//get the handle or address of current or parent window
		String parenthandle=driver.getWindowHandle();
		System.out.println(parenthandle);

	}

}
