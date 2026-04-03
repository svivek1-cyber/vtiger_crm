package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organizations {
    public Organizations(WebDriver driver){
        PageFactory.initElements(driver, Organizations.this);
    }

    
    @FindBy(css = "img[title='Create Organization...']")
    private WebElement createOrganizations;

    public WebElement getCreateOrganization(){
        return createOrganizations;
    } 
}
