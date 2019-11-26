package com.testcompany.test;

public class SomeClass1 {
    public String someFunction1(String arg1, String arg2){
        return arg1.concat(arg2);
    }

    public String someFailFunction2(String arg1, String arg2){
        throw new RuntimeException();
    }
}
