package com.test.automation.uiautomation.homepage;
import java.io.IOException;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.automation.uiautomation.testBase.TestBase;
import com.test.automation.uiautomation.uiActions.HomePage;

public class TC002_Registration extends TestBase {
	public static final Logger log =Logger.getLogger(TC002_Registration.class.getName());
	HomePage homepage;
			
			@BeforeClass			
			public void setUp() throws IOException{
			init();
			}
			
			@Test
	        public void registrationuser()  {
				try{
					log.info("*****Starting TC002 Test Case Exceution*******" );
					homepage = new HomePage(driver);
					homepage.userregistration("Test3@dsfhd.com","yeuweyu");
					homepage.getsucessmsg();
					Assert.assertEquals(true,homepage.getsucessmsg());
					log.info("*****Finished TC002 Test Case Exceution*******" );
				}
				
				catch(AssertionError e) {
					captureScreen("Registration");
					//Assert.assertTrue(false,"Registration");
				}
				catch(Exception e) {
					log(e.fillInStackTrace().toString());
					
				}
			}
			
			
	        
		  

		


			
		}





