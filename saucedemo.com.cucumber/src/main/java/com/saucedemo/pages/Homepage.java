package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Utility {
    private static final Logger log= LogManager.getLogger(Homepage.class.getName());
    public Homepage() {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(id="user-name")
    WebElement usernamefiled;

    @CacheLookup
    @FindBy(id="password")
    WebElement passwordfiled;

    @CacheLookup
    @FindBy(id="login-button")
    WebElement loginbutton;


    public void enteruserName(String usernm){
        sendTextToElement(usernamefiled,usernm);
        log.info("enter on username"+usernamefiled.toString());
    }
    public void enterPasswordFiled(String password1){
        sendTextToElement(passwordfiled,password1);
        log.info("enter on password"+passwordfiled.toString());
    }
    public void clickOnloginButton(){
        clickOnElement(loginbutton);
        log.info("click on login button"+loginbutton.toString());
    }
}
