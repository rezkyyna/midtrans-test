package com.juaracoding;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/main/resources/features/Login.feature"
        , "src/main/resources/features/RegisterFoto.feature"
        },
        glue = {"com.juaracoding"},
        plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber.json"}
)
public class RunnerTest extends AbstractTestNGCucumberTests {
}
 