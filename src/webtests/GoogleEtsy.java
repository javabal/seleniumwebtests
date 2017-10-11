package webtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleEtsy {
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");

	}

	@Test
	public void testErrorMessage() throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.findElement(By.id("lst-ib")).sendKeys("etsy.com");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='sbtc']/div[2]/div[2]/div[1]/div/ul/li[11]/div/span[1]/span/input"))
				.click();

		driver.findElement(By.id("vs0p1c0")).click();

		Assert.assertTrue(driver.findElement(By.xpath("//*[@id='etsy-logo']/a/span[2]")).isDisplayed());
		System.out.println("pass");
	}
}
