package pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class sc_Shipping  extends BaseClass {
	public WebElement element=null;
	WebDriverWait wait=new WebDriverWait(driver,60);
	By txt_firstName=By.xpath("//android.view.View[@resource-id='inputAddress']/android.view.View[@index='1']/android.widget.EditText[@index='0']");
	By txt_name=By.xpath("//android.view.View[@resource-id='inputAddress']/android.view.View[@index='1']/android.widget.EditText[@index='2']");
	By txt_Zcode=By.xpath("//android.view.View[@resource-id='inputAddress']/android.view.View[@index='3']/android.widget.EditText[@index='0']");
	By cmb_country=By.xpath("//android.view.View[@resource-id='inputAddress']/android.view.View[@index='5']/android.view.View[@index='0']");
	By ck_country=By.xpath("//android.widget.CheckedTextView[@index='1']");
	By txt_city=By.xpath("//android.view.View[@resource-id='inputAddress']/android.view.View[@index='6']/android.widget.EditText[@index='0']");
	By txt_street=By.xpath("//android.view.View[@resource-id='inputAddress']/android.view.View[@index='7']/android.widget.EditText[@index='0']");
	By txt_phone=By.xpath("//android.view.View[@resource-id='inputAddress']/android.view.View[@index='9']/android.widget.EditText[@index='0']");
	By ck_chose=By.id("dlv_id_1");
	By btn_next=By.xpath("//android.view.View[@text='Next']");
	
	public sc_Shipping(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public WebElement  txt_firstName() {
    	try { 
    		element=wait.until(ExpectedConditions.visibilityOfElementLocated(txt_firstName));
    	}catch(Exception e) {
    		System.out.println("khong tim thay element txt_username");
    	}
		return element;
    	
    }
	public WebElement  txt_name() {
    	try { 
    		element=wait.until(ExpectedConditions.visibilityOfElementLocated(txt_name));
    	}catch(Exception e) {
    		System.out.println("khong tim thay element txt_name");
    	}
		return element;
    	
    }
	public WebElement  txt_Zcode() {
    	try { 
    		element=wait.until(ExpectedConditions.visibilityOfElementLocated(txt_Zcode));
    	}catch(Exception e) {
    		System.out.println("khong tim thay element txt_username");
    	}
		return element;
    	
    }
	public WebElement  txt_phone() {
    	try { 
    		element=wait.until(ExpectedConditions.visibilityOfElementLocated(txt_phone));
    	}catch(Exception e) {
    		System.out.println("khong tim thay element txt_phone");
    	}
		return element;
    	
    }
	public WebElement  ck_chose() {
    	try { 
    		element=wait.until(ExpectedConditions.visibilityOfElementLocated(ck_chose));
    	}catch(Exception e) {
    		System.out.println("khong tim thay element ck_chose");
    	}
		return element;
    	
    }
	public WebElement  btn_next() {
    	try { 
    		element=wait.until(ExpectedConditions.visibilityOfElementLocated(btn_next));
    	}catch(Exception e) {
    		System.out.println("khong tim thay element btn_next");
    	}
		return element;
    	
    }
	public WebElement  cmb_country() {
    	try { 
    		element=wait.until(ExpectedConditions.visibilityOfElementLocated(cmb_country));
    	}catch(Exception e) {
    		System.out.println("khong tim thay element cmb_country");
    	}
		return element;
    	
    }
	public WebElement  ck_country() {
    	try { 
    		element=wait.until(ExpectedConditions.visibilityOfElementLocated(ck_country));
    	}catch(Exception e) {
    		System.out.println("khong tim thay element ck_country");
    	}
		return element;
    	
    }

	public WebElement  txt_city() {
    	try { 
    		element=wait.until(ExpectedConditions.visibilityOfElementLocated(txt_city));
    	}catch(Exception e) {
    		System.out.println("khong tim thay element txt_city");
    	}
		return element;
    	
    }
	public WebElement  txt_street() {
    	try { 
    		element=wait.until(ExpectedConditions.visibilityOfElementLocated(txt_street));
    	}catch(Exception e) {
    		System.out.println("khong tim thay element txt_street");
    	}
		return element;
    	
    }
	 public void scrollElement() {
		 Point point = txt_Zcode().getLocation();
		 int startX = point.x;
		 int endX = point.x;
		  
		 int startY = (int) ((driver.manage().window().getSize().getHeight()) * 0.80);
		 int endY = (int) ((driver.manage().window().getSize().getHeight()) * 0.20);
		  
		 TouchAction actions = new TouchAction(driver);
		 actions.press(startX, startY).waitAction(Duration.ofSeconds(2)).moveTo(endX, endY).release().perform();
	}
}
