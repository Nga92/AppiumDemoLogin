package live.pageObject;

import org.openqa.selenium.WebDriver;

import bank.pageUIs.BankHomePageUI;
import commons.AbstractPage;

public class LiveHomePageObject extends AbstractPage{
	WebDriver driver;
	public LiveHomePageObject(WebDriver mappingDriver) {
		driver=mappingDriver;
	
}
}
