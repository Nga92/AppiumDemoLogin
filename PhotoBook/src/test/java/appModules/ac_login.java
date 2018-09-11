package appModules;

import io.appium.java_client.AppiumDriver;
import pageObject.BaseClass;
import pageObject.Login;

public class ac_login extends BaseClass {
    Login login;
	public ac_login(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void input_Login(String user , String Pass) {
		login=new Login(driver);
		login.txt_useName().sendKeys(user);
		login.txt_pass().sendKeys(Pass);
		login.btn_login().click();
	}
}
