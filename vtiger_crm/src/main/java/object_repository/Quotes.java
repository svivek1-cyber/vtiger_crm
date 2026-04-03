package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Quotes {
    public Quotes(WebDriver driver){
        PageFactory.initElements(driver, Quotes.this);
    }
    
    @FindBy(css = "input[value='Delete']")
    private WebElement deleteQuote;

    public WebElement getDeleteQuote(){
        return deleteQuote;
    }  
    
    @FindBy(css = "img[title='Create Quote...']")
    private WebElement createQuote;

    public WebElement getCreateQuote(){
        return createQuote;
    }  


}
