package com.resource;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(features = "C://Users//Computer//workspace//AppsProjectss//src//test//resource//Feature//facebook.feature",
glue={"com.stepdefinitions"} )
public class TestRunner {

}
