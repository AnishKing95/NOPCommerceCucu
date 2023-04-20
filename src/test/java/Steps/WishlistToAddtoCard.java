package Steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WishlistToAddtoCard  extends Initializaion.Initialization{
	@Given("user enter into wishlist")
	public void user_enter_into_wishlist() {
		WebElement apparel = allObj.getApparelPage().getApparel();
		apparel.click();
		
		WebElement accessories = allObj.getApparelPage().getAccessories();
		accessories.click();
        
		WebElement productHat = allObj.verifyAddtoCardPage().getProductHat();
	    productHat.click();
	     
	     WebElement sizedropdown = allObj.verifyAddtoCardPage().getSizedropdown();
		 sizedropdown.click();
	     WebElement sizeOption = allObj.verifyAddtoCardPage().getSizeOption();
	     sizeOption.click();
		WebElement wishlistButton = allObj.verifyAddtoCardPage().getWishlistButton();
		wishlistButton.click();
			
	    WebElement wishlistlabel = allObj.wishlisttoAddtoCard().getWishlistlabel();
	    wishlistlabel.click();

	}

	

	@Given("click add to card button")
	public void click_add_to_card_button() {
		WebElement addtoCardwishList = allObj.wishlisttoAddtoCard().getAddtoCardwishList();
		addtoCardwishList.click();
		
		
	   
	}

	

	@Given("no product selected to add to card alert message come")
	public void no_product_selected_to_add_to_card_alert_message_come() {
		WebElement noproductAddedPopup = allObj.wishlisttoAddtoCard().getNoproductAddedPopup();
		if(noproductAddedPopup.isDisplayed()) {
			System.out.println("no product selected to add to card alert message popup");
		}else {
			System.out.println("no product selected to add to card alert message did not popup ");
		}
	  
	}

	

	@When("select the required product")
	public void select_the_required_product() {
	    WebElement checkbox = allObj.wishlisttoAddtoCard().getCheckbox();
	    checkbox.click();
	}

	

	@When("select add to card")
	public void select_add_to_card() {
		WebElement addtoCardwishList = allObj.wishlisttoAddtoCard().getAddtoCardwishList();
		addtoCardwishList.click();
	    
	}

	

	@Then("check the product is added in add to card")
	public void check_the_product_is_added_in_add_to_card() {
		WebElement shopcardPage = allObj.wishlisttoAddtoCard().getShopcardPage();
		if(shopcardPage.isDisplayed()) {
			System.out.println("product added to add to card page");
		}else {
			System.out.println("product did not added to add to card page");
		}
	
	}
	
	@When("user select gift wrapping icon")
	public void user_select_gift_wrapping_icon() {
		WebElement apparel = allObj.getApparelPage().getApparel();
		apparel.click();
		
		WebElement accessories = allObj.getApparelPage().getAccessories();
		accessories.click();
        
		WebElement productHat = allObj.verifyAddtoCardPage().getProductHat();
	     productHat.click();
	     
	     WebElement sizedropdown = allObj.verifyAddtoCardPage().getSizedropdown();
		 sizedropdown.click();
	      WebElement sizeOption = allObj.verifyAddtoCardPage().getSizeOption();
			   sizeOption.click();
			   
			   
			   WebElement addtocardbutton = allObj.verifyAddtoCardPage().getAddtocardbutton();
			     addtocardbutton.click();
			     
			     WebElement shopcard = allObj.wishlisttoAddtoCard().getShopcard();
			     shopcard.click();
			     
			  WebElement giftWrapping = allObj.wishlisttoAddtoCard().getGiftWrapping();
		giftWrapping.click();
		
	    
	}

	@Then("check user can change the dropdown values")
	public void check_user_can_change_the_dropdown_values() {
		WebElement giftWrapping = allObj.wishlisttoAddtoCard().getGiftWrapping();
		giftWrapping.click();
		WebElement wrappingYes = allObj.wishlisttoAddtoCard().getGiftWrappingYes();
		wrappingYes.click();
		System.out.println("user can change the gift wrapping drop down");
	    
	}

//Scennario 9
	@When("user enter values in the discount code box")
	public void user_enter_values_in_the_discount_code_box() {
		WebElement apparel = allObj.getApparelPage().getApparel();
		apparel.click();
		
		WebElement accessories = allObj.getApparelPage().getAccessories();
		accessories.click();
        
		WebElement productHat = allObj.verifyAddtoCardPage().getProductHat();
	     productHat.click();
	     
	    WebElement sizedropdown = allObj.verifyAddtoCardPage().getSizedropdown();
	    sizedropdown.click();
	    WebElement sizeOption = allObj.verifyAddtoCardPage().getSizeOption();
        sizeOption.click();
			   
			   
	   WebElement addtocardbutton = allObj.verifyAddtoCardPage().getAddtocardbutton();
	   addtocardbutton.click();
			     
	   WebElement shopcard = allObj.wishlisttoAddtoCard().getShopcard();
	   shopcard.click();
			     
	    WebElement giftWrapping = allObj.wishlisttoAddtoCard().getGiftWrapping();
		giftWrapping.click();
		
		
		
		WebElement wrappingYes = allObj.wishlisttoAddtoCard().getGiftWrappingYes();
		wrappingYes.click();
		
		
		WebElement discountode = allObj.wishlisttoAddtoCard().getDiscountode();
		discountode.sendKeys("1344242");
	 
		WebElement applybutton = allObj.wishlisttoAddtoCard().getApplybutton();
		applybutton.click();
		
	  
	}


	@Then("check the  enter value is displayed")
	public void check_the_enter_value_is_displayed() {
	    WebElement dicCouponFail = allObj.wishlisttoAddtoCard().getDicCouponFail();
	    if(dicCouponFail.isDisplayed()) {
	    	System.out.println("user can Enter values in discoutcoupon box");
	    }else {
	    	System.out.println("user can not handle discountcoupon box");
	    }
	}
	
	
//	Scenario 10

@When("user enter values in the gift card box")
public void user_enter_values_in_the_gift_card_box() {
	WebElement apparel = allObj.getApparelPage().getApparel();
	apparel.click();
	
	WebElement accessories = allObj.getApparelPage().getAccessories();
	accessories.click();
    
	WebElement productHat = allObj.verifyAddtoCardPage().getProductHat();
     productHat.click();
     
     WebElement sizedropdown = allObj.verifyAddtoCardPage().getSizedropdown();
	 sizedropdown.click();
      WebElement sizeOption = allObj.verifyAddtoCardPage().getSizeOption();
	  sizeOption.click();
		   
		   
    WebElement addtocardbutton = allObj.verifyAddtoCardPage().getAddtocardbutton();
    addtocardbutton.click();
    
    WebElement shopcard = allObj.wishlisttoAddtoCard().getShopcard();
    shopcard.click();
		     
		  WebElement giftWrapping = allObj.wishlisttoAddtoCard().getGiftWrapping();
	giftWrapping.click();
	
	
	
	WebElement wrappingYes = allObj.wishlisttoAddtoCard().getGiftWrappingYes();
	wrappingYes.click();
	
	
	WebElement giftcoupon = allObj.wishlisttoAddtoCard().getGiftcoupon();
	giftcoupon.sendKeys("354222");
	
	WebElement giftcardapplybutton = allObj.wishlisttoAddtoCard().getGiftcardapplybutton();
	giftcardapplybutton.click();
	

}



@Then("check the  enter value is displayed in gift card box")
public void check_the_enter_value_is_displayed_in_gift_card_box() {
	WebElement wrongCouponMsg = allObj.wishlisttoAddtoCard().getWrongCouponMsg();
	if(wrongCouponMsg.isDisplayed()) {
		System.out.println("user can enter values in gift card box");
	}else {
		System.out.println("user can not enter values in gift card box");
	}
 
}

//Scenario 11
@Given("user click checkout button")
public void user_click_checkout_button() {
	WebElement apparel = allObj.getApparelPage().getApparel();
	apparel.click();
	
	WebElement accessories = allObj.getApparelPage().getAccessories();
	accessories.click();
    
	WebElement productHat = allObj.verifyAddtoCardPage().getProductHat();
     productHat.click();
     
     WebElement sizedropdown = allObj.verifyAddtoCardPage().getSizedropdown();
	 sizedropdown.click();
     WebElement sizeOption = allObj.verifyAddtoCardPage().getSizeOption();
	 sizeOption.click();
		   
		   
	WebElement addtocardbutton = allObj.verifyAddtoCardPage().getAddtocardbutton();
    addtocardbutton.click();
		     
     WebElement shopcard = allObj.wishlisttoAddtoCard().getShopcard();
     shopcard.click();
		     
	WebElement giftWrapping = allObj.wishlisttoAddtoCard().getGiftWrapping();
	giftWrapping.click();
	
	
	
	WebElement wrappingYes = allObj.wishlisttoAddtoCard().getGiftWrappingYes();
	wrappingYes.click();
 
	WebElement checkOut = allObj.wishlisttoAddtoCard().getCheckOut();
	checkOut.click();
   
}



@Given("check Tearms of service alert come")
public void check_tearms_of_service_alert_come() {
	WebElement termsAndService = allObj.wishlisttoAddtoCard().getTermsAndService();
	if (termsAndService.isDisplayed()) {
		System.out.println("click tearms and service aleart popup");
		
	}
  
}



@When("select the terms of service icon")
public void select_the_terms_of_service_icon() {
	WebElement closebutton = allObj.wishlisttoAddtoCard().getClosebutton();
	closebutton.click();
    WebElement termsOfServiceCheckBox = allObj.wishlisttoAddtoCard().getTermsOfServiceCheckBox();
    termsOfServiceCheckBox.click();

    WebElement checkOut = allObj.wishlisttoAddtoCard().getCheckOut();
    checkOut.click();


    
}

@Then("Check the checkout is navigating to next page")
public void check_the_checkout_is_navigating_to_next_page() {
    WebElement nextPage = allObj.wishlisttoAddtoCard().getNextPage();
    if(nextPage.isDisplayed()) {
    	System.out.println("user can navigate to next page");
    }else {
    	System.out.println("user can not navigate to next page");
    }
}




}
