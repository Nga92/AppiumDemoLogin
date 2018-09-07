package screenObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;

public class screenLogin extends BaseClass {
	public WebElement element=null;
	WebDriverWait wait=new WebDriverWait(driver,60);
	By txt_username=By.id("com.beetsoft.fufu:id/edtUserName");
	By txt_pass=By.id("com.beetsoft.fufu:id/edtPassword");
	By btn_login=By.id("com.beetsoft.fufu:id/btnLogin");
	By btn_regist=By.id("com.beetsoft.fufu:id/btnRegister");
	By txt_err=By.xpath("//android.view.View[contains(@resource-id,'root')]/android.view.View[@index='0']");
//	By txt_err1=By
	public screenLogin(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
   
    public WebElement  txt_username() {
    	try { 
    		element=wait.until(ExpectedConditions.visibilityOfElementLocated(txt_username));
    	}catch(Exception e) {
    		System.out.println("khong tim thay element txt_username");
    	}
		return element;
    	
    }
    public WebElement  txt_pass() {
    	try { 
    		element=wait.until(ExpectedConditions.visibilityOfElementLocated(txt_pass));
    	}catch(Exception e) {
    		System.out.println("khong tim thay element txt_pass");
    	}
		return element;
    }

    public WebElement  btn_login() {
    	try { 
    		element=wait.until(ExpectedConditions.visibilityOfElementLocated(btn_login));
    	}catch(Exception e) {
    		System.out.println("khong tim thay element btn_login");
    	}
		return element;
    }
    public WebElement  txt_err() {
    	try { 
    		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    		element=driver.findElement(txt_err);
    	}catch(Exception e) {
    		System.out.println("khong tim thay element txt_err");
    	}
		return element;
    	
    }  
    public WebElement  txt_err1() {
    	try { 
    		element=wait.until(ExpectedConditions.visibilityOfElementLocated(txt_err));
    	}catch(Exception e) {
    		System.out.println("khong tim thay element txt_err");
    	}
		return element;
    	
    } 
}
