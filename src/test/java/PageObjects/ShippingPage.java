package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingPage {
	@FindBy(xpath="//input[@id='shippingoption_0']")
	private WebElement ground ;
	
	@FindBy(xpath="//input[@id='shippingoption_1']")
	private WebElement nextdayair ;
	
	@FindBy(xpath="//input[@id='shippingoption_2']")
	private WebElement dayair ;
	
	@FindBy(xpath="//button[@class='button-1 shipping-method-next-step-button']")
	private WebElement continuebutton ;
	
	public WebElement getGround() {
		return ground;
	}

	public void setGround(WebElement ground) {
		this.ground = ground;
	}

	public WebElement getNextdayair() {
		return nextdayair;
	}

	public void setNextdayair(WebElement nextdayair) {
		this.nextdayair = nextdayair;
	}

	public WebElement getDayair() {
		return dayair;
	}

	public void setDayair(WebElement dayair) {
		this.dayair = dayair;
	}

	public WebElement getContinuebutton() {
		return continuebutton;
	}

	public void setContinuebutton(WebElement continuebutton) {
		this.continuebutton = continuebutton;
	}
	
	
}
