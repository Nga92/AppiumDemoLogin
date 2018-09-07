package testcase;

import org.testng.annotations.Test;

import appModules.ac_Login;
import appModules.ac_Register;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import screenObject.sc_Register;
import screenObject.screenLogin;
import unility.Constant;
import unility.ExcelUtils;
import unility.Utils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;

public class tc_Register {
	ac_Login      ac_login;
	ac_Register   ac_register;
	screenLogin   login;
	sc_Register   register;
	AppiumDriver  driver;
	int n = 0;
	String mess = "";
	
	public void Show(int lastNum,String testCase,String SheetName) throws Exception {
		if (register.txt_err().isDisplayed()) {
			mess =register.txt_err().getAttribute("name");
			System.out.println("erro : "+ mess);
			ExcelUtils.setCellData(mess, lastNum, Constant.Col_Actualy,SheetName);
			ExcelUtils.setCellData_Result(mess, Constant.Col_Excepted, lastNum, Constant.Col_Result,SheetName);
			String vale = ExcelUtils.getCellData1(lastNum, Constant.Col_Excepted,SheetName);
			if (vale.equals(mess) == false) {
            Utils.takeScreenshot(driver, testCase);
			}
//			else {
//				ExcelUtils.setCellData("PASS", lastNum, Constant.Col_Result);
//			}
	}
	}

	@BeforeClass
	public void beforeClass() throws Exception {

		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot,Constant.Path_App);
		File app = new File(appDir, Constant.File_App);
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "ANDROID");
		cap.setCapability("deviceName", "192.168.98.101:5555");
		cap.setCapability("appPackage", "com.beetsoft.fufu");
		cap.setCapability("appActivity", "com.beetsoft.fufu.views.activities.main.MainActivity");
		// cap.setCapability("avd", "Test");
		driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ac_login = new ac_Login(driver);
		ac_register=new ac_Register(driver);
		register=new sc_Register(driver);
		login=new screenLogin(driver);
		ac_login.start();
		ac_register.click_Register();
	}


	@Test(dataProvider = "Authentication")
	public void f(String testcase,String username, String nickname,String email,String pass,String a, String b, String c) throws Exception {
	  ac_register.register(username, nickname, email, pass);
	  int LastRow=++n;
		Show(LastRow,testcase,"Register");
  }

@DataProvider
public Object[][] Authentication() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_Data + Constant.File_DataTest, "Register");
		Object[][] testObjArray = ExcelUtils.getTableArray(Constant.Path_Data + Constant.File_DataTest, "Register");
		return (testObjArray);
	}
  @AfterClass
  public void afterClass() {
  }

}
