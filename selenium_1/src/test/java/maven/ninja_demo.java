package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ninja_demo {
	String url="http://www.tutorialsninja.com/demo/";
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
	Thread.sleep(3000);
	WebElement components =driver.findElement(By.xpath("//*[text()='Components'"));
	Actions a = new Actions(driver);
	a.moveToElement(components).perform();
}


}
