package com.qa.StepDef;

import com.qa.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {

    LoginPage lp = new LoginPage();

        @When("I enter user name as {string}")
        public void iEnterUserNameAs(String username) {
            lp.findAndSend("userNameTxt",username);

        }
        @When("I enter password as {string}")
        public void iEnterPasswordAs(String password) {
           lp.findAndSend("passwordTxt", password);

        }
        @When("I login")
        public void iLogin() {
            lp.findAndClick("loginBtn");

        }
        @Then("Login should fail an error {string}")
        public void loginShouldFailAnError(String err) {
            lp.findAndContainsText("errTxt",err);

        }
    @Then("I should see Products page with title {string}")
    public void iShouldSeeProductsPageWithTitle(String title) {
        // Write code here that turns the phrase above into concrete actions

    }


}

