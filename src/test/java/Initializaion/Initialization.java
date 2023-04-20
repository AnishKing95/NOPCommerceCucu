package Initializaion;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import PageObjects.ApparelPage;
import PageObjects.LoginPage;
import PageObjects.ProductPage;
import PageObjects.VerifyAddtoCardPage;
import PageObjects.ViewPage;
import PageObjects.WishListToAddtoCard;
import Runners.TestRunner;
import io.cucumber.java.Before;


public class Initialization {

	public static WebDriver driver;
	private static LoginPage loginPage;
	private static ApparelPage apparelpage;
	private static ProductPage productpage;
	private static ViewPage  viewpage;
	private static VerifyAddtoCardPage verifyAddtoCardPage;
	private static WishListToAddtoCard wishlisttoAddtoCard;
    public static Initialization allObj;
	public static ChromeOptions options;

	
	@BeforeClass
	public static void getCucumberOptions() {

		    options= new ChromeOptions();
			options.addArguments("--start-maximized");
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);

	}
	

	public LoginPage getLoginPage() {

		loginPage = PageFactory.initElements(driver, LoginPage.class);
		return loginPage;

	}

	public ApparelPage getApparelPage() {

		apparelpage = PageFactory.initElements(driver, ApparelPage.class);
		return apparelpage;

	}
	
	public ProductPage productpage() {

		productpage = PageFactory.initElements(driver, ProductPage.class);
		return productpage;
	

	}
	

	public ViewPage  viewpage() {

		viewpage = PageFactory.initElements(driver, ViewPage.class);
		return viewpage;
	

	}
	
	public VerifyAddtoCardPage verifyAddtoCardPage() {
		verifyAddtoCardPage = PageFactory.initElements(driver, VerifyAddtoCardPage.class);
		return verifyAddtoCardPage;
	}


	public WishListToAddtoCard wishlisttoAddtoCard () {
         wishlisttoAddtoCard = PageFactory.initElements(driver, WishListToAddtoCard.class);
		return  wishlisttoAddtoCard;
	}



	public static void getAllObjects() {

		allObj = new Initialization();

	}

}
