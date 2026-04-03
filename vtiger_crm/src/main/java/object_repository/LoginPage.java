package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, LoginPage.this);
    }

    @FindBy(name = "user_name")
    private WebElement username;

    public WebElement getUserName(){
        return username;
    }

    @FindBy(name = "user_password")
    private WebElement pwd;

    public WebElement getpwd(){
        return pwd;
    }

    @FindBy(id = "submitButton")
    private WebElement loginBtn;

    public WebElement getLoginBtn(){
        return loginBtn;
    }

}
