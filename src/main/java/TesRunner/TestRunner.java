package TesRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

	@CucumberOptions (features="src/test/res/features",glue={"com/src/main/java/com/stepdefenitions"},
			plugin ={"pretty", "html:target/cucumber-reports/cucumber-pretty",
					"json:target/cucumber-reports/CucumberTestReport.json", "rerun:target/cucumber-reports/rerun.txt"} ,
					monochrome = true, 
					strict = true,
					dryRun = true
	)
	
			
public class TestRunner {
		
		private TestNGCucumberRunner testNGCucumberrRunner;
		
		@BeforeClass(alwaysRun=true)
		public void setup(){
		testNGCucumberrRunner= new TestNGCucumberRunner(this.getClass());
		}
		
		@Test(groups="cucumber", description="Runs cucumber features", dataProvider="features")
		public void feature(CucumberFeatureWrapper cucumberFeature){
		testNGCucumberrRunner.runCucumber( cucumberFeature.getCucumberFeature());
		}
		
		@DataProvider
		public Object[][] features(){
		return testNGCucumberrRunner.provideFeatures();
		}
		
		@AfterClass
		public void testdownclass(){
			testNGCucumberrRunner.finish();
		}
		
}
