package appModules;

import io.appium.java_client.AppiumDriver;
import screenObject.BaseClass;
import screenObject.screenLogin;

public class ac_Login extends BaseClass{
    screenLogin  login;
	public ac_Login(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
  public void login(String username, String pass) {
	  login=new screenLogin(driver);
	  login.txt_next().click();
	  login.txt_next().click();
	  login.txt_next().click();
	  login.txt_next().click();
	  login.txt_login().click();
	  login.ck_login().click();
	  login.btn_fb().click();
	  login.txt_email().sendKeys(username);
	  login.txt_pass().sendKeys(pass);
	  login.btn_login().click(1);
	  if(login.txt_err().isDisplayed()) {
		  System.out.println("erro"+login.txt_err().getAttribute("name"));
	  }
  }
}
