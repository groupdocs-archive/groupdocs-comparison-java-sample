package com.groupdocs.comparison.sample.config;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestNGSetUp {

    @BeforeMethod
    public void runBeforeEachTest() {
    }

    @AfterMethod
    public void runAfterEachTests() {
    }
}
