package com.bankguru.user;

import org.testng.annotations.Test;

import bank.pageObject.HomePageObject;
import bank.pageObject.LoginPageObject;
import bank.pageObject.BankRegisterPageObject;
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

public class User_01_Login_Level_2_PageObjectBasic extends AbstractTest {
	WebDriver driver;
	private String userID, password, loginPageURL, email;
	// khai bao LoginPage
	private LoginPageObject loginPage;
	private BankRegisterPageObject registerPage;
	private HomePageObject homePage;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void beforeClass(String browserName, String url) {
		if (browserName.equals("chrome")) {
			// System.setProperty("webdriver.chrome.driver","/Volumes/NGANT/OFME/SELENIUNM/POM_BANKGURU_05_NGANT/resources/chromedriver");
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		} else {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("headless");
			options.addArguments("window-size=1920x1080");
			driver = new ChromeDriver(options);
		}
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loginPage = new LoginPageObject(driver);
		registerPage = new BankRegisterPageObject(driver);
	}

	@Test
	public void TC_01_Register() {
		loginPageURL = loginPage.getLoginPageURL();
		/* Click here link to open Register Page */
		loginPage.clickHereLinkToOpenRegisterPage();
		/* Input email random */
		registerPage.inputEmailAdress("online06" + random() + "@gmail.com");
		/* Click Submit button */
		registerPage.clickSubmitButton();

		/* get Text of UserID */
		userID = registerPage.getUserIDText();
		password = registerPage.getPasswordText();

		/* */
	}

	@Test
	public void TC_02_Login() {
		/* Open Login page URL to navigate to Login Page */
		registerPage.OpenLoginPageUrl(loginPageURL);
		loginPage = new LoginPageObject(driver);
		loginPage.inputUsernameTextbox(userID);
		loginPage.inputPasswordTextbox(password);
		loginPage.clickToLogingButton();
		// homePage.isHomePageDisplayed();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	public int random() {
		Random rand = new Random();
		int number = rand.nextInt(999999) + 1;
		return number;
	}
}
