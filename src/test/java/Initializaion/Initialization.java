package Initializaion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import PageObjects.LoginPage;






public class Initialization {

	public static WebDriver driver = new ChromeDriver();
	private static LoginPage loginPage;
	public static Initialization allObj;

	

	public LoginPage getLoginPage() {

		loginPage = PageFactory.initElements(driver, LoginPage.class);
		return loginPage;

	}



	public static void getAllObjects() {

		allObj = new Initialization();

	}

}
