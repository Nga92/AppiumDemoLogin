package live.pageObject;

import org.openqa.selenium.WebDriver;

public class LivePageFactoryManager {
	public static MyAccountPageObject getMyAccountPage(WebDriver driver) {
		return new MyAccountPageObject(driver);	
	}

	public static LiveHomePageObject getHomePage(WebDriver driver) {
		// TODO Auto-generated method stub
		return new LiveHomePageObject(driver);
	}
	public static LiveRegisterPageObject getRegisterPage(WebDriver driver) {
		// TODO Auto-generated method stub
		return new LiveRegisterPageObject(driver);
	}
	public static MyDashboardPageObject getMyDashboardPage(WebDriver driver) {
		// TODO Auto-generated method stub
		return new MyDashboardPageObject(driver);
	}
}
