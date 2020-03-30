package framework.webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepdefinition.SharedSD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DarkSkyHomePage extends BasePage {



    private By searchtextField = By.id("searchForm");
    private By DarkSkyApiButton = By.xpath(" //div[@class='inner']//a[contains(text(),'Dark Sky API')]");

    private static By darkSkyCurrentTemp = By.xpath("(//span[starts-with(@class, 'summary')])[1]");
    private By timeLineTemp = By.xpath("//div[@id='timeline']//div[@class = 'temps']//span//span");
    private By timeLineHours = By.xpath("//div[@id='timeline']//div[@class = 'hours']//span[@class = 'hour']/span");
    private By darSkyExpandButton = By.xpath("//body[@class='forecast']/div[@id='week']/a[1]/span[3]/span[1]/*[1] ");
    private By minTimelineTempToday = By.xpath("(//div[@id = 'week']//a[@class = 'day'])[1]//span[@class = 'minTemp']");
    private By maxTimelineTempToday = By.xpath("(//div[@id = 'week']//a[@class = 'day'])[1]//span[@class = 'maxTemp']");
    private By lowestTempToday = By.xpath("(//div[contains(@class, 'highLowTemp')])[1]//span[contains(@class, 'highTemp')]//span[@class = 'temp']");
    private By highestTempToday = By.xpath("(//div[contains(@class, 'highLowTemp')])[1]//span[contains(@class, 'lowTemp')]//span[@class = 'temp']");


    public void clickOnDarkSkyButton() {
        clickOn(DarkSkyApiButton);
    }
    public static void clickOnDarkSkyExpandButton(By darkSkyExpandButton){
        clickOn (darkSkyExpandButton);
    }
    public List<String> getTimeLineTemperatures() {
        List<String> temperaturesText = new ArrayList<>();
        ArrayList<WebElement> timeTemps = (ArrayList<WebElement>) SharedSD.getDriver().findElements(timeLineTemp);
        for (WebElement temp : timeTemps) {
            String tempText = temp.getText();
            temperaturesText.add(tempText);
        }
        return temperaturesText;
    }

    public static int getCurrentTemp(){
        String currentTempText = getTextFromElement(darkSkyCurrentTemp);
        String currentTemp= currentTempText.split(" ")[0];
        return Integer.parseInt(currentTemp);
    }
    public static int getMaxTemp(){
        List<String> timeLineTemp = getTimeLineTemperatures();
        String maxTemp = Collections.max(timeLineTemp).replace("°","");
        return Integer.parseInt(maxTemp);
    }
    public static int getMinTemp(){
        List<String>timeLineTemp =getTimeLineTemperatures();
        String minTemp = Collections.min(timeLineTemp).replace("°","");
        return Integer.parseInt(minTemp);
    }
    public static boolean assertCurrTemp(int currentTemp, int maxTemp, int minTemp){
        return currentTemp<=maxTemp && currentTemp>=minTemp;
    }
    public static String getMinTempToday(){
        return getTextFromElement(minTimelineTempToday);
    }
    public static String getMaxTempToday(){
        return getTextFromElement(maxTimelineTempToday);
    }
    public static String getLowest(){
        return getTextFromElement(lowestTempToday);
    }
    public static String getHighest(){
        return getTextFromElement(highestTempToday);
    }
    public List<String>getHours(){
        return getValue(timeLineHours);
    }

    private List<String> getValue(By timeLineHours) {
        return null;
    }

    public By getDarSkyExpandButton() {
        return darSkyExpandButton;
    }

    public void setDarSkyExpandButton(By darSkyExpandButton) {
        this.darSkyExpandButton = darSkyExpandButton;
    }
}