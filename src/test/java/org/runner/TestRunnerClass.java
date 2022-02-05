package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature", glue = "org.stepdefinition" ,
dryRun = false , monochrome = true , strict = true, snippets=SnippetType.CAMELCASE, tags="@smoke")

public class TestRunnerClass {

}
