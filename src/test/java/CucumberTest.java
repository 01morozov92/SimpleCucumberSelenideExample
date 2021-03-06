import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (monochrome = true, glue = "steps", features = {"src/test/resources/features"}, tags = "@all")
public class CucumberTest {
}
