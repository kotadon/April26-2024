package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MbLogin {
	private WebDriver driver;
	
	@FindBy(xpath="(//input[@class='m-login__input'])[1]")
	private WebElement emailId;
	@FindBy(xpath="(//button[@type='button'])[1]")
	private WebElement next;
	@FindBy(xpath="(//input[@class='m-login__input'])[2]")
	private WebElement password;
	@FindBy(xpath="//button[@id='btnLogin']")
	private WebElement login;
	@FindBy(xpath="//*[@id=\"emailIdVerificationLinkDiv\"]/div[2]/button")
	private WebElement ContinueCta;

	public MbLogin(WebDriver driver){
		PageFactory.initElements(driver, this);
		driver=this.driver;
	}
	
	public void enterEmailId() {
		emailId.sendKeys("6478047939@yopmail.com");
	}
	public void loginNext() {
		next.click();
	}
	public void enterPassword() {
		password.sendKeys("times@123");
	}
	public void loginCta() {
		login.click();
	}
	public void continueCta() {
		ContinueCta.click();
	}
}
	