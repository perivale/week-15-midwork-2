$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("purchase.feature");
formatter.feature({
  "line": 1,
  "name": "Search functionality",
  "description": "As a user I want to purchase cheapest and costliest product from the saucedemo after sorting the products by Hight to Low filter.",
  "id": "search-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6088918400,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User navigates saucedemo page and complete the item purchas",
  "description": "",
  "id": "search-functionality;user-navigates-saucedemo-page-and-complete-the-item-purchas",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on saucedemo page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I login with credential username \"standard_user\" and password \"secret_sauce\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I filter the products by \"Price (high to low)\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I select cheapest \u0026 costliest products and add to basket",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I open shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I go to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter details firstname \"firstName\", lastName \"lastName\" and zipPostalCode \"Zip/PostalCode\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on finish button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I should be able to see message \u0027Thank you for your order\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.iAmOnSaucedemoPage()"
});
formatter.result({
  "duration": 197075900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 34
    },
    {
      "val": "secret_sauce",
      "offset": 63
    }
  ],
  "location": "HomePageSteps.iLoginWithCredentialUsernameAndPassword(String,String)"
});
formatter.result({
  "duration": 360194000,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 231171800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Price (high to low)",
      "offset": 26
    }
  ],
  "location": "ProductPageSteps.iFilterTheProductsBy(String)"
});
formatter.result({
  "duration": 485545600,
  "status": "passed"
});
formatter.match({
  "location": "ProductPageSteps.iSelectCheapestCostliestProductsAndAddToBasket()"
});
formatter.result({
  "duration": 117333000,
  "status": "passed"
});
formatter.match({
  "location": "ProductPageSteps.iOpenShoppingCart()"
});
formatter.result({
  "duration": 111707900,
  "status": "passed"
});
formatter.match({
  "location": "ShopingPageSteps.iGoToCheckout()"
});
formatter.result({
  "duration": 102996000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "firstName",
      "offset": 27
    },
    {
      "val": "lastName",
      "offset": 49
    },
    {
      "val": "Zip/PostalCode",
      "offset": 78
    }
  ],
  "location": "CheckoutPageSteps.iEnterDetailsFirstnameLastNameAndZipPostalCode(String,String,String)"
});
formatter.result({
  "duration": 465894400,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutPageSteps.iClickOnContinueButton()"
});
formatter.result({
  "duration": 116116400,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutPageSteps.iClickOnFinishButton()"
});
formatter.result({
  "duration": 98913700,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutPageSteps.iShouldBeAbleToSeeMessageThankYouForYourOrder()"
});
formatter.result({
  "duration": 50248700,
  "status": "passed"
});
formatter.after({
  "duration": 804580400,
  "status": "passed"
});
});