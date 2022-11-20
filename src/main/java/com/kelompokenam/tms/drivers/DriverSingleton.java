package com.kelompokenam.tms.drivers;

import com.kelompokenam.tms.drivers.strategies.DriverStrategy;
import com.kelompokenam.tms.drivers.strategies.DriverStrategyImplementer;
import com.kelompokenam.tms.utils.Constants;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class DriverSingleton {
    private static DriverSingleton instance = null;
    private static WebDriver driver;

    private DriverSingleton(String driver) {
        instantiate(driver);
    }

    public WebDriver instantiate(String strategy) {
        DriverStrategy driverStrategy = DriverStrategyImplementer.chooseStrategy(strategy);
        driver = driverStrategy.setStrategy();
        driver.manage().timeouts().implicitlyWait(Constants.TIMEOUT, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        return driver;
    }

    public static void getInstance(String driver) {
        if(instance == null) {
            instance = new DriverSingleton(driver);
        }

    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void closeObjectInstance() {
        instance = null;
        driver.quit();
    }

}

