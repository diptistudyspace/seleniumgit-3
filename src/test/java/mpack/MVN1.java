package mpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MVN1 {
	@Test
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Login")).click();		
		
		//login to the application with valid credential
		driver.findElement(By.id("input-email")).sendKeys("diptistudyspace@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("diptistudyspace");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		System.out.println("Conform Login = " + driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Account']")).isDisplayed());
		
		//Searching for iPhone
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("iphone");
		driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
		
		System.out.println("Searching Result = "+ driver.findElement(By.xpath("//div[@class='caption']//a[contains(text(),'iPhone')]")).isDisplayed());
		driver.findElement(By.xpath("//a[normalize-space()='iPhone']")).click();
		
		//Adding the item from product display page to cart
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Add to Cart')]")).isDisplayed());
		
		WebElement quantity = driver.findElement(By.id("input-quantity"));
		quantity.clear();
		quantity.sendKeys("2");
		
		driver.findElement(By.id("button-cart")).click();
		
		//1.10min v-20
		
		
		//Thread.sleep(3000);
		//driver.quit();

	}

}
