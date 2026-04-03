package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contact {
    public Contact(WebDriver driver){
        PageFactory.initElements(driver, Contact.this);
    }
    
    @FindBy(css = "img[title='Create Contact...']")
    private WebElement createContact;

    public WebElement getCreateContact(){
        return createContact;
    } 
}
