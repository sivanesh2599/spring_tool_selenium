package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class e_commerce_shopping {
	String url = "http://automationpractice.com/";
	WebDriver driver;
	@BeforeTest
	public void bt() {
		//open a browser and get URL
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		System.out.print(url);
		driver.manage().window().maximize();
	}
	
	@Test(priority=0)
	public void test1()throws InterruptedException {
		//sign in using Mail
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='login']")).click();
		driver.findElement(By.id("email_create")).sendKeys("siva2590@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='icon-user left']")).click();
	}
		
	@Test(priority=1)
	public void test2() throws InterruptedException {
		//Enter the details of user
		Thread.sleep(5000);
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("sivanesh");
		driver.findElement(By.id("customer_lastname")).sendKeys("kumar");
		driver.findElement(By.id("passwd")).sendKeys("sivanesh");
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("company")).sendKeys("moolyaed");
		driver.findElement(By.id("address1")).sendKeys("Pattiveeranpatti");
		driver.findElement(By.id("address2")).sendKeys("GKR ILLLAM");
		driver.findElement(By.id("city")).sendKeys("Dindigul");
		driver.findElement(By.id("id_state")).click();
		driver.findElement(By.xpath("//*[text()='New York']")).click();
		driver.findElement(By.name("postcode")).sendKeys("62421");
		driver.findElement(By.id("id_country")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@selected='selected']")).click();
		driver.findElement(By.id("other")).sendKeys("nothing");
		driver.findElement(By.name("phone_mobile")).sendKeys("9876543210");
		driver.findElement(By.name("alias")).sendKeys("pattiveeranpatti");
		driver.findElement(By.name("submitAccount")).click();
	}
	@Test(priority=2)
	public void test3() throws InterruptedException {
		//Place an order and Sign out
		driver.findElement(By.xpath("//*[@title='View my shopping cart']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@title='Return to Home']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("search_query_top")).sendKeys("summer dress");
		driver.findElement(By.name("submit_search")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("selectProductSort")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Price: Lowest first']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='icon-th-list']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("color_2")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='icon-plus']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@title='Proceed to checkout']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='icon-home']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Sign out']")).click();
	}
	@AfterTest
	public void at() throws InterruptedException {
		//Quit the entire browser
		Thread.sleep(3000);
		driver.quit();
	}
}
	
	
