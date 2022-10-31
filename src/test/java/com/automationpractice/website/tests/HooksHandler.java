package com.automationpractice.website.tests;

import com.automationpractice.website.driver.DriverHandler;
import io.cucumber.java.Before;

public class HooksHandler extends BaseTest{
    @Before
    public void setUp(){
        driverHandler = new DriverHandler();
        driverHandler.navigate();
    }

//    @After
//    public void tearDown(){
//        driverHandler.close();
//    }
}
