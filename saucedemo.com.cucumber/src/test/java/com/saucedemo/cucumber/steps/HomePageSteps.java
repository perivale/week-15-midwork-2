package com.saucedemo.cucumber.steps;

import com.saucedemo.pages.Homepage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePageSteps {
    @Given("^I am on saucedemo page$")
    public void iAmOnSaucedemoPage() {
    }

    @When("^I login with credential username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iLoginWithCredentialUsernameAndPassword(String username, String password) {
        new Homepage().enteruserName(username);
        new Homepage().enterPasswordFiled(password);
    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() {
        new Homepage().clickOnloginButton();
    }
}
