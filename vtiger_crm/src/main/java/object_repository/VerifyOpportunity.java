package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyOpportunity {
    public VerifyOpportunity(WebDriver driver){
        PageFactory.initElements(driver, VerifyOpportunity.this);
    }

    @FindBy(id = "dtlview_Opportunity Name")
    private WebElement opportunityName;

    public WebElement getOpportunityName(){
        return opportunityName;
    }
}
