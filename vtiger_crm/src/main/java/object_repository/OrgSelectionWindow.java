package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgSelectionWindow {
    public OrgSelectionWindow(WebDriver driver){
        PageFactory.initElements(driver, OrgSelectionWindow.this);
    }

    @FindBy(linkText="vtiger")
    private WebElement orgName;
    public WebElement getOrgName(){
        return orgName;
    }

    @FindBy(name="search_text")
    private WebElement searchField;
    public WebElement getSearchTextfield(){
        return searchField;
    }

    
    
}
