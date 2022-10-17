package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class insurance_project {
	
	String url ="https://demo.guru99.com/test/newtours/";
	WebDriver driver;
	String ul;
	
	@BeforeTest
	public void bt() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@Test(priority=0)
	public void test1() throws InterruptedException {
		Thread.sleep(2000);
		WebElement insurance = driver.findElement(By.xpath("//*[text()='Insurance Project']"));
		insurance.click();
		Thread.sleep(10000);
		//Register
		WebElement register = driver.findElement(By.xpath("//*[text()='Register']"));
		register.click();
		//Title click
		WebElement title = driver.findElement(By.id("user_title"));
		title.click();
		Thread.sleep(2000);
		//Mr or Mrs
		WebElement mr = driver.findElement(By.xpath("//*[@value='Mr']"));
		mr.click();
		//first name
		WebElement firstname = driver.findElement(By.xpath("//*[@autofocus='autofocus']"));
		firstname.sendKeys("sivanesh");
		//last name
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("kumar");
		//phone number
		WebElement phonenum = driver.findElement(By.id("user_phone"));
		phonenum.sendKeys("986543210");
		//Date of birth year
		driver.findElement(By.id("user_dateofbirth_1i")).click();
		Thread.sleep(2000);
		//Date of birth year
		driver.findElement(By.xpath("//*[@value='1995']")).click();
		//DOB month
		driver.findElement(By.name("month")).click();
		Thread.sleep(2000);
		//DOB month
		driver.findElement(By.xpath("//*[text()='1995']")).click();
		//DOB date
		driver.findElement(By.id("user_dateofbirth_3i")).click();
		//Provisional
		driver.findElement(By.xpath("//*[@value='Provisional']")).click();
		//License period
		driver.findElement(By.id("user_licenceperiod")).click();
		//License period
		driver.findElement(By.xpath("//*[@value='80']")).click();
		//Occupation
		driver.findElement(By.id("user_occupation_id")).click();
		//Occupation
		driver.findElement(By.xpath("//*[text()='Architect']")).click();
		//Address
		driver.findElement(By.id("user_address_attributes_street")).sendKeys("Pattiveeranpattti");
		//City
		driver.findElement(By.id("user_address_attributes_city")).sendKeys("dindigul");
		//Country
		driver.findElement(By.name("county")).sendKeys("India");
		//Post code
		driver.findElement(By.id("user_address_attributes_postcode")).sendKeys("624211");
		//Email
		driver.findElement(By.xpath("//*[@placeholder='youremail@abv.bg']")).sendKeys("sivanesh@gmail.com");
		//Password
		driver.findElement(By.id("user_user_detail_attributes_password")).sendKeys("sivanesh");
		//Confirm password
		driver.findElement(By.id("user_user_detail_attributes_password_confirmation")).sendKeys("sivanesh");
		//Submit button
		driver.findElement(By.name("submit")).click();
	}
	@Test(priority=1)
	public void test2() throws InterruptedException {
		
		Thread.sleep(2000);
		//Login with mail
		driver.findElement(By.id("email")).sendKeys("sivanesh@gmail.com");
		//password
		driver.findElement(By.name("password")).sendKeys("sivanesh");
		//login button
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
	}
	@Test(priority=2)
	public void test3() throws InterruptedException {
		
		Thread.sleep(2000);
		//Request quotation
		driver.findElement(By.id("ui-id-2")).click();
		//Break down cover
		driver.findElement(By.id("quotation_breakdowncover")).click();
		Thread.sleep(2000);
		//Break down cover 
		driver.findElement(By.xpath("//*[text()='European']")).click();
		//Wind screen repair
		driver.findElement(By.id("quotation_windscreenrepair_t")).click();
		//Quotation incident
		driver.findElement(By.id("quotation_incidents")).sendKeys("crashing");
		//vehicle registration
		driver.findElement(By.xpath("//*[@placeholder='Enter vehicle registration']")).sendKeys("tn59 ab0000");
		//vehicle mileage
		driver.findElement(By.xpath("//*[@placeholder='Enter vehicle mileage']")).sendKeys("15");
		//Estimate value
		driver.findElement(By.xpath("//*[@placeholder='Enter vehicle value']")).sendKeys("200000");
		//Parking location
		Select s = new Select(driver.findElement(By.name("parkinglocation")));
		s.selectByValue("Garage");
		//Start of policy Year
		Select s1 = new Select(driver.findElement(By.name("year")));
		s1.selectByValue("2019");
		//Start of policy month
		Select s2 = new Select(driver.findElement(By.name("month")));
		s2.selectByVisibleText("September");
		//Start of policy date
		Select s3 = new Select(driver.findElement(By.name("date")));
		s3.selectByVisibleText("3");
		//Save quotation
		driver.findElement(By.xpath("//*[@value='Save Quotation']")).click();
		Thread.sleep(3000);
		ul=driver.getCurrentUrl();
		System.out.println(ul);
		Thread.sleep(2000);
		driver.navigate().back();
		//logout
		driver.findElement(By.xpath("//*[@value='Log out']")).click();
		//CLick on bank project
		driver.findElement(By.xpath("//*[text()='Bank Project']")).click();
		//user id
		driver.findElement(By.name("uid")).sendKeys("mngr446911");
		//password
		driver.findElement(By.name("password")).sendKeys("UzerUbU");
		//Login button
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(3000);
		//new customer
		driver.findElement(By.xpath("//*[text()='New Customer']")).click();
		Thread.sleep(2000);
		//customer name
		driver.findElement(By.name("name")).sendKeys("sivanesh");
		//gender
		driver.findElement(By.name("rad1")).click();
		//address
		driver.findElement(By.name("addr")).sendKeys("Pattiveeranpatti,dindigul");
		//city
		driver.findElement(By.name("city")).sendKeys("Pattiveeranpatti");
		//state
		driver.findElement(By.name("state")).sendKeys("Tamil nadu");
		//pincode
		driver.findElement(By.xpath("//*[@onblur='validatePIN();']")).sendKeys("624211");
		//telephone
		driver.findElement(By.xpath("//*[@onblur='validateTelephone();']")).sendKeys("9876543210");
		//email
		driver.findElement(By.name("emailid")).sendKeys("sivanesh@gmail.com");
		//click submit
		driver.findElement(By.xpath("//*[@value='Submit']")).click();
		
	}
	@AfterTest(enabled=false)
	public void at() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
		
	}	
	


