package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.HotelsHomePage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class HotelsSD {
    private HotelsHomePage hotelsHomePage = new HotelsHomePage();
    private Object homepage;


//1
@Given("^I am on default locations search result screen$")
public void iAmOnDefaultLocationSearchResultScreen() {
    Assert.assertEquals(SharedSD.getDriver().getTitle(), "Hotels.com - where to", "Invalid Home Page");
}
    @When("^I select property class <(\\d+)stars>$")
    public void iSelectPropertyClass(int value) {
        clickOnStarButton ();
    }
    private void clickOnStarButton() {
    }
    private void button() {
    }
    @Then("^I verify system displays only <(\\d+)stars> hotels on search result $")
    public void iVerifyStarsHotelsOnSearchResult(String starHotels, Object defaultLocationScreen, double starHotelSearchResult) {
        Assert.assertEquals (homepage.toString (), "value");
    }



//2
    @When("^I verify Hilton Hotel is within radius$")
    public void iVerifyHiltonHotelIsWithinRadius() {
    }

    @Then("^I verify system displays all hotels within (\\d+) miles radius of airport$")
    public void iVerifySystemDisplaysAllHotelsWithinMilesRadiusOfAirport(int value) {
    }





//3
    @When("^I verify today's deal is less than \\$(\\d+)$")
    public void iVerifyTodaySDealIsLessThan$(int value) {
    }




//4
    @When("^I am on hotels\\.com home page$")
    public void iAmOnHotelsComHomePage() {
    }

    @Then("^I select <select_rooms> from room dropdown$")
    public void iSelectSelect_roomsFromRoomDropdown() {
    }

    @And("^I verify <number_of_room_dropdown> is displayed$")
    public void iVerifyNumber_of_room_dropdownIsDisplayed() {

    }

}
