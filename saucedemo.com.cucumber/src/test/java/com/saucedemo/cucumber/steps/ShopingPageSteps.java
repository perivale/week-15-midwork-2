package com.saucedemo.cucumber.steps;

import com.saucedemo.pages.ShopingPage;
import cucumber.api.java.en.And;

public class ShopingPageSteps {
    @And("^I go to checkout$")
    public void iGoToCheckout() {
        new ShopingPage().clickOnCheckout();

    }
}
