package Steps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cameraphoto_steps<Z> extends Initializaion.Initialization {
	@Given("user navigates to electronic page")
	public void user_navigates_to_electronic_page() {
	    WebElement electronic = allObj.getCameraphoto_page().getElectronic();
	    electronic.click();
	}
	



	@When("user select a camera & photo")
	public void user_select_a_camera_photo() {
	  WebElement campage = allObj.getCameraphoto_page().getCamerapages();
	  campage.click();
	}

	

	@Then("check it navigate to selected camera & photo page")
	public void check_it_navigate_to_selected_camera_photo_page() {
	   WebElement appleicons = allObj.getCameraphoto_page().getAppleicon();
	  	if (appleicons.isDisplayed()) {
	  		System.out.println("camera & photo page pass");
			
		} else {
			System.out.println("camera & photopage fail");

		}
		
	}
	

	

	

	}

