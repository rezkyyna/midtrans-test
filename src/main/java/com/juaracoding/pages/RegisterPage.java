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

    //login admin

    public void loginform(){
        username.sendKeys("ferinugraha");
        password.sendKeys("a");
        submit.click();
        DriverSingleton.delay(2);
    }

    public void registerForm(){
        registerfotomenu.click();
        pilihType.click();

    }


}