package vtiger_crm;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_utility.BaseClass;
import object_repository.HomePage;

public class CreateNotebookAtHomeTest extends BaseClass {

    @Test(groups={"smoke","regression"})
    public void createNotebookAtHome() throws InterruptedException, FileNotFoundException, IOException {
        String bookName = fu.getDataFromExcelFile("NotebookCreationData", 1, 0);
        
        super.hp = new HomePage(driver);
        hp.getPlusIcon().click();
        hp.getNotebookLink().click();
        hp.getWindowTitleTextField().sendKeys(bookName);
        hp.getSaveButton().click();
        
        WebElement getNotebookTitle = driver.findElement(By.xpath("//b[contains(text(), '"+bookName+"')]"));

        boolean isDisplayed = getNotebookTitle.isDisplayed();
        if (isDisplayed) {
            Reporter.log("Notebook created successfully");
        } else {
            Reporter.log("Notebook creation failed");
        }
    }
}
