package pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;

public class sc_Payment extends BaseClass {
	public WebElement element=null;
	WebDriverWait wait=new WebDriverWait(driver,60);
	By t_payment=By.id("payment");
	By ck_payment=By.id("pay_2");
	By btn_payment=By.xpath("//android.widget.ListView[@index='3']/android.view.View[@index='0']");
	
	public sc_Payment(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public WebElement  t_payment() {
    	try { 
    		element=wait.until(ExpectedConditions.visibilityOfElementLocated(t_payment));
    	}catch(Exception e) {
    		System.out.println("khong tim thay element t_payment");
    	}
		return element;
    	
    }
	public WebElement  ck_payment() {
    	try { 
    		element=wait.until(ExpectedConditions.visibilityOfElementLocated(ck_payment));
    	}catch(Exception e) {
    		System.out.println("khong tim thay element t_payment");
    	}
		return element;
    	
    }
	public WebElement  btn_payment() {
    	try { 
    		element=wait.until(ExpectedConditions.visibilityOfElementLocated(btn_payment));
    	}catch(Exception e) {
    		System.out.println("khong tim thay element btn_payment");
    	}
		return element;
    	
    }
	 public void scrollElement() {
		 Point point = t_payment().getLocation();
		 int startX = point.x;
		 int endX = point.x;
		  
		 int startY = (int) ((driver.manage().window().getSize().getHeight()) * 0.90);
		 int endY = (int) ((driver.manage().window().getSize().getHeight()) * 0.10);
		  
		 TouchAction actions = new TouchAction(driver);
		 actions.press(startX, startY).waitAction(Duration.ofSeconds(2)).moveTo(endX, endY).release().perform();
	}
}
