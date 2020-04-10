package steps;

import io.cucumber.java.en.When;
import pages.YandexMarketPage;

import static util.DriverManager.getDriver;

public class YandexMarketSteps {

    @When("^Выполнено в Яндекс.Маркет нажатие на кнопку \"(.*)\"$")
    public void stepSelectElectronicsPage(String menuItem){
        new YandexMarketPage(getDriver()).selectElectronicsPage(menuItem);
    }

}
