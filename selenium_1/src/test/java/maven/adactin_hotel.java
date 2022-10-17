package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class adactin_hotel {
	@Test
	public void test_1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("siva2599");
		driver.findElement(By.name("password")).sendKeys("sivaneshkumar");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("location")).click();
		driver.findElement(By.xpath("//*[@value='Melbourne']")).click();
		driver.findElement(By.name("hotels")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@value='Hotel Sunshine']")).click();
		driver.findElement(By.name("room_type")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@value='Double']")).click();
		driver.findElement(By.id("room_nos")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='3 - Three']")).click();
		driver.findElement(By.name("adult_room")).click();
		Thread.sleep(2000);
		
		
		


	
	}
}
