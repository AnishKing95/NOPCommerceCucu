
package Runners;


import org.junit.AfterClass;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "src\\test\\resources\\new\\Test.feature" },
		glue = { "Steps" },
		monochrome = true,
		publish = true

)

public class TestRunner {



}
