package Steps;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DropDownsStep extends Initializaion.Initialization{
	
	@Given("user can handle to all dropdowns in sort by")
	public void user_can_handle_to_all_dropdowns_in_sort_by() throws AWTException, InterruptedException {
		WebElement electronic = allObj.getCameraphoto_page().getElectronic();
		    electronic.click();
        WebElement campage = allObj.getCameraphoto_page().getCamerapages();
			  campage.click();
		    
		WebElement ordersortby = allObj.getCameraphoto_page().getOrdersortby();
		ordersortby.click();
		Thread.sleep(15);
		
		WebElement position = allObj.getCameraphoto_page().getPosition();
		position.click();
		
		WebElement AtoZ = allObj.getCameraphoto_page().getAtoz();
		AtoZ.click();
		
		WebElement ZtoA = allObj.getCameraphoto_page().getZtoa();
		ZtoA.click();
		
		WebElement lowtohigh = allObj.getCameraphoto_page().getLowtohigh();
		lowtohigh.click();
		
		WebElement hightolow = allObj.getCameraphoto_page().getHightilow();
		hightolow.click();
		
	}




	@When("user  select on name:z to a")
	public void user_select_on_name_z_to_a() {
		WebElement ztoa = allObj.getCameraphoto_page().getZtoa();
		ztoa.click();
		
	}


	@Then("check the selected value changed in the sort by tab")
	public void check_the_selected_value_changed_in_the_sort_by_tab() {
		WebElement selecct = allObj.getCameraphoto_page().getEquals();
		selecct.click();
		if (selecct.isDisplayed()) {
			System.out.println("pass z to a");
			
		}
		else {
			System.out.println("fail sortby value");
		}
		
	}
	
	

	
	   

}
