package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

import static util.DriverManager.getDriver;

public class YandexFrontPage extends BasePageObject{
    @FindBy(xpath = "//DIV[@class='home-tabs stream-control dropdown2 dropdown2_switcher_elem i-bem home-tabs_js_inited']")
    WebElement menuAboveSearchingBar;

    public YandexFrontPage(WebDriver driver) {
        PageFactory.initElements(getDriver(), this);

    }

    public void selectYandexMarketPage(String menuItem)  {
        menuAboveSearchingBar.findElement(By.linkText(menuItem)).click();

        ArrayList<String> tabs2 = new ArrayList<String> (getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs2.get(0));
        getDriver().close();
        getDriver().switchTo().window(tabs2.get(1));

//        String oldTab = getDriver().getWindowHandle();
//        getDriver().findElement(By.linkText(menuItem)).click();
//        ArrayList<String> newTab = new ArrayList<String>(getDriver().getWindowHandles());
//        newTab.remove(oldTab);
//        getDriver().switchTo().window(newTab.get(0));




    }
}
