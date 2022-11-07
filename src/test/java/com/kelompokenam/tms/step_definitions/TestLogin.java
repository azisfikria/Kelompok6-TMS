package com.kelompokenam.tms.step_definitions;

import com.kelompokenam.tms.pages.Login;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;

public class TestLogin {
    WebDriver driver;
    private static ExtentTest extentTest;

    private Login login = new Login();

    public TestLogin(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

}
