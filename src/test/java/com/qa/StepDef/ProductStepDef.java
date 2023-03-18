package com.qa.StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductStepDef {

    @Given("I'm logged in")
    public void iMLoggedIn() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("The product is listed with title {string} and price {string}")
    public void theProductIsListedWithTitleAndPrice(String title, String price) {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("I click product title {string}")
    public void iClickProductTitle(String title) {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("The product is listed with title {string} and price {string} and description {string}")
    public void theProductIsListedWithTitleAndPriceAndDescription(String title, String price, String description) {
        // Write code here that turns the phrase above into concrete actions

    }




}
