package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApparelPageSteps extends Initializaion.Initialization {
	@Given("check user can select all products in Apparel bar")
	public void check_user_can_select_all_products_in_apparel_bar() {
		WebElement apparel = allObj.getApparelPage().getApparel();
		apparel.click();
		
		
		
	    WebElement shoes = allObj.getApparelPage().getShoes();	
		if(shoes.isDisplayed()) {
		System.out.println("shoes is visible");
		
		}else {
			System.out.println("Shoes page is not visible error");
		}
		
		
		WebElement clothing = allObj.getApparelPage().getClothing();
		if(clothing.isDisplayed()) {
			System.out.println("clothing is visible");
		}else {
			System.out.println("clothing page is not visible error");
		}
		
		
		WebElement accessories = allObj.getApparelPage().getAccessories();
		if(accessories.isDisplayed()) {
			System.out.println("accessories is visible");
		}else {
			System.out.println("accessories page is not visible error");
		}
		
		
	}
	
	
	@When("user select required product in Apparel bar")
	public void user_select_required_product_in_apparel_bar() {
		WebElement product = allObj.getApparelPage().getProduct();
		if(product.isDisplayed()) {
			product.click();
		}else {
			System.out.println("product not clicked");
		}
	}
	
	
	@Then("check it navigate to the selected accessories page")
	public void check_it_navigate_to_the_selected_accessories_page() throws InterruptedException {
		WebElement productpage = allObj.getApparelPage().getProductpage();
		if(productpage.isDisplayed()) {
			System.out.println("navigate to the selected productpage");
		}else {
			System.out.println("testfail");
		}
		
	}
		


}
