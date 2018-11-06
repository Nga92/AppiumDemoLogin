package com.bankguru.user;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG_Annotations {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite ");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class ");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method ");
	}

	@Test()
	public void TC_01() {
		System.out.println("TC 01");
	}

	@Test()
	public void TC_02() {
		System.out.println("TC 02");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After method ");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class ");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test ");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test ");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite ");
	}

}