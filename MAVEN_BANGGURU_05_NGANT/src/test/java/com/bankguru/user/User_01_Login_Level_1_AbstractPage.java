package com.bankguru.user;

import org.testng.annotations.Test;

import commons.AbstractPage;

import org.testng.annotations.BeforeClass;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class User_01_Login_Level_1_AbstractPage {
	WebDriver driver;
	private String userID,password,loginPageURL;
	private AbstractPage abstractPage;
 
  @BeforeClass
  public void beforeClass() {
	  driver= new ChromeDriver();  
	  abstractPage=new AbstractPage();
	  abstractPage.openAnyURL(driver, "http://demo.guru99.com/v4/");
  }
  @Test
  public void TC_01_Register() {
	  loginPageURL=abstractPage.getCurrentPageURL(driver);
	  /* Click here link to open Register Page*/
	  abstractPage.clickToElement(driver, "//a[text()='here']");
	  /*wait for email textbox visible*/
	  abstractPage.waitForControlVisible(driver, "//input[@name='emailid']");
	  /*Input email random*/
	  abstractPage.sendkyToElement(driver, "//input[@name='emailid']", "online06"+random()+"@gmail.com");
	  
	  /*Click Submit button  */
	  abstractPage.clickToElement(driver, "//input[@name='btnLogin']");
	  
	  /* get Text of UserID */
	  userID=abstractPage.getTextElement(driver, "//td[text()='User ID :']/following-sibling::td");
	  password=abstractPage.getTextElement(driver, "//td[text()='Password :']/following-sibling::td");
	  
	  /* */
  }
  @Test
  public void TC_02_Login() {
	  /* Open Login page again */
	  driver.get(loginPageURL);
	  
	  /*wait for userID textbox visible*/
	  abstractPage.waitForControlVisible(driver, "//input[@name='uid']");
	  abstractPage.sendkyToElement(driver, "//input[@name='uid']", userID);
	  abstractPage.sendkyToElement(driver, "//input[@name='password']", password);
	  abstractPage.clickToElement(driver, "//input[@name='btnLogin']");
	  Assert.assertTrue(driver.findElement(By.xpath("//marquee[text()=\"Welcome To Manager's Page of Guru99 Bank\"]")).isDisplayed());
  }
  @AfterClass
  public void afterClass() {
  }
  
   public int random() {
	   Random rand = new Random();
	   int  number = rand.nextInt(999999) + 1;
	   return number;
   }
}
