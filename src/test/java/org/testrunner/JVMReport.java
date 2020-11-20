package org.testrunner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	public static void generateJVMReport(String jsonFile) {
		
		File reportDirectory = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports");
		
		Configuration configuration = new Configuration(reportDirectory, "adactinhotel Automation");
		
		configuration.addClassifications("OS", "Windos 10");
		configuration.addClassifications("Browser", "chrome");
		configuration.addClassifications("Browser_version", "82");
		configuration.addClassifications("Sprint", "33");
		
		List<String>jsonFiles = new ArrayList<String>();
		
		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		reportBuilder.generateReports();
	}

}
