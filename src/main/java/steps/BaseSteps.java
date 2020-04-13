package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static util.DriverManager.*;

public class BaseSteps {

    @Before
    public static void startScenario() {

        if (!isDriverStarted()) {
            getDriver().get("https://yandex.ru/");
            getDriver().manage().window().maximize();
            getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        }
    }

    @After(value = "@Яндекс.Маркет.Наушники")
    public static void tearDown() throws Exception {
        String originalWindow = getDriver().getWindowHandle();
        final Set<String> oldWindowsSet = getDriver().getWindowHandles();

        for (String window : oldWindowsSet) {
            if (!window.equals(originalWindow)) {
                getDriver().close();
                getDriver().switchTo().window(window);
                break;
            }
        }
    }

    @After(value = "@Яндекс.Маркет.Телевизоры")
    public static void tearDownFinal() throws Exception {
        tearDownDriver();
    }

}