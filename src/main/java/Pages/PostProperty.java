package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PostProperty {
	private WebDriver driver;
	
	@FindBy(xpath="//*[@id='commercialIndex']/header/section[1]/div/div[2]/div[3]/a")
	private WebElement post;
	@FindBy(xpath="//input[@id='propertyForR']")
	private WebElement typeRent;
	@FindBy(xpath="//input[@id='propertyForS']")
	private WebElement typeSell;
	@FindBy(xpath="//input[@id='propertyTypeVal']")
	private WebElement propertyType;
	@FindBy(xpath="//*[@id='pTypSectionDivId']/div[2]/div[1]/div/ul/li[3]")
	private WebElement dropdown;
	@FindBy(xpath="//input[@id='postingAsfh']")
	private WebElement radio;
	@FindBy(xpath="(//li[@class='csF blOption  '])[1]")
	private WebElement noOfFlat;
	@FindBy(xpath="//input[@name='quickCity']")
	private WebElement city;
	@FindBy(xpath="(//div[@class='cityAutoSuggestDivs'])[1]")
	private WebElement jaipur;
	@FindBy(xpath="//input[@id='projectSocietySelectForMA']")
	private WebElement project;
	@FindBy(xpath="(//li[@class='csF bdOption  '])[1]")
	private WebElement orchid;
	@FindBy(xpath="//div[@id='projectSocietyForMASuggest']//div[1]")
	private WebElement bedroom;
	@FindBy(xpath="(//li[@class='csF blOption  '])[1]")
	private WebElement balconies;
	@FindBy(xpath="(//li[@class='csF blOption blOptionNowr  '])[1]")
	private WebElement floorNo;
	@FindBy(xpath="(//li[@class='csF blOption  '])[4]")
	private WebElement totalFloor;
	@FindBy(xpath="(//li[@class='csF blOption  '])[1]")
	private WebElement furnishedStatus;
	@FindBy(xpath="//input[@id='carpetArea']")
	private WebElement bathrooms;
	@FindBy(xpath="//li[@class='csF btOption active']")
	private WebElement carpetArea;
	@FindBy(xpath="//input[@id='10102']")
	private WebElement transactionType;
	@FindBy(xpath="//input[@id='ageofconsVal']")
	private WebElement ageConstruction;
	@FindBy(xpath="//*[@id=\"ageofconsDiv\"]/div[2]/div[1]/div/ul/li[2]")
	private WebElement newConstruction;
	@FindBy(xpath="//*[@id=\"totalPrice\"]")
	private WebElement monthlyRent;
	@FindBy(xpath="//*[@id=\"bookingAmount\"]")
	private WebElement security;
	@FindBy(xpath="//*[@id=\"maintenanceCharges\"]")
	private WebElement maintenance;
	@FindBy(xpath="//*[@id=\"mylink\"]")
	private WebElement continuePost;
	
	public PostProperty(WebDriver driver){
		PageFactory.initElements(driver, this);
		driver=this.driver;
}
	public void clickPost() {
		post.click();
	}
	public void selectType() {
		typeRent.click();
	}
	public void clickProperty() {
		propertyType.click();
	}
	public void selectProperty() {
		dropdown.click();
	}
	public boolean isSelectedPosting() {
		boolean r=radio.isSelected();
		return r;
	}
	public void selectPostingAs() {
		radio.click();
	}
	public void selectFlat() {
		noOfFlat.click();
	}
	public void clickonCityField() {
		city.click();
	}
	public void enterCity() {
		city.sendKeys("Bangalore");
	}
	public void selectcityFromDropdown() {
		jaipur.click();
	}
	public void clickonProject() {
		project.click();
	}
	public void enterProject() {
		project.sendKeys("Orchid Whitefield");
	}
	public void selectProjectFromDropdown() {
		orchid.click();
	}
	public void clickBedroom() {
		bedroom.click();
	}
	public void clickBalconies() {
		balconies.click();
	}
	public void clickFloorNo() {
		floorNo.click();
	}
	public void clickTotalFloor() {
		totalFloor.click();
	}
	public void clickFurnished() {
		furnishedStatus.click();
	}
	public void clickBathroom() {
		bathrooms.click();
	}
	public void enterCarpetArea() {
		carpetArea.sendKeys("1000");
	}
	public void selectTransactionType() {
		transactionType.click();
	}
	public void clickAgeOfConstruction() {
		ageConstruction.click();
	}
	public void clickNewConstruction() {
		newConstruction.click();
	}
	public void enterMonthlyRent() {
		monthlyRent.sendKeys("20000");
	}
	public void enterSecurity() {
		security.sendKeys("2000");
	}
	public void enterMaintenace() {
		maintenance.sendKeys("2000");
	}
	public void clickPostCta() {
		continuePost.click();
	}
}