package maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testng {
	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	String url1 = "https://www.facebook.com/";
	WebDriver driver;
	
	@BeforeTest
	public void bt()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().fullscreen();
		//driver.manage().window().maximize();
	}
	@Test(priority=0)
	public void windowhandle() throws InterruptedException {
		driver.getWindowHandle();
		//open new tab and switch to new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		//navigate to new tab and enter url
		driver.navigate().to(url1);
		Thread.sleep(3000);
		driver.quit();
	}
	@Test (priority =0,enabled=false)
	public void testcase1() throws InterruptedException {
		Thread.sleep(2000);
		//enter username
		driver.findElement(By.name("username")).sendKeys("Admin");
		//enter password
		driver.findElement(By.name("password")).sendKeys("admin123");
		//click on login button
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}
	@Test(priority=1,enabled=false)
	public void testlink() {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("the total no of links is:"+links.size());
		
		for(int i=0;i<links.size();i++)
		{
			//get text of all links
			System.out.println(links.get(i).getText());
			//get attribute of all links
			System.out.println(links.get(i).getAttribute("href"));
		}
	}
	@Test(priority=3,enabled=false)
	public void testcase4() throws InterruptedException {
		Thread.sleep(2000);
		//click on admin
		driver.findElement(By.xpath("//*[text()='Admin']")).click();
		Thread.sleep(3000);
		//Enter user name
		driver.findElement(By.xpath("//*[@class='oxd-form-row']/div/div[1]/div/div[2]/input")).sendKeys("Dominic.Chase");
		Thread.sleep(3000);
		//create actions
		Actions act = new Actions(driver);
		//select user role using mouseover
		WebElement userrole=driver.findElement(By.xpath("//*[@class='oxd-select-wrapper']/div/div[2]"));
		act.moveToElement(userrole).click().build().perform();
		Thread.sleep(3000);
		//click on userrole using keyboard actions
		act.sendKeys(userrole,Keys.ARROW_DOWN).click().build().perform();
		act.sendKeys(userrole,Keys.ENTER).click().build().perform();
		Thread.sleep(2000);
		//enter hints of user
		WebElement hints=driver.findElement(By.xpath("//*[@placeholder='Type for hints...']"));
		act.sendKeys(hints,"Dominic Chase").click().build().perform();
		Thread.sleep(3000);
		//status
		WebElement status=driver.findElement(By.xpath("//*[@class='oxd-form-row']/div/div[4]/div/div[2]/div"));
		act.click(status).build().perform();
		Thread.sleep(3000);
		//select staus using keyboard actions
		act.sendKeys(status,Keys.ARROW_DOWN).click().build().perform();
		Thread.sleep(4000);
		//double click on search
		WebElement search=driver.findElement(By.xpath("//*[@type='submit']"));
		act.moveToElement(search).doubleClick().build().perform();
	    Thread.sleep(3000);
	    //click on username selected
	    driver.findElement(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).click();
	    Thread.sleep(2000);
	    //click on delete icon
	    WebElement delete=driver.findElement(By.xpath("//*[@class='oxd-icon bi-trash']"));
	    act.moveToElement(delete).click().build().perform();
	    Thread.sleep(3000);
	    //delete user
	    driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
		
		
//		List<WebElement> li=driver.findElements(By.xpath("//*[@class='oxd-table']"));
//		System.out.println(li.size());
//		driver.findElements(By.xpath("//*[@class='oxd-table-card']")).get(6).click();
//		Thread.sleep(3000);
//		driver.findElements(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).get(6).click();
//		Thread.sleep(3000);
//		System.out.println(driver.findElements(By.xpath("//*[@class='oxd-table-card']")).get(6).getText());
//		Thread.sleep(3000);
//		driver.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(6).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
//		
	}
	@Test (priority =2,enabled=false)
	public void testcase2() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
	}
	@Test (priority =1,enabled=false)
	public void testcase3() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Maintenance']")).click();
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--large oxd-button--secondary orangehrm-admin-access-button']")).click();
	    Thread.sleep(3000);	
	}
	@AfterTest(enabled=false)
	public void at() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	}

	



