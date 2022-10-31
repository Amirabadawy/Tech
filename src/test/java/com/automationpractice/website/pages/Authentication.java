package com.automationpractice.website.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Authentication extends BasePage{

    @FindBy(id="email_create")
    private WebElement emailBox;

    @FindBy(xpath = "//*[@ class='icon-user left']")
    private WebElement createAccountButton;

    @FindBy(id="email")
    private WebElement emailLoginBox;

    @FindBy(id="passwd")
    private WebElement passwordBox;

    @FindBy(id="SubmitLogin")
    private WebElement loginButton;


    public void typeOnEmailBox(String emailText){
        emailBox.sendKeys(emailText);
    }

    public void typeOnEmailLoginBox(String loginEmail){
        emailLoginBox.sendKeys(loginEmail);
    }

    public void typeOnPasswordBox(String password){
        passwordBox.sendKeys(password);
    }

    public MyAccount clickOnLoginButton(){
        loginButton.click();
        return new MyAccount();
    }

    public CreateAccount clickOnCreateAccountButton(){
        createAccountButton.click();
        return new CreateAccount();
    }
    public WebElement getEmailBox(){
        return emailBox;
    }
}
