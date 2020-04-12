package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    private static WebDriver driver;

    private DriverManager(){
    }

    public static WebDriver getDriver() {
        if (!isDriverStarted()) {
            System.setProperty("webdriver.chrome.driver", "drv/chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void tearDownDriver(){
        driver.quit();
        driver = null;
    }

    public static  boolean isDriverStarted(){
        return driver != null;
    }

}
