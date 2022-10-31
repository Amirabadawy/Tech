package com.automationpractice.website.tests.registration;

import com.automationpractice.website.browser.Browser;
import com.automationpractice.website.pages.BasePage;
import com.automationpractice.website.tests.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegistrationTestStepDef extends BaseTest {

    @Given("website is opened")
    public void websiteIsOpened() {
        browser = new Browser();
        BasePage.waitUntilPageLoaded();
    }

    @When("click on sign in button in home page")
    public void clickOnSignInButtonInHomePage(){
        browser.automationPractice.authentication = browser.automationPractice.home.clickOnSignInButton();
    }

    @When("type email {string} in Authentication page")
    public void typeEmailInAuthenticationPage(String email){
        browser.automationPractice.authentication.scrollTo(browser.automationPractice.authentication.getEmailBox());
        browser.automationPractice.authentication.typeOnEmailBox(email);
    }

    @When("click on create an account button in Authentication page")
    public void clickOnSignInButtonInAuthenticationPage(){
        browser.automationPractice.createAccount = browser.automationPractice.authentication.clickOnCreateAccountButton();
    }

    @When("type first name {string} in create account page")
    public void typeFirstNameInCreateAccountPage(String firstName){
        browser.automationPractice.createAccount.waitUntilElementIsVisible(browser.automationPractice.createAccount.getFirstNameBox());
        browser.automationPractice.createAccount.typeOnFirstNameBox(firstName);
    }

    @When("type last name {string} in create account page")
    public void typeLastNameInCreateAccountPage(String lastName){
        browser.automationPractice.createAccount.typeOnLastNameBox(lastName);
    }

    @When("type password {string} in create account page")
    public void typePasswordInCreateAccountPage(String password){
        browser.automationPractice.createAccount.typeOnPasswordBox(password);
    }

    @When("choose title in create account page")
    public void chooseTitleInCreateAccountPage(){
        browser.automationPractice.createAccount.clickOnFemaleGenderRadioButton();
    }

    @When("select day of birth in create account page")
    public void selectDayOfBirthInCreateAccountPage(){
        browser.automationPractice.createAccount.clickOnDaysDropDownList();
    }

    @When("select month of birth in create account page")
    public void selectMonthOfBirthInCreateAccountPage(){
        browser.automationPractice.createAccount.clickOnMonthsDropDownList();
    }

    @When("select year of birth in create account page")
    public void selectYearOfBirthInCreateAccountPage(){
        browser.automationPractice.createAccount.clickOnYearsDropDownList();
    }

    @When("type address {string} in create account page")
    public void typeAddressInCreateAccountPage(String companyAddress){
        browser.automationPractice.createAccount.scrollTo(browser.automationPractice.createAccount.getAddressBox());
        browser.automationPractice.createAccount.typeOnAddressBox(companyAddress);
    }

    @When("type city {string} in create account page")
    public void typeCityInCreateAccountPage(String city){
        browser.automationPractice.createAccount.typeOnCityBox(city);
    }

    @When("select state in create account page")
    public void selectStateInCreateAccountPage(){
        browser.automationPractice.createAccount.clickOnStateDropDownList();
    }

    @When("type postal code {string} in create account page")
    public void typePostalCodeInCreateAccountPage(String postalCode){
        browser.automationPractice.createAccount.typeOnPostcodeBox(postalCode);
    }

    @When("select country in create account page")
    public void selectCountryInCreateAccountPage(){
        browser.automationPractice.createAccount.clickOnCountryDropDownList();
    }

    @When("type mobile phone {string} in create account page")
    public void typeMobilePhoneInCreateAccountPage(String mobilePhone){
        browser.automationPractice.createAccount.scrollTo(browser.automationPractice.createAccount.getPhoneMobileBox());
        browser.automationPractice.createAccount.typeOnPhoneMobileBox(mobilePhone);
    }

    @When("type address {string} alias for future reference in create account page")
    public void typeAddressAliasInCreateAccountPage(String address){
        browser.automationPractice.createAccount.typeOnAddressAliasBox(address);
    }

    @When("click on register button in create account page")
    public void clickOnRegisterButtonInCreateAccountPage(){
        browser.automationPractice.myAccount = browser.automationPractice.createAccount.clickOnRegisterButton();
    }

    @When("click on logout button in my account page")
    public void clickOnLogoutButtonInMyAccountPage(){
        browser.automationPractice.authentication = browser.automationPractice.myAccount.clickOnLogoutButton();
    }

    @When("type login email {string} in Authentication page")
    public void typeLoginEmailInAuthenticationPage(String email){
        browser.automationPractice.authentication.typeOnEmailLoginBox(email);
    }

    @When("type password {string} in Authentication page")
    public void typePasswordInAuthenticationPage(String password){
        browser.automationPractice.authentication.typeOnPasswordBox(password);
    }

    @When("click on login button in Authentication page")
    public void clickOnLoginButtonInAuthenticationPage(){
        browser.automationPractice.myAccount = browser.automationPractice.authentication.clickOnLoginButton();
    }

    @Then("account name {string} should be displayed in my account page")
    public void accountNameShouldBeDisplayedInMyAccountPage(String accountName) throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals(browser.automationPractice.myAccount.getMyAccountProfile().getText(),accountName);
    }

    @Then("my wishlists button should be displayed in my account page")
    public void myWishesListButtonShouldBeDisplayedInMyAccountPage() {
        Assert.assertTrue(browser.automationPractice.myAccount.getWishlistButton().isDisplayed());
    }











}
