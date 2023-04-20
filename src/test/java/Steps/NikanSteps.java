package Steps;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;

public class NikanSteps extends Initializaion.Initialization{
	
	@Given("user choosing a camera model")
	public void user_choosing_a_camera_model() {
		WebElement electronic = allObj.getCameraphoto_page().getElectronic();
	    electronic.click();
	    WebElement campage = allObj.getCameraphoto_page().getCamerapages();
		campage.click();
//		WebElement ztoa = allObj.getCameraphoto_page().getZtoa();
//	    ztoa.click(); 
			
		WebElement dslr = allObj.getNikanPages().getDslr();
	    dslr.click();
	}
	
	@Given("user enter  value added in product quantity")
	public void user_enter_value_added_in_product_quantity() {
		WebElement electronic = allObj.getCameraphoto_page().getElectronic();
	    electronic.click();
	    WebElement campage = allObj.getCameraphoto_page().getCamerapages();
		campage.click();
//		WebElement ztoa = allObj.getCameraphoto_page().getZtoa();
//	    ztoa.click();
			
		 
		WebElement dslr = allObj.getNikanPages().getDslr();
	    dslr.click();
	    WebElement addquantity = allObj.getNikanPages().getAddquantity();
	    addquantity.sendKeys("1");
	}
	
	


	@When("user select the  nikan D5500 DSLR model")
	public void user_select_the_nikan_d5500_dslr_model() {
	
		WebElement dslrred = allObj.getNikanPages().getDslrred();
		dslrred.click();
	}

	@When("user select the add cart button")
	public void user_select_the_add_cart_button() {
		WebElement addcart = allObj.getNikanPages().getAddcart();
		addcart.click();
	}
	

	@Then("check the selected product navigate to the nikan model page")
	public void check_the_selected_product_navigate_to_the_nikan_model_page() {
		WebElement check = allObj.getNikanPages().getDslrred();
		check.click();
		if (check.isDisplayed()) {
			System.out.println("visible a test pass on nikon page ");
			
		}
		else {
			System.out.println("fail on nikon page");
		}
	}
	
	@Then("verify user go to addcart product has present or not in shoppingcart page")
	public void verify_user_go_to_addcart_product_has_present_or_not_in_shoppingcart_page() {
		WebElement shopcart = allObj.getNikanPages().getShopcart();
		shopcart.click();
		if (shopcart.isDisplayed()) {
			System.out.println("product added on shopcart" );
			
		}
		else {
			System.out.println("product not added on shopcart");
		}
	}
	
	
	
	
	
	



	





	

	
	

}
