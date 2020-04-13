package steps;

import cucumber.api.java.en.When;
import pages.YandexFrontPage;

import static util.DriverManager.getDriver;

public class YandexFrontSteps {

    @When("^Выбран на основной странице Яндекс пункт меню \"(.*)\"$")
    public void stepSelectYandexMarketPage(String menuItem) {
        new YandexFrontPage(getDriver()).selectYandexMarketPage(menuItem);
    }

}
