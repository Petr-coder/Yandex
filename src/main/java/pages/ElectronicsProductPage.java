package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import static util.DriverManager.getDriver;

public class ElectronicsProductPage extends BasePageObject {

    @FindBy(xpath = "(//DIV[@class='n-snippet-card2__part n-snippet-card2__part_type_left'])[1]")
    WebElement listOfGoods;

    @FindBy(xpath = "//*[@role= 'listbox' and contains(@class, 'button_arrow_down button_size_s')]")
    WebElement quantityOfGoodsButtons;

    @FindBy(xpath = "//select[@class='select__control']")
    WebElement listOfQuantity;

    @FindBy(xpath = "//*[@id='header-search']")
    WebElement stringOfSearch;

    @FindBy(xpath = "(//H3[@class='n-snippet-card2__title'])[1]")
    WebElement firstLineOfSearch;

    @FindBy(xpath = "(//BUTTON[@role='button'])[1]")
    WebElement searchButton;

//    @FindBy(xpath = "//button[contains(@class,'button2 button2_size_ml button2_type_submit button2_pin_brick-round i-bem suggest2-form__button button2_theme_gray button2_js_inited')]")
//    WebElement searchButton;


    @FindBy(xpath = "//*[text()='Все фильтры']")
    WebElement filtersButton;



    public ElectronicsProductPage(WebDriver driver) {
        PageFactory.initElements(getDriver(), this);
    }

    public void selectFiltersButton() {
        filtersButton.click();
    }

    public void selectQuantityOfGoods(int number) throws InterruptedException {
//        Thread.sleep(10000);
//        Actions action = new Actions(getDriver());
//        action.moveToElement(quantityOfGoodsButtons).click().build().perform();
//        quantityOfGoodsButtons.click();
        Wait<WebDriver> wait = new WebDriverWait(getDriver(), 10, 1000);
        wait.until(ExpectedConditions.elementToBeClickable(quantityOfGoodsButtons)).click();
        listOfQuantity.findElement(By.xpath("//*[@class = 'popup__content']//*[contains(text(), 'Показывать по " + number + "')]")).click();
    }

    String word = firstLineOfSearch.getText();

    public void insertName(String name) {
        stringOfSearch.sendKeys(name);
    }

    public void pressSearchButton() {
        Actions action = new Actions(getDriver());
        action.moveToElement(searchButton).click().build().perform();
    }

    public void inputTitleElement(){
        insertName(word);
        pressSearchButton();
    }

    public void checkTitle() {
        Wait<WebDriver> wait = new WebDriverWait(getDriver(), 5, 1000);
        wait.until(ExpectedConditions.elementToBeClickable(firstLineOfSearch));
        Assert.assertEquals(word, firstLineOfSearch.getText());
    }

}


