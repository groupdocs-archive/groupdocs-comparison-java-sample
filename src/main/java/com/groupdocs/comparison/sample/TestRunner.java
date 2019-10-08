package com.groupdocs.comparison.sample;

import com.groupdocs.comparison.common.license.License;
import com.groupdocs.comparison.sample.operations.CommonOperationsTests;
import com.groupdocs.comparison.sample.operations.DocumentsOperationsTests;
import com.groupdocs.comparison.sample.operations.OtherOperationsTests;
import com.groupdocs.comparison.sample.tasks.CommonIssuesTests;
import org.apache.commons.io.FileUtils;
import org.junit.internal.TextListener;
import org.junit.runner.Computer;
import org.junit.runner.JUnitCore;
import org.junit.runner.Request;
import org.junit.runner.Result;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * The type TestRunner.
 */
public class TestRunner {
    public static String PROJECT_PATH = new File("Data").getAbsolutePath();
    public static String STORAGE_PATH = PROJECT_PATH + "\\Storage";
    public static String OUTPUT_PATH = PROJECT_PATH + "\\Output";
    public static String OUTPUT_HTML_PATH = OUTPUT_PATH + "\\html";
    public static String OUTPUT_PDF_PATH = OUTPUT_PATH + "\\pdf";
    public static String OUTPUT_TXT_PATH = OUTPUT_PATH + "\\txt";
    public static String OUTPUT_CELL_PATH = OUTPUT_PATH + "\\cell";
    public static String LICENSE_PATH = STORAGE_PATH + "\\GroupDocs.Total.Java.lic";

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws Exception the exception
     */
    public static void main(String[] args) throws Exception {
        applyLicense();
        configureLogging();
        cleanOutput();

        // https://www.logicbig.com/tutorials/unit-testing/junit/junit-core.html
        Class<?>[] testClasses = {
                CommonOperationsTests.class,
                DocumentsOperationsTests.class,
                OtherOperationsTests.class,
                CommonIssuesTests.class
        };

        Result result;
        if (args.length == 0) {
            JUnitCore junit = new JUnitCore();
            junit.addListener(new TextListener(System.out));
            result = junit.run(Computer.serial(), testClasses); // ParallelComputer.methods()
        } else {
            final String testName = args[0];
            Class<?> clazz = null;
            for (Class<?> testClass : testClasses) {
                try {
                    final Method testMethod = testClass.getDeclaredMethod(testName);
                    if (testMethod != null) {
                        if (clazz != null) {
                            System.err.println("The test '" + testName + "' CAN NOT be run because there are few classes with the same test name!");
                            System.exit(-1);
                        } else {
                            clazz = testClass;
                        }
                    }
                } catch (NoSuchMethodException e) {
                    // pass
                }
            }
            if (clazz == null) {
                System.err.println("The test '" + testName + "' was not found!");
                System.exit(-2);
            }
            final Request request = Request.method(clazz, testName);
            JUnitCore junit = new JUnitCore();
            junit.addListener(new TextListener(System.out));
            result = junit.run(request);
        }

        final int runCount = result.getRunCount();
        final int failureCount = result.getFailureCount();
        final int ignoreCount = result.getIgnoreCount();
        System.out.println(String.format("\n===== RUN: %d, SUCCESS: %d, FAIL: %d, IGNORE: %d =====\n", runCount, (runCount - failureCount - ignoreCount), failureCount, ignoreCount));

        System.exit(failureCount);
    }

    private static void configureLogging() {
        // Logging
//        ComparisonLogger.setLogger(new ConsoleLogger(LoggingLevel.Info));
//        LogUtils.setConsoleEnabled(true);
//        LogUtils.setEnableShowSkipped(true);
    }

    public static void applyLicense() {
        License lic = new License();
        if (LICENSE_PATH != null && new File(LICENSE_PATH).exists()) {
            System.out.println("Using license: " + LICENSE_PATH);
            lic.setLicense(LICENSE_PATH);
            System.out.println("License is valid: " + License.isValidLicense());
        }
    }

    /**
     * Set product's license
     */
    public static void unsetLicense() {
        License lic = new License();
        try {
            lic.setLicense((String) null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void cleanOutput() throws IOException {
        FileUtils.cleanDirectory(new File(OUTPUT_PATH));
    }

    public static String getStoragePath(String fileName, String... subDirectories) {
        StringBuilder builder = new StringBuilder(STORAGE_PATH);
        for (String part : subDirectories) {
            builder.append(File.separator).append(part);
        }
        return builder.append(File.separator).append(fileName).toString();
    }

    public static String getOutputPath(String fileName) {
        return OUTPUT_PATH + File.separator + fileName;
    }

    static {
        final File sp = new File(STORAGE_PATH);
        final File op = new File(OUTPUT_PATH);
        final File ip = new File(OUTPUT_PATH);
        final File ohp = new File(OUTPUT_HTML_PATH);
        final File opp = new File(OUTPUT_PDF_PATH);
        final File otp = new File(OUTPUT_TXT_PATH);
        final File ocp = new File(OUTPUT_CELL_PATH);
        final File lcp = new File(LICENSE_PATH);
        if (!lcp.exists()) {
            LICENSE_PATH = System.getenv("GROUPDOCS_TOTAL");
            System.out.println("License file does not exists! Using license from %GROUPDOCS_VIEWER% ...");
        }
        if (
                (!sp.exists() && !sp.mkdirs()) ||
                        (!op.exists() && !op.mkdirs()) ||
                        (!ip.exists() && !ip.mkdirs()) ||
                        (!ohp.exists() && !ohp.mkdirs()) ||
                        (!opp.exists() && !opp.mkdirs()) ||
                        (!otp.exists() && !otp.mkdirs()) ||
                        (!ocp.exists() && !ocp.mkdirs())
        ) {
            System.err.println("Can't create data directories!!!");
        }
    }
}
