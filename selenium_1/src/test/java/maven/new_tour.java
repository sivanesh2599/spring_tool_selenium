package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class new_tour {
	String url ="https://demo.guru99.com/test/newtours/";
	WebDriver driver;
	String t;
	String ur;
	
	@BeforeTest
	public void bt() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.get(url);
		driver.navigate().to(url);
		driver.manage().window().maximize();
	
	}
	
	@Test(priority=0)
	public void test_1() throws InterruptedException {
		//User login
		Thread.sleep(3000);
		driver.findElement(By.name("userName")).sendKeys("user");
		driver.findElement(By.name("password")).sendKeys("user");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='REGISTER']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
	}
	@Test(priority=1,enabled=false)
	public void test_2() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.name("firstName")).sendKeys("sivanesh");//First name
		driver.findElement(By.name("lastName")).sendKeys("kumar");//Last name
		driver.findElement(By.name("phone")).sendKeys("9876543210");//Phone
		driver.findElement(By.id("userName")).sendKeys("sivanesh@gmail.com");//Mail id
		driver.findElement(By.name("address1")).sendKeys("Pattiveeranpatti");//address
		driver.findElement(By.name("city")).sendKeys("Dindigul");//City
		driver.findElement(By.name("state")).sendKeys("Tamilnadu");//state
		driver.findElement(By.name("postalCode")).sendKeys("624211");//postal code
		Select s = new Select(driver.findElement(By.name("country")));
		//s.selectByVisibleText("AUSTRALIA");
		//s.selectByValue("AUSTRALIA");
		s.selectByIndex(12);
		driver.findElement(By.id("email")).sendKeys("sivanesh@gmail.com");
		driver.findElement(By.name("password")).sendKeys("user");
		driver.findElement(By.name("confirmPassword")).sendKeys("user");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		t=driver.getTitle();
		System.out.println(t);
		ur=driver.getCurrentUrl();
		System.out.println(ur);
		
	}
	@AfterTest(enabled=false)
	public void at() {
		driver.quit();
	}
	
	
	

}
