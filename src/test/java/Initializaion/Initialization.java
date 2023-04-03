package Initializaion;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import PageObjects.LoginPage;
import Runners.TestRunner;
import io.cucumber.java.Before;


public class Initialization {

	public static WebDriver driver;
	private static LoginPage loginPage;
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



	public static void getAllObjects() {

		allObj = new Initialization();

	}

}
