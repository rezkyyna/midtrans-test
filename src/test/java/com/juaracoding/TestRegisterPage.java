package com.juaracoding;

import com.juaracoding.pages.RegisterPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TestRegisterPage {
    private static WebDriver driver;
    static ExtentTest extentTest;
    private static RegisterPage registerPage = new RegisterPage();

    public TestRegisterPage() {

        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User enter URL Event")
    public void user_enter_url_event() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User enter URL Event");
    }
    @When("User Login")
    public void user_login() {
        driver.get(Constants.URL);
        registerPage.loginform();
//        throw new io.cucumber.java.PendingException();
    }

@When("User go to register menu")
public void user_go_to_register_menu() {
    registerPage.registerForm();
    extentTest.log(LogStatus.PASS, "User go to register menu");
}

}