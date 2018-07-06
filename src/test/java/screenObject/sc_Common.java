package screenObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;

public class sc_Common  extends BaseClass {
	public WebElement element=null;
	WebDriverWait wait=new WebDriverWait(driver,60);

	By btn_start=By.id("com.beetsoft.fufu:id/btnStart");
	public sc_Common(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

    public WebElement  btn_start() {
    	try { 
    		element=wait.until(ExpectedConditions.visibilityOfElementLocated(btn_start));
    	}catch(Exception e) {
    		System.out.println("khong tim thay element btn_start");
    	}
		return element;
    	
    }

}
