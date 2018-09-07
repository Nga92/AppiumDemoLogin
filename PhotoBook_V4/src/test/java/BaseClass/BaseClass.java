package BaseClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;


public class BaseClass {
	public static AppiumDriver  driver;
	public static WebElement element;
	public static boolean bResult;
	WebDriverWait wait=new WebDriverWait(driver,60);
	public BaseClass(AppiumDriver driver) {
		BaseClass.driver = driver;
		BaseClass.bResult=true;
	}
	public void click(WebElement el) {
		el.click();
	}
	public void sendky(WebElement el , String value) {
		el.sendKeys(value);
	}
	public Boolean check(String value1,String value2) {
		if(value1==value2) {
		    return true;
			
		}
		else 
			return false;
		
	}
	public WebElement element(By by) {
		return element=wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	public void cSenkey(WebElement elm,String value) throws IOException {
		String ADB=System.getenv("ANDROID_HOME");
		String cmd="adb shell input text"+value;
		Runtime runtime=Runtime.getRuntime();
		elm.click();
		runtime.exec(cmd);
	}
}
