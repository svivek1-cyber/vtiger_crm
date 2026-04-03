package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyLead {
    public VerifyLead(WebDriver driver) {
        PageFactory.initElements(driver, VerifyLead.this);
    }

    @FindBy(id = "dtlview_First Name")
    private WebElement firstName;
    
    public WebElement getFirstName() {
        return firstName;
    }
    
    @FindBy(id = "dtlview_Last Name")
    private WebElement lastName;

    public WebElement getLastName() {
        return lastName;
    }
}
