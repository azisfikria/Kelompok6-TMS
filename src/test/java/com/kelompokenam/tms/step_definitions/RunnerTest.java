package com.kelompokenam.tms.step_definitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
        features = {"src/main/resources/features/01.Login.feature",
                //"src/main/resources/features/02.TambahDivisi.feature",
                //"src/main/resources/features/03.ManagemenDivisi.feature",
                "src/main/resources/features/04.ParameterShifting.feature"},
        glue = "com.kelompokenam.tms.step_definitions",
        plugin = {"pretty","html:target/cucumber-reports.html","json:target/cucumber.json"})
public class RunnerTest extends AbstractTestNGCucumberTests {

}
