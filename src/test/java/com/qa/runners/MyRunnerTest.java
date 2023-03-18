package com.qa.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

public class MyRunnerTest {

    @RunWith(Cucumber.class)
    @CucumberOptions(plugin = {"pretty", "html:target/cucumber", "summary"},
            snippets = CAMELCASE,
            dryRun=true,
            monochrome=true
         //   ,tags = "@foo and not @bar"
            )
    public class RunCucumberTest {
    }
}
