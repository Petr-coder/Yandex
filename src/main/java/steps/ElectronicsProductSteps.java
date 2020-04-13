package steps;

import cucumber.api.java.en.When;
import pages.ElectronicsProductPage;

import static util.DriverManager.getDriver;

public class ElectronicsProductSteps {

    @When("^Выполнено в выбранной категории товара нажатие на кнопку Все фильтры")
    public void setSelectFiltersButton() {
        new ElectronicsProductPage(getDriver()).selectFiltersButton();
    }

    @When("^Количество элементов на странице выбрано в количестве \"(.*)\"$")
    public void setSelectQuantityOfGoods(int number) throws InterruptedException {
        new ElectronicsProductPage(getDriver()).selectQuantityOfGoods(number);
    }

    @When("^Выполнен поиск запомненного наименования первого элемента$")
    public void stepInputTitleElement() {
        new ElectronicsProductPage(getDriver()).inputTitleElement();
    }

    @When("^Выполнена проверка соответствия наименования заполненному значению$")
    public void stepCheckTitle() {
        new ElectronicsProductPage(getDriver()).checkTitle();
    }


}
