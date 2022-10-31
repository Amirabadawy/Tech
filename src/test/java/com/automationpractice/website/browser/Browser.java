package com.automationpractice.website.browser;

import com.automationpractice.website.automationPracticeWebsite.AutomationPracticeWebsite;
import com.automationpractice.website.driver.DriverHandler;
import org.openqa.selenium.WebDriver;

public class Browser {
    private final WebDriver webDriver = DriverHandler.getWebDriver();

    public AutomationPracticeWebsite automationPractice;

    public Browser(){
        automationPractice = new AutomationPracticeWebsite();
    }
}
