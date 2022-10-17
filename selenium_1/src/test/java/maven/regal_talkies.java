package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class regal_talkies {
	String url ="https://www.regaltalkies.com/";
	WebDriver driver;
	@Test
	public void test1() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get(url);
	System.out.print(url);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@class='signin_out_btn']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[text()=' Sign up']")).click();
	driver.findElement(By.name("username")).sendKeys("sivanesh");
	driver.findElement(By.name("emailId")).sendKeys("sivaneshgkr@gmail.com");
	driver.findElement(By.name("password")).sendKeys("sivanesh2599");
	driver.findElement(By.name("mobile")).sendKeys("8072615051");
	Thread.sleep(2000);
	driver.findElement(By.name("aggrement")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@class='btn-submit btn-rate']")).click();
	

}
}
