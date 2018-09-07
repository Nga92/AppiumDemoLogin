package screenObject;

import org.openqa.selenium.WebDriver;

import io.appium.java_client.AppiumDriver;


public class BaseClass {
	public static AppiumDriver  driver;
	public static boolean bResult;
	public BaseClass(AppiumDriver driver) {
		BaseClass.driver = driver;
		BaseClass.bResult=true;
	}
}
