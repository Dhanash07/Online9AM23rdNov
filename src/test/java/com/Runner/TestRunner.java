package com.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Regression\\AdactinHomePage.feature", 
glue ="com.stepdef", monochrome = true,dryRun = false)
public class TestRunner {
	
	}
