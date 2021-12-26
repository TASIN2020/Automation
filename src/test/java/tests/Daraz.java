package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Base;
import model.CommonMethods;
import model.Locators;
import model.Timeout;
import pages.HomePage;

public class Daraz {

	Base base = new Base();
	WebDriver driver = base.setup();
	CommonMethods commonMethods = new CommonMethods(driver);
	HomePage homePage  = new HomePage(driver);
	Timeout time = new Timeout();
	
	@BeforeClass
	public void start() {
		driver.get(homePage.homePageUrl());
		driver.manage().window().maximize();		
	}
	
	@Test
	public void loginTest() {
		
		assertEquals(commonMethods.getTitle(), Locators.homePageTitle);
		time.timeout();
		
		
		//Login Section
		commonMethods.clickOnButton(Locators.loginClick);
		time.timeout();
		
		commonMethods.sendText(Locators.enterUserName, "01886644261");
		time.timeout();
		
		commonMethods.sendText(Locators.enterPassword, "ebrahim881");
		time.timeout();
		
		commonMethods.clickOnButton(Locators.loginButtonClick);
		time.timeout();
		
		
		//Add to cart section
		commonMethods.clickOnButton(Locators.categorySelect);
		time.timeout();
		
		commonMethods.hoverOnButton(Locators.subCategorySelect);
		time.timeout();
		
		commonMethods.clickOnButton(Locators.productTypeSelect);
		time.timeout();
		
		commonMethods.clickOnButton(Locators.productColorSelect);
		time.timeout();
		
		commonMethods.clickOnButton(Locators.productSelect);
		time.timeout();
		
		commonMethods.clickOnButton(Locators.addToCart);
		time.timeout();
		
		
		//Driver Close
		base.tearDown();
		
	}
	
	
}