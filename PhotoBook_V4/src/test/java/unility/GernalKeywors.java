package unility;

import org.openqa.selenium.WebElement;

public class GernalKeywors {
	public static void click(WebElement ele)
	{
		ele.click();
	}
	
	public static void sendkeys(WebElement ele, String text)
	{
		ele.sendKeys(text);
	}
}
