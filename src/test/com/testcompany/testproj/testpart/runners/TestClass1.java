package com.testcompany.testproj.testpart.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = "com.testcompany.testproj.testpart.defs",
        strict = true,
        snippets = SnippetType.UNDERSCORE)
public class TestClass1 {

}
