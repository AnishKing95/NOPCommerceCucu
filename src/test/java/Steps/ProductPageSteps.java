package Steps;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductPageSteps extends Initializaion.Initialization {
	@Given("check user can handle and select dropdown of sortby and diplay")
	public void check_user_can_handle_and_select_dropdown_of_sortby_and_diplay() {
		WebElement apparel = allObj.getApparelPage().getApparel();
		apparel.click();
		WebElement accessories = allObj.getApparelPage().getAccessories();
		accessories.click();
		WebElement sortbybar = allObj.productpage().getSortbybar();
		sortbybar.click();
		WebElement dropdown = allObj.productpage().getDropdown();
		if(dropdown.isDisplayed()) {
			System.out.println("test pass");
		}else {
			System.out.println("test fail");
		}
		
        WebElement productDropDown = allObj.productpage().getProductbar();
		productDropDown.click();
		
		WebElement dropdown2 = allObj.productpage().getDropdown2();
		
		if(dropdown2.isDisplayed()) {
			System.out.println("test pass");
		}else {
			System.out.println("test fail");
		}
		
		
	}

	

	@When("user select required option in sortby and display")
	public void user_select_required_option_in_sortby_and_display() {
		WebElement sortbybar = allObj.productpage().getSortbybar();
		sortbybar.click();
		WebElement dropdown = allObj.productpage().getDropdown();
		 dropdown.click();
	
		 WebElement productDropDown = allObj.productpage().getProductbar();
			productDropDown.click();
			
			WebElement dropdown2 = allObj.productpage().getDropdown2();
			dropdown2.click();
	  
	}
	

	@Then("check the selected option is changed in the accessories page")
	public void check_the_selected_option_is_changed_in_the_accessories_page() {
		WebElement dropdown = allObj.productpage().getDropdown();
		 if(dropdown.isDisplayed()) {
			 System.out.println("user can select values in dropdown");
		 }else {
			 System.out.println("user can't select values in dropdown");
		 }
	
		 WebElement dropdown2 = allObj.productpage().getDropdown2();
		 if(dropdown2.isDisplayed()) {
			 System.out.println("user can select values in dropdown two");
		 }else {
			 System.out.println("user can't select values in dropdown twos");
		 }
	
	}
	
	

}
