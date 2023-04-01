package com.qa.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.DriverManager;

public class ProductPage extends BasePage{

    public ProductPage() {
        this.driver = new DriverManager().getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }

    @AndroidFindBy (xpath = "//android.widget.TextView[@text=\"Sauce Labs Bolt T-Shirt\"]")
    private WebElement productTitle;

    @AndroidFindBy (xpath = "//android.widget.TextView[@text=\"Sauce Labs Backpack\"]")
    private WebElement product1Title;

    @AndroidFindBy (xpath = "//android.widget.TextView[@text=\"$15.99\"]")
    private WebElement productPrice;

    WebElement myElement;


    public void findAndEqualsText(String strElement, String text){
        switch (strElement)
        {
            case "productTitle" : myElement =productTitle; break;
            case "productPrice" : myElement =productPrice; break;

        }
        andScrollToElementUsingUiScrollable("text",text);
        verifyEqualsText(myElement,text);


    }
    public void findAndClick(String strElement){
        switch (strElement)
        {
            case "Sauce Labs Backpack" : myElement =product1Title; break;
            case "Sauce Labs Bolt T-Shirt" : myElement =productTitle; break;

        }

        click(myElement);
    }

}
