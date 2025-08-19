package org.example.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
        tags = "",
        features = {"src/test/resources/featurefiles"},
        glue = {"stepDefinitions"},
        plugin = {"pretty"},
        monochrome = true)

public class TestRunner extends AbstractTestNGCucumberTests {

}