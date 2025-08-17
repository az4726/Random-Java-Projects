package org.example.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
        tags = "",
        features = {"src/main/java/featurefiles"},
        glue = {"java.stepDefinitions"},
        plugin = {"pretty"},
        monochrome = true)

public class TestRunner extends AbstractTestNGCucumberTests {

}