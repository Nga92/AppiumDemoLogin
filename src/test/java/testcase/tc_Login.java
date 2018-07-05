package testcase;

import org.testng.annotations.Test;

import appModules.ac_Login;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import screenObject.BaseClass;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;

public class tc_Login {
	ac_Login ac_login;
	AppiumDriver driver;
	
@Test
  public void f() {
	ac_login=new ac_Login(driver);
	ac_login.login("11","111");
  }
  @BeforeClass
  public void beforeClass() throws Exception {
	  DesiredCapabilities cap = new DesiredCapabilities();
      cap.setCapability("platformName", "ANDROID");
      cap.setCapability("deviceName", "192.168.98.101:5555");
      cap.setCapability("appPackage", "jp.synergydrive.voicelink");
      cap.setCapability("appActivity","jp.synergydrive.voicelink.activities.TutorialActivity");
      //cap.setCapability("avd", "Test");
      driver = new AndroidDriver(new URL(
              "http://localhost:4723/wd/hub"), cap);
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() {
  }

}
