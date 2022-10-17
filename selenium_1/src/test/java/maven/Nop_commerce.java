package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nop_commerce {
	String url="https://demo.nopcommerce.com/";
	WebDriver driver;
	
	@BeforeTest
	public void bt() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	@Test
	public void test1() throws InterruptedException {
		//register
		driver.findElement(By.xpath("//*[text()='Register']")).click();
		Thread.sleep(2000);
		//gender
		driver.findElement(By.id("gender-male")).click();
		//First name
		driver.findElement(By.id("FirstName")).sendKeys("sivanesh");
		//lastname
		driver.findElement(By.name("LastName")).sendKeys("kumar");
		//dob date
		Select date = new Select(driver.findElement(By.name("DateOfBirthDay")));
		date.selectByValue("3");
		//dob month
		Select month = new Select(driver.findElement(By.name("DateOfBirthMonth")));
		month.selectByVisibleText("September");
		//dob year
		Select year = new Select(driver.findElement(By.name("DateOfBirthYear")));
		year.selectByVisibleText("2000");
		//email
		driver.findElement(By.id("Email")).sendKeys("sivanesh@gmail.com");
		//company
		driver.findElement(By.id("Company")).sendKeys("moolya");
		//password
		driver.findElement(By.id("Password")).sendKeys("sivanesh");
		//confirm password
		driver.findElement(By.id("ConfirmPassword")).sendKeys("sivanesh");
		//register button
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(3000);
		//continue
		driver.findElement(By.xpath("//*[@class='button-1 register-continue-button']")).click();
	}
		
	@Test
	public void test2() throws InterruptedException {
		Thread.sleep(2000);
		
		
		
	}
		
	}
			


