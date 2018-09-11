package appModules;

import org.openqa.selenium.interactions.touch.TouchActions;

import android.content.Intent;  
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import pageObject.BaseClass;
import pageObject.ScreenHome;
import unility.Log;

public class ac_Select extends BaseClass {
	ScreenHome sc_home;
	TouchAction tAction;
	int n=0;
	String txt_editAmount="android.widget.EditText";
	public ac_Select(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void click_init(){
		try {
			sc_home=new ScreenHome(driver);
			tAction = new TouchAction(driver);
			sc_home.btn_creatNew().click();
			Log.info("Da click creatNew");
			sc_home.btn_selectPhoto().click();
			Log.info("Da click selectPhoto lan 1");
			sc_home.btn_All().click();
			Log.info("Da click btn All 1");
			sc_home.list_image().get(3).click();
			Log.info("Da click list image 3");
			sc_home.btn_done().click();
			Log.info("Da click Done 1");
			sc_home.btn_selectPhoto().click();
			Log.info("Da click selectPhoto lan 2");
			sc_home.btn_All().click();
			Log.info("Da click btn All 2");
			System.out.println(sc_home.list_element.size());
			for(int j=0 ; j<3; j++){
			for(int i=0 ; i<6; i++){
			sc_home.list_image().get(i).click();
//			if(sc_home.txt_messError().isDisplayed()){
//			sc_home.btn_dialogOK().click();
//			Log.info("Da click dialog");
//			}
//			else {
//			Log.info("Da click list image"+i);
//			System.out.println(n=n+1);
//				
//			}
			n=n+1;
			if(n>15) break;
			System.out.println(n);
			}
			if(n>15) break;
			sc_home.scroll();

			Log.info("Scroll");
//			System.out.println("Scrool"+n);
			}
			sc_home.btn_done().click();
			Log.info("Da click Done 2");
			sc_home.btn_done().click();
			Log.info("Da click Done 3");
			sc_home.list_downCover().get(1).click();
			Log.info("Da click list downCover 1");
			sc_home.btn_viewBorder().click();
			Log.info("Da click  viewBorder ");
			sc_home.list_viewBorder().get(1).click();
			Log.info("Da click  viewBorder 1 ");
			sc_home.btn_done().click();
			Log.info("Da click Done viewBorder");
			sc_home.btn_makeOrder().click();
			Log.info("Da click make Order");
			sc_home.btn_Order().click();
			Log.info("Da click Order ");
			sc_home.btn_continueOrder().click();
			Log.info("Da click continue Order");
			sc_home.scrollElement();
			Log.info("Scroll");
			sc_home.txt_Quan().click();
			sc_home.btn_creatOrder().click();
			sc_home.btn_buttonOrder().click();
		} catch(Exception e) {
			Log.info("chua click init");
		}
		
	}
	
	 
}
