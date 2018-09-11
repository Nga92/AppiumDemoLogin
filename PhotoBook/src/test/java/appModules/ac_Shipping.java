package appModules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import pageObject.BaseClass;
import pageObject.sc_Shipping;


public class ac_Shipping extends BaseClass {

	public WebElement element=null;
	WebDriverWait wait=new WebDriverWait(driver,60);
	sc_Shipping sc_shipping;
	public ac_Shipping(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void input_shipping(String firstName , String name,String zcode,String city,String street, String phone) {
		sc_shipping=new sc_Shipping(driver);
		sc_shipping.txt_firstName().sendKeys(firstName);
		sc_shipping.txt_name().sendKeys(name);
		sc_shipping.txt_Zcode().sendKeys(zcode);
		sc_shipping.cmb_country().click();
		sc_shipping.ck_country().click();
		sc_shipping.txt_city().sendKeys(city);
		sc_shipping.scrollElement();
		sc_shipping.txt_street().click();
		sc_shipping.txt_street().sendKeys(street);
		sc_shipping.txt_phone().click();
		sc_shipping.txt_phone().sendKeys(phone);
		sc_shipping.ck_chose().click();
		sc_shipping.btn_next().click();
	}
}
