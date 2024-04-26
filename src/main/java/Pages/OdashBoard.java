package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OdashBoard {
	private WebDriver driver;
	
	@FindBy(xpath="(//input[@class='m-login__input'])[1]")
	private WebElement EnterEmailId;
	
	}


