package testcase;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import appModules.ac_Confirm;
import appModules.ac_Payment;
import appModules.ac_Select;
import appModules.ac_Shipping;
import appModules.ac_login;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import pageObject.sc_Shipping;
import unility.Constant;
import unility.Log;

public class tc_Select {
	AppiumDriver driver;
	ac_Select ac_select;
	ac_login ac_log;
	ac_Shipping ac_shipping;
	ac_Payment   ac_payment;
	ac_Confirm ac_cf;

	@BeforeTest
	public void beforeClass() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		Log.startTestCase("Selenium_Test");

//		File classpathRoot = new File(System.getProperty("user.dir"));
//		File appDir = new File(classpathRoot, Constant.Path_App);
//		File app = new File(appDir, Constant.File_App);
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "CB5A1NYEES");
		cap.setCapability("platformName", "ANDROID");
		cap.setCapability("platformVersion", "5.0");
		Log.info("New driver instantiated1");
		cap.setCapability("autoGrantPermissions", "true");
		cap.setCapability("autoAcceptAlerts", true);
		cap.setCapability("autoDismissAlerts", true);
		cap.setCapability("ignoreUnimportantViews", true);
		cap.setCapability("disableAndroidWatchers", true);
		cap.setCapability("appPackage", "wcs.mageplus.photobook.jp");
		cap.setCapability("appActivity", "jp.mageplus.photobook.activity.TopActivity");
		cap.setCapability("unicodeKeyboard", true);
		cap.setCapability("resetKeyboard", true);
		// cap.setCapability("avd", "Test");
		driver = new AndroidDriver(new URL("http://127.0.0.1:5000/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		Log.info("New driver instantiated");
		Log.info("App application launched");
		ac_select = new ac_Select(driver);
		ac_log=new ac_login(driver);
		ac_shipping=new ac_Shipping(driver);
		ac_payment=new ac_Payment(driver);
		ac_cf=new ac_Confirm(driver);
		ac_select.click_init();
		ac_log.input_Login("testdevice@beetsoft.com.vn", "123456");
		ac_shipping.input_shipping("Lam", "Tu", "1234567","Usa","302", "0903252222");
		ac_payment.input_Payment();
		ac_cf.input_Confirm();
	}

	@Test(invocationCount = 1)
	public void f() {
		System.out.println("Hello");
		ac_select = new ac_Select(driver);
		ac_log=new ac_login(driver);
		ac_shipping=new ac_Shipping(driver);
		ac_payment=new ac_Payment(driver);
		ac_cf=new ac_Confirm(driver);
		ac_select.click_init();
		ac_log.input_Login("testdevice@beetsoft.com.vn", "123456");
		ac_shipping.input_shipping("Lam", "Tu", "1234567","Usa","302", "0903252222");
		ac_payment.input_Payment();
		ac_cf.input_Confirm();
		driver.manage().deleteAllCookies();

	}
}
