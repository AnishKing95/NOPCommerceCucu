package Initializaion;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeOptions;

import ConfigFiles.FileConfig;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Initialization {

	@Before
	public static void setup() {

//		ChromeOptions options= new ChromeOptions();
////		options.addArguments("--start-maximized");
//		options.addArguments("--remote-allow-origins=*");
		FileConfig.fileReader();
		Initialization.getAllObjects();

		
	}

	@After
	public static void tearDown() {

		driver.close();
		driver.quit();
		

	}
}
