package com.rezkyyna.drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements DriverStrategy {
    @Override
    public WebDriver setStrategy() {
        System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        return driver;

//        System.setProperty("webdriver.chrome.whitelistedIps", "");
//        String path = "D:\\chromedriver\\chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver",path);
//        ChromeOptions options = new ChromeOptions();
//        options.setExperimentalOption("useAutomationExtension",false);
//        options.addArguments("--no-sandbox");
//        return new ChromeDriver(options);
    }
}
