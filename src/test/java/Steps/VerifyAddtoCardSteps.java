package Steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyAddtoCardSteps extends Initializaion.Initialization{
    //	scenario 4
	@Given("user select the add to card under the required product in accesories page")
	public void user_select_the_add_to_card_under_the_required_product_in_accesories_page() {
		WebElement apparel = allObj.getApparelPage().getApparel();
		apparel.click();
		
		WebElement accessories = allObj.getApparelPage().getAccessories();
		accessories.click();
        
	   	WebElement productHat = allObj.verifyAddtoCardPage().getProductHat();
	    productHat.click();
	   
	     WebElement addtocardbutton = allObj.verifyAddtoCardPage().getAddtocardbutton();
	     addtocardbutton.click();

	   
	}



	@Given("check please select size warring message come")
	public void check_please_select_size_warring_message_come() {
     WebElement alertMessage = allObj.verifyAddtoCardPage().getAlertMessage();
    
	   
	}

	

	@When("select the size")
	public void select_the_size() {
		 WebElement sizedropdown = allObj.verifyAddtoCardPage().getSizedropdown();
		 sizedropdown.click();
	     WebElement sizeOption = allObj.verifyAddtoCardPage().getSizeOption();
     	 sizeOption.click();
	     System.out.println("user can handle size dropdown");
		 WebElement addtocardbutton = allObj.verifyAddtoCardPage().getAddtocardbutton();
	     addtocardbutton.click();
	
	   	}



	@Then("check the product can be add to card")
	public void check_the_product_can_be_add_to_card() {
		 WebElement productAddedMessage = allObj.verifyAddtoCardPage().getProductAddedMessage();

		    if(productAddedMessage.isDisplayed()) {
		    	System.out.println("product added to shopping card list");
		    }
		    else {
		    	System.out.println("test fail");
		    }
		}
		
	
	//Quantity box scenario 5
	@Given("user click enter the quantity icon")
	public void user_click_enter_the_quantity_icon() {
		WebElement apparel = allObj.getApparelPage().getApparel();
		apparel.click();
		WebElement accessories = allObj.getApparelPage().getAccessories();
		accessories.click();
        WebElement productHat = allObj.verifyAddtoCardPage().getProductHat();
	    productHat.click();
	
	    WebElement quantitybox = allObj.verifyAddtoCardPage().getQuantitybox();
        quantitybox.click();
        quantitybox.clear();
	}

	

	@When("enter a value")
	public void enter_a_value() {
		  WebElement quantitybox = allObj.verifyAddtoCardPage().getQuantitybox();
		  quantitybox.sendKeys("3");
		  quantitybox.clear();
	 
	}

	

	@Then("it should displayed in the icon")
	public void it_should_displayed_in_the_icon() {
		 WebElement quantitybox = allObj.verifyAddtoCardPage().getQuantitybox();
		 quantitybox.sendKeys("3");
		 String enteredText = quantitybox.getText();
		 System.out.println(enteredText);
		 System.out.println(quantitybox);
		 if(enteredText.equals(quantitybox)) {
			 System.out.println("user can enter values in quantity box");
		 }else {
			 System.out.println("user can not enter values in quantity box");
		 }
	    
	}
	

	
	
	//	Scenario 6 
	@When("user select the Add to wish list")
	public void user_select_the_add_to_wish_list() {
		WebElement apparel = allObj.getApparelPage().getApparel();
		apparel.click();
		
		WebElement accessories = allObj.getApparelPage().getAccessories();
		accessories.click();
        
		WebElement productHat = allObj.verifyAddtoCardPage().getProductHat();
	     productHat.click();
	     
	     WebElement sizedropdown = allObj.verifyAddtoCardPage().getSizedropdown();
		 sizedropdown.click();
	     WebElement wishlistButton = allObj.verifyAddtoCardPage().getWishlistButton();
		wishlistButton.click();
	    
	}



	@Then("check it is added in wish list")
	public void check_it_is_added_in_wish_list() {
		
		WebElement wishlistaddedPopUp = allObj.verifyAddtoCardPage().getWishlistaddedPopUp();
		
		if(wishlistaddedPopUp.isDisplayed()) {
			System.out.println("product can be added to wish list");
		}else {
			System.out.println("product can not be added to wish list");
		}
		
		}
        }




	


