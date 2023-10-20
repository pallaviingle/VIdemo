package com.Test;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pom.LoginPom;
import com.utility.Utility;

public class LoginTest extends BaseClass {

	@BeforeMethod
 public void setUp() {	
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
    @Test
    
 public void loginTest() {
    	
     LoginPom login = new LoginPom();
	 login.setInputUsername(login.getUsername());
	 login.setInputPassword(login.getPassword());
	 login.loginButtonClick();
	 String expected= "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	 String actual= driver.getCurrentUrl();
	 Assert.assertEquals(actual, expected);
 }
    @Test
    
    public void testUsers() throws IOException {
    	LoginPom loginPom = new LoginPom();
    	Utility utility = new Utility();
    	
    	Sheet sh= utility.getSheet("Sheet1");
    	
        String key=	(String) utility.getSingleData(1, 0, sh);
        String value=(String) utility.getSingleData(1, 1, sh);
        
      loginPom.setInputUsername(key);
      loginPom.setInputPassword(value);
      loginPom.loginButtonClick();
      getDataFromExcel();
    }
    public void getDataFromExcel() throws IOException {
    	Utility utility = new Utility();
    	
    	Sheet sh= utility.getSheet("Sheet1");
    	
    	utility.getAllExcelData(sh);
    //String key=	(String) utility.getSingleData(1, 0, sh);
    //String value=(String) utility.getSingleData(1, 1, sh);
    }
}

