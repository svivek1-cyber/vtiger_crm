package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Opportunity {
    public Opportunity(WebDriver driver){
        PageFactory.initElements(driver, Opportunity.this);
    }

    
    @FindBy(css = "img[title='Create Opportunity...']")
    private WebElement createOpportunity;

    public WebElement getCreateOpportunity(){
        return createOpportunity;
    }  
}
