package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopingPage extends Utility {
    private static final Logger log= LogManager.getLogger(ShopingPage.class.getName());
    public ShopingPage() {
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkoutbutton;


    public void clickOnCheckout(){
        clickOnElement(checkoutbutton);
        log.info("click on checkout button"+checkoutbutton.toString());

    }
}
