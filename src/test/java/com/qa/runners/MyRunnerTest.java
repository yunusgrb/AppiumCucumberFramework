package com.qa.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber", "summary"},
        features = {"src/test/resources"},
        glue = {"com.qa.StepDef"},
        snippets = CAMELCASE,
        dryRun=false,
        monochrome=true
        //   ,tags = "@foo and not @bar"
)
public class MyRunnerTest {



}
