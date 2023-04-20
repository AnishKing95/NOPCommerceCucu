package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cameraphoto_page {

	
	
	@FindBy(xpath = "(//a[text()='Electronics '])[1]")
	private WebElement electronic;
	
	@FindBy(xpath="//a[text()=' Camera & photo ']")
	private WebElement Camerapages;
	
	@FindBy(xpath="//a[text()='Apple iCam']")
	private WebElement appleicon;
	
	@FindBy(xpath="//select[@id='products-orderby']")
	private WebElement ordersortby;

	@FindBy(xpath="//option[text()='Position']")
	private WebElement position;
	
	@FindBy(xpath="//option[text()='Name: A to Z']")
	private WebElement atoz;
	
	@FindBy(xpath="//option[text()='Name: Z to A']")
	private WebElement ztoa;
	
	@FindBy(xpath="//option[text()='Price: Low to High']")
	private WebElement lowtohigh;
	
	@FindBy(xpath="//option[text()='Price: High to Low']")
	private WebElement hightilow;
	

//	@FindBy(xpath="//option[text()='Name: Z to A']")
//	private WebElement confirmsortby;
	
	@FindBy(xpath="//option[text()='Name: Z to A']")
	private WebElement equals;
	
	
	public WebElement getEquals() {
		return equals;
	}

	public void setEquals(WebElement equals) {
		this.equals = equals;
	}
	
//	public WebElement getConfirmsortby() {
//		return confirmsortby;
//	}
//
//	public void setConfirmsortby(WebElement confirmsortby) {
//		this.confirmsortby = confirmsortby;
//	}
	
	public WebElement getPosition() {
		return position;
	}

	public void setPosition(WebElement position) {
		this.position = position;
	}

	public WebElement getAtoz() {
		return atoz;
	}

	public void setAtoz(WebElement atoz) {
		this.atoz = atoz;
	}

	public WebElement getZtoa() {
		return ztoa;
	}

	public void setZtoa(WebElement ztoa) {
		this.ztoa = ztoa;
	}

	public WebElement getLowtohigh() {
		return lowtohigh;
	}

	public void setLowtohigh(WebElement lowtohigh) {
		this.lowtohigh = lowtohigh;
	}

	public WebElement getHightilow() {
		return hightilow;
	}

	public void setHightilow(WebElement hightilow) {
		this.hightilow = hightilow;
	}

	public WebElement getOrdersortby() {
		return ordersortby;
	}

	public void setOrdersortby(WebElement ordersortby) {
		this.ordersortby = ordersortby;
	}

	public WebElement getAppleicon() {
		return appleicon;
	}

	public void setAppleicon(WebElement appleicon) {
		this.appleicon = appleicon;
	}

	public WebElement getElectronic() {
		return electronic;
	}

	public void setElectronic(WebElement electronic) {
		this.electronic = electronic;
	}

	public WebElement getCamerapages() {
		return Camerapages;
	}

	public void setCamerapages(WebElement camerapages) {
		Camerapages = camerapages;
	}

	

	
	

}
