package com.groupdocs.comparison.sample.common;

import com.groupdocs.comparison.Comparer;
import com.groupdocs.comparison.ComparerSettings;
import com.groupdocs.comparison.options.CompareOptions;
import com.groupdocs.comparison.options.style.DetalisationLevel;
import com.groupdocs.comparison.result.ChangeInfo;
import com.groupdocs.comparison.sample.config.TestNGSetUp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import static com.groupdocs.comparison.sample.TestRunner.getStoragePath;
import static org.assertj.core.api.Assertions.assertThat;

public class FileFormatTests extends TestNGSetUp {
    private static final Logger LOG = LoggerFactory.getLogger(FileFormatTests.class);

    @Test(invocationCount = 1)
    public void testCompareAsAsStream() throws Exception {
        final String sourceName = "source.as", targetName = "target.as", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(50);

            final long actulalSize = Files.size(resultPath), expectedSize = 13416;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareAs3AsStream() throws Exception {
        final String sourceName = "source.as3", targetName = "target.as3", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());

            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(30);

            final long actulalSize = Files.size(resultPath), expectedSize = 11663;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareAsmAsStream() throws Exception {
        final String sourceName = "source.asm", targetName = "target.asm", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());

            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(40);

            final long actulalSize = Files.size(resultPath), expectedSize = 6705;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareBatAsStream() throws Exception {
        final String sourceName = "source.bat", targetName = "target.bat", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());

            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(4);

            final long actulalSize = Files.size(resultPath), expectedSize = 1075;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareCmdAsStream() throws Exception {
        final String sourceName = "source.cmd", targetName = "target.cmd", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());

            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(9);

            final long actulalSize = Files.size(resultPath), expectedSize = 2598;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareCAsStream() throws Exception {
        final String sourceName = "source.c", targetName = "target.c", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());

            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(44);

            final long actulalSize = Files.size(resultPath), expectedSize = 11577;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareHAsStream() throws Exception {
        final String sourceName = "source.h", targetName = "target.h", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());

            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(22);

            final long actulalSize = Files.size(resultPath), expectedSize = 5702;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testComparePdfAsStream() throws Exception {
        final String sourceName = "source.pdf", targetName = "target.pdf", resultExtension = ".pdf";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());

            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(5);

            final long actulalSize = Files.size(resultPath), expectedSize = 112651;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareDocAsStream() throws Exception {
        final String sourceName = "source.doc", targetName = "target.doc", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());

            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(29);

            final long actulalSize = Files.size(resultPath), expectedSize = 129536;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    @Ignore("Files are required")
    public void testCompareDocmAsStream() throws Exception {
        final String sourceName = "source.docm", targetName = "target.docm", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(123);

            final long actulalSize = Files.size(resultPath), expectedSize = 1481840L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareDocxAsStream() throws Exception {
        final String sourceName = "source.docx", targetName = "target.docx", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());

            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(6);

            final long actulalSize = Files.size(resultPath), expectedSizeMin = 12679, expectedSizeMax = 12691;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                    .isGreaterThanOrEqualTo(expectedSizeMin)
                    .isLessThanOrEqualTo(expectedSizeMax);
        }
    }

    @Test(invocationCount = 1)
    @Ignore("Files are required")
    public void testCompareDotAsStream() throws Exception {
        final String sourceName = "source.dot", targetName = "target.dot", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(123);

            final long actulalSize = Files.size(resultPath), expectedSize = 1481840L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    @Ignore("Files are required")
    public void testCompareDotmAsStream() throws Exception {
        final String sourceName = "source.dotm", targetName = "target.dotm", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(123);

            final long actulalSize = Files.size(resultPath), expectedSize = 1481840L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    @Ignore("Files are required")
    public void testCompareDotxAsStream() throws Exception {
        final String sourceName = "source.dotx", targetName = "target.dotx", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(123);

            final long actulalSize = Files.size(resultPath), expectedSize = 1481840L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareXlsAsStream() throws Exception {
        final String sourceName = "source.xls", targetName = "target.xls", resultExtension = ".xlsx";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());

            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(74);

            final long actulalSize = Files.size(resultPath), expectedSizeMin = 35118, expectedSizeMax = 35148;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                    .isGreaterThanOrEqualTo(expectedSizeMin)
                    .isLessThanOrEqualTo(expectedSizeMax);
        }
    }

    @Test(invocationCount = 1)
    @Ignore("Files are required")
    public void testCompareXltAsStream() throws Exception {
        final String sourceName = "source.xlt", targetName = "target.xlt", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(123);

            final long actulalSize = Files.size(resultPath), expectedSize = 1481840L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareXlsxAsStream() throws Exception {
        final String sourceName = "source.xlsx", targetName = "target.xlsx", resultExtension = ".xlsx";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());

            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(6);

            final long actulalSize = Files.size(resultPath), expectedSizeMin = 8030, expectedSizeMax = 8037;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                    .isGreaterThanOrEqualTo(expectedSizeMin)
                    .isLessThanOrEqualTo(expectedSizeMax);
        }
    }

    @Test(invocationCount = 1)
    @Ignore("Files are required")
    public void testCompareXltmAsStream() throws Exception {
        final String sourceName = "source.xltm", targetName = "target.xltm", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(123);

            final long actulalSize = Files.size(resultPath), expectedSize = 1481840L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    @Ignore("Files are required")
    public void testCompareXlsbAsStream() throws Exception {
        final String sourceName = "source.xlsb", targetName = "target.xlsb", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(123);

            final long actulalSize = Files.size(resultPath), expectedSize = 1481840L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    @Ignore("Files are required")
    public void testCompareXlsmAsStream() throws Exception {
        final String sourceName = "source.xlsm", targetName = "target.xlsm", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(123);

            final long actulalSize = Files.size(resultPath), expectedSize = 1481840L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    @Ignore("Files are required")
    public void testComparePotAsStream() throws Exception {
        final String sourceName = "source.pot", targetName = "target.pot", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(123);

            final long actulalSize = Files.size(resultPath), expectedSize = 1481840L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    @Ignore("Files are required")
    public void testComparePotxAsStream() throws Exception {
        final String sourceName = "source.potx", targetName = "target.potx", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(123);

            final long actulalSize = Files.size(resultPath), expectedSize = 1481840L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    @Ignore("Files are required")
    public void testComparePpsAsStream() throws Exception {
        final String sourceName = "source.pps", targetName = "target.pps", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(123);

            final long actulalSize = Files.size(resultPath), expectedSize = 1481840L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    @Ignore("Files are required")
    public void testComparePpsxAsStream() throws Exception {
        final String sourceName = "source.ppsx", targetName = "target.ppsx", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(123);

            final long actulalSize = Files.size(resultPath), expectedSize = 1481840L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testComparePptxAsStream() throws Exception {
        final String sourceName = "source.pptx", targetName = "target.pptx", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());

            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(6);

            final long actulalSize = Files.size(resultPath), expectedSizeMin = 52973, expectedSizeMax = 52989;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                    .isGreaterThanOrEqualTo(expectedSizeMin)
                    .isLessThanOrEqualTo(expectedSizeMax);
        }
    }

    @Test(invocationCount = 1)
    @Ignore("Files are required")
    public void testComparePptAsStream() throws Exception {
        final String sourceName = "source.ppt", targetName = "target.ppt", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(123);

            final long actulalSize = Files.size(resultPath), expectedSize = 1481840L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareVsdxAsStream() throws Exception {
        final String sourceName = "source.vsdx", targetName = "target.vsdx", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());

            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(4);

            final long actulalSize = Files.size(resultPath), expectedSizeMin = 22341, expectedSizeMax = 22344;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                    .isGreaterThanOrEqualTo(expectedSizeMin)
                    .isLessThanOrEqualTo(expectedSizeMax);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareVsdAsStream() throws Exception {
        final String sourceName = "source.vsd", targetName = "target.vsd", resultExtension = ".vsdx";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());

            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(0);

            final long actulalSize = Files.size(resultPath), expectedSizeMin = 16143, expectedSizeMax = 16146;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                    .isGreaterThanOrEqualTo(expectedSizeMin)
                    .isLessThanOrEqualTo(expectedSizeMax);
        }
    }

    @Test(invocationCount = 1)
    @Ignore("Files are required")
    public void testCompareVssAsStream() throws Exception {
        final String sourceName = "source.vss", targetName = "target.vss", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(123);

            final long actulalSize = Files.size(resultPath), expectedSize = 1481840L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    @Ignore("Files are required")
    public void testCompareVstAsStream() throws Exception {
        final String sourceName = "source.vst", targetName = "target.vst", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(123);

            final long actulalSize = Files.size(resultPath), expectedSize = 1481840L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    @Ignore("Files are required")
    public void testCompareVdxAsStream() throws Exception {
        final String sourceName = "source.vdx", targetName = "target.vdx", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(123);

            final long actulalSize = Files.size(resultPath), expectedSize = 1481840L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareOneAsStream() throws Exception {
        final String sourceName = "source.one", targetName = "target.one", resultExtension = ".one";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(1);

            final long actulalSize = Files.size(resultPath), expectedSize = 11320L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    @Ignore("Files are required")
    public void testCompareOdtAsStream() throws Exception {
        final String sourceName = "source.odt", targetName = "target.odt", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(123);

            final long actulalSize = Files.size(resultPath), expectedSize = 1481840L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    @Ignore("Files are required")
    public void testCompareOdpAsStream() throws Exception {
        final String sourceName = "source.odp", targetName = "target.odp", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(123);

            final long actulalSize = Files.size(resultPath), expectedSize = 1481840L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareOtpAsStream() throws Exception {
        final String sourceName = "source.otp", targetName = "target.otp", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());

            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(2);

            final long actulalSize = Files.size(resultPath), expectedSizeMin = 5476, expectedSizeMax = 5482;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                    .isGreaterThanOrEqualTo(expectedSizeMin)
                    .isLessThanOrEqualTo(expectedSizeMax);
        }
    }

    @Test(invocationCount = 1)
    @Ignore("Files are required")
    public void testCompareOdsAsStream() throws Exception {
        final String sourceName = "source.ods", targetName = "target.ods", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(123);

            final long actulalSize = Files.size(resultPath), expectedSize = 1481840L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    @Ignore("Files are required")
    public void testCompareOttAsStream() throws Exception {
        final String sourceName = "source.ott", targetName = "target.ott", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(123);

            final long actulalSize = Files.size(resultPath), expectedSize = 1481840L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    @Ignore("Files are required")
    public void testCompareRtfAsStream() throws Exception {
        final String sourceName = "source.rtf", targetName = "target.rtf", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(123);

            final long actulalSize = Files.size(resultPath), expectedSize = 1481840L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareTxtAsStream() throws Exception {
        final String sourceName = "source.txt", targetName = "target.txt", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(2);

            final long actulalSize = Files.size(resultPath), expectedSize = 661;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareCsvAsStream() throws Exception {
        final String sourceName = "source.csv", targetName = "target.csv", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(5);

            final long actulalSize = Files.size(resultPath), expectedSize = 1928;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareHtmlAsStream() throws Exception {
        final String sourceName = "source.html", targetName = "target.html", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(2);

            final long actulalSize = Files.size(resultPath), expectedSize = 739;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareMhtmlAsStream() throws Exception {
        final String sourceName = "source.mhtml", targetName = "target.mhtml", resultExtension = ".mhtml";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());

            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(14);

            final long actulalSize = Files.size(resultPath), expectedSizeMin = 6048, expectedSizeMax = 6049;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                    .isGreaterThanOrEqualTo(expectedSizeMin)
                    .isLessThanOrEqualTo(expectedSizeMax);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareMobiAsStream() throws Exception {
        final String sourceName = "source.mobi", targetName = "target.mobi", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(2);

            final long actulalSize = Files.size(resultPath), expectedSize = 9728L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareDcmAsStream() throws Exception {
        final String sourceName = "source.dcm", targetName = "target.dcm", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            resultPath = comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(248);

            final long actulalSize = Files.size(resultPath), expectedSize = 191845L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareDjvuAsStream() throws Exception {
        final String sourceName = "source.djvu", targetName = "target.djvu", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            resultPath = comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(2124);

            final long actulalSize = Files.size(resultPath), expectedSize = 2347543L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareDwgAsStream() throws Exception {
        final String sourceName = "source.dwg", targetName = "target.dwg", resultExtension = ".pdf";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            resultPath = comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(507);

            final long actulalSize = Files.size(resultPath), expectedSize = 325269L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareDxfAsStream() throws Exception {
        final String sourceName = "source.dxf", targetName = "target.dxf", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(11);

            final long actulalSize = Files.size(resultPath), expectedSize = 93763;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareBmpAsStream() throws Exception {
        final String sourceName = "source.bmp", targetName = "target.bmp", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            resultPath = comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(118);

            final long actulalSize = Files.size(resultPath), expectedSize = 175172L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    @Ignore("Files are required")
    public void testCompareGifAsStream() throws Exception {
        final String sourceName = "source.gif", targetName = "target.gif", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(123);

            final long actulalSize = Files.size(resultPath), expectedSize = 1481840L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    @Ignore("Files are required")
    public void testCompareJpegAsStream() throws Exception {
        final String sourceName = "source.jpeg", targetName = "target.jpeg", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(123);

            final long actulalSize = Files.size(resultPath), expectedSize = 1481840L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testComparePngAsStream() throws Exception {
        final String sourceName = "source.png", targetName = "target.png", resultExtension = ".pdf";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());

            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(56);

            final long actulalSize = Files.size(resultPath), expectedSize = 174456L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }

    }

    @Test(invocationCount = 1)
    public void testCompareEmlAsStream() throws Exception {
        final String sourceName = "source.eml", targetName = "target.eml", resultExtension = ".eml";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());

            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(5);

            final long actulalSize = Files.size(resultPath), expectedSizeMin = 2530, expectedSizeMax = 2534;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                    .isGreaterThanOrEqualTo(expectedSizeMin)
                    .isLessThanOrEqualTo(expectedSizeMax);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareEmlxAsStream() throws Exception {
        final String sourceName = "source.emlx", targetName = "target.emlx", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());

            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(5);

            final long actulalSize = Files.size(resultPath), expectedSizeMin = 2501, expectedSizeMax = 2511;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be from <%d> to <%d> but was:<%d>", expectedSizeMin, expectedSizeMax, actulalSize)
                    .isGreaterThanOrEqualTo(expectedSizeMin)
                    .isLessThanOrEqualTo(expectedSizeMax);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareMsgAsStream() throws Exception {
        final String sourceName = "source.msg", targetName = "target.msg", resultExtension = ".msg";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(5);

            final long actulalSize = Files.size(resultPath), expectedSize = 17920;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    @Ignore("Files are required")
    public void testCompareCadAsStream() throws Exception {
        final String sourceName = "source.cad", targetName = "target.cad", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(123);

            final long actulalSize = Files.size(resultPath), expectedSize = 1481840L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareCppAsStream() throws Exception {
        final String sourceName = "source.cpp", targetName = "target.cpp", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(12);

            final long actulalSize = Files.size(resultPath), expectedSize = 6231;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareCcAsStream() throws Exception {
        final String sourceName = "source.cc", targetName = "target.cc", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(44);

            final long actulalSize = Files.size(resultPath), expectedSize = 21430;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareCxxAsStream() throws Exception {
        final String sourceName = "source.cxx", targetName = "target.cxx", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(31);

            final long actulalSize = Files.size(resultPath), expectedSize = 11390;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareHxxAsStream() throws Exception {
        final String sourceName = "source.hxx", targetName = "target.hxx", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(32);

            final long actulalSize = Files.size(resultPath), expectedSize = 10567;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareHhAsStream() throws Exception {
        final String sourceName = "source.hh", targetName = "target.hh", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(36);

            final long actulalSize = Files.size(resultPath), expectedSize = 11737;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareHppAsStream() throws Exception {
        final String sourceName = "source.hpp", targetName = "target.hpp", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(46);

            final long actulalSize = Files.size(resultPath), expectedSize = 13150;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareCmakeAsStream() throws Exception {
        final String sourceName = "source.cmake", targetName = "target.cmake", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(18);

            final long actulalSize = Files.size(resultPath), expectedSize = 5288;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareCsAsStream() throws Exception {
        final String sourceName = "source.cs", targetName = "target.cs", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(4);

            final long actulalSize = Files.size(resultPath), expectedSize = 4501;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareCsxAsStream() throws Exception {
        final String sourceName = "source.csx", targetName = "target.csx", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(2);

            final long actulalSize = Files.size(resultPath), expectedSize = 4640;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareCakeAsStream() throws Exception {
        final String sourceName = "source.cake", targetName = "target.cake", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(10);

            final long actulalSize = Files.size(resultPath), expectedSize = 2650;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareDiffAsStream() throws Exception {
        final String sourceName = "source.diff", targetName = "target.diff", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(5);

            final long actulalSize = Files.size(resultPath), expectedSize = 3985;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testComparePatchAsStream() throws Exception {
        final String sourceName = "source.patch", targetName = "target.patch", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(4);

            final long actulalSize = Files.size(resultPath), expectedSize = 913;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareRejAsStream() throws Exception {
        final String sourceName = "source.rej", targetName = "target.rej", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(17);

            final long actulalSize = Files.size(resultPath), expectedSize = 2630;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareGroovyAsStream() throws Exception {
        final String sourceName = "source.groovy", targetName = "target.groovy", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(5);

            final long actulalSize = Files.size(resultPath), expectedSize = 2375;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareGvyAsStream() throws Exception {
        final String sourceName = "source.gvy", targetName = "target.gvy", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(3);

            final long actulalSize = Files.size(resultPath), expectedSize = 893;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareGradleAsStream() throws Exception {
        final String sourceName = "source.gradle", targetName = "target.gradle", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(23);

            final long actulalSize = Files.size(resultPath), expectedSize = 10511;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareHamlAsStream() throws Exception {
        final String sourceName = "source.haml", targetName = "target.haml", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(14);

            final long actulalSize = Files.size(resultPath), expectedSize = 4098;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareJsAsStream() throws Exception {
        final String sourceName = "source.js", targetName = "target.js", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(26);

            final long actulalSize = Files.size(resultPath), expectedSize = 7297;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareEs6AsStream() throws Exception {
        final String sourceName = "source.es6", targetName = "target.es6", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(16);

            final long actulalSize = Files.size(resultPath), expectedSize = 3084;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareMjsAsStream() throws Exception {
        final String sourceName = "source.mjs", targetName = "target.mjs", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(3);

            final long actulalSize = Files.size(resultPath), expectedSize = 1544;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testComparePacAsStream() throws Exception {
        final String sourceName = "source.pac", targetName = "target.pac", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(6);

            final long actulalSize = Files.size(resultPath), expectedSize = 3227;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareJsonAsStream() throws Exception {
        final String sourceName = "source.json", targetName = "target.json", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(12);

            final long actulalSize = Files.size(resultPath), expectedSize = 3055;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareBowerrcAsStream() throws Exception {
        final String sourceName = "source.bowerrc", targetName = "target.bowerrc", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(4);

            final long actulalSize = Files.size(resultPath), expectedSize = 2259;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareJshintrcAsStream() throws Exception {
        final String sourceName = "source.jshintrc", targetName = "target.jshintrc", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(11);

            final long actulalSize = Files.size(resultPath), expectedSize = 10115;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareJscsrcAsStream() throws Exception {
        final String sourceName = "source.jscsrc", targetName = "target.jscsrc", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(28);

            final long actulalSize = Files.size(resultPath), expectedSize = 8599;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareWEBMANIFESTAsStream() throws Exception {
        final String sourceName = "source.webmanifest", targetName = "target.webmanifest", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(10);

            final long actulalSize = Files.size(resultPath), expectedSize = 2385;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    @Ignore("Files are required")
    public void testCompareJsmapAsStream() throws Exception {
        final String sourceName = "source.jsmap", targetName = "target.jsmap", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(123);

            final long actulalSize = Files.size(resultPath), expectedSize = 1481840L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareHarAsStream() throws Exception {
        final String sourceName = "source.har", targetName = "target.har", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(316);

            final long actulalSize = Files.size(resultPath), expectedSize = 602624;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareJavaAsStream() throws Exception {
        final String sourceName = "source.java", targetName = "target.java", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(22);

            final long actulalSize = Files.size(resultPath), expectedSize = 13042;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareLessAsStream() throws Exception {
        final String sourceName = "source.less", targetName = "target.less", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(4);

            final long actulalSize = Files.size(resultPath), expectedSize = 11887;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    @Ignore("Files are required")
    public void testCompareLogAsStream() throws Exception {
        final String sourceName = "source.log", targetName = "target.log", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(123);

            final long actulalSize = Files.size(resultPath), expectedSize = 1481840L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareMakeAsStream() throws Exception {
        final String sourceName = "source.make", targetName = "target.make", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(11);

            final long actulalSize = Files.size(resultPath), expectedSize = 2539;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareMkAsStream() throws Exception {
        final String sourceName = "source.mk", targetName = "target.mk", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(9);

            final long actulalSize = Files.size(resultPath), expectedSize = 4059;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareMdAsStream() throws Exception {
        final String sourceName = "source.md", targetName = "target.md", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(6);

            final long actulalSize = Files.size(resultPath), expectedSize = 1652;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareMkdAsStream() throws Exception {
        final String sourceName = "source.mkd", targetName = "target.mkd", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(11);

            final long actulalSize = Files.size(resultPath), expectedSize = 2572;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareMdwnAsStream() throws Exception {
        final String sourceName = "source.mdwn", targetName = "target.mdwn", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(24);

            final long actulalSize = Files.size(resultPath), expectedSize = 4674;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareMdownAsStream() throws Exception {
        final String sourceName = "source.mdown", targetName = "target.mdown", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(15);

            final long actulalSize = Files.size(resultPath), expectedSize = 3999;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareMarkdownAsStream() throws Exception {
        final String sourceName = "source.markdown", targetName = "target.markdown", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(8);

            final long actulalSize = Files.size(resultPath), expectedSize = 2326;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareMarkdnAsStream() throws Exception {
        final String sourceName = "source.markdn", targetName = "target.markdn", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(2);

            final long actulalSize = Files.size(resultPath), expectedSize = 2414;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareMdtxtAsStream() throws Exception {
        final String sourceName = "source.mdtxt", targetName = "target.mdtxt", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(3);

            final long actulalSize = Files.size(resultPath), expectedSize = 1623;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareMdtextAsStream() throws Exception {
        final String sourceName = "source.mdtext", targetName = "target.mdtext", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(10);

            final long actulalSize = Files.size(resultPath), expectedSize = 3237;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareMlAsStream() throws Exception {
        final String sourceName = "source.ml", targetName = "target.ml", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(11);

            final long actulalSize = Files.size(resultPath), expectedSize = 3541;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareMliAsStream() throws Exception {
        final String sourceName = "source.mli", targetName = "target.mli", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(17);

            final long actulalSize = Files.size(resultPath), expectedSize = 5903;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    @Ignore("Files are required")
    public void testCompareObjcAsStream() throws Exception {
        final String sourceName = "source.objc", targetName = "target.objc", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(123);

            final long actulalSize = Files.size(resultPath), expectedSize = 1481840L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    @Ignore("Files are required")
    public void testCompareObjcpAsStream() throws Exception {
        final String sourceName = "source.objcp", targetName = "target.objcp", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(123);

            final long actulalSize = Files.size(resultPath), expectedSize = 1481840L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testComparePhpAsStream() throws Exception {
        final String sourceName = "source.php", targetName = "target.php", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(11);

            final long actulalSize = Files.size(resultPath), expectedSize = 5059;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testComparePhp4AsStream() throws Exception {
        final String sourceName = "source.php4", targetName = "target.php4", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(27);

            final long actulalSize = Files.size(resultPath), expectedSize = 6702;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testComparePhp5AsStream() throws Exception {
        final String sourceName = "source.php5", targetName = "target.php5", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(8);

            final long actulalSize = Files.size(resultPath), expectedSize = 3730;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testComparePhtmlAsStream() throws Exception {
        final String sourceName = "source.phtml", targetName = "target.phtml", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(7);

            final long actulalSize = Files.size(resultPath), expectedSize = 2124;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareCtpAsStream() throws Exception {
        final String sourceName = "source.ctp", targetName = "target.ctp", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(4);

            final long actulalSize = Files.size(resultPath), expectedSize = 1615;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testComparePlAsStream() throws Exception {
        final String sourceName = "source.pl", targetName = "target.pl", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(9);

            final long actulalSize = Files.size(resultPath), expectedSize = 2664;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testComparePmAsStream() throws Exception {
        final String sourceName = "source.pm", targetName = "target.pm", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(112);

            final long actulalSize = Files.size(resultPath), expectedSize = 38840;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testComparePodAsStream() throws Exception {
        final String sourceName = "source.pod", targetName = "target.pod", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(4);

            final long actulalSize = Files.size(resultPath), expectedSize = 1846;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    @Ignore("Files are required")
    public void testCompareTAsStream() throws Exception {
        final String sourceName = "source.t", targetName = "target.t", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(123);

            final long actulalSize = Files.size(resultPath), expectedSize = 1481840L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testComparePsgiAsStream() throws Exception {
        final String sourceName = "source.psgi", targetName = "target.psgi", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(4);

            final long actulalSize = Files.size(resultPath), expectedSize = 2188;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareP6AsStream() throws Exception {
        final String sourceName = "source.p6", targetName = "target.p6", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(6);

            final long actulalSize = Files.size(resultPath), expectedSize = 3061;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testComparePl6AsStream() throws Exception {
        final String sourceName = "source.pl6", targetName = "target.pl6", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(6);

            final long actulalSize = Files.size(resultPath), expectedSize = 2711;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testComparePm6AsStream() throws Exception {
        final String sourceName = "source.pm6", targetName = "target.pm6", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(6);

            final long actulalSize = Files.size(resultPath), expectedSize = 5731;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareNqpAsStream() throws Exception {
        final String sourceName = "source.nqp", targetName = "target.nqp", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(52);

            final long actulalSize = Files.size(resultPath), expectedSize = 7728;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    @Ignore("Files are required")
    public void testComparePropAsStream() throws Exception {
        final String sourceName = "source.prop", targetName = "target.prop", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(123);

            final long actulalSize = Files.size(resultPath), expectedSize = 1481840L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareCfgAsStream() throws Exception {
        final String sourceName = "source.cfg", targetName = "target.cfg", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(6);

            final long actulalSize = Files.size(resultPath), expectedSize = 1800;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareConfAsStream() throws Exception {
        final String sourceName = "source.conf", targetName = "target.conf", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(1);

            final long actulalSize = Files.size(resultPath), expectedSize = 897;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    @Ignore("Files are required")
    public void testCompareDirAsStream() throws Exception {
        final String sourceName = "source.dir", targetName = "target.dir", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(123);

            final long actulalSize = Files.size(resultPath), expectedSize = 1481840L;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testComparePyAsStream() throws Exception {
        final String sourceName = "source.py", targetName = "target.py", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(39);

            final long actulalSize = Files.size(resultPath), expectedSize = 5808;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareRpyAsStream() throws Exception {
        final String sourceName = "source.rpy", targetName = "target.rpy", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(46);

            final long actulalSize = Files.size(resultPath), expectedSize = 17054;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testComparePywAsStream() throws Exception {
        final String sourceName = "source.pyw", targetName = "target.pyw", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(45);

            final long actulalSize = Files.size(resultPath), expectedSize = 23710;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareCpyAsStream() throws Exception {
        final String sourceName = "source.cpy", targetName = "target.cpy", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(5);

            final long actulalSize = Files.size(resultPath), expectedSize = 1430;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareGypAsStream() throws Exception {
        final String sourceName = "source.gyp", targetName = "target.gyp", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(6);

            final long actulalSize = Files.size(resultPath), expectedSize = 2288;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareGypiAsStream() throws Exception {
        final String sourceName = "source.gypi", targetName = "target.gypi", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(23);

            final long actulalSize = Files.size(resultPath), expectedSize = 4649;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testComparePyiAsStream() throws Exception {
        final String sourceName = "source.pyi", targetName = "target.pyi", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(210);

            final long actulalSize = Files.size(resultPath), expectedSize = 53088;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareIpyAsStream() throws Exception {
        final String sourceName = "source.ipy", targetName = "target.ipy", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(9);

            final long actulalSize = Files.size(resultPath), expectedSize = 2015;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareRstAsStream() throws Exception {
        final String sourceName = "source.rst", targetName = "target.rst", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(3);

            final long actulalSize = Files.size(resultPath), expectedSize = 1291;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareRbAsStream() throws Exception {
        final String sourceName = "source.rb", targetName = "target.rb", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(17);

            final long actulalSize = Files.size(resultPath), expectedSize = 3854;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareErbAsStream() throws Exception {
        final String sourceName = "source.erb", targetName = "target.erb", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(12);

            final long actulalSize = Files.size(resultPath), expectedSize = 2843;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareRjsAsStream() throws Exception {
        final String sourceName = "source.rjs", targetName = "target.rjs", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(6);

            final long actulalSize = Files.size(resultPath), expectedSize = 1471;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareGemspecAsStream() throws Exception {
        final String sourceName = "source.gemspec", targetName = "target.gemspec", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(13);

            final long actulalSize = Files.size(resultPath), expectedSize = 4288;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareRakeAsStream() throws Exception {
        final String sourceName = "source.rake", targetName = "target.rake", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(4);

            final long actulalSize = Files.size(resultPath), expectedSize = 1643;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareRuAsStream() throws Exception {
        final String sourceName = "source.ru", targetName = "target.ru", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(11);

            final long actulalSize = Files.size(resultPath), expectedSize = 2498;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testComparePodspecAsStream() throws Exception {
        final String sourceName = "source.podspec", targetName = "target.podspec", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(8);

            final long actulalSize = Files.size(resultPath), expectedSize = 1990;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareRbiAsStream() throws Exception {
        final String sourceName = "source.rbi", targetName = "target.rbi", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(6);

            final long actulalSize = Files.size(resultPath), expectedSize = 1906;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareSassAsStream() throws Exception {
        final String sourceName = "source.sass", targetName = "target.sass", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(8);

            final long actulalSize = Files.size(resultPath), expectedSize = 1621;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareScssAsStream() throws Exception {
        final String sourceName = "source.scss", targetName = "target.scss", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(9);

            final long actulalSize = Files.size(resultPath), expectedSize = 1778;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareScalaAsStream() throws Exception {
        final String sourceName = "source.scala", targetName = "target.scala", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(4);

            final long actulalSize = Files.size(resultPath), expectedSize = 3669;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareSbtAsStream() throws Exception {
        final String sourceName = "source.sbt", targetName = "target.sbt", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(5);

            final long actulalSize = Files.size(resultPath), expectedSize = 2374;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareScAsStream() throws Exception {
        final String sourceName = "source.sc", targetName = "target.sc", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(2);

            final long actulalSize = Files.size(resultPath), expectedSize = 3618;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareShAsStream() throws Exception {
        final String sourceName = "source.sh", targetName = "target.sh", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(17);

            final long actulalSize = Files.size(resultPath), expectedSize = 8741;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareBashAsStream() throws Exception {
        final String sourceName = "source.bash", targetName = "target.bash", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(3);

            final long actulalSize = Files.size(resultPath), expectedSize = 1326;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareBashrcAsStream() throws Exception {
        final String sourceName = "source.bashrc", targetName = "target.bashrc", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(67);

            final long actulalSize = Files.size(resultPath), expectedSize = 34599;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareEbuildAsStream() throws Exception {
        final String sourceName = "source.ebuild", targetName = "target.ebuild", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(173);

            final long actulalSize = Files.size(resultPath), expectedSize = 49127;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareSqlAsStream() throws Exception {
        final String sourceName = "source.sql", targetName = "target.sql", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(46);

            final long actulalSize = Files.size(resultPath), expectedSize = 11564;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareDsqlAsStream() throws Exception {
        final String sourceName = "source.dsql", targetName = "target.dsql", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(2);

            final long actulalSize = Files.size(resultPath), expectedSize = 857;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareVimAsStream() throws Exception {
        final String sourceName = "source.vim", targetName = "target.vim", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(13);

            final long actulalSize = Files.size(resultPath), expectedSize = 3069;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareYamlAsStream() throws Exception {
        final String sourceName = "source.yaml", targetName = "target.yaml", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(7);

            final long actulalSize = Files.size(resultPath), expectedSize = 1994;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareYmlAsStream() throws Exception {
        final String sourceName = "source.yml", targetName = "target.yml", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new ComparerSettings())) {
            comparer.add(targetStream);
            comparer.compare(resultStream, new CompareOptions.Builder()
                    .setGenerateSummaryPage(true)
                    .setDetalisationLevel(DetalisationLevel.High)
                    .setDetectStyleChanges(true)
                    .build());


            LOG.debug("Result file was written as {}", resultPath);
            final ChangeInfo[] changes = comparer.getChanges();
            LOG.debug("Finished comparing with {} changes.", changes.length);
            assertThat(changes)
                    .isNotNull()
                    .withFailMessage("Changes count is not as expected:<%d>", changes.length)
                    .hasSize(11);

            final long actulalSize = Files.size(resultPath), expectedSize = 2622;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }
}
