package com.testcompany.test;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = "com.testcompany.test",
        strict = true,
        snippets = SnippetType.UNDERSCORE)
public class TestClass1 {

}
