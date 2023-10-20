package com.Test;

import java.io.FileNotFoundException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.base.BaseClass;
import com.base.HomePage;
public class HomePageTest extends BaseClass{
	
	HomePage homePage = new HomePage();
	
	@BeforeMethod
 public void setUp()  {	
	 try {
		launchTheWeb();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
	@AfterMethod
 public void tearDown() {
	 driver.quit();
 }
	
}

	

