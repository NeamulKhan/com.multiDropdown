package utilitymultipleDropdown;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BaseClassmultipleDropdown {
	
	public static Properties muldrop_prop;
	public static WebDriver driver;
	
public BaseClassmultipleDropdown() {
	
try {
	FileInputStream	files = new FileInputStream( System.getProperty("user.dir")+"\\src\\test\\java\\com\\multipleDropdown\\config\\com.multipleDropdown.Properties");
	
	muldrop_prop = new Properties();
	
	muldrop_prop.load(files);
	
} catch (FileNotFoundException e) {
	
	System.out.println("Please check your constructor");
	e.printStackTrace();
}catch (IOException e) {
	e.printStackTrace();
}
}

public void multipleDropdownbrowserinit() {
	
	String muldropBrowser=muldrop_prop.getProperty("Browser1");
	
	if(muldropBrowser.equalsIgnoreCase("Chrome")) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\webDrivermultipleDropdown\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestDatamultipleDropdown.implicitywait));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestDatamultipleDropdown.pageLoadwait));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		}
	else if(muldropBrowser.equalsIgnoreCase("FireFox")) {
		
		
	}
}
 public static void multipleDropdownLaunchURL(String URL) {
	 
	 driver.get(muldrop_prop.getProperty("URL"));
 }



}



