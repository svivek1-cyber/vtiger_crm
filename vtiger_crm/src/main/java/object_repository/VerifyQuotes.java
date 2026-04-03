package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyQuotes {
    public VerifyQuotes(WebDriver driver){
        PageFactory.initElements(driver, VerifyQuotes.this);
    }

    @FindBy(id = "dtlview_Subject")
    private WebElement subjectName;

    public WebElement getSubjectName(){
        return subjectName;
    }
}
