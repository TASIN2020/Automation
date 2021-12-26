package model;

import org.openqa.selenium.By;

public class Locators {
	
	public static String homePageUrl = "https://www.daraz.com.bd/";
	public static String homePageTitle = "Online Shopping in Bangladesh: Order Now from Daraz.com.bd";
	
	//Login
	public static By loginClick = By.xpath("//a[contains(text(),'Signup / Login')]");
	public static By enterUserName = By.xpath("//input[@placeholder='Please enter your Phone Number or Email']");
	public static By enterPassword = By.xpath("//input[@type='password']");
	public static By loginButtonClick = By.xpath("//button[@type='submit']");
	
	//Select an item and add to cart
	public static By categorySelect = By.xpath("//span[contains(text(),'Automotive & Motorbike')]");
	public static By subCategorySelect = By.xpath("//span[contains(text(),'Motorcycle Riding Gear')]");
	public static By productTypeSelect = By.xpath("//span[contains(text(),'Eyewear')]");
	public static By productColorSelect = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/label[2]/span[1]/input[1]");
	public static By productSelect = By.xpath("//a[contains(text(),'motorcycle silencer guard for honda X blade')]");
	public static By addToCart = By.xpath("//body/div[@id='container']/div[@id='root']/div[@id='block-Y-4uLJVMtw']/div[@id='block-r6Vg4R0VUw']/div[@id='block-bi5j2GL8q8']/div[@id='block-n2wJOry3OWJ']/div[@id='module_add_to_cart']/div[1]/button[2]");
	
}
