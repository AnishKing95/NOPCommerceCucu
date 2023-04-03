
package Runners;


import org.junit.AfterClass;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import ConfigFiles.FileConfig;
import Initializaion.Initialization;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "src\\test\\resources\\new\\Test.feature"},
		glue = { "Steps" },
		monochrome = true,
		publish = true

)

public class TestRunner extends Initialization {



	@BeforeClass
	public static void setup() {
	
 		
		
		FileConfig.fileReader();
		Initialization.getAllObjects();

		
	}

	@AfterClass
	public static void tearDown() {

		driver.close();
		driver.quit();
		

	
}
}
