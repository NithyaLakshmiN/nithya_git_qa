package com.test.automation.uiautomation.uiActions;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.automation.uiautomation.testBase.TestBase;

public class HomePage extends TestBase{
	public final String Women ="Women";
	public final String WomenTops ="Tops";
	public final String WomenTopstshirts ="T-shirts";
	public final String WomenTopsblouses ="Blouses";
	public final String WomenDresses ="Dresses";
	public final String WomenDresses1 ="Casual Dresses";
	public final String WomenDresses2 ="Evening Dresses";
	public final String WomenDresses3 ="Summer Dresses";
	public final String Dresses ="Dresses";
	public final String Dresses1 ="Casual Dresses";
	public final String Dresses2 ="Evening Dresses";
	public final String Dresses3 ="Summer Dresses";
	public final String tshirt ="T-shirts";
	
	
	
	public static final Logger log =Logger.getLogger(HomePage.class.getName());
	WebDriver driver ;
	
	
	
	
	@FindBy(className="login")
	WebElement signin;
	
	@FindBy(id="email")
	WebElement Eaddress;
	
	@FindBy(id="passwd")
	WebElement pwd;
	
	@FindBy(xpath="//*[@id=\"SubmitLogin\"]")
	WebElement submit;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div[3]/div/div[1]/ol/li")
	WebElement InvalidPassword;
//---------------------------------------------------------------------------------	//
	//Registration Elements
	@FindBy(className="login")
	WebElement Signin1;
	
	@FindBy(id="email_create")
	WebElement Emailaddress;
	
	@FindBy(id="SubmitCreate")
	WebElement CreateanAccount;
	
	@FindBy(id="id_gender1")
	WebElement title;
	
	@FindBy(id ="customer_firstname")
	WebElement firstname;
	
	@FindBy(id ="customer_lastname")
	WebElement lastname;
	
	@FindBy(id="passwd")
	WebElement Password;
	
	
	//@FindBy(id="days")
	//WebElement days;
	
	//@FindBy(id="months")
	//WebElement months;
	
	//@FindBy(id="years")
	//WebElement years;
	
	@FindBy(id="newsletter")
	WebElement newsletter;
	
	@FindBy(id="optin")
	WebElement optin;
	
	@FindBy(id="firstname")
	WebElement firstname1;
	
	@FindBy(id="lastname")
	WebElement lastname1;
	
	@FindBy(id="company")
	WebElement company;
	
	@FindBy(id="address1")
	WebElement address1;
	
	@FindBy(id="address2")
	WebElement address2;
	
	@FindBy(id="city")
	WebElement city;
	
	@FindBy(id="id_state")
	WebElement state;
	
	@FindBy(id="postcode")
	WebElement zipcode;
	
	@FindBy(id="id_country")
	WebElement country;
	
	@FindBy(id="other")
	WebElement addinfo;
	
	@FindBy(id="phone_mobile")
	WebElement mobilephone;
	
	@FindBy(id="alias")
	WebElement Alias;
	
	@FindBy(id="submitAccount")
	WebElement submitAccount;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[2]/a")
	WebElement signout;
	
	@FindBy(xpath=".//div[@id='categories_block_left']/div[1]/ul[1]/li/a[contains(text(),'Tops')]/Preceding-sibling::span[1]")
	WebElement WomenTopsPlus;
	
	@FindBy(xpath=".//div[@id='categories_block_left']/div[1]/ul[1]/li/a[contains(text(),'Dresses')]/Preceding-sibling::span[1]")
	WebElement WomenDressesPlus;
	
	@FindBy(xpath=".//*[@id='add_to_cart']/button")
	WebElement addtocart;
	
	//@FindBy(xpath =".//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")
	//WebElement proceedtocheckout;
	
	@FindBy(xpath =".//*[@id='center_column']/div/div/div[3]/p[7]/button[1]")
	WebElement tweet;
	
	@FindBy(xpath =".//*[@id='center_column']/div/div/div[3]/p[7]/button[2]")
	WebElement fb;
	
	@FindBy(xpath =".//*[@id='center_column']/div/div/div[3]/p[7]/button[3]")
	WebElement google;
	
	@FindBy(xpath =".//*[@id='center_column']/div/div/div[3]/p[7]/button[4]")
	WebElement pinterest;
	
	
	@FindBy(xpath =".//*[@id='bd']/h2")
	WebElement tweetmessage;
	
	@FindBy(xpath ="//*[@id='email_container']/div/label")
	WebElement fbmessage;
	
	@FindBy(xpath =".//*[@id='headingText']")
	WebElement googlemessage;
	
	
	@FindBy(xpath ="html/body/div[1]/div[1]/div[1]/div/div/div/div/div/div/div[1]/div[2]/h3")
	WebElement pinterestmessage;
	
	@FindBy(xpath =".//*[@id='cart_title']")
	WebElement shoppingcartsummary;
	
	
	
	//Creating Constructor to intiate all WebElements
	public HomePage(WebDriver driver) {
		//inside constructor we r intialising Driver
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void loginToApplicationsinvalidcredentials(String emailaddress,String password) {
		signin.click();
		log("Clicked signin Button and object is :"+Signin1.toString());
		Eaddress.sendKeys(emailaddress);
		log("Entered Email Address and object is :"+Eaddress.toString());
		pwd.sendKeys(password);
		log("Entered Password and object is :"+pwd.toString());
		submit.click();
		log("Clicked Submit Button and object is :"+submit.toString());

}
	
	public String getinvalidPasswordtext() {
		log("Error Message is :"+InvalidPassword.getText());
		return InvalidPassword.getText();
	}



public void userregistration(String emailaddress,String password) {
		{
		Signin1.click();
		Emailaddress.sendKeys(emailaddress);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", CreateanAccount);
		CreateanAccount.click();
		
		title.click();
		firstname.sendKeys("NITHYA");
		lastname.sendKeys("LAKSHMI");
		Password.sendKeys(password);
		Select days = new Select(driver.findElement(By.id("days")));
		days.selectByValue("2");
		Select oselect2 = new Select(driver.findElement(By.id("months")));
		oselect2.selectByValue("1");
		Select oselect3 = new Select(driver.findElement(By.id("years")));
		oselect3.selectByValue("1983");
		newsletter.click();
		optin.click();
		firstname1.sendKeys("NITHYA");
		lastname1.sendKeys("LAKSHMI");
		company.sendKeys("TCS");
		address1.sendKeys("A6MIMS");
		address2.sendKeys("GANDHIROAD");
		city.sendKeys("FREMONT");
		Select oselect4 = new Select(driver.findElement(By.id("id_state")));
		oselect4.selectByValue("2");
		zipcode.sendKeys("72126");
		addinfo.sendKeys("PLS REGISTER");
		mobilephone.sendKeys("8587654321");
		Alias.sendKeys("jdsakdjs@dkjd.com");
		submitAccount.click();
		
		 }
}
		
	

public boolean getsucessmsg() {
	//log("Display Message is :"+resitrationmessage.getText());
	try {
	driver.findElement(By.xpath(".//*[@id='columns']/div[1]/a"));
	return true;
	}
	catch (Exception E) {
		return false;
}
}


public void loginToApplicationsvalidcredentials(String emailaddress,String password) {
	signin.click();
	log("Clicked signin Button and object is :"+Signin1.toString());
	Eaddress.sendKeys(emailaddress);
	log("Entered Email Address and object is :"+Eaddress.toString());
	pwd.sendKeys(password);
	log("Entered Password and object is :"+pwd.toString());
	submit.click();
	log("Clicked Submit Button and object is :"+submit.toString());
	signout.click();

}

public void mainmenu(String menu) {
	//Women/Dresses/T-Shirts Selection
	driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li/a[contains(text(),'"+menu+"')]")).click();
	
}

//Women
public void women() {
	WomenTopsPlus.click();
	log("clicked on Women-Tops +Symbol");
	WomenDressesPlus.click();
	log("clicked on Women-Dresses +Symbol");
	
	}

public void womentops(String submenuName1) {
	driver.findElement(By.xpath(".//div[@id='categories_block_left']/div[1]/ul[1]/li/a[contains(text(),'Tops')]/following-sibling::ul/child::li/child::a[contains(text(),'"+submenuName1+"')]")).click();
	log("clicked on Tops");
}

public void womendresses(String submenuName2) {
	driver.findElement(By.xpath(".//div[@id='categories_block_left']/div[1]/ul[1]/li/a[contains(text(),'Dresses')]/following-sibling::ul/child::li/child::a[contains(text(),'"+submenuName2+"')]")).click();
	log("clicked on Dresses");
}

//Dresses
public void dresses(String submenuName3) {
	driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li/a[contains(text(), 'Dresses')]/following-sibling::ul/child::li/child::a[contains(text(),'"+submenuName3+"')]")).click();
}

public void dressesmenu(String submenuName4) {
	driver.findElement(By.xpath(".//*[@id='categories_block_left']/h2/following-sibling::div/child::ul/child::li/child::a[contains(text(),'"+submenuName4+"')]")).click();

}

public void clickontweet() {
	tweet.click();
	
}

public void clickonfb() {
	fb.click();
	
}

public void clickongoogle() {
	google.click();
	
}


public void clickonpinterest() {
	pinterest.click();
	
}

public void clickonAddtoCart() {
	addtocart.click();
	
}

public void proceedtocheckout() {
	waitForElement(driver, 80, driver.findElement(By.xpath (".//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")));
    driver.findElement(By.xpath(".//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")).click();
	
	}

public boolean verifytweetmsg() {
	try {
		tweetmessage.isDisplayed();
		return true;
		}
		catch(Exception e){
			return false;
		}
	}

public boolean verifyfbmsg() {
	try {
		fbmessage.isDisplayed();
		return true;
		}
		catch(Exception e){
			return false;
		}
	}

public boolean verifygooglemsg() {
	try {
		googlemessage.isDisplayed();
		return true;
		}
		catch(Exception e){
			return false;
		}
	}

public boolean verifypinterestmsg() {
	try {
	pinterestmessage.isDisplayed();
	return true;
	}
	catch(Exception e){
		return false;
	}
}
	
	public boolean verifysummarytext() {
		try {
			shoppingcartsummary.isDisplayed();
		return true;
		}
		catch(Exception e){
			return false;
		}
}
	
	public static boolean isElementPresent(By by, WebDriver driver) 
    {
      boolean present;
      try
        {
          driver.findElement(by);
          present = true;
        }catch (NoSuchElementException e)
        {
          present = false;
         }
     return present;
    }
	
}

