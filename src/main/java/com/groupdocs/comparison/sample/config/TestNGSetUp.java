package com.groupdocs.comparison.sample.config;

import com.groupdocs.comparison.sample.TestRunner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.nio.file.Paths;

public abstract class TestNGSetUp {
    private String mClassName = null;
    private String mMethodName = null;
    private String mFilesDorectoryName = null;

    @BeforeMethod
    public void runBeforeEachTest(Method method) {
        mClassName = method.getDeclaringClass().getSimpleName();
        mMethodName = method.getName();
        mFilesDorectoryName = (mMethodName.startsWith("test") ? mMethodName.substring(4) : mMethodName);
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

    protected Path getStoragePathByTestName(String fileName) {
        return getStoragePathByTestName(fileName, null);
    }

    protected Path getStoragePathByTestName(String fileName, String subFolder) {
        if (fileName == null) {
            throw new IllegalArgumentException("fileName must not be null");
        }
        Path resultPath = Paths.get(TestRunner.STORAGE_PATH + File.separator + mFilesDorectoryName);
        if (subFolder != null) {
            resultPath = resultPath.resolve(subFolder);
        }
        return resultPath.resolve(fileName);
    }
}
