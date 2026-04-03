package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Lead {
    public Lead(WebDriver driver){
        PageFactory.initElements(driver, Lead.this);
    }

    
    @FindBy(css = "img[title='Create Lead...']")
    private WebElement createLead;

    public WebElement getCreateLead(){
        return createLead;
    } 
}
