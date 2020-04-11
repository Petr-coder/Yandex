package pages;

import org.openqa.selenium.support.PageFactory;

import static util.DriverManager.getDriver;

public class BasePageObject {
    public BasePageObject() {
        PageFactory.initElements(getDriver(), this);
    }


}
