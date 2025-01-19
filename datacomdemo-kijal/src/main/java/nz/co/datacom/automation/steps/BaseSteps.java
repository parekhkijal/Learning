package nz.co.datacom.automation.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import nz.co.datacom.automation.common.SeleniumHelper;
import nz.co.datacom.automation.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class BaseSteps extends BasePage {
    @And ("clicks on the Discover link")
            public void clickDiscover(){
        SeleniumHelper.getDriver().findElement(By.xpath().click();
    }


    @Given("the browser is successfully initialized")
    public void successfullyInitialiseABrowser() {
        initialiseBrowser();
    }

    @Given("the browser is closed")
    public void closeTheBrowser() {
        SeleniumHelper.getDriver().close();
    }

    @Given("the AcceptAllCookies button is clicked")
    public void clickAcceptAllCookies() {
        SeleniumHelper.getDriver().findElement(By.id(acceptAllCookiesButtonId)).click();
    }

    @Then("the main menu headers should be displayed as:")
    public void validateMainMenuHeaders(DataTable dataTable) {
        List<String> expectedHeaders = dataTable.asList();
        List<WebElement> menuHeaders = SeleniumHelper.getDriver().findElements(By.className(mainMenuClass)); // Adjust selector as needed

        for (int i = 0; i < expectedHeaders.size(); i++) {
            Assert.assertEquals(menuHeaders.get(i).getText().trim(), expectedHeaders.get(i),
                    "Mismatch in menu header at index " + i);
        }
    }




}



