package com.automationpractice.website.automationPracticeWebsite;

import com.automationpractice.website.pages.*;

public class AutomationPracticeWebsite {
    public Home home;
    public Authentication authentication;
    public CreateAccount createAccount;
    public SummerDresses summerDresses;
    public MyAccount myAccount;

    public AutomationPracticeWebsite(){
        home = new Home();
    }
}
