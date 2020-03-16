package stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.DarkSkyAPIPage;
import framework.webPages.DarkSkyHomePage;
import framework.webPages.DarkSkyRegisterPage;
import org.testng.Assert;

public class DarkSkySD {

    private DarkSkyHomePage darkSkyHomepage = new DarkSkyHomePage();
    private DarkSkyRegisterPage darkSkyRegisterPage = new DarkSkyRegisterPage();
    private DarkSkyAPIPage darkSkyAPIPage = new DarkSkyAPIPage();

    @Given("^I am on darksky Register Page$")
    public void iAmOnDarkSkyHomePage() {
        // darkSkyHomepage.enterAddress("New York");
        darkSkyHomepage.clickOnDarkSkyButton();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
        darkSkyAPIPage.clickOnSignUpButton();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
        Assert.assertTrue(darkSkyRegisterPage.isRegisterHeaderDisplayed());
    }
    @When("^I click on register button$")
    public void clickOnRegisterButton() {
        darkSkyRegisterPage.clickOnRegisterButton();
    }

    @Then("^I verify I am on register page by asserting Register header$")
    public void verifyRegisterHeader() {
        Assert.assertTrue(darkSkyRegisterPage.isRegisterHeaderDisplayed());
    }
}