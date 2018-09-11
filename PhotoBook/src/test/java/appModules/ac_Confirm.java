package appModules;

import io.appium.java_client.AppiumDriver;
import pageObject.BaseClass;
import pageObject.sc_Confirm;

public class ac_Confirm extends BaseClass {
     sc_Confirm sc_cf;
	public ac_Confirm(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
 public void input_Confirm() {
	 sc_cf=new sc_Confirm(driver);
	 sc_cf.scrollElement();
	 sc_cf.scrollElement();
	 sc_cf.btn_OK().click();
	 sc_cf.btn_Done().click();
 }
}
