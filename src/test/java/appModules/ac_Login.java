package appModules;

import io.appium.java_client.AppiumDriver;
import screenObject.BaseClass;
import screenObject.sc_Common;
import screenObject.screenLogin;

public class ac_Login extends BaseClass{
    screenLogin  login;
    sc_Common     common;
	public ac_Login(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
  public void start() {
	  common=new sc_Common(driver);
	  common.btn_start().click();
  }
 public void input_login(String username, String pass) {
	  login=new screenLogin(driver);
	  login.txt_username().clear();
	  login.txt_username().sendKeys(username);
	  login.txt_pass().clear();
	  login.txt_pass().sendKeys(pass);
	  login.btn_login().click();
  }
}