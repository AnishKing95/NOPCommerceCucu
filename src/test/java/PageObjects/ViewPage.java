package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewPage {
	@FindBy(xpath = "//a[@class='viewmode-icon grid selected']")
	private WebElement viewtypeOne;
	
	
	public WebElement getViewtypeOne() {
		return viewtypeOne;
	}

	public void setViewtypeOne(WebElement viewtypeOne) {
		this.viewtypeOne = viewtypeOne;
	}

	@FindBy(xpath = "//a[@class='viewmode-icon list']")
	private WebElement viewtypeTwo;

	public WebElement getViewtypeTwo() {
		return viewtypeTwo;
	}

	public void setViewtypeTwo(WebElement viewtypeTwo) {
		viewtypeTwo = viewtypeTwo;
	}
	

}
