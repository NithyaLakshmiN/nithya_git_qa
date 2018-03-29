package com.test.automation.uiautomation.uiActions;

import java.util.List;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.automation.uiautomation.testBase.TestBase;

public class ProductDetailsPage extends TestBase{
	WebDriver driver;
	
	public static final Logger log =Logger.getLogger(ProductDetailsPage.class.getName());
	public final String FadedShortSleeveTshirts  ="Faded Short Sleeve T-shirts";
	public final String Blouse  ="Blouse";
	public final String PrintedSummerDress1  ="Printed Summer Dress";
	public final String PrintedSummerDress2  ="Printed Summer Dress";
	public final String PrintedChiffonDress  ="Printed Chiffon Dress";
	
	
	
	@FindBy(xpath=".//*[@id='center_column']/ul/li/div/div/div/a/img")
	List<WebElement> products;
	
	
	
	public ProductDetailsPage(WebDriver driver) {
		//inside constructor we r intialising Driver
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void selectProduct(String product) {
    driver.findElement(By.xpath("//a[contains(text(),'"+product+"')]")).click();
    log.info(product+"has been selected");
}
	
	public  List<WebElement> selectProduct() {
	  List<WebElement> element=  products;
	    return element;
	}
}
