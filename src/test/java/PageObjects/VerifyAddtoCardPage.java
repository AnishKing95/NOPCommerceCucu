package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyAddtoCardPage {
	@FindBy(xpath = "(//div[@class='product-item'])[1]")
	private WebElement ProductHat;

	public WebElement getProductHat() {
		return ProductHat;
	}

	public void setProductHat(WebElement productHat) {
		ProductHat = productHat;
	}
	
	@FindBy(xpath = "//button[@id='add-to-cart-button-31']")
	private WebElement addtocardbutton;

	public WebElement getAddtocardbutton() {
		return addtocardbutton;
	}

	public void setAddtocardbutton(WebElement addtocardbutton) {
		this.addtocardbutton = addtocardbutton;
	}
	
	@FindBy(xpath = "//p[text()='Please select Size']")
	private WebElement AlertMessage;

	public WebElement getAlertMessage() {
		return AlertMessage;
	}

	public void setAlertMessage(WebElement alertMessage) {
		AlertMessage = alertMessage;
	}
	
	@FindBy(xpath = "//span[@class='close']")
	private WebElement AlertMessageClose;
	
	
	public WebElement getAlertMessageClose() {
		return AlertMessageClose;
	}

	public void setAlertMessageClose(WebElement alertMessageClose) {
		AlertMessageClose = alertMessageClose;
	}

	@FindBy(xpath = "//select[@id='product_attribute_13']")
	private WebElement Sizedropdown;

	public WebElement getSizedropdown() {
		return Sizedropdown;
	}

	public void setSizedropdown(WebElement sizedropdown) {
		Sizedropdown = sizedropdown;
	}
	@FindBy(xpath = "//option[text()='X-Large']")
	private WebElement sizeOption;

	public WebElement getSizeOption() {
		return sizeOption;
	}

	public void setSizeOption(WebElement sizeOption) {
		this.sizeOption = sizeOption;
	}
	
	@FindBy(xpath = "//div[@id='bar-notification']")
	private WebElement ProductAddedMessage;

	public WebElement getProductAddedMessage() {
		return ProductAddedMessage;
	}

	public void setProductAddedMessage(WebElement productAddedMessage) {
		ProductAddedMessage = productAddedMessage;
	}
	
//Scenario 5 xpath
@FindBy(xpath = "//input[@id='product_enteredQuantity_31']" )
private WebElement quantitybox;

public WebElement getQuantitybox() {
	return quantitybox;
}

public void setQuantitybox(WebElement quantitybox) {
	this.quantitybox = quantitybox;
}


//Scenario 6 Xpath

@FindBy(xpath = "//button[@id='add-to-wishlist-button-31']")
private WebElement wishlistButton;

public WebElement getWishlistButton() {
	return wishlistButton;
}

public void setWishlistButton(WebElement wishlistButton) {
	this.wishlistButton = wishlistButton;
}

@FindBy(xpath = "//div[@id='bar-notification']")
private WebElement wishlistaddedPopUp;

public WebElement getWishlistaddedPopUp() {
	return wishlistaddedPopUp;
}

public void setWishlistaddedPopUp(WebElement wishlistaddedPopUp) {
	this.wishlistaddedPopUp = wishlistaddedPopUp;
}
}
