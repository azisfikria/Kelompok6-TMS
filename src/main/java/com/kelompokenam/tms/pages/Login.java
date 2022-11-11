package com.kelompokenam.tms.pages;

import com.kelompokenam.tms.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    private WebDriver driver;

    public Login() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='NIK']")
    WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnLogin;


}
