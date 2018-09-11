package pageObject;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import unility.Log;

public class ScreenHome extends BaseClass {

	public WebElement element=null;
	public List<WebElement>   list_element=null;
	WebDriverWait wait=new WebDriverWait(driver,40);
	By btn_CreateNew= By.id("wcs.mageplus.photobook.jp:id/btnCreateNew");
	By btn_selectPhoto=By.xpath("//*[@resource-id='wcs.mageplus.photobook.jp:id/llBottomArea']");
	By btn_All=By.xpath("//*[@resource-id='wcs.mageplus.photobook.jp:id/lvData']/android.widget.LinearLayout[@index='3']");
	By list_image=By.xpath("//*[@resource-id='wcs.mageplus.photobook.jp:id/ivImage']");
	By btn_done=By.id("wcs.mageplus.photobook.jp:id/btnACDone");
	By list_downCover=By.id("wcs.mageplus.photobook.jp:id/btnDowloadCover");
	By btn_viewBorder=By.id("wcs.mageplus.photobook.jp:id/ivThumb");
	By list_viewBorder=By.id("wcs.mageplus.photobook.jp:id/ivThumb");
	By btn_makeOrder=By.id("wcs.mageplus.photobook.jp:id/btnOrder");
	By btn_Order =By.id("wcs.mageplus.photobook.jp:id/btnDialogOrder");
	By btn_continueOrder=By.xpath("//android.view.View[@resource-id='detailarea']/android.widget.ListView/android.view.View[@index='0']");
    By txt_err=By.xpath("//android.widget.TextView[contains(.,'Unsupported file format selected')]");
	By btn_dialogOK=By.id("android:id/button");
	By txt_Quan=By.className("android.widget.EditText");
	By btn_creatOrder=By.xpath("//android.view.View[@resource-id='cartbtn_default']/android.view.View[@index='0']");
	By btn_buttonOrder=By.className("android.widget.Button");
	

	public ScreenHome(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
 public WebElement btn_creatNew() {
	 try {
		 element=wait.until(ExpectedConditions.visibilityOfElementLocated(btn_CreateNew));
		 Log.info("Da tim thay creatNew");
	 }catch(Exception e) {
		 Log.info("Chua tim thay CreatNew");
	 }
	return element;
 }
 public WebElement btn_selectPhoto() {
	 try {
		 element=wait.until(ExpectedConditions.visibilityOfElementLocated(btn_selectPhoto));
		 Log.info("Da tim thay element selectPhoto");
	 }catch(Exception e) {
		 Log.info("Chua tim thay element selectPhoto");
	 }
	return element;
 }
 public WebElement btn_All() {
	 try {
		 element=wait.until(ExpectedConditions.visibilityOfElementLocated(btn_All));
		 Log.info("Da tim thay element btn All");
	 }catch(Exception e) {
		 Log.info("Chua tim thay element  btn All");
	 }
	return element;
 }
 public WebElement btn_done() {
	 try {
		 element=wait.until(ExpectedConditions.visibilityOfElementLocated(btn_done));
		 Log.info("Da tim thay element btn Done");
	 }catch(Exception e) {
		 Log.info("Chua tim thay element  btn Done");
	 }
	return element;
 }
 public List<WebElement>  list_image(){
	 try {
		 list_element=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(list_image));
		 Log.info("Da tim thay element list_image");
	 }catch(Exception e) {
		 Log.info("Chua tim thay element  list_image");
	 }
	return list_element;
 }
 public List<WebElement>  list_downCover(){
	 try {
		 list_element=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(list_downCover));
		 Log.info("Da tim thay element list_downCover");
	 }catch(Exception e) {
		 Log.info("Chua tim thay element  list_downCover");
	 }
	return list_element;
 }
 public List<WebElement>  list_viewBorder(){
	 try {
		 list_element=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(list_viewBorder));
		 Log.info("Da tim thay element list_viewBorder");
	 }catch(Exception e) {
		 Log.info("Chua tim thay element  list_viewBorder");
	 }
	return list_element;
 }
 public WebElement btn_viewBorder() {
	 try {
		 element=wait.until(ExpectedConditions.visibilityOfElementLocated(btn_viewBorder));
		 Log.info("Da tim thay element btnt_viewBorder");
	 }catch(Exception e) {
		 Log.info("Chua tim thay element btnt_viewBorder");
	 }
	return element;
 }
 public WebElement btn_makeOrder() {
	 try {
		 element=wait.until(ExpectedConditions.visibilityOfElementLocated(btn_makeOrder));
		 Log.info("Da tim thay element btn_makeOrder");
	 }catch(Exception e) {
		 Log.info("Chua tim thay element  btn_makeOrder");
	 }
	return element;
 }

 public WebElement btn_Order() {
	 try {
		 element=wait.until(ExpectedConditions.visibilityOfElementLocated(btn_Order));
		 Log.info("Da tim thay element btn_Order");
	 }catch(Exception e) {
		 Log.info("Chua tim thay element btn_Order");
	 }
	return element;
 }
 
 public WebElement btn_continueOrder() {
	 try {
		 element=wait.until(ExpectedConditions.visibilityOfElementLocated(btn_continueOrder));
		 Log.info("Da tim thay element btn_continueOrder");
	 }catch(Exception e) {
		 Log.info("Chua tim thay element btn_continueOrder");
	 }
	return element;
 }
 public void scroll() {
	 Point point = list_image().get(6).getLocation();
	 int startX = point.x;
	 int endX = point.x;
	  
	 int startY = (int) ((driver.manage().window().getSize().getHeight()) * 0.90);
	 int endY = (int) ((driver.manage().window().getSize().getHeight()) * 0.10);
	  
	 TouchAction actions = new TouchAction(driver);
	 actions.press(startX, startY).waitAction(Duration.ofSeconds(2)).moveTo(endX, endY).release().perform();
}
 public void scrollElement() {
	 Point point = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("detailarea"))).getLocation();
	 int startX = point.x;
	 int endX = point.x;
	  
	 int startY = (int) ((driver.manage().window().getSize().getHeight()) * 0.90);
	 int endY = (int) ((driver.manage().window().getSize().getHeight()) * 0.10);
	  
	 TouchAction actions = new TouchAction(driver);
	 actions.press(startX, startY).waitAction(Duration.ofSeconds(2)).moveTo(endX, endY).release().perform();
//	 MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
//				"new UiScrollable(new UiSelector().resourceId(\"detailphotoblock\")).getChildByText("
//				+ "new UiSelector().className(\"android.view.View\")),\"500\")"));
}
 public WebElement txt_Quan() {
	 try {
		 element=wait.until(ExpectedConditions.visibilityOfElementLocated(txt_Quan));
		 Log.info("Da tim thay element txt_Quan");
	 }catch(Exception e) {
		 Log.info("Chua tim thay element txt_Quan");
	 }
	return element;
 }
 
 public WebElement btn_creatOrder() {
	 try {
		 element=wait.until(ExpectedConditions.visibilityOfElementLocated(btn_creatOrder));
		 Log.info("Da tim thay element btn_creatOrder");
	 }catch(Exception e) {
		 Log.info("Chua tim thay element btn_creatOrder");
	 }
	return element;
 }
 
 public WebElement btn_buttonOrder() {
	 try {
		 element=wait.until(ExpectedConditions.visibilityOfElementLocated(btn_buttonOrder));
		 Log.info("Da tim thay element btn_buttonOrder");
	 }catch(Exception e) {
		 Log.info("Chua tim thay element btn_buttonOrder");
	 }
	return element;
 }
 public WebElement btn_dialogOK() {
	 try {
		 element=driver.findElement(btn_dialogOK);
	 }catch(Exception e) {
	 }
	return element;
 }
 public WebElement txt_messError() {
	 try {
		 WebDriverWait wait = new WebDriverWait(driver,2);
		 element=wait.until(ExpectedConditions.visibilityOfElementLocated(txt_err));
	 }catch(Exception e) {
	 }
	return element;
 }
 
}
