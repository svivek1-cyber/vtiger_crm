package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateQuotes {
    public CreateQuotes(WebDriver driver){
        PageFactory.initElements(driver, CreateQuotes.this);
    }

    
    @FindBy(name = "subject")
    private WebElement subjectTextField;

    public WebElement getSubjectTextField(){
        return subjectTextField;
    }  

    @FindBy(xpath = "//input[@id='single_accountid']/../img")
    private WebElement selectOrgPlusIcon;
    
    public WebElement getSelectOrgPlusIcon(){
        return selectOrgPlusIcon;
    }

    @FindBy(xpath = "//input[@id='productName1']/../img")
    private WebElement selectProductIcon;

    public WebElement getSelectProductIcon(){
        return selectProductIcon;
    }

    @FindBy(id = "qty1")
    private WebElement quantityField;

    public WebElement getQuantityField(){
        return quantityField;
    }

    @FindBy(css = "input[title='Save [Alt+S]']")
    private WebElement saveButton;
    public WebElement getSaveButton(){
        return saveButton;
    }
}
