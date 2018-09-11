package pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;

public class sc_Confirm extends BaseClass {

	public WebElement element=null;
	WebDriverWait wait=new WebDriverWait(driver,60);
	By txt_Title=By.id("wcs.mageplus.photobook.jp:id/tvACTitle");
	By btn_OK=By.xpath("//android.view.View[@resource-id='form1']/android.widget.ListView[@index='4']/android.view.View[@index='0']");
	By btn_Done=By.id("wcs.mageplus.photobook.jp:id/btnACDone");
	
	public sc_Confirm(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public WebElement  txt_Title() {
    	try { 
    		element=wait.until(ExpectedConditions.visibilityOfElementLocated(txt_Title));
    	}catch(Exception e) {
    		System.out.println("khong tim thay element txt_Title");
    	}
		return element;
    	
    }
	public WebElement  btn_OK() {
    	try { 
    		element=wait.until(ExpectedConditions.visibilityOfElementLocated(btn_OK));
    	}catch(Exception e) {
    		System.out.println("khong tim thay element btn_OK");
    	}
		return element;
    	
    }
	public WebElement  btn_Done() {
    	try { 
    		element=wait.until(ExpectedConditions.visibilityOfElementLocated(btn_Done));
    	}catch(Exception e) {
    		System.out.println("khong tim thay element btn_Done");
    	}
		return element;
    	
    }
	 public void scrollElement() {
		 Point point = txt_Title().getLocation();
		 int startX = point.x;
		 int endX = point.x;
		  
		 int startY = (int) ((driver.manage().window().getSize().getHeight()) * 0.90);
		 int endY = (int) ((driver.manage().window().getSize().getHeight()) * 0.10);
		  
		 TouchAction actions = new TouchAction(driver);
		 actions.press(startX, startY).waitAction(Duration.ofSeconds(2)).moveTo(endX, endY).release().perform();
	}
}
