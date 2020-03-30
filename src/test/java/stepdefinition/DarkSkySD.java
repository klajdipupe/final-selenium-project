package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.DarkSkyAPIPage;
import framework.webPages.DarkSkyHomePage;
import framework.webPages.DarkSkyRegisterPage;
import org.openqa.selenium.By;
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




    @Then("^I verify current temp is not greater or less than temps from daily timeline$")
    public void iVerifyCurrentTempIsNotGreaterOrLessThenTempsFromDailyTimeline(){
        int currentTemp = DarkSkyHomePage.getCurrentTemp();
        int maxTemp = DarkSkyHomePage.getMaxTemp();
        int minTemp = DarkSkyHomePage.getMinTemp();
        boolean Range = DarkSkyHomePage.assertCurrTemp(currentTemp,minTemp,maxTemp);
        Assert.assertTrue(Range,"currentTemp"+currentTemp+"is not in between"+maxTemp+"and"+minTemp);
    }



    @When("^I expand today timeline$")
    public void IExpandTodayTimeline(By darkSkyExpandButton) throws InterruptedException {
        Thread.sleep(3000);
        DarkSkyHomePage.clickOnDarkSkyExpandButton(darkSkyExpandButton);
    }
    @Then ("^I verify lowest and highest temp is displayed correctly$")
    public void iVerifyLowestAndHighestTempIsDisplayedCorrectly () {
        String minTimeLineTemp = DarkSkyHomePage.getMinTempToday();
        String maxTimeLineTemp = DarkSkyHomePage.getMaxTempToday();
        String lowestTemp = DarkSkyHomePage.getLowest();
        String highestTemp = DarkSkyHomePage.getHighest();
        Assert.assertTrue(minTimeLineTemp.equals(lowestTemp),"Min Temp"+minTimeLineTemp+"does not match with lowest temp "+lowestTemp);
        Assert.assertTrue((maxTimeLineTemp.equals(highestTemp)),"max Temp"+maxTimeLineTemp+"does not match with highest"+highestTemp);
    }
}