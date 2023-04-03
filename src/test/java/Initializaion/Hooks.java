//package Initializaion;
//
//import org.junit.AfterClass;
//import org.junit.Assert;
//import org.junit.BeforeClass;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import ConfigFiles.FileConfig;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//
//public class Hooks extends Initialization {
//	
//
//	@Before
//	public static void setup() {
//		
//		FileConfig.fileReader();
//		Initialization.getAllObjects();
//
//		
//	}
//
//	@After
//	public static void tearDown() {
//
//		driver.close();
//		driver.quit();
//		
//
//	}
//}
