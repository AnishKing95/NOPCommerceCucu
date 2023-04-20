package Steps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;

public class ShopCartStep extends Initializaion.Initialization{
	@Given("user can access to all dropdowns")
	public void user_can_access_to_all_dropdowns() throws AWTException {
		WebElement electronic = allObj.getCameraphoto_page().getElectronic();
	    electronic.click();
	    WebElement campage = allObj.getCameraphoto_page().getCamerapages();
		  campage.click();
		WebElement dslr = allObj.getNikanPages().getDslr();
	    dslr.click();
	    WebElement addcart = allObj.getNikanPages().getAddcart();
		addcart.click();

		WebElement shopcart = allObj.getNikanPages().getShopcart();
		shopcart.click();
		
		WebElement giftwapper1 = allObj.getShopCartPage().getGiftwapper();
		Select c = new Select(giftwapper1);
		c.selectByValue("2");
		
		WebElement giftwapper12 = allObj.getShopCartPage().getGiftwapper();
		
		c.selectByValue("1");

	}
	
	
	@Given("user see on total cost")
	public void user_see_on_total_cost() {
		WebElement electronic = allObj.getCameraphoto_page().getElectronic();
	    electronic.click();
	    WebElement campage = allObj.getCameraphoto_page().getCamerapages();
		  campage.click();
		WebElement dslr = allObj.getNikanPages().getDslr();
	    dslr.click();
	    WebElement addcart = allObj.getNikanPages().getAddcart();
		addcart.click();

		WebElement shopcart = allObj.getNikanPages().getShopcart();
		shopcart.click();
		 WebElement giftwapperclick = allObj.getShopCartPage().getGiftwapper();
		 Select d = new Select(giftwapperclick);
		 d.selectByValue("2");
		
		
		WebElement totalcost = allObj.getShopCartPage().getTotalcost();
	   totalcost.isDisplayed();
	}
	
	@Given("user select on terms of service icon")
	public void user_select_on_terms_of_service_icon() {
		WebElement electronic = allObj.getCameraphoto_page().getElectronic();
	    electronic.click();
	    WebElement campage = allObj.getCameraphoto_page().getCamerapages();
		campage.click();
		WebElement dslr = allObj.getNikanPages().getDslr();
	    dslr.click();
	    WebElement addcart = allObj.getNikanPages().getAddcart();
		addcart.click();

		WebElement shopcart = allObj.getNikanPages().getShopcart();
	    shopcart.click();
		WebElement giftwapperclick = allObj.getShopCartPage().getGiftwapper();
		Select d = new Select(giftwapperclick);
		d.selectByValue("2");
		WebElement discountcoupon = allObj.getShopCartPage().getDiscountcoupon();
		discountcoupon.sendKeys("1233");
	    WebElement tickbutton = allObj.getShopCartPage().getTickbutton();
	    tickbutton.click();
	}


	@When("user select the yes button")
	public void user_select_the_yes_button() {
		 WebElement giftwapperclick = allObj.getShopCartPage().getGiftwapper();
		 Select d = new Select(giftwapperclick);
		 d.selectByValue("2");
		
	}
	@When("user change the value present")
	public void user_change_the_value_present() {
		WebElement giftwapperclick = allObj.getShopCartPage().getGiftwapper();
		 Select d = new Select(giftwapperclick);
		 d.selectByValue("2");
	    	}
	
	
	
	@When("user select on checkout button")
	public void user_select_on_checkout_button() {
	    WebElement checkout = allObj.getShopCartPage().getCheckout();
	    checkout.click();
	}
	@When("user select on shoppingcart checkout button")
	public void user_select_on_shoppingcart_checkout_button() {
		WebElement checkout = allObj.getShopCartPage().getCheckout();
		checkout.click();
	}


	@Then("verify user select on values yes or no")
	public void verify_user_select_on_values_yes_or_no() {
		WebElement giftwapper = allObj.getShopCartPage().getGiftwapper();
		giftwapper.click();
		if (giftwapper.isDisplayed()) {
			System.out.println("slected on giftwapper select yes");
		}
		else {
			System.out.println("slected on giftwapper select no");
		}
		
	}



	@Then("check the terms of services warning displayed")
	public void check_the_terms_of_services_warning_displayed() {
		String expected = "Please accept the terms of service before the next step.";
		 

		
	    WebElement tearmswarning = allObj.getShopCartPage().getTearmswarning();
	     
	   
	     
		 String acutal = tearmswarning.getText();
		 System.out.println(acutal);
		 
		 
		 if (expected.equals(acutal)) {
			 System.out.println("warning message is equals test pass");
			
		}
		 else {
			System.out.println("warning message as not equalstest fail");
		}
	}
	
	
	
	



	
	
	

	


	@Then("product is check out and navigate to billing page")
	public void product_is_check_out_and_navigate_to_billing_page() {
		WebElement shipbillingpage = allObj.getShopCartPage().getShipbillingpage();
		
		String expected ="Ship to the same address";
		
		String acutal = shipbillingpage.getText();
		 System.out.println(acutal);
		 
		 
		 if (expected.equals(acutal)) {
			 System.out.println("test pass go to shippingmethod page");
			
		}
		 else {
			System.out.println("test fail freezed on billing page");
		}
		
	}
	

}
