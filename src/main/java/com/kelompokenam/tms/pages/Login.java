package com.kelompokenam.tms.pages;

import com.kelompokenam.tms.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Login {
    private WebDriver driver;

    //Rizki
    //User D6201031
    //Pass 1994-10-02

    public Login() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
}
