package com.qa.StepDef;

import com.qa.pages.LoginPage;
import com.qa.pages.ProductPage;
import com.qa.pages.ProductsDetailsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductStepDef {
    LoginPage lp = new LoginPage();
    ProductPage productPage = new ProductPage();
    ProductsDetailsPage productsDetailsPage = new ProductsDetailsPage();

    @Given("I'm logged in")
    public void iMLoggedIn() {
        lp.findAndSend("userNameTxt","standard_user");
        lp.findAndSend("passwordTxt", "secret_sauce");
        lp.findAndClick("loginBtn");

    }
    @Then("The product is listed with title {string} and price {string}")
    public void theProductIsListedWithTitleAndPrice(String title, String price) {
        productPage.findAndEqualsText("productTitle",title);
        productPage.findAndEqualsText("productPrice",price);

    }
    @When("I click product title {string}")
    public void iClickProductTitle(String title) {
    productPage.findAndClick(title);

    }
    @Then("The product is listed with title {string} and price {string} and description {string}")
    public void theProductIsListedWithTitleAndPriceAndDescription(String title, String price, String description) {
        productsDetailsPage.findAndEqualsText("product1DetailTitle",title);
        productsDetailsPage.findAndContainsText("product1DetailDesc",description);
        productsDetailsPage.findAndEqualsText("product1DetailPrice",price);


    }




}
