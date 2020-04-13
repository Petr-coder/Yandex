package util;

import gherkin.formatter.model.Result;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import io.qameta.allure.cucumberjvm.AllureCucumberJvm;
import io.qameta.allure.model.Status;
import io.qameta.allure.util.ResultsUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class AllureReporter extends AllureCucumberJvm {

    @Override
    public void result(Result result) {
        if (!result.getStatus().equals("passed") && !result.getStatus().equals("skipped")) {
            Allure.getLifecycle().addAttachment("С к р и н ш о т", "image/png", ".png", takeScreenshot());
        }
        super.result(result);
    }

    public static byte[] takeScreenshot() {
        return ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
