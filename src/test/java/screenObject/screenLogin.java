package screenObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;

public class screenLogin extends BaseClass {
	public WebElement element=null;
	WebDriverWait wait=new WebDriverWait(driver, 30);
	By txt_next=By.id("jp.synergydrive.voicelink:id/tv_next");
	By txt_login=By.xpath("//android.widget.TextView[@text='Login']");
	By ck_login=By.id("jp.synergydrive.voicelink:id/cb_check_read");
	By btn_fb=By.id("jp.synergydrive.voicelink:id/btn_login_facebook");
	By txt_email=By.id("m_login_email");
	By txt_pass=By.id("m_login_password");
	By btn_login=By.id("u_0_5");
	By txt_err=By.xpath("//android.view.View[contains(@resource-id,'root')]/android.view.View[@index='0']");
	public screenLogin(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
    public WebElement  txt_next() {
    	try { 
    		element=wait.until(ExpectedConditions.visibilityOfElementLocated(txt_next));
    	}catch(Exception e) {
    		System.out.println("khong tim thay element txt_next");
    	}
		return element;
    	
    }
    
    public WebElement  txt_login() {
    	try { 
    		element=wait.until(ExpectedConditions.visibilityOfElementLocated(txt_login));
    	}catch(Exception e) {
    		System.out.println("khong tim thay element txt_login");
    	}
		return element;
    	
    }
    public WebElement  ck_login() {
    	try { 
    		element=wait.until(ExpectedConditions.visibilityOfElementLocated(ck_login));
    	}catch(Exception e) {
    		System.out.println("khong tim thay element ck_login");
    	}
		return element;
    	
    }
    public WebElement btn_fb() {
    	try { 
    		element=wait.until(ExpectedConditions.visibilityOfElementLocated(btn_fb));
    	}catch(Exception e) {
    		System.out.println("khong tim thay element btn_fb");
    	}
		return element;
    	
    }
    public WebElement  txt_email() {
    	try { 
    		element=wait.until(ExpectedConditions.visibilityOfElementLocated(txt_email));
    	}catch(Exception e) {
    		System.out.println("khong tim thay element txt_email");
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
    		element=driver.findElement(txt_err);
    	}catch(Exception e) {
    		System.out.println("khong tim thay element txt_err");
    	}
		return element;
    	
    }  
}
