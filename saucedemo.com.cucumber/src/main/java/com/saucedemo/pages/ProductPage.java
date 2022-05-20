package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[2]/div[2]/span[1]/select[1]")
    WebElement filerproductfiled;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[2]/div[2]/span[1]/select[1]")
    WebElement hightolow;

    @CacheLookup
    @FindBy(xpath = "//div[@class=\"inventory_list\"]/child::div")
    List<WebElement> allproduct;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    WebElement chepproductaddtocart;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")
    WebElement addtocartinlk;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")
    WebElement addtocardbutton;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")
    List<WebElement> selectbothitem;


    public void clickOnproductfilerfiled() {
        clickOnElement(filerproductfiled);
        log.info("click on pro filter" + filerproductfiled.toString());
    }


    public void selectproductHighToLow(String product) {
        selectByVisibleTextFromDropDown(hightolow, product);
        log.info("select product high to low" + hightolow.toString());
    }

    public void getcheapesAndCostPriceOnCart() {
        allproduct.get(0).click();
        allproduct.get(selectbothitem.size());


    }

    public void clickonchepproduct(String pro) {
        for (WebElement product : allproduct)
            product.getSize();


    }

    public void addInBasketChecpProducut() {
        clickOnElement(chepproductaddtocart);
        log.info("add to basket cheap pro" + chepproductaddtocart.toString());
    }

    public void clickonAddToCartlink() {
        clickOnElement(addtocartinlk);
        log.info("click on add to cart link" + addtocartinlk.toString());
    }


}
