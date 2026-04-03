package vtiger_crm;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;

import org.testng.annotations.Test;

import generic_utility.BaseClass;
import object_repository.CreateQuotes;
import object_repository.HomePage;
import object_repository.OrgSelectionWindow;
import object_repository.ProductSelectionWindow;
import object_repository.Quotes;
import object_repository.VerifyQuotes;

public class CreateQuoteTest extends BaseClass {
    @Test(groups="smoke")
    public void createQuote() throws FileNotFoundException, IOException, InterruptedException {
        super.hp = new HomePage(driver);
        hp.getMoreLink().click();
        hp.getQuotesLink().click();
        Quotes q = new Quotes(driver);
        q.getCreateQuote().click();

        String hId = driver.getWindowHandle();
        String subjName = fu.getDataFromExcelFile("QuoteCreationData", 1, 0);

        CreateQuotes cq = new CreateQuotes(driver);
        cq.getSubjectTextField().sendKeys(subjName);

        cq.getSelectOrgPlusIcon().click();

        Set<String> ids = driver.getWindowHandles();
        for (String id : ids) {
            if (!id.equals(hId)) {
                driver.switchTo().window(id);
                break;
            }
        }
        OrgSelectionWindow osw = new OrgSelectionWindow(driver);
        osw.getOrgName().click();
        driver.switchTo().alert().accept();

        driver.switchTo().window(hId);

        cq.getSelectProductIcon().click();
        ids = driver.getWindowHandles();
        for (String id : ids) {
            if (!id.equals(hId)) {
                driver.switchTo().window(id);
                break;
            }
        }

        ProductSelectionWindow psw = new ProductSelectionWindow(driver);

        psw.getProductName().click();
        driver.switchTo().window(hId);
        String quantity = fu.getDataFromExcelFile("QuoteCreationData", 1, 1);

        cq.getQuantityField().sendKeys(quantity);
        cq.getSaveButton().click();

        VerifyQuotes vq = new VerifyQuotes(driver);
        String subName = vq.getSubjectName().getText();

        if (subjName.equalsIgnoreCase(subName)) {
            System.out.println("Quote created successfully");
        } else {
            System.out.println("Quote creation failed");
        }
    }
}
