package framework.webPages;

import org.openqa.selenium.By;

public class DarkSkyHomePage extends BasePage {

    private By searchtextField = By.id("searchForm");
    private By DarkSkyApiButton = By.xpath(" //div[@class='inner']//a[contains(text(),'Dark Sky API')]");
    public void clickOnDarkSkyButton(){
        clickOn(DarkSkyApiButton);
    }
}
