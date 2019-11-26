package com.testcompany.testproj.testpart.defs;

import com.testcompany.testproj.models.SomeClass1;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class FirstConcatMethodDef {
    private String string1;
    private String string2;
    private String resultString;

    @Given("2 args {string} and {string}")
    public void userGiveStrings(String arg1, String arg2) {
        System.out.println("User gives 2 args " + arg1 + " and " + arg2);

        string1 = arg1;
        string2 = arg2;
    }

    @When("user do first method append")
    public void userDoAppendFirstMethod() {
        System.out.println("user append " + string1 + " and " + string2);

        resultString = new SomeClass1().someFunction1(string1, string2);
    }

    @When("user do second method append")
    public void userDoAppendSecondMethod() {
        System.out.println("user append " + string1 + " and " + string2);

        resultString = new SomeClass1().someFailFunction2(string1, string2);
    }

    @Then("user receive result {string}")
    public void userReceive(String arg1) {
        System.out.println("user receive answer " + arg1);

        Assert.assertEquals(resultString, arg1);
    }
}
