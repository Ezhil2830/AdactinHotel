package org.stepdefinition;

import org.BaseCucu.HBaseCucumber;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends HBaseCucumber {
	
	@Before
	public void beforescenario() {
		launchBrowser();
		maximizeWindow();
		applyWaitToAllLocators();
		
	}
	@After
		public void afterscenario(Scenario s) {
		
		if(s.isFailed()) {
			
			TakesScreenshot ts=(TakesScreenshot) driver;
			byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
			s.embed(screenshot, "image/png");
			
			
			//String str=s.getname();
			//String name=str.replaceAll(" ","_");
			//takeSnap(name);
			
		}
		
		

	}
	

}
