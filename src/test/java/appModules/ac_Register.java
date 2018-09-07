package appModules;

import io.appium.java_client.AppiumDriver;
import screenObject.BaseClass;
import screenObject.sc_Register;
import screenObject.screenLogin;

public class ac_Register extends BaseClass{
    sc_Register  register;
	 public ac_Register(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	 public void click_Register() {
		 register=new sc_Register(driver);
		 register.btn_register().click();
	 }
  public void register(String username, String nickname,String email,String pass){
	  register=new sc_Register(driver);
	  register.txt_user().sendKeys(username);
	  register.txt_nick().sendKeys(nickname);
	  register.txt_email().sendKeys(email);
	  register.txt_pass().sendKeys(pass);
	  register.btn_register().click();
  }
}
