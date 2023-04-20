package Steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;

public class ShippingSteps extends Initializaion.Initialization{

	
	@Given("user can handle options")
	public void user_can_handle_options() throws InterruptedException {
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
	    WebElement billingcontinue = allObj.getBillingPages().getBillingcontinue(); 
		billingcontinue.click();
	    Thread.sleep(30);
		
		WebElement ground = allObj.getShippingPage().getGround();
		ground.click();
		
		WebElement nextdayair = allObj.getShippingPage().getNextdayair();
		nextdayair.click();
		WebElement dayair = allObj.getShippingPage().getDayair();
		dayair.click();
	}
	@Given("user select the Shipping by land transport")
	public void user_select_the_shipping_by_land_transport() {
		WebElement ground = allObj.getShippingPage().getGround();
		ground.click();
	}


	@When("user click a continue button")
	public void user_click_a_continue_button() {
		WebElement continuebutton = allObj.getShippingPage().getContinuebutton();
		continuebutton.click();
	}



	@Then("check user selected option is selected")
	public void check_user_selected_option_is_selected() {
		WebElement ground = allObj.getShippingPage().getGround();
		ground.click();
		
		String expected ="ground";
		
		String acutal = ground.getText();
		 System.out.println(acutal);
		 
		 
		 if (expected.equals(acutal)) {
			 System.out.println("test pass go to shippingmethod page");
			
		}
		 else {
			System.out.println("test fail freezed on billing page");
		}
		
		
		
		
	}

	
	
	
}
