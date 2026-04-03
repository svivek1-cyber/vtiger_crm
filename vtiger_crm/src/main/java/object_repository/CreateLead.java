package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateLead {
    public CreateLead(WebDriver driver){
        PageFactory.initElements(driver, CreateLead.this);
    }

    @FindBy(name = "firstname")
    private WebElement firstNameTextField;
    public WebElement getFirstNameTextField(){
        return firstNameTextField;
    }

    @FindBy(name = "lastname")
    private WebElement lastNameTextField;
    public WebElement getLastNameTextField(){
        return lastNameTextField;
    }

    @FindBy(name = "company")
    private WebElement companyTextField;
    public WebElement getCompanyTextField(){
        return companyTextField;
    }

    @FindBy(name = "designation")
    private WebElement designationTextField;
    public WebElement getDesignationTextField(){
        return designationTextField;
    }

    @FindBy(name = "leadsource")
    private WebElement leadSourceTextField;
    public WebElement getLeadSourceTextField(){
        return leadSourceTextField;
    }

    @FindBy(name = "annualrevenue")
    private WebElement annualRevenueTextField;
    public WebElement getAnnualRevenueTextField(){
        return annualRevenueTextField;
    }

    @FindBy(name = "noofemployees")
    private WebElement noOfEmployeesTextField;
    public WebElement getNoOfEmployeesTextField(){
        return noOfEmployeesTextField;
    }

    @FindBy(name = "email")
    private WebElement emailTextField;
    public WebElement getEmailTextField(){
        return emailTextField;
    }

    @FindBy(name = "phone")
    private WebElement phoneTextField;
    public WebElement getPhoneTextField(){
        return phoneTextField;
    }

    @FindBy(name = "website")
    private WebElement websiteTextField;
    public WebElement getWebsiteTextField(){
        return websiteTextField;
    }

    @FindBy(name = "lane")
    private WebElement laneTextField;
    public WebElement getLaneTextField(){
        return laneTextField;
    }

    @FindBy(name = "city")
    private WebElement cityTextField;
    public WebElement getCityTextField(){
        return cityTextField;
    }

    @FindBy(name = "state")
    private WebElement stateTextField;
    public WebElement getStateTextField(){
        return stateTextField;
    }

    @FindBy(name = "country")
    private WebElement countryTextField;
    public WebElement getCountryTextField(){
        return countryTextField;
    }

    @FindBy(name = "code")
    private WebElement codeTextField;
    public WebElement getCodeTextField(){
        return codeTextField;
    }

    @FindBy(css = "input[title='Save [Alt+S]']")
    private WebElement saveButton;
    public WebElement getSaveButton(){
        return saveButton;
    }

    
    
}
