package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, HomePage.this);
    }

    @FindBy(css = "img[src='themes/softed/images/user.PNG']")
    private WebElement profile;

    public WebElement getProfile(){
        return profile;
    }

    @FindBy(linkText = "Sign Out")
    private WebElement signOut;

    public WebElement getSignOut(){
        return signOut;
    }

    @FindBy(css = "img[onmouseout='fnRemoveWindow();']")
    private WebElement plusIcon;
    
    public WebElement getPlusIcon(){
        return plusIcon;
    }
    
    @FindBy(linkText = "Notebook")
    private WebElement notebookLink;
    
    public WebElement getNotebookLink(){
        return notebookLink;
    }
    
    @FindBy(id = "stufftitle_id")
    private WebElement windowTitleTextField;
    
    public WebElement getWindowTitleTextField(){
        return windowTitleTextField;
    }
    
    @FindBy(id = "savebtn")
    private WebElement saveButton;
    
    public WebElement getSaveButton(){
        return saveButton;
    }
    
    @FindBy(xpath="//b[contains(text(), 'G14 Notebook')]")
    private WebElement notebookTitle;
    
    public WebElement getNotebookTitle(){
        return notebookTitle;
    }

    @FindBy(linkText = "Opportunities")
    private WebElement opportunity;
    
    public WebElement getOpportunityLink(){
        return opportunity;
    }

    @FindBy(linkText = "More")
    private WebElement moreLink;
    
    public WebElement getMoreLink(){
        return moreLink;
    }

    @FindBy(linkText = "Quotes")
    private WebElement quotesLink;

    public WebElement getQuotesLink(){
        return quotesLink;
    }

    @FindBy(linkText="Leads")
    private WebElement leadsLink;
    
    public WebElement getLeadsLink(){
        return leadsLink;
    }

    @FindBy(linkText="Organizations")
    private WebElement orgLink;
    
    public WebElement getOrgLink(){
        return orgLink;
    }

    @FindBy(linkText="Contacts")
    private WebElement contactsLink;
    
    public WebElement getContactsLink(){
        return contactsLink;
    }
}
    