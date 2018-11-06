//package com.bankguru.user;
//
//import org.testng.annotations.Test;
//
//import commons.AbstractPage;
//import commons.AbstractTest;
//import page.objects.DeleteAccountPageObject;
//import page.objects.EditCustomerPageObject;
//import page.objects.HomePageObject;
//import page.objects.LoginPageObject;
//import page.objects.NewCustomerPageObject;
//import page.objects.RegisterPageObject;
//import page.objects.WithdrawPageObject;
//
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Parameters;
//
//import java.util.Random;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//
//public class User_01_Login_Level_3_ApplyAbstractTest extends AbstractTest {
//	WebDriver driver;
//	private String userID,password,loginPageURL,email;
//	//khai bao LoginPage
//	private LoginPageObject loginPage;
//	private RegisterPageObject registerPage;
//	private HomePageObject homePage;
//	private NewCustomerPageObject newCustomerPage;
//	private EditCustomerPageObject editCustomerPage;
//	private DeleteAccountPageObject deleteCustomerPage;
//	private WithdrawPageObject withdrawPage;
//	
// @Parameters({"browser","url"})
//  @BeforeClass
//  public void beforeClass(String browserName,String url) {
//	 driver=openMutilBrowser(browserName, url);
//	  loginPage=new LoginPageObject(driver);
//	  registerPage=new RegisterPageObject(driver);
//  }
//  @Test
//  public void TC_01_Register() {
//	  loginPageURL=loginPage.getLoginPageURL();
//	  /* Click here link to open Register Page*/
//	 loginPage.clickHereLinkToOpenRegisterPage();
//	  /*Input email random*/
//	  registerPage.inputEmailAdress("online06"+random()+"@gmail.com");
//	  /*Click Submit button  */
//	  registerPage.clickSubmitButton();
//	  
//	  /* get Text of UserID */
//	  userID=registerPage.getUserIDText();
//	  password=registerPage.getPasswordText();
//	  
//	  /* */
//  }
//  @Test
//  public void TC_02_Login() {
//	  /* Open Login page URL to navigate to Login Page */
//	  registerPage.OpenLoginPageUrl(loginPageURL);
//	  loginPage=new LoginPageObject(driver);
//	  loginPage.inputUsernameTextbox(userID);
//	  loginPage.inputPasswordTextbox(password);
//	  loginPage.clickToLogingButton();
////	  homePage.isHomePageDisplayed();
//  }
//  @Test
//  public void TC_03_OpenMultiPage() {
//	  //Home Page -> New Customer Page
//	  homePage.openNewCustomerPage();
//	  newCustomerPage=new NewCustomerPageObject(driver);
//	  
//	  //New Customer Page -> Withdraw Page
//	  
//	  newCustomerPage.openWithdrawPage();
//	  withdrawPage=new WithdrawPageObject(driver);
//	  
//	  //Withdraw --> Edit Customer Page
//	  withdrawPage.openEditCustomerPage();
//	  editCustomerPage=new EditCustomerPageObject(driver);
//  }
//  @AfterClass
//  public void afterClass() {
//	  driver.quit();
//  }
//  
//   public int random() {
//	   Random rand = new Random();
//	   int  number = rand.nextInt(999999) + 1;
//	   return number;
//   }
//}
