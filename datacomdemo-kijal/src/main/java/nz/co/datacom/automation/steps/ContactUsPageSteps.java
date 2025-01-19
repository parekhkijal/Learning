package nz.co.datacom.automation.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import nz.co.datacom.automation.common.SeleniumHelper;
import nz.co.datacom.automation.pages.ContactUsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static nz.co.datacom.automation.common.CommonConstants.BASE_URL;

public class ContactUsPageSteps extends ContactUsPage {

    @Given("the user navigates to the Contact Us page")
    public void navigateToContactUsPage() {
        SeleniumHelper.getDriver().get(props.getProperty(BASE_URL) + urlPrefix);
    }

    @When("the page title should be {string}")
    public void pageTitleValidation(String pageTitle) {
        Assert.assertEquals(SeleniumHelper.getDriver().getTitle(), pageTitle);
    }

    @Then("the contactus menu headers should be displayed as:")
    public void validateContactUsMenuHeaders(DataTable dataTable) {
        List<String> expectedHeaders = dataTable.asList();
        List<WebElement> menuHeaders = SeleniumHelper.getDriver().findElements(By.className(contactUsMenuClass)); // Adjust selector as needed

        for (int i = 0; i < expectedHeaders.size(); i++) {
            Assert.assertEquals(menuHeaders.get(i).getText().trim(), expectedHeaders.get(i),
                    "Mismatch in menu header at index " + i);
        }
    }






}




