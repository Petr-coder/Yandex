package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import static util.DriverManager.getDriver;

public class FiltersPage extends BasePageObject{

    @FindBy(xpath = "//*[@name = 'glf-pricefrom-var']")
    WebElement priceFromButton;

    @FindBy(xpath = "//a[@role= 'button' and contains(@class, 'action_show-filtered')]")
    WebElement showResultButton;

    @FindBy(xpath = "//div[@data-filter-id='7893318']//div[contains(@class, 'list-items')]")
    WebElement listOfBrands;

    public FiltersPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void setPrice(String price) {
        priceFromButton.sendKeys(price);
    }

    public void selectMenuBrand(String brand) {
        listOfBrands.findElement(By.xpath("//*[text() = '" + brand + "']")).click();
    }

    public void pressShowResultButton() {
//        Actions action = new Actions(getDriver());
//        action.moveToElement(showResultButton).click().build().perform();
//        ((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView();"
//                ,showResultButton);
        Wait<WebDriver> wait = new WebDriverWait(getDriver(), 10, 1000);
       wait.until(ExpectedConditions.elementToBeClickable(showResultButton)).click();
    }
}
