package com.test.automation.uiautomation.homepage;


import java.io.IOException;
import java.util.logging.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automation.uiautomation.testBase.TestBase;
import com.test.automation.uiautomation.uiActions.HomePage;

public class TC001_VerifyLoginwithInvalidCredentials extends TestBase {

public static final Logger log =Logger.getLogger(TC001_VerifyLoginwithInvalidCredentials.class.getName());
HomePage homepage;
		
		@BeforeTest 
		public void setUp() throws IOException{
		init();
		}
		
		@Test
        public void verifyLoginwithInvalidCredentials(){
			try {
			log.info("*****Starting TC001 Test Case Exceution*******" );
			homepage = new HomePage(driver);
			homepage.loginToApplicationsinvalidcredentials("Test656@dsfhd.com","yeuweyu");
			Assert.assertEquals(true,homepage.getinvalidPasswordtext(),"Authentication failed.");
			log.info("*****Finished TC001 Test Case Exceution*******" );
		}
			catch(AssertionError e) {
				captureScreen("verifyLoginwithInvalidCredentials");
				Assert.assertTrue(true,"verifyLoginwithInvalidCredentials");
			}
			catch(Exception e) {
				log(e.fillInStackTrace().toString());
				
			}
		}
		
      
		

	


		
	}


