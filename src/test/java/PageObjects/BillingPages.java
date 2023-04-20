package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BillingPages {
	
@FindBy(xpath="//input[@id='BillingNewAddress_Email']")
private WebElement emailclear;

@FindBy(xpath="(//button[@class='button-1 new-address-next-step-button'])[1]")
private WebElement billingcontinue;

@FindBy(xpath="//span[text()='Street address is required']")
private WebElement errormessage;

@FindBy(xpath="//input[@id='BillingNewAddress_Company']")
private WebElement companynameclear;

@FindBy(xpath="//select[@data-trigger='country-select']")
private WebElement country;

@FindBy(xpath="//select[@data-trigger='state-select']")
private WebElement State;

@FindBy(xpath="//input[@id='BillingNewAddress_City']")
private WebElement city ;

@FindBy(xpath="//input[@id='BillingNewAddress_Address1']")
private WebElement address1 ;

@FindBy(xpath="//input[@id='BillingNewAddress_Address2']")
private WebElement address2 ;

@FindBy(xpath="//input[@id='BillingNewAddress_ZipPostalCode']")
private WebElement zip;

@FindBy(xpath="//input[@id='BillingNewAddress_PhoneNumber']")
private WebElement phonenumber;

@FindBy(xpath="//input[@id='BillingNewAddress_FaxNumber']")
private WebElement faxnumber;

@FindBy(xpath="//h2[text()='Shipping method']")
private WebElement shippingmethodpage;









public WebElement getShippingmethodpage() {
	return shippingmethodpage;
}

public void setShippingmethodpage(WebElement shippingmethodpage) {
	this.shippingmethodpage = shippingmethodpage;
}

public WebElement getCountry() {
	return country;
}

public void setCountry(WebElement country) {
	this.country = country;
}

public WebElement getState() {
	return State;
}

public void setState(WebElement state) {
	State = state;
}

public WebElement getCity() {
	return city;
}

public void setCity(WebElement city) {
	this.city = city;
}

public WebElement getAddress1() {
	return address1;
}

public void setAddress1(WebElement address1) {
	this.address1 = address1;
}

public WebElement getAddress2() {
	return address2;
}

public void setAddress2(WebElement address2) {
	this.address2 = address2;
}

public WebElement getZip() {
	return zip;
}

public void setZip(WebElement zip) {
	this.zip = zip;
}

public WebElement getPhonenumber() {
	return phonenumber;
}

public void setPhonenumber(WebElement phonenumber) {
	this.phonenumber = phonenumber;
}

public WebElement getFaxnumber() {
	return faxnumber;
}

public void setFaxnumber(WebElement faxnumber) {
	this.faxnumber = faxnumber;
}

public WebElement getErrormessage() {
	return errormessage;
}

public void setErrormessage(WebElement errormessage) {
	this.errormessage = errormessage;
}


public WebElement getCompanynameclear() {
	return companynameclear;
}

public void setCompanynameclear(WebElement companynameclear) {
	this.companynameclear = companynameclear;
}

public WebElement getEmailclear() {
	return emailclear;
}

public void setEmailclear(WebElement emailclear) {
	this.emailclear = emailclear;
}

public WebElement getBillingcontinue() {
	return billingcontinue;
}

public void setBillingcontinue(WebElement billingcontinue) {
	this.billingcontinue = billingcontinue;
}





}
