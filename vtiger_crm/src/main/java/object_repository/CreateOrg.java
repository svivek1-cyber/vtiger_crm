package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrg {
    public CreateOrg(WebDriver driver){
        PageFactory.initElements(driver, CreateOrg.this);
    }

    @FindBy(name = "accountname")
    private WebElement orgNameTextField;
    public WebElement getOrgNameTextField(){
        return orgNameTextField;
    }

    @FindBy(css = "input[title='Save [Alt+S]']")
    private WebElement saveButton;
    public WebElement getSaveButton(){
        return saveButton;
    }

}
