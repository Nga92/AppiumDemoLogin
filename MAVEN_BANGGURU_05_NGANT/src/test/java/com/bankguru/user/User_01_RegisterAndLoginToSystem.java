package com.bankguru.user;

import org.testng.annotations.Test;
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

public class User_01_RegisterAndLoginToSystem {
	WebDriver driver;
	WebDriverWait wait;
	private String userID,password,loginPageURL;
 
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver",".\\src\\test\\resources\\chromedriver.exe");
	  driver= new ChromeDriver();   
	  wait=new WebDriverWait(driver, 30);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("http://demo.guru99.com/v4/");
  }
  @Test
  public void TC_01_Register() {
	  loginPageURL=driver.getCurrentUrl();
	  /* Click here link to open Register Page*/
	  driver.findElement(By.xpath("//a[text()='here']")).click();
	  /*wait for email textbox visible*/
	  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='emailid']"))));
	  /*Input email random*/
	  driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("online06"+random()+"@gmail.com");
	  
	  /*Click Submit button  */
	  driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	  
	  /* get Text of UserID */
	  userID=driver.findElement(By.xpath("//td[text()='User ID :']/following-sibling::td")).getText();
	  password=driver.findElement(By.xpath("//td[text()='Password :']/following-sibling::td")).getText();
	  
	  /* */
  }
  @Test
  public void TC_02_Login() {
	  /* Open Login page again */
	  driver.get(loginPageURL);
	  
	  /*wait for userID textbox visible*/
	  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='uid']"))));
	  driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(userID);
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	  driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
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
