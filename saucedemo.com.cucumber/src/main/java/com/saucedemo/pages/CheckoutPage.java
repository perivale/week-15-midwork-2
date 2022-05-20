package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends Utility {
    private static final Logger log= LogManager.getLogger(CheckoutPage.class.getName());

    public CheckoutPage() {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='first-name']")
    WebElement fristname;

    @CacheLookup
    @FindBy(xpath = "//input[@id='last-name']")
    WebElement lastname;

    @CacheLookup
    @FindBy(xpath = "//input[@id='postal-code']")
    WebElement postcode;

    @CacheLookup
    @FindBy(xpath = "//input[@id='continue']")
    WebElement continuebutton;


    @CacheLookup
    @FindBy(xpath = "//button[@id='finish']")
    WebElement finishbutton;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]")
    WebElement thankyoumessage;


    public void enterYuorDetails(String name,String lname,String pcode){
        sendTextToElement(fristname,name);
        sendTextToElement(lastname,lname);
        sendTextToElement(postcode,pcode);

    }
    public void clickOnContinueButton(){
        clickOnElement(continuebutton);
        log.info("click on continue button"+continuebutton.toString());
    }

    public void clickOnFinishedButton(){
        clickOnElement(finishbutton);
        log.info("click on finised button"+finishbutton.toString());

    }
    public String getthemessagethankyou(){
        log.info("click on get the text thank you message"+thankyoumessage.toString());
        return thankyoumessage.getText();
    }



















}

