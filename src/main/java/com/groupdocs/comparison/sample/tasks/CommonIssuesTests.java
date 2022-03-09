package com.groupdocs.comparison.sample.tasks;

import com.groupdocs.comparison.Comparer;
import com.groupdocs.comparison.common.exceptions.ComparisonException;
import com.groupdocs.comparison.license.License;
import com.groupdocs.comparison.options.ApplyChangeOptions;
import com.groupdocs.comparison.options.CompareOptions;
import com.groupdocs.comparison.options.load.LoadOptions;
import com.groupdocs.comparison.options.style.DetalisationLevel;
import com.groupdocs.comparison.options.style.StyleSettings;
import com.groupdocs.comparison.result.ChangeInfo;
import com.groupdocs.comparison.result.ChangeType;
import com.groupdocs.comparison.result.ComparisonAction;
import com.groupdocs.comparison.sample.TestRunner;
import com.groupdocs.comparison.sample.config.TestNGSetUp;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.*;

/**
 * @author Aleksey Permyakov
 */
@SuppressWarnings("all")
public class CommonIssuesTests extends TestNGSetUp {
    private static final Logger LOG = LoggerFactory.getLogger(CommonIssuesTests.class);

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA107() throws Exception {
        final String sourceName = "original.pdf", targetName = "updated.pdf", resultExtension = ".pdf";
        final Path sourcePath = getStoragePathByTestName(sourceName);
        final Path targetPath = getStoragePathByTestName(targetName);
        final Path resultPath = getOutputPath(resultExtension);

        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);
            comparer.compare(resultPath);

            LOG.debug("Result file was written as {}", resultPath);
            final long actulalSize = Files.size(resultPath), expectedSize = 39790;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA226() throws Exception {
        final String sourceName = "source.docx", targetName = "target.docx", resultExtension = ".docx";
        final Path sourcePath = getStoragePathByTestName(sourceName);
        final Path targetPath = getStoragePathByTestName(targetName);
        final Path resultPath = getOutputPath(resultExtension);

        try (Comparer comparer = new Comparer(sourcePath);
             ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
            comparer.add(targetPath);
            comparer.compare(outputStream);
            assertTrue(outputStream.size() > 0, "The result stream is empty");
            FileUtils.writeByteArrayToFile(resultPath.toFile(), outputStream.toByteArray());

            LOG.debug("Result file was written as {}", resultPath);
            final long actulalSize = Files.size(resultPath), expectedSizeMin = 10913, expectedSizeMax = 10916;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                    .isGreaterThanOrEqualTo(expectedSizeMin)
                    .isLessThanOrEqualTo(expectedSizeMax);
        }
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA228() throws Exception {
        final String sourceName = "source.docx", targetName1 = "target_1.docx", targetName2 = "target_2.docx", targetName3 = "target_3.docx", resultExtension = ".docx";
        final Path sourcePath = getStoragePathByTestName(sourceName);
        final Path targetPath1 = getStoragePathByTestName(targetName1);
        final Path targetPath2 = getStoragePathByTestName(targetName2);
        final Path targetPath3 = getStoragePathByTestName(targetName3);
        final Path resultPath = getOutputPath(resultExtension);

        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath1, targetPath2, targetPath3);
            comparer.compare(resultPath);

            LOG.debug("Result file was written as {}", resultPath);
            final long actulalSize = Files.size(resultPath), expectedSizeMin = 10994, expectedSizeMax = 10999;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                    .isGreaterThanOrEqualTo(expectedSizeMin)
                    .isLessThanOrEqualTo(expectedSizeMax);
        }
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA252() throws Exception {
        final String sourceName = "source.pptx", targetName = "target.pptx", resultExtension = ".ppt";
        final Path sourcePath = getStoragePathByTestName(sourceName);
        final Path targetPath = getStoragePathByTestName(targetName);
        final Path resultPath = getOutputPath(resultExtension);

        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);
            comparer.compare(resultPath);

            LOG.debug("Result file was written as {}", resultPath);
            final long actulalSize = Files.size(resultPath), expectedSizeMin = 87605, expectedSizeMax = 87622;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                    .isGreaterThanOrEqualTo(expectedSizeMin)
                    .isLessThanOrEqualTo(expectedSizeMax);
        }
    }

    /**
     * Check wheather the license is valid
     */
    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA247() throws Exception {
//        unsetLicense();
//        assertFalse(License.isValidLicense());
//        applyLicense();
//        assertTrue(License.isValidLicense());
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA419() throws Exception {
        {
            final String sourceName = "source-highlights.rtf", targetName = "target-highlights.rtf", resultExtension = ".rtf";
            final Path sourcePath = getStoragePathByTestName(sourceName);
            final Path targetPath = getStoragePathByTestName(targetName);
            final Path resultPath = getOutputPath(resultExtension);

            try (Comparer comparer = new Comparer(sourcePath)) {
                comparer.add(targetPath);
                comparer.compare(resultPath, new CompareOptions.Builder()
                        .setDetectStyleChanges(true)
                        .setGenerateSummaryPage(true)
                        .build());

                LOG.debug("Result file was written as {}", resultPath);
                final ChangeInfo[] changes = comparer.getChanges();
                LOG.debug("Finished comparing with {} changes.", changes.length);
                assertThat(changes)
                        .isNotNull()
                        .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                        .hasSize(2);
            }
        }
        {
            final String sourceName = "source-not-highlights.rtf", targetName = "target-not-highlights.rtf", resultExtension = ".rtf";
            final Path sourcePath = getStoragePathByTestName(sourceName);
            final Path targetPath = getStoragePathByTestName(targetName);
            final Path resultPath = getOutputPath(resultExtension); /* Create instance of GroupDocs.Comparison.Comparer and call method */

            try (Comparer comparer = new Comparer(sourcePath)) {
                comparer.add(targetPath);
                comparer.compare(resultPath, new CompareOptions.Builder()
                        .setDetectStyleChanges(true)
                        .setGenerateSummaryPage(true)
                        .build());

                LOG.debug("Result file was written as {}", resultPath);
                final ChangeInfo[] changes = comparer.getChanges();
                LOG.debug("Finished comparing with {} changes.", changes.length);
                assertThat(changes)
                        .isNotNull()
                        .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                        .hasSize(3);
            }
        }
        {
            final String sourceName = "source-3.rtf", targetName = "target-3.rtf", resultExtension = ".rtf";
            final Path sourcePath = getStoragePathByTestName(sourceName);
            final Path targetPath = getStoragePathByTestName(targetName);
            final Path resultPath = getOutputPath(resultExtension); /* Create instance of GroupDocs.Comparison.Comparer and call method */

            try (Comparer comparer = new Comparer(sourcePath)) {
                comparer.add(targetPath);
                comparer.compare(resultPath, new CompareOptions.Builder()
                        .setDetectStyleChanges(true)
                        .setGenerateSummaryPage(true)
                        .build());

                LOG.debug("Result file was written as {}", resultPath);
                final ChangeInfo[] changes = comparer.getChanges();
                LOG.debug("Finished comparing with {} changes.", changes.length);
                assertThat(changes)
                        .isNotNull()
                        .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                        .hasSize(25);
            }
        }
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA418() throws Exception {
        final String sourceName = "Test.pdf", targetName = "Test_Copy.pdf", resultExtension = ".pdf";
        final Path sourcePath = getStoragePathByTestName(sourceName);
        final Path targetPath = getStoragePathByTestName(targetName);
        final Path resultPath = getOutputPath(resultExtension);

        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);
            comparer.compare(resultPath);

            LOG.debug("Result file was written as {}", resultPath);
            final long actulalSize = Files.size(resultPath), expectedSize = 1465384;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA383() throws Exception {
        final String sourceName = "source.pdf", targetName = "target.pdf", resultExtension = ".pdf";
        final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA383");
        final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA383");
        final Path resultPath = getOutputPath(resultExtension);

        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);
            comparer.compare(resultPath);

            LOG.debug("Result file was written as {}", resultPath);
            final long actulalSize = Files.size(resultPath), expectedSize = 61356;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA381() throws Exception {
        final String sourceName = "source.pdf", targetName = "target.pdf", resultExtension = ".pdf";
        final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA381");
        final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA381");
        final Path resultPath = getOutputPath(resultExtension);

        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);
            comparer.compare(resultPath);

            LOG.debug("Result file was written as {}", resultPath);
            final long actulalSize = Files.size(resultPath), expectedSize = 252642;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA380() throws Exception {
        final String sourceName = "source.pdf", targetName = "target.pdf", resultExtension = ".pdf";
        final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA380");
        final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA380");
        final Path resultPath = getOutputPath(resultExtension);

        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);
            comparer.compare(resultPath);

            LOG.debug("Result file was written as {}", resultPath);
            final long actulalSize = Files.size(resultPath), expectedSize = 509076;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA377() throws Exception {
        if (Boolean.parseBoolean("true")) { // To avoid commenting sources below
            throw new SkipException("Is not fixed yet");
        }
        final String sourceName = "source.html", targetName = "target.html", resultExtension = ".html";
        final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA377");
        final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA377");
        final Path resultPath = getOutputPath(resultExtension);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);
            comparer.compare(resultPath);

            LOG.debug("Result file was written as {}", resultPath);
            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    @Ignore("COMPARISONJAVA-1185")
    public void testCOMPARISONJAVA231() throws Exception {
        final String sourceName = "compara1.pdf", targetName = "compara2.pdf", resultExtension = ".pdf";
        final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA231");
        final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA231");
        final Path resultPath = getOutputPath(resultExtension);
        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             Comparer comparer = new Comparer(sourceStream)) {
            comparer.add(targetStream);
            comparer.compare(resultPath);

            LOG.debug("Result file was written as {}", resultPath);
            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA420() throws Exception {
        final String sourceName = "source.pdf", targetName = "target.pdf", resultExtension = ".pdf";
        final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA420");
        final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA420");
        final Path resultPath = getOutputPath(resultExtension);
        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             Comparer comparer = new Comparer(sourceStream)) {
            comparer.add(targetStream);
            comparer.compare(resultPath, new CompareOptions.Builder()
                    .setDetectStyleChanges(true)
                    .setGenerateSummaryPage(true)
                    .build());

            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(5);

            final long actulalSize = Files.size(resultPath), expectedSize = 165527;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA421() throws Exception {
        final String sourceName = "source.pdf", targetName = "target.pdf", resultExtension = ".pdf";
        final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA421");
        final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA421");
        final Path resultPath = getOutputPath(resultExtension);
        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             Comparer comparer = new Comparer(sourceStream)) {
            comparer.add(targetStream);
            comparer.compare(resultPath);

            LOG.debug("Result file was written as {}", resultPath);
            final long actulalSize = Files.size(resultPath), expectedSize = 61356;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA425() throws Exception {
        final String sourceName = "source.pdf", targetName = "target.pdf", resultExtension = ".pdf";
        final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA425");
        final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA425");
        final Path resultPath = getOutputPath(resultExtension);
        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             Comparer comparer = new Comparer(sourceStream)) {
            comparer.add(targetStream);
            comparer.compare(resultPath, new CompareOptions.Builder()
                    .setDetectStyleChanges(true)
                    .setGenerateSummaryPage(true)
                    .build());

            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(45);

            final long actulalSize = Files.size(resultPath), expectedSize = 209768;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA426() throws Exception {
        final String sourceName = "source.pdf", targetName = "target.pdf", resultExtension = ".pdf";
        final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA426");
        final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA426");
        final Path resultPath = getOutputPath(resultExtension);
        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             Comparer comparer = new Comparer(sourceStream)) {
            comparer.add(targetStream);
            comparer.compare(resultPath, new CompareOptions.Builder()
                    .setDetectStyleChanges(true)
                    .setGenerateSummaryPage(true)
                    .build());

            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(43);

            final long actulalSize = Files.size(resultPath), expectedSize = 117563;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA430() throws Exception {
        final String sourceName = "source.pdf", targetName = "target.pdf", resultExtension = ".pdf";
        final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA430");
        final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA430");
        final Path resultPath = getOutputPath(resultExtension);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);
            comparer.compare(resultPath, new CompareOptions.Builder()
                    .setDetectStyleChanges(true)
                    .setShowDeletedContent(true)
                    .setGenerateSummaryPage(true)
                    .build());

            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(8);

            final long actulalSize = Files.size(resultPath), expectedSize = 40228;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA431() throws Exception {
        final String sourceName = "source.pdf", targetName = "target.pdf", resultExtension = ".pdf";
        final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA431");
        final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA431");
        final Path resultPath = getOutputPath(resultExtension);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);
            comparer.compare(resultPath, new CompareOptions.Builder()
                    .setDetectStyleChanges(true)
                    .setShowDeletedContent(true)
                    .setGenerateSummaryPage(true)
                    .build());

            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(3);

            final long actulalSize = Files.size(resultPath), expectedSize = 35766;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1, timeOut = 200000)
    public void testCOMPARISONJAVA374() throws Exception {
        final String sourceName = "source.pdf", targetName = "target.pdf", resultExtension = ".pdf";
        final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA374");
        final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA374");
        final Path resultPath = getOutputPath(resultExtension);
        final List<Thread> threads = new ArrayList<Thread>();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int n = 0; n < 10; n++) {
            final String threadResultPath = resultPath.toString().replace(".pdf", "-thread-" + n + ".pdf");
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
                         InputStream targetStream = new FileInputStream(targetPath.toFile());
                         Comparer comparer = new Comparer(sourceStream)) {
                        comparer.add(targetStream);
                        comparer.compare(threadResultPath);
                    } catch (Exception e) {
                        LOG.error("Error during comparing documents in parallel threads", e);
                        fail(e.getMessage());
                    }
                    System.out.println("Thread " + Thread.currentThread().getName() + " finished");
                }
            });
        }
        executorService.shutdown();
        if (!executorService.awaitTermination(3, TimeUnit.MINUTES)) {
            Assert.fail("Not all threaded finished correctly!");
        }
    }

    @Test(timeOut = 200000)
    public void testCOMPARISONJAVA374_2() throws Exception {
        final String sourceName = "hot_frog.pdf", targetName = "hot_frog-1.pdf", resultExtension = ".pdf";
        final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA374_2");
        final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA374_2");
        final Path resultPath = getOutputPath(resultExtension);

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int n = 0; n < 5; n++) {
            final String threadResultPath = resultPath.toString().replace(".pdf", "-thread-" + n + ".pdf");
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
                         InputStream targetStream = new FileInputStream(targetPath.toFile());
                         Comparer comparer = new Comparer(sourceStream)) {
                        comparer.add(targetStream);
                        comparer.compare(threadResultPath);
                        assertNotNull(comparer.getChanges());
                    } catch (Exception e) {
                        LOG.error("Error during comparing documents in parallel threads", e);
                        fail(e.getMessage());
                    }
                }
            });
        }
        executorService.shutdown();
        if (!executorService.awaitTermination(3, TimeUnit.MINUTES)) {
            Assert.fail("Not all threaded finished correctly!");
        }
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA373() throws Exception {
        final String sourceName = "karta_izo_parole.docx", targetName = "karta_izo_parole1.docx", resultExtension = ".docx";
        final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA373");
        final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA373");
        final Path resultPath = getOutputPath(resultExtension);
        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new LoadOptions("parole"))) {
            comparer.add(targetStream, new LoadOptions("parole"));
            comparer.compare(resultPath);

            LOG.debug("Result file was written as {}", resultPath);
            final long actulalSize = Files.size(resultPath), expectedSizeMin = 16084, expectedSizeMax = 16146;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                    .isGreaterThanOrEqualTo(expectedSizeMin)
                    .isLessThanOrEqualTo(expectedSizeMax);
        }
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA372() throws Exception {
        final String sourceName = "git_internals.pptx", targetName = "git_internals-1.pptx", resultExtension = ".pptx";
        final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA372");
        final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA372");
        final Path resultPath = getOutputPath(resultExtension);
        try (final Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);
            comparer.compare(resultPath);
            LOG.debug("Result file was written as {}", resultPath);

            final ChangeInfo[] changes = comparer.getChanges();
            for (ChangeInfo change : changes) {
                assertNotNull(change.getPageInfo());
            }

            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(4);

            final long actulalSize = Files.size(resultPath), expectedSizeMin = 163115, expectedSizeMax = 163130;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                    .isGreaterThanOrEqualTo(expectedSizeMin)
                    .isLessThanOrEqualTo(expectedSizeMax);
        }
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA379() throws Exception {
        final String sourceName = "hot_frog.pdf", targetName = "hot_frog-1.pdf", resultExtension = ".pdf";
        final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA379");
        final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA379");
        final Path resultPath = getOutputPath(resultExtension);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(sourcePath, targetPath);
            comparer.compare(resultPath);

            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(28);

            final long actulalSize = Files.size(resultPath), expectedSize = 341145;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA376() throws Exception {
        final String sourceName = "letter.txt", targetName = "letter2.txt", resultExtension = ".txt";
        final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA376");
        final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA376");
        final Path resultPath = getOutputPath(resultExtension);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);
            comparer.compare(resultPath);

            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(296);

            final long actulalSize = Files.size(resultPath), expectedSize = 3128;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA447() throws Exception {
        final String sourceName = "source.pdf", targetName = "target.pdf", resultExtension = ".pdf";
        final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA447");
        final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA447");
        final Path resultPath = getOutputPath(resultExtension);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);
            comparer.compare(resultPath, new CompareOptions.Builder()
                    .setDetectStyleChanges(true)
                    .build());

            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(10);

            final long actulalSize = Files.size(resultPath), expectedSize = 61384;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA78() throws Exception {
        final String sourceName = "source50p.pdf", targetName = "target50p.pdf", resultExtension = ".pdf";
        final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA78");
        final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA78");
        final Path resultPath = getOutputPath(resultExtension);
        for (int n = 0; n < 10; n++) {
            final long before = new Date().getTime();
            try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
                 InputStream targetStream = new FileInputStream(targetPath.toFile());
                 Comparer comparer = new Comparer(sourceStream)) {
                comparer.add(targetStream);
                comparer.compare(resultPath);
                final long after = new Date().getTime();
                final double resultTime = (after - before) / 1000d;
                LOG.debug("Time: {} sec", resultTime);
                assertTrue(resultTime < 10);

                LOG.debug("Result file was written as {}", resultPath);
                final long actulalSize = Files.size(resultPath), expectedSize = 154754;
                assertThat(actulalSize)
                        .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                        .isEqualTo(expectedSize);
            }
        }
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA698() throws Exception {
        final String sourceName = "candy.pdf", targetName = "candy-1.pdf", resultExtension = ".pdf";
        final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA698");
        final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA698");
        final Path outputPath = getOutputPath(resultExtension);
        final Path firstResultPath = Paths.get(outputPath.toString().replace(".pdf", "-first.pdf"));
        final Path secondResultPath = Paths.get(outputPath.toString().replace(".pdf", "-second.pdf"));
        final ChangeInfo[] firstChanges;
        final byte[] firstComparisonData;
        try (
                Comparer comparer = new Comparer(sourcePath);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
            comparer.add(targetPath);
            CompareOptions settings = new CompareOptions.Builder()
                    .setShowDeletedContent(false)
                    .setDetectStyleChanges(true)
                    .setCalculateCoordinates(true)
                    .build();
            comparer.compare(byteArrayOutputStream, settings);
            firstChanges = comparer.getChanges();
            firstComparisonData = byteArrayOutputStream.toByteArray();
        }
        final ChangeInfo[] secondChanges;
        final byte[] secondComparisonData;
        try (Comparer comparer = new Comparer(targetPath);
             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
            comparer.add(sourcePath);
            CompareOptions settings = new CompareOptions.Builder()
                    .setShowDeletedContent(false)
                    .setDetectStyleChanges(true)
                    .setCalculateCoordinates(true)
                    .build();
            comparer.compare(byteArrayOutputStream, settings);
            secondChanges = comparer.getChanges();
            secondComparisonData = byteArrayOutputStream.toByteArray();
        }
        assertNotEquals(firstChanges.length, 0);
        assertNotEquals(secondChanges.length, 0);

        if (Boolean.parseBoolean("true")) { // Not ot comment sources below
            throw new SkipException("Is not fixed yet");
        }
        assertEquals(firstChanges.length, secondChanges.length);
        for (int i = 0; i < firstChanges.length; i++) {
            ChangeInfo change = firstChanges[i];
            LOG.debug("{} - {} - {}", change.getType(), change.getText(), change.getId());
        }
        LOG.debug("------");
        for (int i = 0; i < secondChanges.length; i++) {
            ChangeInfo change = secondChanges[i];
            LOG.debug("{} - {} - {}", change.getType(), change.getText(), change.getId());
        }
        {
            FileUtils.writeByteArrayToFile(firstResultPath.toFile(), firstComparisonData);
            LOG.debug("First result was saved as '{}'", firstResultPath);
            final long actulalSize = Files.size(firstResultPath), expectedSize = 123L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>\n\t(File paths is %s )", expectedSize, actulalSize, firstResultPath)
                    .isEqualTo(expectedSize);
        }
        {
            FileUtils.writeByteArrayToFile(secondResultPath.toFile(), secondComparisonData);
            LOG.debug("Second result was saved as '{}'", secondResultPath);
            final long actulalSize = Files.size(secondResultPath), expectedSize = 123L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>\n\t(File paths is %s )", expectedSize, actulalSize, secondResultPath)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA699() throws Exception {
        final String sourceName = "123.docx", targetName = "123_-_Copy.docx", resultExtension = ".docx";
        final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA699");
        final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA699");
        final Path outputPath = getOutputPath(resultExtension);
        final Path firstResultPath = Paths.get(outputPath.toString().replace(".doc", "-first.doc"));
        final Path secondResultPath = Paths.get(outputPath.toString().replace(".doc", "-second.doc"));
        final List<ChangeInfo> firstChanges;
        final byte[] firstComparisonData;
        try (Comparer comparer = new Comparer(sourcePath);
             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
            comparer.add(targetPath);
            CompareOptions settings = new CompareOptions.Builder()
                    .setShowDeletedContent(false)
                    .setDetectStyleChanges(true)
                    .setCalculateCoordinates(true)
                    .build();
            comparer.compare(byteArrayOutputStream, settings);
            firstChanges = new ArrayList<ChangeInfo>(Arrays.asList(comparer.getChanges()));
            firstComparisonData = byteArrayOutputStream.toByteArray();
        }
        final List<ChangeInfo> secondChanges;
        final byte[] secondComparisonData;
        try (Comparer comparer = new Comparer(targetPath);
             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
            comparer.add(sourcePath);
            CompareOptions settings = new CompareOptions.Builder()
                    .setShowDeletedContent(false)
                    .setDetectStyleChanges(true)
                    .setCalculateCoordinates(true)
                    .build();
            comparer.compare(byteArrayOutputStream, settings);
            secondChanges = new ArrayList<ChangeInfo>(Arrays.asList(comparer.getChanges()));
            secondComparisonData = byteArrayOutputStream.toByteArray();
        }
        assertNotEquals(firstChanges.size(), 0);
        assertNotEquals(secondChanges.size(), 0);
        {
            FileUtils.writeByteArrayToFile(firstResultPath.toFile(), firstComparisonData);
            LOG.debug("First result was saved as '{}'", firstResultPath);
            FileUtils.writeByteArrayToFile(secondResultPath.toFile(), secondComparisonData);
            LOG.debug("Second result was saved as '{}'", secondResultPath);
        }
        // Is must be like here?
//        assertEquals(firstChanges.size(), secondChanges.size());
        // But actually
        assertThat(firstChanges)
                .isNotNull()
                .withFailMessage("Changes count is not as expected:<%d>", firstChanges.size())
                .hasSize(9);
        assertThat(secondChanges)
                .isNotNull()
                .withFailMessage("Changes count is not as expected:<%d>", secondChanges.size())
                .hasSize(6);

        LOG.debug("--- --- SOURCE to TARGET --- ---");
        for (ChangeInfo change : firstChanges) {
            LOG.debug(ChangeType.getName(ChangeType.class, change.getType()) + " - " + change.getId() + " - \"" + change.getText() + "\"");
        }
        LOG.debug("--- --- TARGET to SOURCE --- ---");
        for (ChangeInfo change : secondChanges) {
            LOG.debug(ChangeType.getName(ChangeType.class, change.getType()) + " - " + change.getId() + " - \"" + change.getText() + "\"");
        }
        {
            final long actulalSize = Files.size(firstResultPath), expectedSizeMin = 12578, expectedSizeMax = 12581;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                    .isGreaterThanOrEqualTo(expectedSizeMin)
                    .isLessThanOrEqualTo(expectedSizeMax);
        }
        {
            final long actulalSize = Files.size(secondResultPath), expectedSizeMin = 12495, expectedSizeMax = 12497;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                    .isGreaterThanOrEqualTo(expectedSizeMin)
                    .isLessThanOrEqualTo(expectedSizeMax);
        }
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA459() throws Exception {
        if (Boolean.parseBoolean("true")) { // To avoid commenting sources below
            throw new SkipException("Is not fixed yet");
        }
        final String sourceName = "signature.html", targetName = "viewer.html", resultExtension = ".html";
        final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA459");
        final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA459");
        final Path resultPath = getOutputPath(resultExtension);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);
            comparer.compare(resultPath,
                    new CompareOptions.Builder()
                            .setGenerateSummaryPage(true)
                            .build());
        }
        final long actulalSize = Files.size(resultPath), expectedSize = 123L;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be:<%d> but was:<%d>\n\t(File paths is %s )", expectedSize, actulalSize, resultPath)
                .isEqualTo(expectedSize);
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA375() throws Exception {
        final String sourceName = "hot_frog.pdf", targetName = "hot_frog-1.pdf", resultExtension = ".pdf";
        final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA375");
        final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA375");
        final Path resultPath = getOutputPath(resultExtension);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);
            comparer.compare(resultPath);
        }
        final long actulalSize = Files.size(resultPath), expectedSize = 290603;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be:<%d> but was:<%d>\n\t(File paths is %s )", expectedSize, actulalSize, resultPath)
                .isEqualTo(expectedSize);
    }

    @Test(invocationCount = 1, timeOut = 600000)
    public void testBugInDotNetWithCommentsinHtmlFiles() throws Exception {
        if (Boolean.parseBoolean("true")) { // To avoid commenting sources below
            throw new SkipException("Is not fixed yet");
        }
        final String sourceName = "source-with-comments.html", targetName = "target-with-comments.html", resultExtension = ".html";
        final Path sourcePath = TestRunner.getStoragePath(sourceName);
        final Path targetPath = TestRunner.getStoragePath(targetName);
        final Path resultPath = getOutputPath(resultExtension);
        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             Comparer comparer = new Comparer(sourceStream)) {
            comparer.add(targetStream);
            comparer.compare(resultPath);

            LOG.debug("Result file was written as {}", resultPath);
            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA774() throws Exception {
        final String sourceName = "source.docx", targetName = "target.docx", resultExtension = ".docx";
        final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA774");
        final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA774");
        final Path resultPath = getOutputPath(resultExtension);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);
            comparer.compare(resultPath);
            LOG.debug("Result file was written as {}", resultPath);
            ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(2);
            changes[0].setType(ComparisonAction.REJECT);
            ApplyChangeOptions applyChangeOptions = new ApplyChangeOptions(changes);
            comparer.applyChanges(resultPath, applyChangeOptions);

            final long actulalSize = Files.size(resultPath), expectedSizeMin = 10913, expectedSizeMax = 10916;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                    .isGreaterThanOrEqualTo(expectedSizeMin)
                    .isLessThanOrEqualTo(expectedSizeMax);
        }
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA764() throws Exception {
        final String sourceName = "source.pptx", targetName = "target.pptx", resultExtension = ".pptx";
        final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA764");
        final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA764");
        final Path resultPath = getOutputPath(resultExtension);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);
            comparer.compare(resultPath, new CompareOptions.Builder().setGenerateSummaryPage(true)
                    .setCalculateCoordinates(true).setDetalisationLevel(3)
                    .setDetectStyleChanges(true)
                    .setShowDeletedContent(true)
                    .setSensitivityOfComparison(100)
                    .build());

            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(1);
        }

        final long actulalSize = Files.size(resultPath), expectedSizeMin = 52737, expectedSizeMax = 52755;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                .isGreaterThanOrEqualTo(expectedSizeMin)
                .isLessThanOrEqualTo(expectedSizeMax);
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA867() throws Exception {
        final String sourceName = "left.doc", targetName = "right.doc", resultExtension = ".doc";
        final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA867");
        final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA867");
        final Path resultPath = getOutputPath(resultExtension);

        final boolean validLicense = License.isValidLicense();
        TestRunner.unsetLicense(); // it works correctly with valid license
        LOG.debug("Source file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);
            comparer.compare(resultPath);
        }
        if (validLicense) {
            TestRunner.applyLicense();
        }

        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSize = 147968;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                .isEqualTo(expectedSize);
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA866_pdf() throws Exception {
        final String sourceName = "sample_old{number}.pdf", targetName = "sample_new{number}.pdf", resultExtension = ".pdf";
        final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA866", "pdf");
        final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA866", "pdf");
        final Path resultPath = getOutputPath(resultExtension);
        {
            final String result1 = resultPath.toString().replace(resultExtension, "-1" + resultExtension);
            try (Comparer comparer = new Comparer(sourcePath.toString().replace("{number}", "1"))) {

                comparer.add(targetPath.toString().replace("{number}", "1"));

                CompareOptions compareOptions = new CompareOptions.Builder()
                        .setDeletedItemStyle(new StyleSettings.Builder()
                                .setStrikethrough(true)
                                .setHighlightColor(Color.gray)
                                .build())
                        .setGenerateSummaryPage(true)
                        .setDetalisationLevel(DetalisationLevel.High)
                        .setSensitivityOfComparison(100)
                        .setCalculateCoordinates(true)
                        .build();

                comparer.compare(result1, compareOptions);
            }
            LOG.debug("resultPath1 = {}", result1);
            final long actulalSize = Files.size(Paths.get(result1)), expectedSizeMin = 113280, expectedSizeMax = 113290;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                    .isGreaterThanOrEqualTo(expectedSizeMin)
                    .isLessThanOrEqualTo(expectedSizeMax);
        }
        {
            final String result2 = resultPath.toString().replace(resultExtension, "-2" + resultExtension);
            try (Comparer comparer = new Comparer(sourcePath.toString().replace("{number}", "2"))) {

                comparer.add(targetPath.toString().replace("{number}", "2"));

                CompareOptions compareOptions = new CompareOptions.Builder()
                        .setDeletedItemStyle(new StyleSettings.Builder()
                                .setStrikethrough(true)
                                .setHighlightColor(Color.gray)
                                .build())
                        .setGenerateSummaryPage(true)
                        .setDetalisationLevel(DetalisationLevel.High)
                        .setSensitivityOfComparison(100)
                        .setCalculateCoordinates(true)
                        .build();

                comparer.compare(result2, compareOptions);
            }
            LOG.debug("resultPath2 = {}", result2);
            final long actulalSize = Files.size(Paths.get(result2)), expectedSizeMin = 200243, expectedSizeMax = 200253;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                    .isGreaterThanOrEqualTo(expectedSizeMin)
                    .isLessThanOrEqualTo(expectedSizeMax);
        }
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA866_xlsx() throws Exception {
        final String sourceName = "sample_old{number}.xlsx", targetName = "sample_new{number}.xlsx", resultExtension = ".xlsx";
        final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA866", "xlsx");
        final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA866", "xlsx");
        final Path resultPath = getOutputPath(resultExtension);
        {
            final String result1 = resultPath.toString().replace(resultExtension, "-1-" + resultExtension);
            try (Comparer comparer = new Comparer(sourcePath.toString().replace("{number}", "1"))) {

                comparer.add(targetPath.toString().replace("{number}", "1"));

                CompareOptions compareOptions = new CompareOptions.Builder()
                        .setDeletedItemStyle(new StyleSettings.Builder()
                                .setStrikethrough(true)
                                .setHighlightColor(Color.gray)
                                .build())
                        .setGenerateSummaryPage(true)
                        .setDetalisationLevel(DetalisationLevel.High)
                        .setSensitivityOfComparison(100)
                        .setCalculateCoordinates(true)
                        .build();

                comparer.compare(result1, compareOptions);
            }
            LOG.debug("resultPath1 = {}", result1);
            final long actulalSize = Files.size(Paths.get(result1)), expectedSizeMin = 8908, expectedSizeMax = 8918;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                    .isGreaterThanOrEqualTo(expectedSizeMin)
                    .isLessThanOrEqualTo(expectedSizeMax);
        }
        {
            final String result2 = resultPath.toString().replace(resultExtension, "-2" + resultExtension);
            try (Comparer comparer = new Comparer(sourcePath.toString().replace("{number}", "2"))) {

                comparer.add(targetPath.toString().replace("{number}", "2"));

                CompareOptions compareOptions = new CompareOptions.Builder()
                        .setDeletedItemStyle(new StyleSettings.Builder()
                                .setStrikethrough(true)
                                .setHighlightColor(Color.gray)
                                .build())
                        .setGenerateSummaryPage(true)
                        .setDetalisationLevel(DetalisationLevel.High)
                        .setSensitivityOfComparison(100)
                        .setCalculateCoordinates(true)
                        .build();

                comparer.compare(result2, compareOptions);
            }
            LOG.debug("resultPath1 = {}", result2);
            final long actulalSize = Files.size(Paths.get(result2)), expectedSizeMin = 8839, expectedSizeMax = 8849;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                    .isGreaterThanOrEqualTo(expectedSizeMin)
                    .isLessThanOrEqualTo(expectedSizeMax);
        }
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA872() throws Exception {
        final String sourceName = "Home-Font-Old3.doc", targetName = "Home-Font-New3.doc", resultExtension = ".doc";
        {
            final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA872");
            final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA872");
            final Path resultPath = getOutputPath(resultExtension);

            LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
            try (Comparer comparer = new Comparer(sourcePath)) {
                comparer.add(targetPath);
                comparer.compare(resultPath);
            }
            LOG.debug("Result file was written as {}", resultPath);
            final long actulalSize = Files.size(resultPath), expectedSize = 34304;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
        {
            final Path sourcePath = TestRunner.getStoragePath(sourceName + "x", "COMPARISONJAVA872");
            final Path targetPath = TestRunner.getStoragePath(targetName + "x", "COMPARISONJAVA872");
            final Path resultPath = getOutputPath(resultExtension + "x");

            LOG.debug("Source file: {}\nTarget file: {}", sourcePath, targetPath);
            try (Comparer comparer = new Comparer(sourcePath)) {
                comparer.add(targetPath);
                comparer.compare(resultPath);
            }
            LOG.debug("Result file was written as {}", resultPath);

            final long actulalSize = Files.size(resultPath), expectedSizeMin = 18020, expectedSizeMax = 18022;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                    .isGreaterThanOrEqualTo(expectedSizeMin)
                    .isLessThanOrEqualTo(expectedSizeMax);
        }
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA869() throws Exception {
        final String sourceName = "Image-Pen-Old1.doc", targetName = "Image-Pen-New1.doc", resultExtension = ".doc";
        { // DOC
            final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA869");
            final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA869");
            final Path resultPath = getOutputPath(resultExtension);

            LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
            try (Comparer comparer = new Comparer(sourcePath)) {
                comparer.add(targetPath);

                CompareOptions compareOptions = new CompareOptions();
                compareOptions.setDetectStyleChanges(true);
                compareOptions.setMarkChangedContent(true);
                comparer.compare(resultPath, compareOptions);

                LOG.debug("Result file was written as {}", resultPath);
                final ChangeInfo[] changes = comparer.getChanges();
                LOG.debug("Finished comparing with {} changes.", changes.length);
                assertThat(changes)
                        .isNotNull()
                        .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                        .hasSize(13);
            }

            final long actulalSize = Files.size(resultPath), expectedSize = 32768;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
            // Result content CAN'T contain borders, for doc format changes are marked using different colors
        }
        { // DOCX
            final Path sourcePath = TestRunner.getStoragePath(sourceName + "x", "COMPARISONJAVA869");
            final Path targetPath = TestRunner.getStoragePath(targetName + "x", "COMPARISONJAVA869");
            final Path resultPath = getOutputPath(resultExtension + "x");

            LOG.debug("Source file: {}\nTarget file: {}", sourcePath, targetPath);
            try (Comparer comparer = new Comparer(sourcePath)) {
                comparer.add(targetPath);
                CompareOptions compareOptions = new CompareOptions();
                compareOptions.setMarkChangedContent(true);
                comparer.compare(resultPath, compareOptions);
            }
            LOG.debug("Result file was written as {}", resultPath);
            final long actulalSize = Files.size(resultPath), expectedSizeMin = 26185, expectedSizeMax = 26187;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                    .isGreaterThanOrEqualTo(expectedSizeMin)
                    .isLessThanOrEqualTo(expectedSizeMax);
            // Result document must contain borders around changes
        }
//        fail("Manual check required - https://issue.lisbon.dynabic.com/issues/COMPARISONJAVA-869");
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA870() throws Exception {
        final String sourceName = "Reference-Figures-Old2.doc", targetName = "Reference-Figures-New2.doc", resultExtension = ".doc";
        {
            final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA870");
            final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA870");
            final Path resultPath = getOutputPath(resultExtension);

            LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
            try (Comparer comparer = new Comparer(sourcePath)) {
                comparer.add(targetPath);

                CompareOptions compareOptions = new CompareOptions();
                compareOptions.setSensitivityOfComparison(70);
                comparer.compare(resultPath, compareOptions);
            }
            LOG.debug("Result file was written as {}", resultPath);
            final long actulalSize = Files.size(resultPath), expectedSize = 15872;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
        {
            final Path sourcePath = TestRunner.getStoragePath(sourceName + "x", "COMPARISONJAVA870");
            final Path targetPath = TestRunner.getStoragePath(targetName + "x", "COMPARISONJAVA870");
            final Path resultPath = getOutputPath(resultExtension + "x");

            LOG.debug("Source file: {}\nTarget file: {}", sourcePath, targetPath);
            try (Comparer comparer = new Comparer(sourcePath)) {
                comparer.add(targetPath);

                CompareOptions compareOptions = new CompareOptions();
                compareOptions.setSensitivityOfComparison(70);
                comparer.compare(resultPath, compareOptions);
            }
            LOG.debug("Result file was written as {}", resultPath);
            final long actulalSize = Files.size(resultPath), expectedSizeMin = 13630, expectedSizeMax = 13632;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                    .isGreaterThanOrEqualTo(expectedSizeMin)
                    .isLessThanOrEqualTo(expectedSizeMax);
        }
//        fail("Manual check required - https://issue.lisbon.dynabic.com/issues/COMPARISONJAVA-870");
        // Order of chars must be the same as in source/target files
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA873() throws Exception {
        final String sourceName = "Layout-Arrange-Old3.doc", targetName = "Layout-Arrange-New3.doc", resultExtension = ".xls";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA873");
        final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA873");
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);
            // Must not throw NoClassDefFoundError ..ArchiveStreamFactory
            comparer.compare(resultPath);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSize = 19968;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                .isEqualTo(expectedSize);
//        fail("Manual check required - https://issue.lisbon.dynabic.com/issues/COMPARISONJAVA-873");
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA874() throws Exception {
        final String sourceName = "Reference-Annotation-Old4.docx", targetName = "Reference-Annotation-New4.docx", resultExtension = ".xls";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA874");
        final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA874");
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);
            // Must not throw NoClassDefFoundError ..ArchiveStreamFactory
            comparer.compare(resultPath);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSizeMin = 13412, expectedSizeMax = 13414;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                .isGreaterThanOrEqualTo(expectedSizeMin)
                .isLessThanOrEqualTo(expectedSizeMax);
//        fail("Manual check required - https://issue.lisbon.dynabic.com/issues/COMPARISONJAVA-874");
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA875() throws Exception {
        {
            final String sourceName = "Home-Font-Old2.xls", targetName = "Home-Font-New15.xls", resultExtension = ".xls";
            final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA875");
            final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA875");
            final Path resultPath = getOutputPath(resultExtension);

            LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
            try (Comparer comparer = new Comparer(sourcePath)) {
                comparer.add(targetPath);
                comparer.compare(resultPath);
            }
            LOG.debug("Result file was written as {}", resultPath);
            final long actulalSize = Files.size(resultPath), expectedSizeMin = 7979, expectedSizeMax = 7989;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                    .isGreaterThanOrEqualTo(expectedSizeMin)
                    .isLessThanOrEqualTo(expectedSizeMax);
        }
        {
            final String sourceName = "Home-Font-Old4 - fillcolor.xls", targetName = "Home-Font-New17 - fillcolor.xls", resultExtension = ".xls";
            final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA875");
            final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA875");
            final Path resultPath = getOutputPath(resultExtension);

            LOG.debug("Source file: {}\nTarget file: {}", sourcePath, targetPath);
            try (Comparer comparer = new Comparer(sourcePath)) {
                comparer.add(targetPath);
                comparer.compare(resultPath);
            }
            LOG.debug("Result file was written as {}", resultPath);
            final long actulalSize = Files.size(resultPath), expectedSizeMin = 7964, expectedSizeMax = 7974;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                    .isGreaterThanOrEqualTo(expectedSizeMin)
                    .isLessThanOrEqualTo(expectedSizeMax);
        }
//        fail("Manual check required - https://issue.lisbon.dynabic.com/issues/COMPARISONJAVA-875");
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA876() throws Exception {
        final String sourceName = "Home-Style_old6.xls", targetName = "Home-Style_new6.xls", resultExtension = ".xls";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA876");
        final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA876");
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);
            // Must not throw NoClassDefFoundError ..ArchiveStreamFactory
            comparer.compare(resultPath);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSizeMin = 10114, expectedSizeMax = 10124;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                .isGreaterThanOrEqualTo(expectedSizeMin)
                .isLessThanOrEqualTo(expectedSizeMax);
        // must not throw exception
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA878() throws Exception {
        final String sourceName = "Layout-Arrange_old2.xls", targetName = "Layout-Arrange_new2.xls", resultExtension = ".xlsx";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA878");
        final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA878");
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);
            // Must not throw NoClassDefFoundError ..ArchiveStreamFactory
            comparer.compare(resultPath);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSizeMin = 9547, expectedSizeMax = 9557;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                .isGreaterThanOrEqualTo(expectedSizeMin)
                .isLessThanOrEqualTo(expectedSizeMax);
        // must not throw exception
    }

    @Test(expectedExceptions = {ComparisonException.class})
    public void testCOMPARISONJAVA879() throws Exception {
        final String sourceName = "Layout-Arrange_old10.xls", targetName = "Layout-Arrange_new10.xls", resultExtension = ".xlsx";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA879");
        final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA879");
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);

            comparer.compare(resultPath);
            fail("The bug was fixed");
            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
        LOG.debug("Result file was written as {}", resultPath);
        // must not throw exception
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA880() throws Exception {
        final String sourceName = "Review-Comment_old.xls", targetName = "Review-Comment_new.xls", resultExtension = ".xlsx";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA880");
        final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA880");
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);

            comparer.compare(resultPath);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSizeMin = 7723, expectedSizeMax = 7733;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                .isGreaterThanOrEqualTo(expectedSizeMin)
                .isLessThanOrEqualTo(expectedSizeMax);
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA881() throws Exception {
        final String issueDirectory = "COMPARISONJAVA881";
        final String sourceName = "DiffHomeParagraph_old1.pptx", targetName = "DiffHomeParagraph_new1.pptx", resultExtension = ".pptx";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, issueDirectory);
        final Path targetPath = TestRunner.getStoragePath(targetName, issueDirectory);
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);

            comparer.compare(resultPath);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSizeMin = 59045, expectedSizeMax = 59063;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                .isGreaterThanOrEqualTo(expectedSizeMin)
                .isLessThanOrEqualTo(expectedSizeMax);
        //
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA882() throws Exception {
        final String issueDirectory = "COMPARISONJAVA882";
        final String sourceName = "source.pptx", targetName = "target.pptx", resultExtension = ".pptx";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, issueDirectory);
        final Path targetPath = TestRunner.getStoragePath(targetName, issueDirectory);
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);

            CompareOptions compareOptions = new CompareOptions();
            compareOptions.setDetalisationLevel(DetalisationLevel.High);

            comparer.compare(resultPath, compareOptions);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSizeMin = 52275, expectedSizeMax = 52297;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                .isGreaterThanOrEqualTo(expectedSizeMin)
                .isLessThanOrEqualTo(expectedSizeMax);
        // Comments must be compared
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA893() throws Exception {
        final String issueDirectory = "COMPARISONJAVA893";
        final String sourceName = "sourceFile.docx", targetName = "targetFile.docx", resultExtension = ".docx";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, issueDirectory);
        final Path targetPath = TestRunner.getStoragePath(targetName, issueDirectory);
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);

            CompareOptions compareOptions = new CompareOptions();
//            compareOptions.setDetalisationLevel(DetalisationLevel.High);

            comparer.compare(resultPath, compareOptions);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSizeMin = 27351, expectedSizeMax = 27354;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                .isGreaterThanOrEqualTo(expectedSizeMin)
                .isLessThanOrEqualTo(expectedSizeMax);
        // There are 3 inserted items in summary page, that is not correct
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA896() throws Exception {
        final String sourceName = "Review-Protect_old.xls", targetName = "Review-Protect_new.xls", resultExtension = ".xls";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA896");
        final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA896");
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);
            // Must not throw NoClassDefFoundError ..ArchiveStreamFactory
            comparer.compare(resultPath);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSizeMin = 9333, expectedSizeMax = 9343;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                .isGreaterThanOrEqualTo(expectedSizeMin)
                .isLessThanOrEqualTo(expectedSizeMax);
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA913() throws Exception {
        final String issueDirectory = "COMPARISONJAVA913";
        final String sourceName = "Home-Font-Italic_old1.pdf", targetName = "Home-Font-Italic_new1.pdf", resultExtension = ".pdf";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, issueDirectory);
        final Path targetPath = TestRunner.getStoragePath(targetName, issueDirectory);
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);

            CompareOptions compareOptions = new CompareOptions();
//            compareOptions.setDetalisationLevel(DetalisationLevel.High);

            comparer.compare(resultPath, compareOptions);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSize = 124644;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                .isEqualTo(expectedSize);
        // Source text styles are missed in result file
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA914() throws Exception {
        final String issueDirectory = "COMPARISONJAVA914";
        final String sourceName = "Home-Font-Bold_old1.pdf", targetName = "Home-Font-Bold_new1.pdf", resultExtension = ".pdf";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, issueDirectory);
        final Path targetPath = TestRunner.getStoragePath(targetName, issueDirectory);
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);

            CompareOptions compareOptions = new CompareOptions();

            comparer.compare(resultPath, compareOptions);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSize = 122000;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                .isEqualTo(expectedSize);
        // Some chars were missed
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA915() throws Exception {
        final String issueDirectory = "COMPARISONJAVA915";
        final String sourceName = "Home-Font-Cricle2_old1.pdf", targetName = "Home-Font-Cricle2_new3.pdf", resultExtension = ".pdf";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, issueDirectory);
        final Path targetPath = TestRunner.getStoragePath(targetName, issueDirectory);
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);

            CompareOptions compareOptions = new CompareOptions();

            comparer.compare(resultPath, compareOptions);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSize = 125092;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                .isEqualTo(expectedSize);
        // result file is not as expected
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA916() throws Exception {
        final String issueDirectory = "COMPARISONJAVA916";
        final String sourceName = "Home-Font-Ruby_old1.pdf", targetName = "Home-Font-Ruby_new1.pdf", resultExtension = ".pdf";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, issueDirectory);
        final Path targetPath = TestRunner.getStoragePath(targetName, issueDirectory);
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);

            CompareOptions compareOptions = new CompareOptions();

            comparer.compare(resultPath, compareOptions);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSize = 115236;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                .isEqualTo(expectedSize);
        // result is not as expected
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA917() throws Exception {
        final String issueDirectory = "COMPARISONJAVA917";
        final String sourceName = "Home-Paragraph-Comb_old1.pdf", targetName = "Home-Paragraph-Comb_new2.pdf", resultExtension = ".pdf";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, issueDirectory);
        final Path targetPath = TestRunner.getStoragePath(targetName, issueDirectory);
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);

            CompareOptions compareOptions = new CompareOptions();

            comparer.compare(resultPath, compareOptions);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSize = 136468;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                .isEqualTo(expectedSize);
        // text position in result document is not correct
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA918() throws Exception {
        final String issueDirectory = "COMPARISONJAVA918";
        final String sourceName = "Home-Paragraph-Vert4_old1.pdf", targetName = "Home-Paragraph-Vert4_new1.pdf", resultExtension = ".pdf";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, issueDirectory);
        final Path targetPath = TestRunner.getStoragePath(targetName, issueDirectory);
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);

            CompareOptions compareOptions = new CompareOptions();

            comparer.compare(resultPath, compareOptions);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSize = 136071;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                .isEqualTo(expectedSize);
        // text position in result document is not correct
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA919() throws Exception {
        final String issueDirectory = "COMPARISONJAVA919";
        final String sourceName = "Home-Paragraph-Sort_old2.pdf", targetName = "Home-Paragraph-Sort_new4.pdf", resultExtension = ".pdf";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, issueDirectory);
        final Path targetPath = TestRunner.getStoragePath(targetName, issueDirectory);
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);

            CompareOptions compareOptions = new CompareOptions();

            comparer.compare(resultPath, compareOptions);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSize = 16175;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                .isEqualTo(expectedSize);
        // rotation is lost in result document
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA920() throws Exception {
        final String issueDirectory = "COMPARISONJAVA920";
        final String sourceName = "Home-Paragraph-Equals_old1.pdf", targetName = "Home-Paragraph-Equals_new1.pdf", resultExtension = ".pdf";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, issueDirectory);
        final Path targetPath = TestRunner.getStoragePath(targetName, issueDirectory);
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);

            CompareOptions compareOptions = new CompareOptions();

            comparer.compare(resultPath, compareOptions);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSize = 112049;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                .isEqualTo(expectedSize);
        // position change is not marked in result
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA928() throws Exception {
        final String issueDirectory = "COMPARISONJAVA928";
        final String sourceName = "Insert-Text-TextBox_old.pdf", targetName = "Insert-Text-TextBox_new.pdf", resultExtension = ".pdf";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, issueDirectory);
        final Path targetPath = TestRunner.getStoragePath(targetName, issueDirectory);
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);

            CompareOptions compareOptions = new CompareOptions();

            comparer.compare(resultPath, compareOptions);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSize = 121548;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                .isEqualTo(expectedSize);
        // rectangle is lost in result file
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA930() throws Exception {
        final String issueDirectory = "COMPARISONJAVA930";
        final String sourceName = "Insert-Mark-Formula_old.pdf", targetName = "Insert-Mark-Formula_new.pdf", resultExtension = ".pdf";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, issueDirectory);
        final Path targetPath = TestRunner.getStoragePath(targetName, issueDirectory);
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);

            CompareOptions compareOptions = new CompareOptions();

            comparer.compare(resultPath, compareOptions);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSize = 162288;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                .isEqualTo(expectedSize);
        // comparison process brokes the formula in result document
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA931() throws Exception {
        final String issueDirectory = "COMPARISONJAVA931";
        final String sourceName = "Design-Background-Sukashi_old.pdf", targetName = "Design-Background-Sukashi_new.pdf", resultExtension = ".pdf";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, issueDirectory);
        final Path targetPath = TestRunner.getStoragePath(targetName, issueDirectory);
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);

            CompareOptions compareOptions = new CompareOptions();

            comparer.compare(resultPath, compareOptions);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSize = 1364;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                .isEqualTo(expectedSize);
        // warermark is lost in result file
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA932() throws Exception {
        final String issueDirectory = "COMPARISONJAVA932";
        final String sourceName = "Layout-PageSetup-Para3_old.pdf", targetName = "Layout-PageSetup-Para3_new.pdf", resultExtension = ".pdf";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, issueDirectory);
        final Path targetPath = TestRunner.getStoragePath(targetName, issueDirectory);
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);

            CompareOptions compareOptions = new CompareOptions();

            comparer.compare(resultPath, compareOptions);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSize = 29332;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                .isEqualTo(expectedSize);
        // columns layout is broken
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA933() throws Exception {
        final String issueDirectory = "COMPARISONJAVA933";
        final String sourceName = "Layout-PageSetup-Newline_old.pdf", targetName = "Layout-PageSetup-Newline_new.pdf", resultExtension = ".pdf";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, issueDirectory);
        final Path targetPath = TestRunner.getStoragePath(targetName, issueDirectory);
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);

            CompareOptions compareOptions = new CompareOptions();

            comparer.compare(resultPath, compareOptions);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSize = 121392;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                .isEqualTo(expectedSize);
        // symbol is lost in result document
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA934() throws Exception {
        final String issueDirectory = "COMPARISONJAVA934";
        final String sourceName = "Layout-PageSetup-RowNum_old.pdf", targetName = "Layout-PageSetup-RowNum_new.pdf", resultExtension = ".pdf";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, issueDirectory);
        final Path targetPath = TestRunner.getStoragePath(targetName, issueDirectory);
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);

            CompareOptions compareOptions = new CompareOptions();

            comparer.compare(resultPath, compareOptions);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSize = 27080;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                .isEqualTo(expectedSize);
        // text is transparant in result file
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA935() throws Exception {
        final String issueDirectory = "COMPARISONJAVA935";
        final String sourceName = "Reference-Annotation_old.pdf", targetName = "Reference-Annotation_new.pdf", resultExtension = ".pdf";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, issueDirectory);
        final Path targetPath = TestRunner.getStoragePath(targetName, issueDirectory);
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);

            CompareOptions compareOptions = new CompareOptions();

            comparer.compare(resultPath, compareOptions);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSize = 122657;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                .isEqualTo(expectedSize);
        // number was moved down
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA936() throws Exception {
        final String issueDirectory = "COMPARISONJAVA936";
        final String sourceName = "Home-Font-Old7.xls", targetName = "Home-Font-New20.xls",
                resultExtension = "" + sourceName.substring(sourceName.lastIndexOf('.'));

        final Path sourcePath = TestRunner.getStoragePath(sourceName, issueDirectory);
        final Path targetPath = TestRunner.getStoragePath(targetName, issueDirectory);
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);

            CompareOptions compareOptions = new CompareOptions();

            comparer.compare(resultPath, compareOptions);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSizeMin = 7997, expectedSizeMax = 8007;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                .isGreaterThanOrEqualTo(expectedSizeMin)
                .isLessThanOrEqualTo(expectedSizeMax);
        //
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA937() throws Exception {
        final String issueDirectory = "COMPARISONJAVA937";
        final String sourceName = "Insert-Graph-New4-01.xls", targetName = "Insert-Graph-New4-08.xls", resultExtension = ".xls";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, issueDirectory);
        final Path targetPath = TestRunner.getStoragePath(targetName, issueDirectory);
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);

            CompareOptions compareOptions = new CompareOptions();

            comparer.compare(resultPath, compareOptions);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSizeMin = 11925, expectedSizeMax = 11935;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                .isGreaterThanOrEqualTo(expectedSizeMin)
                .isLessThanOrEqualTo(expectedSizeMax);
        // must not fail
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA938() throws Exception {
        final String issueDirectory = "COMPARISONJAVA938";
        final String sourceName = "DiffHomeImage_old3.pptx", targetName = "DiffHomeImage_new3.pptx", resultExtension = ".pptx";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, issueDirectory);
        final Path targetPath = TestRunner.getStoragePath(targetName, issueDirectory);
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);

            CompareOptions compareOptions = new CompareOptions();

            comparer.compare(resultPath, compareOptions);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSizeMin = 59379, expectedSizeMax = 59389;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                .isGreaterThanOrEqualTo(expectedSizeMin)
                .isLessThanOrEqualTo(expectedSizeMax);
        // changes in figures in rectangle are not detected (2nd page)
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA939() throws Exception {
        final String issueDirectory = "COMPARISONJAVA939";
        final String sourceName = "DiffInsertTable_old2.pptx", targetName = "DiffInsertTable_new2.pptx", resultExtension = ".pptx";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, issueDirectory);
        final Path targetPath = TestRunner.getStoragePath(targetName, issueDirectory);
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);

            CompareOptions compareOptions = new CompareOptions();

            comparer.compare(resultPath, compareOptions);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSizeMin = 63971, expectedSizeMax = 63990;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                .isGreaterThanOrEqualTo(expectedSizeMin)
                .isLessThanOrEqualTo(expectedSizeMax);
        //
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA940() throws Exception {
        final String issueDirectory = "COMPARISONJAVA940";
        final String sourceName = "DiffInsertTable_old2 (1).pptx", targetName = "DiffInsertTable_new2.pptx", resultExtension = ".pptx";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, issueDirectory);
        final Path targetPath = TestRunner.getStoragePath(targetName, issueDirectory);
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);

            CompareOptions compareOptions = new CompareOptions();

            comparer.compare(resultPath, compareOptions);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSizeMin = 63973, expectedSizeMax = 63987;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                .isGreaterThanOrEqualTo(expectedSizeMin)
                .isLessThanOrEqualTo(expectedSizeMax);
        //
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA941() throws Exception {
        final String issueDirectory = "COMPARISONJAVA941";
        final String sourceName = "Home-Paragraph-Vert-Up-old1.pdf", targetName = "Home-Paragraph-Vert-Up-new1.pdf", resultExtension = ".pdf";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, issueDirectory);
        final Path targetPath = TestRunner.getStoragePath(targetName, issueDirectory);
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);

            CompareOptions compareOptions = new CompareOptions();

            comparer.compare(resultPath, compareOptions);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSize = 133320;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                .isEqualTo(expectedSize);
        // alignment is incorrect
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA942() throws Exception {
        final String issueDirectory = "COMPARISONJAVA942";
        final String sourceName = "Insert-Table-Title_old1.pdf", targetName = "Insert-Table-Title_new2.pdf", resultExtension = ".pdf";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, issueDirectory);
        final Path targetPath = TestRunner.getStoragePath(targetName, issueDirectory);
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);

            CompareOptions compareOptions = new CompareOptions();

            comparer.compare(resultPath, compareOptions);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSize = 147866;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                .isEqualTo(expectedSize);
        // incorrect table layout
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA943() throws Exception {
        final String issueDirectory = "COMPARISONJAVA943";
        final String sourceName = "Insert-Table-Name_old1.pdf", targetName = "Insert-Table-Name_new1.pdf", resultExtension = ".pdf";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, issueDirectory);
        final Path targetPath = TestRunner.getStoragePath(targetName, issueDirectory);
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);

            CompareOptions compareOptions = new CompareOptions();

            comparer.compare(resultPath, compareOptions);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSize = 145379;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                .isEqualTo(expectedSize);
        // wrong result
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA944() throws Exception {
        final String issueDirectory = "COMPARISONJAVA944";
        final String sourceName = "Layout-Paper-Landscape-Old1.pdf", targetName = "Layout-Paper-Landscape-New1.pdf", resultExtension = ".pdf";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, issueDirectory);
        final Path targetPath = TestRunner.getStoragePath(targetName, issueDirectory);
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);

            CompareOptions compareOptions = new CompareOptions();

            comparer.compare(resultPath, compareOptions);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSize = 147146;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                .isEqualTo(expectedSize);
        //
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA945() throws Exception {
        final String issueDirectory = "COMPARISONJAVA945";
        final String sourceName = "Reference-Figures-Table-old1.pdf", targetName = "Reference-Figures-Table-new1.pdf", resultExtension = ".pdf";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, issueDirectory);
        final Path targetPath = TestRunner.getStoragePath(targetName, issueDirectory);
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);

            CompareOptions compareOptions = new CompareOptions();

            comparer.compare(resultPath, compareOptions);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSize = 129143;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                .isEqualTo(expectedSize);
        // Some words are lost in  result
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA946() throws Exception {
        final String issueDirectory = "COMPARISONJAVA946";
        final String sourceName = "Reference-Index_old.pdf", targetName = "Reference-Index_new.pdf", resultExtension = ".pdf";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, issueDirectory);
        final Path targetPath = TestRunner.getStoragePath(targetName, issueDirectory);
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);

            CompareOptions compareOptions = new CompareOptions();

            comparer.compare(resultPath, compareOptions);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSize = 136018;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                .isEqualTo(expectedSize);
        //
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA975() throws Exception {
        final String issueDirectory = "COMPARISONJAVA975";
        final String sourceName = "Layout-Arrange_old9.xls", targetName = "Layout-Arrange_new9.xls", resultExtension = ".xls";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, issueDirectory);
        final Path targetPath = TestRunner.getStoragePath(targetName, issueDirectory);
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);

            CompareOptions compareOptions = new CompareOptions();
            compareOptions.setDetectStyleChanges(true);

            comparer.compare(resultPath, compareOptions);

            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(1);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSizeMin = 9659, expectedSizeMax = 9669;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                .isGreaterThanOrEqualTo(expectedSizeMin)
                .isLessThanOrEqualTo(expectedSizeMax);
        //
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA976() throws Exception {
        final String sourceName = "Insert-Text-xlsx_old.pdf", targetName = "Insert-Text-xlsx_new.pdf", resultExtension = ".pdf";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA976");
        final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA976");
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);
            comparer.compare(resultPath);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSize = 1614540;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                .isEqualTo(expectedSize);
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA977() throws Exception {
        final String issueDirectory = "COMPARISONJAVA977";
        final String sourceName = "source.doc", targetName = "target.doc", resultExtension = ".doc";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, issueDirectory);
        final Path targetPath = TestRunner.getStoragePath(targetName, issueDirectory);
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);

            CompareOptions compareOptions = new CompareOptions();

            comparer.compare(resultPath, compareOptions);

            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(11);

            for (ChangeInfo changeInfo : changes) {
                System.out.println(changeInfo.getSourceText());
                System.out.println(changeInfo.getTargetText());
            }
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSize = 24064;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                .isEqualTo(expectedSize);
        //
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA978() throws Exception {
        final String sourceName = "Insert-Image_old.xlsx", targetName = "Insert-Image_new.xlsx", resultExtension = ".xlsx";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA978");
        final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA978");
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);

            CompareOptions compareOptions = new CompareOptions();
            compareOptions.setDetectStyleChanges(true);

            comparer.compare(resultPath, compareOptions);

            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(14);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSizeMin = 83050, expectedSizeMax = 83060;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                .isGreaterThanOrEqualTo(expectedSizeMin)
                .isLessThanOrEqualTo(expectedSizeMax);
        // images changes must be detected
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA979() throws Exception {
        final String issueDirectory = "COMPARISONJAVA979";
        final String sourceName = "Reference-Table-Old1.pdf", targetName = "Reference-Table-New1.pdf", resultExtension = ".pdf";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, issueDirectory);
        final Path targetPath = TestRunner.getStoragePath(targetName, issueDirectory);
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);

            CompareOptions compareOptions = new CompareOptions();
            compareOptions.setDetectStyleChanges(true);

            comparer.compare(resultPath, compareOptions);

            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(22);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSize = 226460;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                .isEqualTo(expectedSize);
        // Must not cut any text
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA980() throws Exception {
        final String issueDirectory = "COMPARISONJAVA980";
        final String sourceName = "v1.docx", targetName = "v2.docx", resultExtension = ".docx";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, issueDirectory);
        final Path targetPath = TestRunner.getStoragePath(targetName, issueDirectory);
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);

            StyleSettings deletedStyleSettings = new StyleSettings();
            deletedStyleSettings.setStrikethrough(true);
            deletedStyleSettings.setFontColor(Color.red);

            CompareOptions compareOptions = new CompareOptions();
            compareOptions.setDeletedItemStyle(deletedStyleSettings);
            compareOptions.setSensitivityOfComparison(75);
            compareOptions.setDetectStyleChanges(true);
            compareOptions.setMarkChangedContent(true);
            compareOptions.setCalculateCoordinates(true);

            comparer.compare(resultPath, compareOptions);

            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected! Actual:<%d>", changes.length)
                    .hasSize(55);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSizeMin = 38293, expectedSizeMax = 38300;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                .isGreaterThanOrEqualTo(expectedSizeMin)
                .isLessThanOrEqualTo(expectedSizeMax);
        //
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA981() throws Exception {
        final String issueDirectory = "COMPARISONJAVA981";
        final String sourceName = "Format-Accessibility_Old.xls", targetName = "Format-Accessibility_New.xls", resultExtension = ".xls";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, issueDirectory);
        final Path targetPath = TestRunner.getStoragePath(targetName, issueDirectory);
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);

            CompareOptions compareOptions = new CompareOptions();
            compareOptions.setDetectStyleChanges(true);

            comparer.compare(resultPath, compareOptions);

            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(0);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSizeMin = 9735, expectedSizeMax = 9745;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                .isGreaterThanOrEqualTo(expectedSizeMin)
                .isLessThanOrEqualTo(expectedSizeMax);
        // Must not cut any text
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA1010() throws Exception {
        final String sourceName = "source.html", targetName = "target.html", resultExtension = ".html";

        final Path sourcePath = TestRunner.getStoragePath(sourceName, "COMPARISONJAVA1010");
        final Path targetPath = TestRunner.getStoragePath(targetName, "COMPARISONJAVA1010");
        final Path resultPath = getOutputPath(resultExtension);

        LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);
            // Must not throw NoClassDefFoundError ..IOUtils
            comparer.compare(resultPath);
        }
        LOG.debug("Result file was written as {}", resultPath);
        final long actulalSize = Files.size(resultPath), expectedSize = 452180;
        assertThat(actulalSize)
                .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                .isEqualTo(expectedSize);
    }

    @Test(invocationCount = 1)
    public void testCOMPARISONJAVA1189() throws Exception {
        final String issueDirectory = "COMPARISONJAVA1189";
        {
            final String sourceName = "house-source.png", targetName = "house-target.png", resultExtension = ".png";

            final Path sourcePath = TestRunner.getStoragePath(sourceName, issueDirectory);
            final Path targetPath = TestRunner.getStoragePath(targetName, issueDirectory);
            final Path resultPath = getOutputPath(resultExtension);

            LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
            try (Comparer comparer = new Comparer(sourcePath)) {
                comparer.add(targetPath);

                CompareOptions compareOptions = new CompareOptions();
                compareOptions.setGenerateSummaryPage(false);

                comparer.compare(resultPath, compareOptions);
            }
            LOG.debug("Result file was written as {}", resultPath);
            final long actulalSize = Files.size(resultPath), expectedSize = 54817;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        } // It must generate PDF file when setGenerateSummaryPage is enabled and PNG file when disabled
        {
            final String sourceName = "laptop-source.jpg", targetName = "laptop-target.jpg", resultExtension = ".jpg";

            final Path sourcePath = TestRunner.getStoragePath(sourceName, issueDirectory);
            final Path targetPath = TestRunner.getStoragePath(targetName, issueDirectory);
            final Path resultPath = getOutputPath(resultExtension);

            LOG.debug("\nSource file: {}\nTarget file: {}", sourcePath, targetPath);
            try (Comparer comparer = new Comparer(sourcePath)) {
                comparer.add(targetPath);

                CompareOptions compareOptions = new CompareOptions();
                compareOptions.setGenerateSummaryPage(false);

                comparer.compare(resultPath, compareOptions);
            }
            LOG.debug("Result file was written as {}", resultPath);
            final long actulalSize = Files.size(resultPath), expectedSize = 44857;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        } // Must do the same, but output image must be JPG
    }
}