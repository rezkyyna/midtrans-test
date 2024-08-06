package com.rezkyyna;

import com.rezkyyna.drivers.DriverSingleton;
import com.rezkyyna.pages.TransaksiPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
        WebElement element = (new WebDriverWait(driver, 120))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='cart-checkout']")));
        transaksiPage.setCheckoutButton();
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS,"user click button checkout");
    }


}
