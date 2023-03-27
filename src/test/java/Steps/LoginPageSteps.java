package Steps;

import org.openqa.selenium.*;

import ConfigFiles.FileConfig;
import io.cucumber.java.en.*;

public class LoginPageSteps extends Initializaion.Initialization {

	@Given("user can able to enter into home page")
	public void user_can_able_enter_into_home_page() {

		if (FileConfig.property.getProperty("Browser").equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
//			driver = new ChromeDriver();
		}

		driver.get(FileConfig.property.getProperty("appUrl"));
		driver.manage().window().maximize();

	}

	@Given("user can login with valid credentials")
	public void user_can_login_with_valid_credentials() {

		WebElement register = allObj.getLoginPage().getRegister();
		register.click();

		WebElement gender = allObj.getLoginPage().getGender();
		gender.click();

		WebElement getfName = allObj.getLoginPage().getfName();
		getfName.sendKeys("Anish");

		WebElement getlName = allObj.getLoginPage().getlName();
		getlName.sendKeys("Raja");

		WebElement day = allObj.getLoginPage().getDay();

		WebElement month = allObj.getLoginPage().getMonth();

		WebElement year = allObj.getLoginPage().getYear();

		WebElement email = allObj.getLoginPage().getEmail();
		email.sendKeys(FileConfig.property.getProperty("username"));

		WebElement company = allObj.getLoginPage().getCompany();
		company.sendKeys("SkillPits");

		WebElement password = allObj.getLoginPage().getPassword();
		password.sendKeys(FileConfig.property.getProperty("password"));

		WebElement cPassword = allObj.getLoginPage().getcPassword();
		cPassword.sendKeys(FileConfig.property.getProperty("password"));

		WebElement regBotton = allObj.getLoginPage().getRegBotton();
		regBotton.click();

		WebElement login = allObj.getLoginPage().getLogIn();
		login.click();

		WebElement userName = allObj.getLoginPage().getUserName();
		userName.sendKeys(FileConfig.property.getProperty("username"));

		WebElement passWord = allObj.getLoginPage().getPassWord();
		passWord.sendKeys(FileConfig.property.getProperty("password"));

		WebElement loginBtn = allObj.getLoginPage().getLoginBtn();
		loginBtn.click();

	}

}
