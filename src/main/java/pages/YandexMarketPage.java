package pages;

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

public class YandexMarketPage extends BasePageObject{
    @FindBy(xpath = "//a[text()='Все категории']")
    WebElement allCategoriesButton;

    @FindBy(xpath = "(//DIV[@role='tablist'])[2]")
    WebElement listOfCategories;

    public YandexMarketPage(WebDriver driver) {
        PageFactory.initElements(getDriver(), this);

    }

    public void selectElectronicsPage(String menuItem)  {
        Actions action = new Actions(getDriver());
        action.moveToElement(allCategoriesButton).click().build().perform();

//        Wait<WebDriver> wait = new WebDriverWait(getDriver(), 10, 1000);
//        wait.until(ExpectedConditions.elementToBeClickable(allCategoriesButton)).click();

        WebElement electronics = listOfCategories.findElement(By.xpath("//*[contains(text(),'"+menuItem+"')]"));
        action.moveToElement(electronics).click().build().perform();
        getDriver().findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.PAGE_DOWN);
    }
}
