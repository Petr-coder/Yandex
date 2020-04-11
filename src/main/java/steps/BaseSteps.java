package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.AfterClass;
import util.TestProperties;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static util.DriverManager.getDriver;

public class BaseSteps {
//    protected static String baseUrl;
//    public static Properties properties = TestProperties.getInstance().getProperties();

    @Before
    public static void startScenario() {
        getDriver().get("https://yandex.ru/");
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }


    @After
    public static void tearDown() throws Exception {
        getDriver().quit();
    }

}