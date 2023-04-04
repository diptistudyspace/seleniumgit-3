package mpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MVN2 {
	
	WebDriver driver;
	@Test
	public void demo112() {
System.out.println("mOne Executed");
		
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
				
	} 
	
	public void closure() {
		driver.close();
	} 
		system.out.println("Test Done");

}
