package com.kelompokenam.tms.step_definitions;

import com.kelompokenam.tms.pages.Login;
import com.kelompokenam.tms.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {
    WebDriver driver;
    private static ExtentTest extentTest;

    private Login login = new Login();

    public TestLogin(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    // Login Invalid
    @When("TCC.TMS.058 User go to Web Dika TMS")
    public void user_go_to_Web_Dika_TMS() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User go to Web Dika TMS");

    }
    @And("TCC.TMS.058 User enter username password invalid TMS")
    public void user_enter_username_password_invalid() {
        login.loginInvalid("admin", "d1k4@pass");
        extentTest.log(LogStatus.PASS, "User enter username password invalid");
    }

    @And("TCC.TMS.058 User click button login invalid TMS")
    public void user_click_button_login_invalid() {
        login.btnLoginInvalid();
        extentTest.log(LogStatus.PASS, "User click button login invalid");
    }

    @Then("TCC.TMS.058 User invalid credentials TMS")
    public void user_invalid_credentials() {
        Assert.assertEquals(login.txtWrongUsernameOrPassword(), "DIKA TMS\n" +
                "Login menggunakan NIK & DOB");
        extentTest.log(LogStatus.PASS, "User valid credentials");
    }

    // Login Valid
    @When("TCC.TMS.059 User enter username password valid TMS")
    public void user_enter_username_password_valid() {
        login.loginValid("admin_tms", "d1k4@passw0rd");
        extentTest.log(LogStatus.PASS, "User enter username password valid");
    }

    @And("TCC.TMS.059 User click button login valid TMS")
    public void user_click_button_login_valid() {
        login.btnLoginValid();
        extentTest.log(LogStatus.PASS, "User click button login valid");
    }

    @Then("TCC.TMS.059 User valid credentials TMS")
    public void user_valid_credentials() {
        Assert.assertEquals(login.getTxtRequired(), "Dashboard Admin TMS 7");
        extentTest.log(LogStatus.PASS, "User valid credentials");
    }
}