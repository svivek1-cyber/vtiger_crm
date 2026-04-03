package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOpportunity {
    public CreateOpportunity(WebDriver driver){
        PageFactory.initElements(driver, CreateOpportunity.this);
    }

    @FindBy(name = "potentialname")
    private WebElement OppotunityName;

    public WebElement getOppotunityName(){
        return OppotunityName;
    }

    @FindBy(css = "input[title='Save [Alt+S]']")
    private WebElement save;

    public WebElement getSaveButton(){
        return save;
    }

    @FindBy(xpath="//input[@id='related_to_display']/../img")
    private WebElement chooseOrgPlusIcon;
    
    public WebElement getChooseOrgPlusIcon(){
        return chooseOrgPlusIcon;
    }
        
}
