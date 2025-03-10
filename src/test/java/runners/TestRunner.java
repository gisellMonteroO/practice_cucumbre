package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features", // Ruta del archivo .feature
    glue = "steps", // Ruta de las definiciones de pasos
    plugin = {"pretty", "html:target/cucumber-report.html"}
)
public class TestRunner {
}
