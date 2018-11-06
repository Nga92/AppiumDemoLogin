package live.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;

import bank.pageUIs.LoginPageUI;
import commons.AbstractPage;

public class MyAccountPageObject extends AbstractPage {
	WebDriver driver;
/* ACTION : 
 * - Get login page url
 * - Input username 
 * - Input pasword 
 * - Click SUBMIT 
 * - Click Here link . */

	public MyAccountPageObject(WebDriver mapingDriver) {
		driver = mapingDriver;
	}
	
}
