package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListToAddtoCard {


	
@FindBy(xpath = "//span[@class='wishlist-label']")
private WebElement wishlistlabel;

public WebElement getWishlistlabel() {
	return wishlistlabel;
}

public void setWishlistlabel(WebElement wishlistlabel) {
	this.wishlistlabel = wishlistlabel;
}
@FindBy(xpath = "//button[text()='Add to cart']")
private WebElement AddtoCardwishList;

public WebElement getAddtoCardwishList() {
	return AddtoCardwishList;
}

public void setAddtoCardwishList(WebElement addtoCardwishList) {
	AddtoCardwishList = addtoCardwishList;
}

@FindBy(xpath = "//div[@id='bar-notification']")
private WebElement NoproductAddedPopup;

public WebElement getNoproductAddedPopup() {
	return NoproductAddedPopup;
}

public void setNoproductAddedPopup(WebElement noproductAddedPopup) {
	NoproductAddedPopup = noproductAddedPopup;
}
@FindBy(xpath = "//input[@type='checkbox']")
private WebElement checkbox;

public WebElement getCheckbox() {
	return checkbox;
}

public void setCheckbox(WebElement checkbox) {
	this.checkbox = checkbox;
}
@FindBy(xpath = "//table[@class='cart']")
private WebElement shopcardPage;

public WebElement getShopcardPage() {
	return shopcardPage;
}

public void setShopcardPage(WebElement shopcardPage) {
	this.shopcardPage = shopcardPage;
}

//Scenario 8
@FindBy(xpath = "//dd[@id='checkout_attribute_input_1']")
private WebElement GiftWrapping;

public WebElement getGiftWrapping() {
	return GiftWrapping;
}

public void setGiftWrapping(WebElement giftWrapping) {
	GiftWrapping = giftWrapping;
	
	
}
@FindBy(xpath = "//option[text()='Yes [+$10.00]']")
private WebElement giftWrappingYes;


public WebElement getGiftWrappingYes() {
	return giftWrappingYes;
}

public void setGiftWrappingYes(WebElement giftWrappingYes) {
	this.giftWrappingYes = giftWrappingYes;
}
@FindBy(xpath = "//span[text()='Shopping cart']")
private WebElement shopcard;

public WebElement getShopcard() {
	return shopcard;
}

public void setShopcard(WebElement shopcard) {
	this.shopcard = shopcard;
}

//Scenario  9

@FindBy(xpath = "//input[@id='discountcouponcode']")
private WebElement discountode;

public WebElement getDiscountode() {
	return discountode;
}

public void setDiscountode(WebElement discountode) {
	this.discountode = discountode;
}
@FindBy(xpath = "//button[@id='applydiscountcouponcode']")
private WebElement applybutton;

public WebElement getApplybutton() {
	return applybutton;
}

public void setApplybutton(WebElement applybutton) {
	this.applybutton = applybutton;
	
	
}

@FindBy(xpath = "(//div[@class='message-failure'])[2]")
private WebElement dicCouponFail;

public WebElement getDicCouponFail() {
	return dicCouponFail;
}

public void setDicCouponFail(WebElement dicCouponFail) {
	this.dicCouponFail = dicCouponFail;
}

@FindBy(xpath = "//input[@id='giftcardcouponcode']")
private WebElement giftcoupon;

public WebElement getGiftcoupon() {
	return giftcoupon;
}

public void setGiftcoupon(WebElement giftcoupon) {
	this.giftcoupon = giftcoupon;
}
@FindBy(xpath = "//button[@id='applygiftcardcouponcode']")
private WebElement giftcardapplybutton;

public WebElement getGiftcardapplybutton() {
	return giftcardapplybutton;
}

public void setGiftcardapplybutton(WebElement giftcardapplybutton) {
	this.giftcardapplybutton = giftcardapplybutton;
}
@FindBy(xpath = "(//div[@class='message-failure'])[2]")
private WebElement wrongCouponMsg;

public WebElement getWrongCouponMsg() {
	return wrongCouponMsg;
}

public void setWrongCouponMsg(WebElement wrongCouponMsg) {
	this.wrongCouponMsg = wrongCouponMsg;
}

//Scenario 11
@FindBy(xpath = "//button[@id='checkout']")
private WebElement checkOut;

public WebElement getCheckOut() {
	return checkOut;
}

public void setCheckOut(WebElement checkOut) {
	this.checkOut = checkOut;
}
@FindBy(xpath = "//div[@tabindex='-1']")
private WebElement termsAndService;

public WebElement getTermsAndService() {
	return termsAndService;
}

public void setTermsAndService(WebElement termsAndService) {
	this.termsAndService = termsAndService;
}
@FindBy(xpath = "//button[@title='Close']")
private WebElement closebutton;

public WebElement getClosebutton() {
	return closebutton;
}

public void setClosebutton(WebElement closebutton) {
	this.closebutton = closebutton;
}
@FindBy(xpath = "//input[@id='termsofservice']")
private WebElement termsOfServiceCheckBox;

public WebElement getTermsOfServiceCheckBox() {
	return termsOfServiceCheckBox;
}

public void setTermsOfServiceCheckBox(WebElement termsOfServiceCheckBox) {
	this.termsOfServiceCheckBox = termsOfServiceCheckBox;
}

@FindBy(xpath = "//label[@for='ShipToSameAddress']")

private WebElement nextPage;

public WebElement getNextPage() {
	return nextPage;
}

public void setNextPage(WebElement nextPage) {
	this.nextPage = nextPage;
}
}