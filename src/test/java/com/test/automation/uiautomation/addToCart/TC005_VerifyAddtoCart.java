package com.test.automation.uiautomation.addToCart;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Logger;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automation.uiautomation.testBase.TestBase;
import com.test.automation.uiautomation.uiActions.HomePage;
import com.test.automation.uiautomation.uiActions.ProductDetailsPage;

public class TC005_VerifyAddtoCart extends TestBase{
	
	public static final Logger log =Logger.getLogger(TC005_VerifyAddtoCart.class.getName());
	 HomePage homepage;
	 ProductDetailsPage productDetailsPage;
	 
	 @BeforeTest
		public void setUp() throws IOException{
		init();
		}
	 
		@Test
		public void VerifyAddtoCart (){
			log.info("*****Starting TC005 Test Case Exceution*******" );
			homepage = new HomePage(driver);
			homepage.mainmenu(homepage.Dresses);
			homepage.dressesmenu(homepage.WomenDresses3);
			productDetailsPage = new ProductDetailsPage(driver);
			productDetailsPage.selectProduct(productDetailsPage.PrintedChiffonDress);
			homepage.clickonpinterest();
			//This would fetch us all Windows id and based on that we can move between windows
			
			Iterator<String> itr = getAllWindows();
			String ParentWindow =itr.next();
			String ChildWindow =itr.next();
			driver.switchTo().window(ChildWindow);
			boolean status =homepage.verifypinterestmsg();
			driver.switchTo().window(ParentWindow);
			Assert.assertEquals(true, status);
			homepage.clickonAddtoCart();
			//driver.switchTo().defaultContent();
			homepage.proceedtocheckout();
			homepage.verifysummarytext();
			Assert.assertEquals(true, status);
			log.info("*****Finished TC005 Test Case Exceution*******" );
			
		}
			
				
			
	 
	 
}

