package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LearnLocators {

	WebDriver driver;

	@Before
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.cnn.com/?refresh=1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void testLocators() throws InterruptedException {
		//driver.findElement(By.name("firstname")).sendKeys("Vanessa");
		
	//	driver.findElement(By.partialLinkText("TF-API")).click();
		//driver.findElement(By.xpath("//strong[contains (text(),'Link Test : New Page')]")).click();
//		driver.findElement(By.linkText("API Documentations")).click();
		
		//Absolute xpath
		//driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[10]/input")).sendKeys("is fun");
		//relative xpath mostly used than the absolite one
		//driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Love selenium");
		driver.findElement(By.xpath("//div[@data-uri='cms.cnn.com/_components/card/instances/clvutjr2c0083356j34lxzl31@published']/child::a[2]")).click(); 
		
	}
}
