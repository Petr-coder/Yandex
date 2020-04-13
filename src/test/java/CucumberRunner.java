import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/TVYandexTest.feature", "src/test/resources/HeadphonesYandexTest.feature"},
        glue = {"steps"},
        tags = {"@Яндекс.Маркет.Телевизоры, @Яндекс.Маркет.Наушники"},
        plugin = {"util.AllureReporter"})

public class CucumberRunner{
}
