package com.bankguru.user;

import org.testng.annotations.Test;

import bank.pageObject.DeleteAccountPageObject;
import bank.pageObject.EditCustomerPageObject;
import bank.pageObject.HomePageObject;
import bank.pageObject.LoginPageObject;
import bank.pageObject.NewCustomerPageObject;
import bank.pageObject.BankPageFactoryManager;
import bank.pageObject.BankRegisterPageObject;
import bank.pageObject.WithdrawPageObject;
import commons.AbstractPage;
import commons.AbstractTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class User_01_Login_Level_4_ApplyOOP extends AbstractTest {
	WebDriver driver;
	private String userID,password,loginPageURL,email;
	//khai bao LoginPage
	private LoginPageObject loginPage;
	private BankRegisterPageObject registerPage;
	private HomePageObject homePage;
	private NewCustomerPageObject newCustomerPage;
	private EditCustomerPageObject editCustomerPage;
	private DeleteAccountPageObject deleteCustomerPage;
	private WithdrawPageObject withdrawPage;
	private AbstractPage page;
	
 @Parameters({"browser","url"})
  @BeforeClass
  public void beforeClass(String browserName,String url) {
	 driver=openMutilBrowser(browserName, url);
	  loginPage=BankPageFactoryManager.openLoginPage(driver);
  }
  @Test
  public void TC_01_Register() {
	  loginPageURL=loginPage.getLoginPageURL();
	  registerPage=loginPage.clickHereLinkToOpenRegisterPage();
	  registerPage.inputEmailAdress("online06"+randomNumber()+"@gmail.com");
	  registerPage.clickSubmitButton();
	  userID=registerPage.getUserIDText();
	  password=registerPage.getPasswordText();
	  
	  /* */
  }
  @Test
  public void TC_02_Login() {
	  loginPage=registerPage.OpenLoginPageUrl(loginPageURL);
	  loginPage.inputUsernameTextbox(userID);
	  loginPage.inputPasswordTextbox(password);
	  homePage=loginPage.clickToLogingButton();
	  Assert.assertTrue(homePage.isHomePageDisplayed());
  }
  @Test
  public void TC_03_OpenMultiPage() {
	  newCustomerPage= homePage.openNewCustomerPage(driver);
	  homePage=newCustomerPage.openHomePage(driver);	
	  withdrawPage=homePage.openWithdrawPage(driver);
	  editCustomerPage=withdrawPage.openEditCustomerPage(driver);
  }
  @AfterClass
  public void afterClass() {
	  quitBrowser();
  }
  
}
