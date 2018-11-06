package live.pageObject;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import live.pageUIs.LiveRegisterPageUI;

public class LiveRegisterPageObject extends AbstractPage {
 WebDriver driver;

public LiveRegisterPageObject(WebDriver mapingDriver) {
	driver = mapingDriver;
}

public MyDashboardPageObject clickToRegisterButton() {
	// TODO Auto-generated method 
	waitForControlVisible(driver, LiveRegisterPageUI.REGISTER_BUTTON);
	clickToElement(driver, LiveRegisterPageUI.REGISTER_BUTTON);
	return LivePageFactoryManager.getMyDashboardPage(driver);
	
}

}
