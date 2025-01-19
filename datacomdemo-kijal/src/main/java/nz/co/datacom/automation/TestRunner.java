package nz.co.datacom.automation;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        monochrome = true,
        features = "src/test/resources/features",
        glue = "nz.co.datacom.automation.steps",
        plugin = {
                "pretty",
                "json:target/cucumber-report.json",
                "html:target/cucumber-html-report"
        }
)

public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
