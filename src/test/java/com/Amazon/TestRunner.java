package com.Amazon;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="./cucumber/Amazon.feature",
glue="com.Amazon")
public class TestRunner {

}
