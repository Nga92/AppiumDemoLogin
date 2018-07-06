package testcase;

import org.testng.annotations.Test;

import appModules.ac_Login;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import screenObject.BaseClass;
import screenObject.screenLogin;
import unility.Constant;
import unility.ExcelUtils;
import unility.Utils;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class tc_Login {
	ac_Login ac_login;
	screenLogin  login;
	AppiumDriver driver;
	int n = 0;
	String mess = "";
	String xpath = "";

	public boolean Show(int lastNum, String ss,String SheetName) throws Exception {
		if (login.txt_err().isDisplayed()) {
			mess =login.txt_err1().getAttribute("name");
			ExcelUtils.setCellData(mess, lastNum, Constant.Col_Actualy,SheetName);
			ExcelUtils.setCellData_Result(mess, Constant.Col_Excepted, lastNum, Constant.Col_Result,SheetName);
			String vale = ExcelUtils.getCellData(lastNum, Constant.Col_Excepted);
			if (vale.equals(mess) == false) {
				Utils.takeScreenshot(driver, ss);
			}
			return true;
		}
		return false;
	}
	public void Show1(int lastNum,String SheetName) throws Exception {
		if (login.txt_err().isDisplayed()) {
			mess =login.txt_err1().getAttribute("name");
			System.out.println("erro : "+ mess);
			ExcelUtils.setCellData(mess, lastNum, Constant.Col_Actualy,SheetName);
			ExcelUtils.setCellData_Result(mess, Constant.Col_Excepted, lastNum, Constant.Col_Result,SheetName);
			String vale = ExcelUtils.getCellData(lastNum, Constant.Col_Excepted);
//			if (vale.equals(mess) == false) {
//				ExcelUtils.setCellData("FAIL", lastNum, Constant.Col_Result);	
//			}
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
		login=new screenLogin(driver);
		ac_login.start();
	}

	
	@Test(dataProvider = "Authentication")
	public void f(String sUserName, String sPassword) throws Exception {
		ac_login.input_login(sUserName, sPassword);
		int LastRow=++n;
		Show1(LastRow,"Sheet1");
		}

	// @BeforeMethod
	// public void beforeMethod() throws Exception {
	// ac_login = new ac_Login(driver);
	// ac_login.login();
	// }
	@DataProvider
	public Object[][] Authentication() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_Data + Constant.File_DataTest, "Sheet1");
		Object[][] testObjArray = ExcelUtils.getTableArray(Constant.Path_Data + Constant.File_DataTest, "Sheet1");
		return (testObjArray);
	}

}
