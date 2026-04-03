package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSelectionWindow {
    public ProductSelectionWindow(WebDriver driver){
        PageFactory.initElements(driver, ProductSelectionWindow.this);
    }

    @FindBy(linkText="Vtiger Single User Pack")
    private WebElement productName;

    public WebElement getProductName(){
        return productName;
    }
}
