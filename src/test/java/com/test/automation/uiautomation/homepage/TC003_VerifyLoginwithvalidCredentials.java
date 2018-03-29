package com.test.automation.uiautomation.homepage;


import java.io.IOException;
import java.util.logging.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automation.uiautomation.testBase.TestBase;
import com.test.automation.uiautomation.uiActions.HomePage;

public class TC003_VerifyLoginwithvalidCredentials extends TestBase {

public static final Logger log =Logger.getLogger(TC003_VerifyLoginwithvalidCredentials.class.getName());
HomePage homepage;
		
		@BeforeTest
		public void setUp() throws IOException{
		init();
		}
		
		@Test
        public void verifyLoginwithvalidCredentials(){
			try {
			log.info("*****Starting TC003 Test Case Exceution*******" );
			homepage = new HomePage(driver);
			
			homepage.loginToApplicationsvalidcredentials("Test1@dsfhd.com","yeuweyu");
			homepage.getsucessmsg();
			Assert.assertEquals(true,homepage.getsucessmsg());
			log.info("*****Finished TC003 Test Case Exceution*******" );
		}
			catch(Exception e){
				log(e.fillInStackTrace().toString());
				
			}
		}
		
       
		

	


		
	}


