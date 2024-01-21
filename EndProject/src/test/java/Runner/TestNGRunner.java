package Runner;
import org.testng.annotations.Listeners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//import testnglisteners.CucumberExtentReportListener;
import utilities.CucumberExtentReportListener;

@CucumberOptions(
        features = {"C:\\Users\\shaik\\eclipse-workspace\\EndProject\\src\\test\\java\\feature\\Login.feature",
                    },
        glue = {"Steps" },
        dryRun = false,
        plugin = {
            "pretty",
            "html:targettestng/cucumberreport_Login.html",
            "json:targettestng/cucumber.json",
            "junit:targettestng/xmlReport.xml",
            "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:\", \"timeline:test-output-thread/"
            
          
        },
        monochrome=true
)

@Listeners(CucumberExtentReportListener.class)
public class TestNGRunner extends AbstractTestNGCucumberTests {
}