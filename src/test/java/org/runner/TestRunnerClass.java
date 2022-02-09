package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvm.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature", glue = "org.stepdefinition" ,
dryRun = false , monochrome = true , strict = true, snippets=SnippetType.CAMELCASE, tags="@smoke",
plugin = {"pretty",
		"html:C:\\Users\\intel\\eclipse-workspace\\FebCucumber\\Reports\\HTMLReport",
		"json:C:\\Users\\intel\\eclipse-workspace\\FebCucumber\\Reports\\JSONReport\\jsonreport.json",
		"junit:C:\\Users\\intel\\eclipse-workspace\\FebCucumber\\Reports\\JUNITReport\\junitreport.junit",
		"rerun:C:\\Users\\intel\\eclipse-workspace\\FebCucumber\\FailedScenario\\failed.txt"
		})

public class TestRunnerClass {
	@AfterClass
	public static void jvm() {
		JvmReport.jvmReportGenerate("C:\\Users\\intel\\eclipse-workspace\\FebCucumber\\Reports\\JSONReport\\jsonreport.json");
	}
}
