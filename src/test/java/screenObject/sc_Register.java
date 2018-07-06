package screenObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;

public class sc_Register extends BaseClass {
	public WebElement element=null;
	By txt_user=By.id("com.beetsoft.fufu:id/edtUserName");
	By txt_nick=By.id("com.beetsoft.fufu:id/edtNickName");
	By txt_email=By.id("com.beetsoft.fufu:id/edtEmail");
	By cmb_sex=By.id("com.beetsoft.fufu:id/spinnerBreed");
	By txt_pass=By.id("com.beetsoft.fufu:id/edtPassword");
	By btn_register=By.id("com.beetsoft.fufu:id/btnRegister");
	By txt_err=By.id("com.beetsoft.fufu:id/tvError");
	WebDriverWait wait=new WebDriverWait(driver,60);
	public sc_Register(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	 public WebElement  txt_user() {
	    	try { 
	    		element=wait.until(ExpectedConditions.visibilityOfElementLocated(txt_user));
	    	}catch(Exception e) {
	    		System.out.println("khong tim thay element txt_user");
	    	}
			return element;
	    	
	    }
	 public WebElement  txt_nick() {
	    	try { 
	    		element=wait.until(ExpectedConditions.visibilityOfElementLocated(txt_nick));
	    	}catch(Exception e) {
	    		System.out.println("khong tim thay element txt_nick");
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
	 public WebElement  cmb_sex() {
	    	try { 
	    		element=wait.until(ExpectedConditions.visibilityOfElementLocated(cmb_sex));
	    	}catch(Exception e) {
	    		System.out.println("khong tim thay element cmb_sex");
	    	}
			return element;
	    	
	    }
	 public WebElement  btn_register() {
	    	try { 
	    		element=wait.until(ExpectedConditions.visibilityOfElementLocated(btn_register));
	    	}catch(Exception e) {
	    		System.out.println("khong tim thay element btn_register");
	    	}
			return element;
	    	
	    }
	 public WebElement txt_err() {
	    	try { 
	    		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    		element=driver.findElement(txt_err);
	    	}catch(Exception e) {
	    		System.out.println("khong tim thay element txt_err");
	    	}
			return element;
	    }
	 
}
