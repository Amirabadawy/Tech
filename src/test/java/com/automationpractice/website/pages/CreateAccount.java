package com.automationpractice.website.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccount extends BasePage{

    @FindBy(id="customer_firstname")
    private WebElement firstNameBox;

    @FindBy(id="customer_lastname")
    private WebElement lastNameBox;

    @FindBy(id="passwd")
    private WebElement passwordBox;

    @FindBy(id="uniform-id_gender2")
    private WebElement femaleGenderRadioButton;

    @FindBy(xpath = "//*[@id='days']/option[8]")
    private WebElement daysDropDownList;

    @FindBy(xpath = "//*[@id='months']/option[8]")
    private WebElement monthsDropDownList;

    @FindBy(xpath = "//*[@id='years']/option[8]")
    private WebElement yearsDropDownList;

    @FindBy(id="address1")
    private WebElement addressBox;

    @FindBy(id="city")
    private WebElement cityBox;

    @FindBy(xpath = "//*[@id='id_state']/option[8]")
    private WebElement stateDropDownList;

    @FindBy(xpath = "//*[@id='id_country']/option[0]")
    private WebElement countryDropDownList;

    @FindBy(id="postcode")
    private WebElement postcodeBox;

    @FindBy(id="phone_mobile")
    private WebElement phoneMobileBox;

    @FindBy(id="alias")
    private WebElement addressAliasBox;

    @FindBy(id="submitAccount")
    private WebElement registerButton;


    public WebElement getFirstNameBox() {
        return firstNameBox;
    }

    public WebElement getAddressBox() {
        return addressBox;
    }

    public WebElement getPhoneMobileBox() {
        return phoneMobileBox;
    }

    public void typeOnFirstNameBox(String firstNameText){
        firstNameBox.sendKeys(firstNameText);
    }

    public void typeOnLastNameBox(String lastNameText){
        lastNameBox.sendKeys(lastNameText);
    }

    public void typeOnPasswordBox(String passwordText){
        passwordBox.sendKeys(passwordText);
    }

    public void clickOnFemaleGenderRadioButton(){
        femaleGenderRadioButton.click();
    }

    public void clickOnDaysDropDownList(){
        daysDropDownList.click();
    }

    public void clickOnMonthsDropDownList(){
      monthsDropDownList.click();
    }

    public void clickOnYearsDropDownList(){
        yearsDropDownList.click();
    }

    public void typeOnAddressBox(String addressText){
        addressBox.sendKeys(addressText);
    }

    public void typeOnCityBox(String cityText){
        cityBox.sendKeys(cityText);
    }

    public void clickOnStateDropDownList(){
        stateDropDownList.click();
    }

    public void clickOnCountryDropDownList(){
       countryDropDownList.click();
    }

    public void typeOnPostcodeBox(String postcodeText){
        postcodeBox.sendKeys(postcodeText);
    }

    public void typeOnPhoneMobileBox(String phoneMobileText){
        phoneMobileBox.sendKeys(phoneMobileText);
    }

    public void typeOnAddressAliasBox(String addressAliasText){
        addressAliasBox.sendKeys( addressAliasText);
    }

    public MyAccount clickOnRegisterButton(){
        registerButton.click();
        return new MyAccount();
    }







}
