package com.test.automation.uiautomation.homepage;


import java.io.IOException;
import java.util.logging.Logger;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.automation.uiautomation.testBase.TestBase;
import com.test.automation.uiautomation.uiActions.HomePage;

public class TC004_VerifywithDifferentRecords extends TestBase {

public static final Logger log =Logger.getLogger(TC004_VerifywithDifferentRecords.class.getName());
        HomePage homepage;
        
        @DataProvider(name="logindata")
        public String[][] getTestData() {
        	String[][] testRecords =getData("TestData.xlsx","LoginTestData");
        	return testRecords;
        	
        }
		
		@BeforeTest
		public void setUp() throws IOException{
		init();
		}
		
		@Test(dataProvider="logindata")
        public void verifywithDifferentRecords(String emailaddress, String password, String runMode){
			homepage = new HomePage(driver);
			if(runMode.equalsIgnoreCase("n")){
				throw new SkipException("user marked this record as no run");
			}
			try {
				log.info("*****Starting TC004 Test Case Exceution*******" );
			homepage.loginToApplicationsvalidcredentials(emailaddress,password);
			homepage.getsucessmsg();
			captureScreen("verifyLoginWithDifferentRecords");
			Assert.assertEquals(true,homepage.getsucessmsg());
			log.info("*****Finished TC004 Test Case Exceution*******" );
			
		}
			catch(Exception e){
				log(e.fillInStackTrace().toString());
				captureScreen("verifyLoginWithDifferentRecords");
			}
		}
		
        
	 
			
			
		
		

	


		
	}


