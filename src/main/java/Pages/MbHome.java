package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MbHome {
	private WebDriver driver;

	@FindBy(xpath="//*[@id=\"commercialIndex\"]/header/section[1]/div/div[2]/div[3]/a")
	private WebElement postProperty;

	public MbHome(WebDriver driver){
	PageFactory.initElements(driver, this);
	driver=this.driver;
}
	public void clickPostProperty() {
		postProperty.click();
}
}