package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApparelPage {
	
	@FindBy(xpath = "//a[text()=' Apparel ']" )
	private WebElement apparel;

	public WebElement getApparel() {
		return apparel;
	}

	public void setApparel(WebElement apparel) {
		this.apparel = apparel;
	}
	
	
	@FindBy(xpath = "(//a[@title='Show products in category Shoes'])[1]")
	private WebElement shoes;

	public WebElement getShoes() {
		return shoes;
	}

	public void setShoes(WebElement shoes) {
		this.shoes = shoes;
	}
	

	
	@FindBy(xpath = "(//a[@title='Show products in category Clothing'])[1]")
	private WebElement clothing;

	public WebElement getClothing() {
		return clothing;
	}

	public void setClothing(WebElement clothing) {
		this.clothing = clothing;
	}
 
	
	@FindBy(xpath = "//a[text()=' Accessories ']")
    private WebElement accessories;

    public WebElement getAccessories() {
	return accessories;
}

    public void setAccessories(WebElement accessories) {
	this.accessories = accessories;
}
    @FindBy(xpath = "//a[text()=' Accessories ']")
    private WebElement product;

	public WebElement getProduct() {
		return product;
	}

	public void setProduct(WebElement product) {
		this.product = product;
	}
	
	@FindBy(xpath = "//a[text()='Obey Propaganda Hat']")
	private WebElement productpage;

	public WebElement getProductpage() {
		return productpage;
	}

	public void setProductpage(WebElement productpage) {
		this.productpage = productpage;
	}
	
	
}	
	