package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransaksiPage {
    static WebDriver driver;

    public TransaksiPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[@class='btn buy']")
    WebElement buyNowButton;

    @FindBy(xpath = "//div[@class='cart-checkout']")
    WebElement checkoutButton;
    @FindBy(xpath = "//div[@class='promo-button-wrapper']//*[name()='svg']")
    WebElement usePromoButton;
    @FindBy(xpath = "//*[@id=\"application\"]/div/div/div[13]/div[3]/div[1]/div/span/label")
    WebElement checklistPromo;
    @FindBy(xpath = "//button[normalize-space()='Use']")
    WebElement useButtonPromo;
    @FindBy(xpath = "//*[@id=\"application\"]/div/div/div[2]")
    WebElement txtOrderId;

    public void setCheckoutButton(){
        checkoutButton.click();
    }
    public void setUsePromoButton(){
        usePromoButton.click();
    }
    public void setBuyNowButton(){
        buyNowButton.click();
    }
    public void setChecklistPromo(){
        checklistPromo.click();
    }
    public void setUseButtonPromo(){
        useButtonPromo.click();
    }

    public String getTxtOrderId(){
        return this.txtOrderId.getText();
    }
}
