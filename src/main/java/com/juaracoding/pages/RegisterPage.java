package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    private WebDriver driver;

    public RegisterPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='Enter Username']")
    private WebElement username;
    @FindBy(xpath = "//input[@placeholder='Enter Password']")
    private WebElement password;
    @FindBy(xpath = "//button[@class='_btn_04']")
    private WebElement submit;
    @FindBy(xpath = "//a[@href='https://dev.ptdika.com/staging_evoucher/registrasi']//p[contains(text(),'Penukaran Voucher')]")
    private WebElement menuRegister;
    @FindBy(xpath = "//a[@class='btn btn-primary btn-block']")
    private WebElement buttonAddData;

    @FindBy(xpath = "//select[@id='Claim_Type']")
    private WebElement pilihType;

    @FindBy(xpath = "//p[normalize-space()='Register Foto']")
    private WebElement registerfotomenu;

    //login admin

    public void loginform(){
        username.sendKeys("ferinugraha");
        password.sendKeys("a");
        submit.click();
    }

    public void registerForm(){
        menuRegister.click();
        pilihType.click();
        
    }


}