package vtiger_crm;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;

import org.testng.annotations.Test;

import generic_utility.BaseClass;
import object_repository.CreateOpportunity;
import object_repository.HomePage;
import object_repository.Opportunity;
import object_repository.OrgSelectionWindow;
import object_repository.VerifyOpportunity;

public class CreateOpportunityTest extends BaseClass {
    @Test(groups="smoke")
    public void createOpportunity() throws InterruptedException, IOException, FileNotFoundException {
        String oppName = fu.getDataFromExcelFile("OpportunityCreationData", 1, 0);
        super.hp = new HomePage(driver);
        hp.getOpportunityLink().click();

        Opportunity opp = new Opportunity(driver);
        opp.getCreateOpportunity().click();

        CreateOpportunity cop = new CreateOpportunity(driver);
        cop.getOppotunityName().sendKeys(oppName);
        String hId = driver.getWindowHandle();

        OrgSelectionWindow osw = new OrgSelectionWindow(driver);
        cop.getChooseOrgPlusIcon().click();

        Set<String> ids = driver.getWindowHandles();
        for (String id : ids) {
            if (!id.equals(hId)) {
                driver.switchTo().window(id);
                break;
            }
        }

        osw.getOrgName().click();
        mwdu.switchToParent(hId);

        cop.getSaveButton().click();

        VerifyOpportunity vop = new VerifyOpportunity(driver);
        String opName = vop.getOpportunityName().getText();
        if (opName.equalsIgnoreCase(oppName)) {
            System.out.println("Opportunity created Successfully");
        } else {
            System.out.println("Opportunity creation failed");
        }
    }
}
  