package unility;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utils {
	WebDriver driver;

	public static void takeScreenshot(WebDriver driver,String name) throws Exception {
		try {
			DateFormat dateFormat = new SimpleDateFormat("yyMMddHHmm");
			Calendar cal = Calendar.getInstance();
			String currentDateTime = dateFormat.format(cal.getTime());
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File(Constant.Path_Screen +currentDateTime+"_" + name + ".jpg"));
		} catch (Exception e) {
			Log.error("Class Utils | Method takeScreenshot | Exception occured while capturing ScreenShot : "
					+ e.getMessage());
			throw new Exception();
		}
	}
}
