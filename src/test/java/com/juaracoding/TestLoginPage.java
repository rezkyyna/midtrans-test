package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLoginPage {
    private static WebDriver driver;
    static ExtentTest extentTest;
    private static LoginPage loginPage = new LoginPage();

    public TestLoginPage() {

        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User enter URL Event")
    public void user_enter_url_event() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User enter URL Event");
    }
    @When("input username {string}")
    public void input_username(String username) {
        loginPage.setUsername(username);
    }

    @When("input password {string}")
    public void input_password(String password) {
        loginPage.setpassword(password);
    }

    @When("click button submit")
    public void click_button_submit() {
        loginPage.clickBtnLogin();
    }

    @Then("validate login page {string}")
    public void validate_login_page_success(String statusTest) {
        if (statusTest.equals("success")) {
            Assert.assertEquals(loginPage.getTxtValidLogin(),"JSD 2024");
        } else if (statusTest.equals("invalid password")) {
            Assert.assertEquals(loginPage.txtInvalidLogin(),"Username atau Password Salah!");
        }
    }
}