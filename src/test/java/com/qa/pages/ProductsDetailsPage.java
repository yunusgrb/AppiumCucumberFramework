package com.qa.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.DriverManager;

public class ProductsDetailsPage extends BasePage{

    public ProductsDetailsPage() {
        this.driver = new DriverManager().getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }

    @AndroidFindBy (xpath = "(//android.view.ViewGroup[@content-desc=\"test-Description\"]/android.widget.TextView)[1]")
            private WebElement product1DetailTitle;

    @AndroidFindBy (xpath = "(//android.view.ViewGroup[@content-desc=\"test-Description\"]/android.widget.TextView)[2]")
    private WebElement product1DetailDesc;

    @AndroidFindBy (xpath = "//android.widget.TextView[@content-desc=\"test-Price\"]")
    private WebElement product1DetailPrice;
    WebElement myElement;
    public void findAndEqualsText(String strElement, String text){
        switch (strElement)
        {
            case "product1DetailTitle" : myElement =product1DetailTitle; break;
            case "product1DetailPrice" : myElement =product1DetailPrice; break;


        }
        //andScrollToElementUsingUiScrollable("text",text);
        verifyEqualsText(myElement,text);
    }
    public void findAndContainsText(String strElement, String text){
        switch (strElement)
        {
            case "product1DetailDesc" : myElement =product1DetailDesc; break;

        }
       // andScrollToElementUsingUiScrollable("text",text);
        verifyContainsText(myElement,text);
    }


}
