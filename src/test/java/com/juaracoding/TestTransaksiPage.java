package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.TransaksiPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestTransaksiPage {
    private static WebDriver driver;
    static ExtentTest extentTest;
    private static TransaksiPage transaksiPage = new TransaksiPage();

    public TestTransaksiPage() {

        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @When("user access url midtrans")
    public void user_access_url_midtrans() {
        driver.get("https://demo.midtrans.com/");
       extentTest.log(LogStatus.PASS,"user access url midtrans");
    }

    @And("user click button buy now")
    public void user_click_button_buy_now() {
        transaksiPage.setBuyNowButton();
        DriverSingleton.delay(1);
        extentTest.log(LogStatus.PASS,"user click button buy now");
    }

    @And("user click button checkout")
    public void user_click_button_checkout() {
        transaksiPage.setCheckoutButton();
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS,"user click button checkout");
    }
    @And("user click metode payment")
    public void user_click_metode_payment(){
        driver.findElement(By.xpath("//*[@id=\"application\"]/div/div/div[3]/div[1]/a/div[2]")).click();
    }

//    @And("user click button use promo")
//    public void user_click_button_use_promo() {
//        transaksiPage.setUsePromoButton();
//        DriverSingleton.delay(1);
//        extentTest.log(LogStatus.PASS,"user click button use promo");
//    }
//
//    @And("user choose promo flash sale")
//    public void user_choose_promo_flash_sale() {
//        transaksiPage.setChecklistPromo();
//        DriverSingleton.delay(1);
//        extentTest.log(LogStatus.PASS,"user choose promo flash sale");
//    }
//    @And("user click button use")
//    public void user_click_button_use(){
//        transaksiPage.setUseButtonPromo();
//        DriverSingleton.delay(1);
//        extentTest.log(LogStatus.PASS,"user click button use");
//    }

    @Then("user get code order id")
    public void user_get_code_order_id() {
        Assert.assertEquals(transaksiPage.getTxtOrderId(),"");
        DriverSingleton.delay(1);
        extentTest.log(LogStatus.PASS,"user get code order id");
    }


}
