package generic_utility;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import object_repository.HomePage;
import object_repository.LoginPage;

public class BaseClass {
	public WebDriver driver = null;
    public MyWebDriverUtility mwdu = null;
    public HomePage hp = null;
    public FileUtility fu = null;
    public static WebDriver sdriver = null;

    @BeforeClass
    public void configBeforeClass() throws IOException{
    	this.fu = new FileUtility();
		String BROWSER = fu.getDataFromPropertiesFile("brow");
        this.driver = MyWebDriverUtility.browserDriver(BROWSER);
        System.out.println("Browser is opened");
    }

    @BeforeMethod
    public void login() throws IOException {
    	String USERNAME = fu.getDataFromPropertiesFile("un");
		String URL = fu.getDataFromPropertiesFile("url");
		String PASSWARD = fu.getDataFromPropertiesFile("pwd");
        System.out.println("Login is successful");
        this.mwdu = new MyWebDriverUtility(driver);
        mwdu.getMaximize();

		driver.get(URL);
		LoginPage lp = new LoginPage(driver);
		lp.getUserName().sendKeys(USERNAME + Keys.TAB + PASSWARD + Keys.ENTER);

        System.out.println("Login is successful");
    }

    @AfterMethod
    public void logout() {
    	WebElement profile = hp.getProfile();
		mwdu.hover(profile);
		hp.getSignOut().click();
        System.out.println("Logout is successful");
    }
    
    @AfterClass
    public void closeBrowser() {
        driver.quit();
        System.out.println("Browser closed");
    }
}
