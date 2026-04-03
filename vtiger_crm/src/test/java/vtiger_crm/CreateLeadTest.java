package vtiger_crm;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import generic_utility.BaseClass;
import generic_utility.JavaUtility;
import object_repository.CreateLead;
import object_repository.HomePage;
import object_repository.Lead;
import object_repository.VerifyLead;

public class CreateLeadTest extends BaseClass {
	
	@Test(groups = {"regression"})
	public void createLead() throws InterruptedException, IOException, FileNotFoundException {
		String firstName = fu.getDataFromExcelFile("LeadCreationData", 1, 0);
		String lastName = fu.getDataFromExcelFile("LeadCreationData", 1, 1);
		String company = fu.getDataFromExcelFile("LeadCreationData", 1, 2);
		String designation = fu.getDataFromExcelFile("LeadCreationData", 1, 3);
		String leadSource = fu.getDataFromExcelFile("LeadCreationData", 1, 4);
		String annualRevenue = fu.getDataFromExcelFile("LeadCreationData", 1, 5);
		String noOfEmployees = fu.getDataFromExcelFile("LeadCreationData", 1, 6);
		String email = fu.getDataFromExcelFile("LeadCreationData", 1, 7);
		String phone = fu.getDataFromExcelFile("LeadCreationData", 1, 8);
		String website = fu.getDataFromExcelFile("LeadCreationData", 1, 9);
		String lane = fu.getDataFromExcelFile("LeadCreationData", 1, 10);
		String city = fu.getDataFromExcelFile("LeadCreationData", 1, 11);
		String state = fu.getDataFromExcelFile("LeadCreationData", 1, 12);
		String country = fu.getDataFromExcelFile("LeadCreationData", 1, 13);
		String code = fu.getDataFromExcelFile("LeadCreationData", 1, 14);

		super.hp = new HomePage(driver);
		hp.getLeadsLink().click();
		Lead l = new Lead(driver);
		l.getCreateLead().click();
		
		int randomNum = JavaUtility.generateRandomNumber();
		CreateLead cLead = new CreateLead(driver);
		cLead.getFirstNameTextField().sendKeys(firstName + randomNum);
		cLead.getLastNameTextField().sendKeys(lastName);
		cLead.getCompanyTextField().sendKeys(company);
		cLead.getDesignationTextField().sendKeys(designation);
		cLead.getLeadSourceTextField().sendKeys(leadSource);
		cLead.getAnnualRevenueTextField().sendKeys(annualRevenue);
		cLead.getNoOfEmployeesTextField().sendKeys(noOfEmployees);
		cLead.getEmailTextField().sendKeys(email);
		cLead.getPhoneTextField().sendKeys(phone);
		cLead.getWebsiteTextField().sendKeys(website);
		cLead.getLaneTextField().sendKeys(lane);
		cLead.getCityTextField().sendKeys(city);
		cLead.getStateTextField().sendKeys(state);
		cLead.getCountryTextField().sendKeys(country);
		cLead.getCodeTextField().sendKeys(code);
		cLead.getSaveButton().click();

		VerifyLead vLead = new VerifyLead(driver);
		String fname = vLead.getFirstName().getText();
		String lname = vLead.getLastName().getText();

		System.out.println("Lead created with name: " + fname + randomNum +" " + lname);

		if (fname.equalsIgnoreCase(firstName + randomNum) && lname.equalsIgnoreCase(lastName)) {
			System.out.println("Lead created successfully");
		} else {
			System.out.println("Lead creation failed");
		}
	}

	@Test(groups = {"smoke"})
    public void createLead2() throws IOException, InterruptedException {

		
        String lastName = fu.getDataFromExcelFile("LeadCreationData", 1, 1);
        String company = fu.getDataFromExcelFile("LeadCreationData", 1, 2);
        
        
        super.hp = new HomePage(driver);
        hp.getLeadsLink().click();
        Lead l = new Lead(driver);
        l.getCreateLead().click();

        CreateLead cLead = new CreateLead(driver);
        cLead.getLastNameTextField().sendKeys(lastName);
        cLead.getCompanyTextField().sendKeys(company);
        cLead.getSaveButton().click();

        VerifyLead vLead = new VerifyLead(driver);
        mwdu.waitUntilClickable(vLead.getLastName());
        String lname = vLead.getLastName().getText();

        System.out.println("Lead created with name: " + lname);

        if (lname.equalsIgnoreCase(lastName)) {
            System.out.println("Lead created successfully");
        } else {
            System.out.println("Lead creation failed");
        }
    }
}
