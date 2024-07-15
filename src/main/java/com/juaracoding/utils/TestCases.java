package com.juaracoding.utils;

public enum TestCases {

    //Register
    T1("Invalid Password Login"),
    T2("Success Login Page"),

    T3("Register Foto Page");



    private String testCaseName;
    TestCases(String value){
        testCaseName = value;
    }
    public String getTestCaseName(){
        return testCaseName;
    }
}
