package Steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;

public class BillingStep extends Initializaion.Initialization{

	@Given("user can not select billing adresss")
	public void user_can_not_select_billing_adresss() {
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
		WebElement tickbutton = allObj.getShopCartPage().getTickbutton();
		tickbutton.click();
		WebElement checkout = allObj.getShopCartPage().getCheckout();
	    checkout.click();
		
		WebElement emailclear = allObj.getBillingPages().getEmailclear();
	    emailclear.clear();
	    WebElement companynameclear = allObj.getBillingPages().getCompanynameclear();
	    companynameclear.clear();
	}
	
	
	@Given("user can enter valid billing details")
	public void user_can_enter_valid_billing_details() {
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
		WebElement tickbutton = allObj.getShopCartPage().getTickbutton();
		tickbutton.click();
		WebElement checkout = allObj.getShopCartPage().getCheckout();
	    checkout.click();
		
		
		WebElement country = allObj.getBillingPages().getCountry();
		Select q = new Select(country);
	    q.selectByValue("133"); 
	    WebElement state = allObj.getBillingPages().getState();   
	    state.click();  
	    WebElement city = allObj.getBillingPages().getCity();
	    city.sendKeys("thanjavur");
	    WebElement address1 = allObj.getBillingPages().getAddress1();
	    address1.sendKeys("1/1,mcroad,thanjavur");
	    WebElement address2 = allObj.getBillingPages().getAddress2();
	    address2.sendKeys("1/1,mcroad,thanjavur");
	    WebElement zip = allObj.getBillingPages().getZip();
	    zip.sendKeys("123466");
	    WebElement phonenumber = allObj.getBillingPages().getPhonenumber();
	    phonenumber.sendKeys("1234567890");
	    WebElement faxnumber = allObj.getBillingPages().getFaxnumber();
	    faxnumber.sendKeys("0987654");
	    
	}


	@When("user to select a continue button")
	public void user_to_select_a_continue_button() {
		WebElement billingcontinue = allObj.getBillingPages().getBillingcontinue(); 
		billingcontinue.click();
	}
    
	@When("user select a continue button")
	public void user_select_a_continue_button() {
		WebElement billingcontinue = allObj.getBillingPages().getBillingcontinue(); 
		billingcontinue.click();
	}

	@Then("check on your cart is empty alert message displayed")
	public void check_on_your_cart_is_empty_alert_message_displayed() {
		 WebElement errormessage = allObj.getBillingPages().getBillingcontinue();
		 if (errormessage.isDisplayed()) {
			 System.out.println("warning message is equals test pass");
			
		}
		 else {
			System.out.println("warning message as not equalstest fail");
		}
		
	}
	
	

	@Then("verify user entered billling address navigate to next page")
	public void verify_user_entered_billling_address_navigate_to_next_page() {
		WebElement shippingmethodpage = allObj.getBillingPages().getShippingmethodpage();
		shippingmethodpage.click();
		
		if (shippingmethodpage.isDisplayed()) {
			System.out.println("test pass go to shippingmethod page");
			
		}
		else {
			System.out.println("test fail freezed on billing page");
		}
		
		
		
		
//		 String expected ="Back";
//		
//		String acutal = shippingmethodpage.getText();
//		 System.out.println(acutal);
//		 
//		 
//		 if (expected.equals(acutal)) {
//			 System.out.println("test pass go to shippingmethod page");
//			
//		}
//		 else {
//			System.out.println("test fail freezed on billing page");
//		}
//		
		
		
	}
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
		
		
	
		
		
		
	

	
	
	
	

