package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement username;
    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement password;
    @FindBy(xpath = "//button[@class='login100-form-btn']")
    private WebElement submit;

    @FindBy(xpath = "//a[@class='btn btn-primary btn-block']")
    private WebElement buttonAddData;

    @FindBy(xpath = "//select[@id='Claim_Type']")
    private WebElement pilihType;

    @FindBy(xpath = "(//p[normalize-space()='Register Foto'])[1]")

    private WebElement registerfotomenu;

    @FindBy(xpath = "//b[normalize-space()='Username atau Password Salah!']")
    private WebElement txtLoginInvalid;
    @FindBy(xpath = "//b[normalize-space()='JSD 2024']")
    private WebElement txtValidLogin;

    //login admin
    public void setUsername(String username){
        this.username.clear();
        this.username.sendKeys(username);
    }

    public void setpassword(String password) {
        this.password.clear();
        this.password.sendKeys(password);
    }

    public void clickBtnLogin(){
        this.submit.click();
    }

    public String getTxtValidLogin(){

        return this.txtValidLogin.getText();
    }
//    public void setTransaksi1(String klikOrNo){
//        if(transaksi.equals("qris bca")){
//            if (klikOrNo.equals("true")) {
//                transaksi.click;
//            }
//        } else if (transaksi.equals("kartu kredit bca")) {
//            if (klikOrNo.equals("true")) {
//                transaksi.click;
//        }
//    }


    //validasi
    public String txtInvalidLogin(){
       return txtLoginInvalid.getText();
    }


}