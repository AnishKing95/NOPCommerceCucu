package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NikanPages {
    
	@FindBy(xpath="//a[text()='Nikon D5500 DSLR']")
	private WebElement dslr;
	
	@FindBy(xpath="//span[text()='N5500DS_R']")
	private WebElement dslrred;
	
	@FindBy(xpath="//input[@id='product_enteredQuantity_14']")
	private WebElement addquantity;
	
	@FindBy(xpath="//button[@id='add-to-cart-button-14']")
	private WebElement addcart;
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement shopcart;
	
	
	

	public WebElement getAddquantity() {
		return addquantity;
	}

	public void setAddquantity(WebElement addquantity) {
		this.addquantity = addquantity;
	}

	public WebElement getAddcart() {
		return addcart;
	}

	public void setAddcart(WebElement addcart) {
		this.addcart = addcart;
	}

	public WebElement getShopcart() {
		return shopcart;
	}

	public void setShopcart(WebElement shopcart) {
		this.shopcart = shopcart;
	}

	public WebElement getDslr() {
		return dslr;
	}

	public void setDslr(WebElement dslr) {
		this.dslr = dslr;
	}

	public WebElement getDslrred() {
		return dslrred;
	}

	public void setDslrred(WebElement dslrred) {
		this.dslrred = dslrred;
	}
	
	
}
