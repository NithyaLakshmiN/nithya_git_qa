package com.test.automation.uiautomation.addToCart;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import com.test.automation.uiautomation.testBase.TestBase;

public class TC006_HandlingMultipleWindows extends TestBase{
	
	List<String> windowsIds = new ArrayList<String>();
	
	@BeforeClass
	
		

	
	@Test
	public void testLogin(){
	Iterator<String> itr =getAllWindows();
	while(itr.hasNext()) {
	 windowsIds.add(itr.next());
	}
	driver.switchTo().window(windowsIds.get(6));//---->This would switch to sixth Window
	driver.switchTo().window(windowsIds.get(1));//---->This would switch to sixth Window
	driver.switchTo().window(windowsIds.get(4));//---->This would switch to sixth Window
	}

	@AfterClass
	public void endtest()
	{
		
	}
}
