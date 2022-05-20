package com.saucedemo.cucumber.steps;

import com.saucedemo.pages.ProductPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;

public class ProductPageSteps {
    @And("^I filter the products by \"([^\"]*)\"$")
    public void iFilterTheProductsBy(String Price)  {
        new ProductPage().clickOnproductfilerfiled();
        new ProductPage().selectproductHighToLow(Price);


    }

    @And("^I select cheapest & costliest products and add to basket$")
    public void iSelectCheapestCostliestProductsAndAddToBasket() {
        new ProductPage().getcheapesAndCostPriceOnCart();


    }

    @And("^I open shopping cart$")
    public void iOpenShoppingCart() {
        new ProductPage().clickonAddToCartlink();
    }



}
