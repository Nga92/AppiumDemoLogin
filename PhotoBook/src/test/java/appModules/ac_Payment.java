package appModules;

import io.appium.java_client.AppiumDriver;
import pageObject.BaseClass;
import pageObject.sc_Payment;

public class ac_Payment extends BaseClass {
      sc_Payment sc_pay;
      
	public ac_Payment(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
 public void input_Payment() {
	 sc_pay=new sc_Payment(driver);
	 sc_pay.ck_payment().click();
	 sc_pay.scrollElement();
	 sc_pay.scrollElement();
	 sc_pay.btn_payment().click();
 }
}
