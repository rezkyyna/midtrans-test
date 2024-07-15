package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RegisterFoto {
    private WebDriver driver;

    public RegisterFoto(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@id='Claim_Type']")
    WebElement pilihType;

    @FindBy(xpath = "(//p[normalize-space()='Register Foto'])[1]")
    WebElement registerfotomenu;

    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement username;
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password;
    @FindBy(xpath = "//button[@class='login100-form-btn']")
    WebElement submit;

    @FindBy(xpath = "//input[@id='Phone_Number']")
    WebElement phoneNumber;

    @FindBy(xpath = "//input[@id='Customer_Name']")
    WebElement customerName;

    @FindBy(xpath = "//*[@id=\"div-Merchant_1\"]/div/div[2]/div[2]/div[1]/div/button/div/div/div")
    WebElement pilihMerchant;

    @FindBy(xpath = "//input[@id='Amount_1']")
    WebElement amountShop;

    @FindBy(xpath = "//input[@id='RRN_1']")
    WebElement inputRrn;

    @FindBy(xpath = "//input[@id='Foto_Struk_EDC']")
    WebElement chooseFile;

    @FindBy(id = "btnsubmit")
    WebElement submitRegisterFoto;

    @FindBy(xpath = "//option[@value='2-QRIS myBCA']")
    WebElement pilihOpsiPenukaran;

    @FindBy(xpath = "//div[contains(text(),'MONGKIS BCA EXPOVERSARY 2024')]")
    WebElement pilihNamaMerchant;



    public void klikMenuRegisterFoto(){
        registerfotomenu.click();
    }
    public void opsiPenukaran(){
      pilihOpsiPenukaran.click();
        tunggu();
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber.sendKeys(phoneNumber);
    }

    public void setCustomerName(String customerName){
        this.customerName.sendKeys(customerName);
    }

    public void pilihMerchant(){
        pilihMerchant.click();
        down();
        enter();
    }

    public void setAmountShop(String amountShop){
        this.amountShop.sendKeys(amountShop);
    }

    public void setRrnCode(String rrnCode) {
        this.inputRrn.sendKeys(rrnCode);
    }


    public void setPathFile(){

    }

    public void btnKirim(){
        submitRegisterFoto.click();
    }



    public void login(){
        username.sendKeys("feriansyah");
        password.sendKeys("a");
        submit.click();
    }
    public void enter() {
        try
        {
            Robot r = new Robot();
            r.keyPress(KeyEvent.VK_ENTER);
            r.keyRelease(KeyEvent.VK_ENTER);
        }
        catch (AWTException e)
        {
            e.printStackTrace();
        }
    }
    public void down() {
        try
        {
            Robot r = new Robot();
            r.keyPress(KeyEvent.VK_DOWN);
            r.keyRelease(KeyEvent.VK_DOWN);
        }
        catch (AWTException e)
        {
            e.printStackTrace();
        }
    }
    public void tab() {
        try
        {
            Robot r = new Robot();
            r.keyPress(KeyEvent.VK_TAB);
            r.keyRelease(KeyEvent.VK_TAB);
        }
        catch (AWTException e)
        {
            e.printStackTrace();
        }
    }
    public void downHold() {
        for (int i = 0; i < 1; i++) {
            try
            {

                Robot r = new Robot();
                r.keyPress(KeyEvent.VK_DOWN);
                r.keyRelease(KeyEvent.VK_DOWN);
            }
            catch (AWTException e)
            {
                e.printStackTrace();
            }
        }

    }

    public void tunggu() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
