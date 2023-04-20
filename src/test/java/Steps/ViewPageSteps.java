package Steps;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewPageSteps extends Initializaion.Initialization   {

@When("user select the required view type")
	public void user_select_the_required_view_type() {
		WebElement apparel = allObj.getApparelPage().getApparel();
		apparel.click();
		WebElement accessories = allObj.getApparelPage().getAccessories();
		accessories.click();
		System.out.println("hi");
	  WebElement viewtype = allObj.viewpage().getViewtypeTwo();
	
	  if( viewtype.isDisplayed()) {
		 viewtype.click();
		 System.out.println("user can select the view type");
	 }else {
		 System.out.println("user can not select the view type");
	 }
	  
}





	@Then("check the slected option is chaged in the product page")
	public void check_the_slected_option_is_chaged_in_the_product_page() {
			 System.out.println("user change the select the view type");
		     

	 }

		
 
	

	}
