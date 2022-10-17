package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {
	String url ="https://www.facebook.com/";
	WebDriver driver;
	@Test
	public void test() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		System.out.print(url);
		driver.findElement(By.name("email")).sendKeys("siva123");;
		driver.findElement(By.name("pass")).sendKeys("sivanesh");
		driver.findElement(By.name("login")).click();
		
	}

}
