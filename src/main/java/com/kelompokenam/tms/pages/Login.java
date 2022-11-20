package com.kelompokenam.tms.pages;

import com.kelompokenam.tms.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.URL;

public class Login {
    private WebDriver driver;

    //Rizki
    //User admin_tms
    //Pass d1k4@passw0rd

    public Login() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //Invalid Login
    @FindBy(name = "username")
    WebElement usernameInvalid;

    @FindBy(name = "password")
    WebElement passwordInvalid;

    @FindBy(xpath = "//body/div[@id='page-container']/div[1]/div[1]")
    WebElement btnLoginInvalid;

    @FindBy(xpath = "//*[@id=\"page-container\"]/div/div[1]")
    WebElement txtWrongUsernameOrPassword;


    //Valid Login
    @FindBy(name = "username")
    WebElement usernameValid;

    @FindBy(name = "password")
    WebElement passwordValid;

    @FindBy(xpath = "//body/div[@id='page-container']/div[1]/div[2]/form[1]/div[3]")
    WebElement btnLoginValid;
    @FindBy(xpath = "//*[@id=\"page-wrapper\"]/div/div[1]/div/h1")
    WebElement txtRequired;

    public void loginInvalid(String username, String password) {
        this.usernameInvalid.sendKeys(username);
        this.passwordInvalid.sendKeys(password);
    }

    public void btnLoginInvalid() {
        btnLoginInvalid.click();
    }

    public String txtWrongUsernameOrPassword() {
        return txtWrongUsernameOrPassword.getText();
    }


    public void loginValid(String username, String password) {
        driver.navigate().refresh();
        this.usernameValid.sendKeys(username);
        this.passwordValid.sendKeys(password);

    }

    public void btnLoginValid() {
        btnLoginValid.click();

    }

    public String getTxtRequired() {
        return txtRequired.getText();
    }

}
