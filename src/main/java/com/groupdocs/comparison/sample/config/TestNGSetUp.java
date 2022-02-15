package com.groupdocs.comparison.sample.config;

import com.groupdocs.comparison.sample.TestRunner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;
import java.nio.file.Path;

public abstract class TestNGSetUp {
    private String mClassName = null;
    private String mMethodName = null;

    @BeforeMethod
    public void runBeforeEachTest(Method method) {
        mClassName = method.getDeclaringClass().getSimpleName();
        mMethodName = method.getName();
    }

    @AfterMethod
    public void runAfterEachTests() {
    }

    protected Path getOutputPath(String extension) {
        if (extension == null || !extension.startsWith(".")) {
            throw new IllegalArgumentException("extension must starts with . but was " + extension);
        }
        return TestRunner.getOutputPath(mClassName + "-" + mMethodName + extension);
    }
}
