package vtiger_crm;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_utility.BaseClass;
import object_repository.Contact;
import object_repository.CreateContact;
import object_repository.HomePage;
import object_repository.OrgSelectionWindow;
import object_repository.VerifyContact;
 
public class CreateContactTest extends BaseClass {
	@Test(groups="smoke")
    public void createContact() throws IOException {
        super.hp = new HomePage(driver);
		hp.getContactsLink().click();
		Contact con = new Contact(driver);
		con.getCreateContact().click();

		String fname = fu.getDataFromExcelFile("ContactCreationData", 1, 0);
		String lname = fu.getDataFromExcelFile("ContactCreationData", 1, 1);

		CreateContact crtCon = new CreateContact(driver);
		crtCon.getFirstNameTextField().sendKeys(fname);
		crtCon.getLastNameTextField().sendKeys(lname);
		crtCon.getChooseOrgPlusIcon().click();

		String hId = driver.getWindowHandle();
		Set<String> ids = driver.getWindowHandles();
		for(String id : ids){
			if(!hId.equals(id)){
				driver.switchTo().window(id);
				break;
			}
		}
		OrgSelectionWindow osw = new OrgSelectionWindow(driver);
		String orgName = fu.getDataFromExcelFile("OrgCreationData", 1, 0);
		osw.getSearchTextfield().sendKeys(orgName + Keys.ENTER);

		// dynamic webElement
		driver.findElement(By.xpath("//a[text()='"+orgName+"']")).click();	
		mwdu.switchToParent(hId);

		crtCon.getSaveButton().click();

		VerifyContact vc = new VerifyContact(driver);
		String vfname = vc.getFirstName().getText();
		String vlname = vc.getLastName().getText();

		if(vfname.equalsIgnoreCase(fname) && vlname.equalsIgnoreCase(vlname)){
			Reporter.log("Contact Cereation successfull.");
		}else{
			Reporter.log("Contact Cereation failed.");
		}
    }
}
