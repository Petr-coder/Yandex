package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static util.DriverManager.getDriver;

public class SectionElectronicsPage extends BasePageObject{
    @FindBy(xpath = "//DIV[@class='section _32PriwSr5B _3WZ8yOWVnM _2pc-e5GHOv uVxPQP6pdS']")
    WebElement categoryСolumn;

    public SectionElectronicsPage(WebDriver driver) {
        PageFactory.initElements(getDriver(), this);

    }

    public void selectElectronicsTVPage(String menuItem)  {
        Actions action = new Actions(getDriver());
        WebElement sectionTVButton = categoryСolumn.findElement(By.xpath("//*[text()='"+menuItem+"']"));
        action.moveToElement(sectionTVButton).click().build().perform();
        getDriver().findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.PAGE_DOWN);
    }
}