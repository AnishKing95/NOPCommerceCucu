package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopCartPage {
	@FindBy(xpath="//select[@id='checkout_attribute_1']")
	private WebElement giftwapper;
	
	@FindBy(xpath="(//div[@class='totals'])[2]")
	private WebElement totalcost;
	
	@FindBy(xpath="//button[text()=' Checkout ']")
	private WebElement checkout;
	
	@FindBy(xpath="//div[@id='terms-of-service-warning-box']")
	private WebElement tearmswarning;
	
	@FindBy(xpath="//input[@id='discountcouponcode']")
	private WebElement discountcoupon;
	
	@FindBy(xpath="//input[@id='termsofservice']")
	private WebElement tickbutton;
	
	@FindBy(xpath="//label[text()='Ship to the same address']")
	private WebElement shipbillingpage;
	

	

	public WebElement getShipbillingpage() {
		return shipbillingpage;
	}

	public void setShipbillingpage(WebElement shipbillingpage) {
		this.shipbillingpage = shipbillingpage;
	}

	public WebElement getTickbutton() {
		return tickbutton;
	}

	public void setTickbutton(WebElement tickbutton) {
		this.tickbutton = tickbutton;
	}

	public WebElement getDiscountcoupon() {
		return discountcoupon;
	}

	public void setDiscountcoupon(WebElement discountcoupon) {
		this.discountcoupon = discountcoupon;
	}

	public WebElement getTotalcost() {
		return totalcost;
	}

	public void setTotalcost(WebElement totalcost) {
		this.totalcost = totalcost;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public void setCheckout(WebElement checkout) {
		this.checkout = checkout;
	}

	public WebElement getTearmswarning() {
		return tearmswarning;
	}

	public void setTearmswarning(WebElement tearmswarning) {
		this.tearmswarning = tearmswarning;
	}

	public WebElement getGiftwapper() {
		return giftwapper;
	}

	public void setGiftwapper(WebElement giftwapper) {
		this.giftwapper = giftwapper;
	}
	
	
	
	
	
	
	
	
}
