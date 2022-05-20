package com.saucedemo.cucumber.steps;

import com.saucedemo.pages.CheckoutPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class CheckoutPageSteps {
    @And("^I enter details firstname \"([^\"]*)\", lastName \"([^\"]*)\" and zipPostalCode \"([^\"]*)\"$")
    public void iEnterDetailsFirstnameLastNameAndZipPostalCode(String name1, String surname1, String postcode1)  {
        new CheckoutPage().enterYuorDetails(name1,surname1,postcode1);


    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new CheckoutPage().clickOnContinueButton();

    }
    @And("^I click on finish button$")
    public void iClickOnFinishButton() {
        new CheckoutPage().clickOnFinishedButton();
    }

    @Then("^I should be able to see message 'Thank you for your order'$")
    public void iShouldBeAbleToSeeMessageThankYouForYourOrder() {
        new CheckoutPage().getthemessagethankyou();
    }
}
