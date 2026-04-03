package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContact {
    public CreateContact(WebDriver driver){
        PageFactory.initElements(driver, CreateContact.this);
    }

    @FindBy(name="firstname")
    private WebElement firstNameTextField;
    public WebElement getFirstNameTextField(){
        return firstNameTextField;
    }

    @FindBy(name="lastname")
    private WebElement lastNameTextField;
    public WebElement getLastNameTextField(){
        return lastNameTextField;
    }


    @FindBy(css = "input[title='Save [Alt+S]']")
    private WebElement saveButton;
    public WebElement getSaveButton(){
        return saveButton;
    }

    @FindBy(xpath="//input[@name='account_name']/../img")
    private WebElement chooseOrgPlusIcon;
    public WebElement getChooseOrgPlusIcon(){
        return chooseOrgPlusIcon;
    }
}
