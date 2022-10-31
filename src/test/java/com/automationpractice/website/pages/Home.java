package com.automationpractice.website.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends BasePage{

    @FindBy(xpath = "//*[@class='login']")
    private WebElement SignInButton;


    public Authentication clickOnSignInButton(){
        SignInButton.click();
        return new Authentication();
    }



}
