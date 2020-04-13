package steps;

import cucumber.api.java.en.When;
import pages.SectionElectronicsPage;

import static util.DriverManager.getDriver;

public class SectionElectronicsSteps {

    @When("^Выполнено в меню Электроника нажатие на кнопку  \"(.*)\"$")
    public void stepSelectElectronicsTVPage(String menuItem){
        new SectionElectronicsPage(getDriver()).selectElectronicsTVPage(menuItem);
    }
}
