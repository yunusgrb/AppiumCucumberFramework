package com.qa.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.DriverManager;
import utils.TestUtils;

public class LoginPage extends BasePage{


    public LoginPage() {
        this.driver = new DriverManager().getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }
    @AndroidFindBy (accessibility = "test-Username")
    private WebElement userNameTxt;

    @AndroidFindBy (accessibility = "test-Password")
    private WebElement passwordTxt;

    @AndroidFindBy (accessibility = "test-LOGIN")
    private WebElement loginBtn;

    @AndroidFindBy (accessibility = "test-Error message")
    private WebElement errTxt;


    WebElement myElement;

    public void findAndSend(String strElement, String value){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "userNameTxt" : myElement =userNameTxt; break;
            case "passwordTxt" : myElement =passwordTxt; break;

        }
        clear(myElement);
        sendKeys(myElement, value);
    }

    public void findAndClick(String strElement){
        switch (strElement)
        {
            case "loginBtn" : myElement =loginBtn; break;

        }

        click(myElement);
    }

    public void findAndContainsText(String strElement, String text){
        switch (strElement)
        {
            case "errTxt" : myElement =errTxt; break;

        }

        getText(myElement,text);
    }


}
