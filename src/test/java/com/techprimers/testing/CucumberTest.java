package com.techprimers.testing;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/feature",
        glue = "com.techprimers.testing",
        plugin = {"json:target/cucumber.json"}
)
public class CucumberTest {
}
