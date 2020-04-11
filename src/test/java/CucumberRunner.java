import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/TVYandexTest.feature", "src/test/resources/HeadphonesYandexTest.feature"},
        glue = {"steps"},
        tags = {"@Яндекс.Маркет.Телевизоры, @Яндекс.Маркет.Наушники"},
        plugin = {"io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"})

public class CucumberRunner{
}
