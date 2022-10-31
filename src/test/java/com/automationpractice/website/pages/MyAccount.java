package com.automationpractice.website.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends BasePage{

    @FindBy(xpath = "//*[text()='Sign out']")
    private WebElement logoutButton;

//  //*[@id="header"]/div[2]/div/div/nav/div[2]/a

    @FindBy(xpath = "//*[@class='account']")
    private WebElement myAccountProfile;

    @FindBy(xpath = "//*[@class='lnk_wishlist']")
    private WebElement wishlistButton;

    public WebElement getWishlistButton() {
        return wishlistButton;
    }

    public Authentication clickOnLogoutButton(){
        logoutButton.click();
        return new Authentication();
    }

    public WebElement getMyAccountProfile() {
        return myAccountProfile;
    }

    public WebElement getLogoutButton() {
        return logoutButton;
    }
}
