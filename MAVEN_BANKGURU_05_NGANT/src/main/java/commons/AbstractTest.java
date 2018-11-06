package commons;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbstractTest {
	WebDriver driver;

	public WebDriver openMutilBrowser(String browserName,String url) {
		if (browserName.equals("chrome")) {
			 System.setProperty("webdriver.chrome.driver",".\\src\\test\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		} else {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("headless");
			options.addArguments("window-size=1920x1080");
			driver = new ChromeDriver(options);
		}
		 driver.get(url);
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}

	   public int randomNumber() {
		   Random rand = new Random();
		   int  number = rand.nextInt(999999) + 1;
		   return number;
	   }
	public void quitBrowser() {
		driver.quit();
	}
}
