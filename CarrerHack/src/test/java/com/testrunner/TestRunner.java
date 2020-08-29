package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features="Feature",
		glue="com.stepdefinition",
		 tags="@examTest"
		//plugin=""
		
		)





public class TestRunner extends AbstractTestNGCucumberTests {

}
