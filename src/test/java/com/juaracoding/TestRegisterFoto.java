package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.RegisterFoto;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TestRegisterFoto {
    private static WebDriver driver;
    static ExtentTest extentTest;
    private static LoginPage loginPage = new LoginPage();
    private static RegisterFoto registerFoto = new RegisterFoto();

    public TestRegisterFoto() {

        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    @When("click register foto menu")
    public void click_register_foto_menu(){
        registerFoto.klikMenuRegisterFoto();
    }

    //Register foto form
    @When("select opsi penukaran")
    public void select_opsi_penukaran() {
        registerFoto.opsiPenukaran();
        DriverSingleton.delay(1);
    }

    @And("input phone number {string}")
    public void input_phone_number(String phoneNumber) {
        registerFoto.setPhoneNumber(phoneNumber);
        DriverSingleton.delay(1);
    }

    @And("input customer name {string}")
    public void input_customer_name(String customerName) {
        registerFoto.setCustomerName(customerName);
        DriverSingleton.delay(1);
    }

   /* @And("select transaksi one {string}")
    public void select_transaksi_one_yes(String pathFile) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }*/

    @And("select merchant name one")
    public void select_merchant_name_one() {
        registerFoto.pilihMerchant();
        DriverSingleton.delay(1);
    }

    @And("input amount shop one {string}")
    public void input_amount_shop_one(String amountShop) {
        registerFoto.setAmountShop(amountShop);
        DriverSingleton.delay(1);
    }

    @And("input rrn code one {string}")
    public void input_rrn_code_one(String rrnCode) {
        registerFoto.setRrnCode(rrnCode);
        DriverSingleton.delay(1);
    }

    @And("upload struk file {string}")
    public void upload_struk_file(String string) {
        DriverSingleton.delay(1);
    }

    @And("click btn kirim")
    public void click_btn_kirim() {
        registerFoto.btnKirim();
        DriverSingleton.delay(1);
    }

    @Then("validate register foto form {string}")
    public void validate_register_foto_form(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
