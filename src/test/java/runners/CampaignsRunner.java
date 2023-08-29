package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeatures\\Campaigns.feature"},
		
		glue = {"steps"},
		
		plugin = {"pretty"},
		
		publish = true,
		
		tags = "@sanity"
		
		
		)

public class CampaignsRunner extends AbstractTestNGCucumberTests{

	
	
}
