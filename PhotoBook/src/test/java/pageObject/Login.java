package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import unility.Log;

public class Login extends BaseClass {
	public WebElement element=null;
	public List<WebElement>   list_element=null;
	WebDriverWait wait=new WebDriverWait(driver,40);
	By txt_useName=By.xpath("//android.widget.EditText[@index='0']");
	By txt_pass=By.xpath("//android.widget.EditText[@index='1']");
	By btn_login=By.className("android.widget.Button");

	public Login(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	 public WebElement txt_useName() {
		 try {
			 element=wait.until(ExpectedConditions.visibilityOfElementLocated(txt_useName));
			 Log.info("Da tim thay txt_useName");
		 }catch(Exception e) {
			 Log.info("Chua tim thay txt_useName");
		 }
		return element;
	 }
	 public WebElement txt_pass() {
		 try {
			 element=wait.until(ExpectedConditions.visibilityOfElementLocated(txt_pass));
			 Log.info("Da tim thay txt_pass");
		 }catch(Exception e) {
			 Log.info("Chua tim thay txt_pass");
		 }
		return element;
	 }
	 public WebElement btn_login() {
		 try {
			 element=wait.until(ExpectedConditions.visibilityOfElementLocated(btn_login));
			 Log.info("Da tim thay txt_login");
		 }catch(Exception e) {
			 Log.info("Chua tim thay txt_login");
		 }
		return element;
	 }
}
