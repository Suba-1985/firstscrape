package baseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
 
  
	@BeforeClass
	public void init_browser() {
		driver=new ChromeDriver();
		ChromeOptions option=new ChromeOptions();
		//option.addArguments("--headless");
		
		driver.get("https://www.indeed.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterSuite
	public void closebrowser()
	{
		driver.quit();
	}
}
