package com.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\featurefile\\OrangeHRM.feature",
glue="src\\test\\java\\com\\stepdefinition\\OrangeStepDef.java")

public class OrangeTestRunner {

}
