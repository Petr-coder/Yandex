package steps;

import io.cucumber.java.en.When;
import pages.FiltersPage;
import pages.SectionElectronicsPage;

import static util.DriverManager.getDriver;

public class FiltersSteps {

    @When("^Введена минимальная стоимость товара в размере  \"(.*)\"$")
    public void stepSetPrice(String price) {
        new FiltersPage().setPrice(price);
    }

    @When("^Выбран производитель   \"(.*)\"$")
    public void stepSelectMenuBrand(String brand) {
        FiltersPage filterPage = new FiltersPage();
        filterPage.selectMenuBrand(brand);

    }

    @When("^Выполнено нажатие на кнопку Показать подходящие")
    public void stepPressShowResultButton() {
        new FiltersPage().pressShowResultButton();
    }


}
