package b2c;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import Pages.MbHome;
import Pages.MbLogin;
import Pages.PostProperty;
import io.github.bonigarcia.wdm.WebDriverManager;

public class B2C {
	WebDriver driver;
	public MbLogin mbLogin;
	public MbHome mbHome;
	public PostProperty postProperty;
	
	@Test
	public void login() throws InterruptedException
	{
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak.Kumar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//System.setProperty("webdriver.http.factory", "jdk-http-client");
		ChromeOptions o = new ChromeOptions();
		o.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver();
		mbLogin = new MbLogin(driver);
		mbHome = new MbHome(driver);
		postProperty = new PostProperty(driver);
		driver.manage().window().maximize();
		driver.get("https://betatest.magicbricks.com/userauth/login");
		Thread.sleep(3000);
		mbLogin.enterEmailId();
		Thread.sleep(3000);
		mbLogin.loginNext();
		Thread.sleep(3000);
		mbLogin.enterPassword();
		Thread.sleep(3000);
		mbLogin.loginCta();
		Thread.sleep(3000);
		mbLogin.continueCta();
		if(driver.getCurrentUrl().equals("https://betatest.magicbricks.com/property-for-sale-rent/residential-real-estate?hpr=LINK"))
		{
			mbHome.clickPostProperty();
			Thread.sleep(3000);
			//to handle child window
			ArrayList<String> addr= new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(addr.get(0));
			postProperty.selectType();
			postProperty.clickProperty();
			postProperty.selectProperty();
			boolean result=postProperty.isSelectedPosting();
			if(result==false)
			{
				postProperty.selectPostingAs();
			}
			postProperty.selectFlat();
			postProperty.enterCity();
			Thread.sleep(3000);
			postProperty.selectcityFromDropdown();
			postProperty.enterProject();
			Thread.sleep(3000);
			postProperty.selectProjectFromDropdown();
			postProperty.clickBedroom();
			postProperty.clickBalconies();
			postProperty.clickFloorNo();
			postProperty.clickTotalFloor();
			postProperty.clickFurnished();
			postProperty.clickBathroom();
			postProperty.enterCarpetArea();
			postProperty.selectTransactionType();
			postProperty.clickAgeOfConstruction();
			postProperty.clickNewConstruction();
			postProperty.enterMonthlyRent();
			postProperty.enterSecurity();
			postProperty.enterMaintenace();
			postProperty.clickPost();
			
		}
		if(driver.getCurrentUrl()=="https://betatest.magicbricks.com/odashboard/dashboard")
		{
			System.out.println("odashboard open");
		}
		
		
	}
}
