package vtiger_crm;

import java.io.IOException;

import org.testng.annotations.Test;

import generic_utility.BaseClass;
import generic_utility.JavaUtility;
import object_repository.CreateOrg;
import object_repository.HomePage;
import object_repository.Organizations;
import object_repository.VerifyOrg;

public class CreateOrgTest extends BaseClass {
    @Test(groups="smoke")
    public void createOrg() throws IOException, InterruptedException {
        
        super.hp = new HomePage(driver);
        mwdu.waitUntilClickable(hp.getOrgLink());
        hp.getOrgLink().click();
        Organizations org = new Organizations(driver);
        org.getCreateOrganization().click();

         int randomNum = JavaUtility.generateRandomNumber();
         String orgName = fu.getDataFromExcelFile("OrgCreationData", 1, 0) + randomNum;
        
//        String orgName = fu.getDataFromExcelFile("OrgCreationData", 1, 0);
        CreateOrg co = new CreateOrg(driver);
        co.getOrgNameTextField().sendKeys(orgName);
        co.getSaveButton().click();

        
        VerifyOrg vOrg = new VerifyOrg(driver);
        mwdu.waitUntilClickable(vOrg.getOrgName());
        String Org = vOrg.getOrgName().getText();

        if(Org.equalsIgnoreCase(orgName)){
            System.out.println("Organization created successfully");
        }else{
            System.err.println("Organization creation Failed!");
        }
    }
}
