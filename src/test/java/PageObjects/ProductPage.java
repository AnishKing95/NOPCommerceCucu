package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage {

	@FindBy(xpath = "//select[@id='products-orderby']")
	private WebElement sortbybar;

	public WebElement getSortbybar() {
		return sortbybar;
	}

	public void setSortby(WebElement sortbybar) {
		this.sortbybar = sortbybar;
	}
	
	@FindBy(xpath = "//option[text()='Created on']")
	private WebElement dropdown;

	public WebElement getDropdown() {
		return dropdown;
	}

	public void setDropdown(WebElement dropdown) {
		this.dropdown = dropdown;
	}

	@FindBy(xpath = "//select[@aria-label='Select number of products per page']")
	private WebElement productbar;

	public WebElement getProductbar() {
		return productbar;
	}

	public void setProductbar(WebElement productbar) {
		this.productbar = productbar;
	}
	
	@FindBy(xpath = "//option[text()=9]")
	private WebElement dropdown2;

	public WebElement getDropdown2() {
		return dropdown2;
	}

	public void setDropdown2(WebElement dropdown2) {
		this.dropdown2 = dropdown2;
	}
	
//	Scenario 3
	
	@FindBy(xpath = "//a[@class='viewmode-icon list selected']")
	private WebElement viewmode;

	public WebElement getViewmode() {
		return viewmode;
	}

	public void setViewmode(WebElement viewmode) {
		this.viewmode = viewmode;
	}
	
	
	

}



