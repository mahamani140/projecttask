package com.taskmanagement.runner;
import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/main/resources/feature/TaskTestcase.feature",
plugin = {"pretty", "html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport"},
//plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"},

tags= {"@TC_01_Login,@TC_02_Add_Task,@TC_03_Search_Task,@TC_04_Task_Table_Printing"},
glue = {"com.taskmanagement.stepdefinition"},
monochrome = true
)
public class TaskMangementRunner  {
//	@AfterClass
//    public static void teardown() {
//        Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
//        Reporter.setSystemInfo("user", System.getProperty("user.name"));
//        Reporter.setSystemInfo("os", "Mac OSX");
//        Reporter.setTestRunnerOutput("Sample test runner output message");
//
//}
}
	