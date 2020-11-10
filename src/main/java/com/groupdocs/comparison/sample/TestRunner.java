package com.groupdocs.comparison.sample;

import com.groupdocs.comparison.license.License;
import com.groupdocs.comparison.sample.common.AccessibleTests;
import com.groupdocs.comparison.sample.common.FileFormatTests;
import com.groupdocs.comparison.sample.operations.CommonOperationsTests;
import com.groupdocs.comparison.sample.operations.DocumentsOperationsTests;
import com.groupdocs.comparison.sample.operations.OtherOperationsTests;
import com.groupdocs.comparison.sample.tasks.CommonIssuesTests;
import org.apache.commons.io.FileUtils;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlInclude;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

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

        final List<Class<?>> testClasses = Arrays.asList(
                AccessibleTests.class,
                FileFormatTests.class,
                CommonOperationsTests.class,
                DocumentsOperationsTests.class,
                OtherOperationsTests.class,
                CommonIssuesTests.class
        );

        TestNG testNG = new TestNG();
        XmlSuite suite = new XmlSuite();
        testNG.setDefaultSuiteName("groupdocs-comparison-java-sample");
        testNG.addListener(new CustomTestListener());

        for (Class<?> clazz : testClasses) {
            XmlTest test = new XmlTest(suite);
            if (args.length == 0) {
                final XmlClass xmlClass = new XmlClass(clazz);
                test.setName(clazz.getCanonicalName());
                test.getXmlClasses().add(xmlClass);
            } else if (args.length == 1) {
                try {
                    clazz.getDeclaredMethod(args[0]);
                    test.setName(args[0]);
                    final XmlClass xmlClass = new XmlClass(clazz);
                    xmlClass.setIncludedMethods(Collections.singletonList(new XmlInclude(args[0])));
                    test.getXmlClasses().add(xmlClass);

                    break;
                } catch (NoSuchMethodException e) {
                    // continue;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                System.err.println("Sample supports running all tests (no command line arguments) or one test (one command line argument)");
                System.exit(2);
            }
        }

        testNG.setXmlSuites(Collections.singletonList(suite));
        testNG.run();

        if (testNG.hasFailure()) {
            System.exit(1);
        }
    }

    private static void configureLogging() {
        // Logging
    }

    public static void applyLicense() {
        License lic = new License();
        if (LICENSE_PATH != null && new File(LICENSE_PATH).exists()) {
            System.out.println("Using license: " + LICENSE_PATH);
            lic.setLicense(LICENSE_PATH);
//            System.out.println("License is valid: " + License.isValidLicense());
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

    public static Path getStoragePath(String fileName, String... subDirectories) {
        StringBuilder builder = new StringBuilder(STORAGE_PATH);
        for (String part : subDirectories) {
            builder.append(File.separator).append(part);
        }
        return Paths.get(builder.append(File.separator).append(fileName).toString());
    }

    public static Path getOutputPath(String fileName) {
        return Paths.get(OUTPUT_PATH + File.separator + fileName);
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

    private static class CustomTestListener implements ITestListener {
        @Override
        public void onTestStart(ITestResult result) {
            System.out.println("=====================================================");
            System.out.println("Running test: " + result.getMethod().getMethodName() + " at " + new Date().toString());
        }

        @Override
        public void onTestSuccess(ITestResult result) {

        }

        @Override
        public void onTestFailure(ITestResult result) {

        }

        @Override
        public void onTestSkipped(ITestResult result) {

        }

        @Override
        public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

        }

        @Override
        public void onStart(ITestContext context) {

        }

        @Override
        public void onFinish(ITestContext context) {

        }
    }
}
