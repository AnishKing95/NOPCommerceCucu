package Initializaion;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import PageObjects.BillingPages;
import PageObjects.Cameraphoto_page;
import PageObjects.LoginPage;
import PageObjects.NikanPages;
import PageObjects.ShippingPage;
import PageObjects.ShopCartPage;
import Runners.TestRunner;
import Steps.Cameraphoto_steps;
import io.cucumber.java.Before;


public class Initialization {

	public static WebDriver driver;
	private static LoginPage loginPage;
	private static Cameraphoto_page cameraphoto_pa;
	private static NikanPages nikanpag;
	private static ShippingPage Shippingpage;
	private static BillingPages Billingpages;
	private static ShopCartPage ShopCartPag;
	public static Initialization allObj;
	public static ChromeOptions options;
	
	
    @BeforeClass
	public static void getCucumberOptions() {

		    options= new ChromeOptions();
			options.addArguments("--start-maximized");
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);

	}


	

	public  LoginPage getLoginPage() {

		loginPage = PageFactory.initElements(driver, LoginPage.class);
		return loginPage;

	}
	
	
	public Cameraphoto_page getCameraphoto_page() {
		cameraphoto_pa = PageFactory.initElements(driver,Cameraphoto_page.class );
		return cameraphoto_pa;

	}
	
	
	public NikanPages getNikanPages() {
		nikanpag = PageFactory.initElements(driver,NikanPages.class );
		return nikanpag;
		
	}
	
	public ShopCartPage getShopCartPage() {
		ShopCartPag = PageFactory.initElements(driver,ShopCartPage.class );
		return ShopCartPag;
		
	}
	
	public BillingPages getBillingPages() {
		Billingpages = PageFactory.initElements(driver,BillingPages.class );
		return Billingpages;
		
	}
	public ShippingPage getShippingPage() {
		Shippingpage = PageFactory.initElements(driver,ShippingPage.class );
		return Shippingpage;
		
	}
	
	
	
	public static void getAllObjects() {

		allObj = new Initialization();

	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public  Cameraphoto_page getcameraphoto_page() {
//
//		Cameraphoto_page Cameraphoto_page = PageFactory.initElements(driver, Cameraphoto_page.class);
//		return Cameraphoto_page;
//		
//
//	}

	
	
//	public cameraphoto_page getcameraphotopage() {
//		cameraphoto_page = PageFactory.initElements(driver,cameraphoto_page.class);
//   return cameraphoto_page;
//	}
	
	
	
}
