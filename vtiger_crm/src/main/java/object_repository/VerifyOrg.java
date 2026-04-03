package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyOrg {
    public VerifyOrg(WebDriver driver){
        PageFactory.initElements(driver, VerifyOrg.this);
    }

    @FindBy(id = "dtlview_Organization Name")
    private WebElement OrgName;

    public WebElement getOrgName(){
        return OrgName;
    }
}
