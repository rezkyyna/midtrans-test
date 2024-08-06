package com.rezkyyna.utils;

public enum TestCases {

    //Register
    T1("Transaksi Test");



    private String testCaseName;
    TestCases(String value){
        testCaseName = value;
    }
    public String getTestCaseName(){
        return testCaseName;
    }
}
