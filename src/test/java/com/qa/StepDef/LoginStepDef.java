package com.qa.StepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {

        @When("I enter user name as {string}")
        public void iEnterUserNameAs(String userName) {
            // Write code here that turns the phrase above into concrete actions

        }
        @When("I enter password as {string}")
        public void iEnterPasswordAs(String password) {
            // Write code here that turns the phrase above into concrete actions

        }
        @When("I login")
        public void iLogin() {
            // Write code here that turns the phrase above into concrete actions

        }
        @Then("Login should fail an error {string}")
        public void loginShouldFailAnError(String error) {
            // Write code here that turns the phrase above into concrete actions

        }
    @Then("I should see Products page with title {string}")
    public void iShouldSeeProductsPageWithTitle(String title) {
        // Write code here that turns the phrase above into concrete actions

    }


}

