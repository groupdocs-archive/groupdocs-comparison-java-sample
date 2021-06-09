package com.groupdocs.comparison.sample.common;

import com.groupdocs.comparison.Comparer;
import com.groupdocs.comparison.ComparerSettings;
import com.groupdocs.comparison.options.CompareOptions;
import com.groupdocs.comparison.options.style.DetalisationLevel;
import com.groupdocs.comparison.sample.config.TestNGSetUp;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import static com.groupdocs.comparison.sample.TestRunner.getOutputPath;
import static com.groupdocs.comparison.sample.TestRunner.getStoragePath;

public class FileFormatTests extends TestNGSetUp {

    @Test
    public void testCompareAsAsStream() throws Exception {
        final String sourceName = "source.as", targetName = "target.as", resultName = "ff_testCompareAsAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 22291, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareAs3AsStream() throws Exception {
        final String sourceName = "source.as3", targetName = "target.as3", resultName = "ff_testCompareAs3AsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 15278, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareAsmAsStream() throws Exception {
        final String sourceName = "source.asm", targetName = "target.asm", resultName = "ff_testCompareAsmAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 8630, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareBatAsStream() throws Exception {
        final String sourceName = "source.bat", targetName = "target.bat", resultName = "ff_testCompareBatAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1153, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareCmdAsStream() throws Exception {
        final String sourceName = "source.cmd", targetName = "target.cmd", resultName = "ff_testCompareCmdAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 3286, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareCAsStream() throws Exception {
        final String sourceName = "source.c", targetName = "target.c", resultName = "ff_testCompareCAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 16095, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareHAsStream() throws Exception {
        final String sourceName = "source.h", targetName = "target.h", resultName = "ff_testCompareHAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 6156, "Result file has incorrect size");
        }
    }

    @Test
    public void testComparePdfAsStream() throws Exception {
        final String sourceName = "source.pdf", targetName = "target.pdf", resultName = "ff_testComparePdfAsStream.pdf";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 112919, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareDocAsStream() throws Exception {
        final String sourceName = "source.doc", targetName = "target.doc", resultName = "ff_testCompareDocAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 129536, "Result file has incorrect size");
        }
    }

    @Test
    @Ignore("Files are required")
    public void testCompareDocmAsStream() throws Exception {
        final String sourceName = "source.docm", targetName = "target.docm", resultName = "ff_testCompareDocmAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareDocxAsStream() throws Exception {
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "ff_testCompareDocxAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertTrue((12600 < size) && (size < 12700), "Result file has incorrect size");
        }
    }

    @Test
    @Ignore("Files are required")
    public void testCompareDotAsStream() throws Exception {
        final String sourceName = "source.dot", targetName = "target.dot", resultName = "ff_testCompareDotAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
    @Ignore("Files are required")
    public void testCompareDotmAsStream() throws Exception {
        final String sourceName = "source.dotm", targetName = "target.dotm", resultName = "ff_testCompareDotmAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
    @Ignore("Files are required")
    public void testCompareDotxAsStream() throws Exception {
        final String sourceName = "source.dotx", targetName = "target.dotx", resultName = "ff_testCompareDotxAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareXlsAsStream() throws Exception {
        final String sourceName = "source.xls", targetName = "target.xls", resultName = "ff_testCompareXlsAsStream.xlsx";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertTrue(54500 < size && size < 54750, "Result file has incorrect size");
        }
    }

    @Test
    @Ignore("Files are required")
    public void testCompareXltAsStream() throws Exception {
        final String sourceName = "source.xlt", targetName = "target.xlt", resultName = "ff_testCompareXltAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareXlsxAsStream() throws Exception {
        final String sourceName = "source.xlsx", targetName = "target.xlsx", resultName = "ff_testCompareXlsxAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertTrue(7775 < size && size < 7785, "Result file has incorrect size");
        }
    }

    @Test
    @Ignore("Files are required")
    public void testCompareXltmAsStream() throws Exception {
        final String sourceName = "source.xltm", targetName = "target.xltm", resultName = "ff_testCompareXltmAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
    @Ignore("Files are required")
    public void testCompareXlsbAsStream() throws Exception {
        final String sourceName = "source.xlsb", targetName = "target.xlsb", resultName = "ff_testCompareXlsbAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
    @Ignore("Files are required")
    public void testCompareXlsmAsStream() throws Exception {
        final String sourceName = "source.xlsm", targetName = "target.xlsm", resultName = "ff_testCompareXlsmAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
    @Ignore("Files are required")
    public void testComparePotAsStream() throws Exception {
        final String sourceName = "source.pot", targetName = "target.pot", resultName = "ff_testComparePotAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
    @Ignore("Files are required")
    public void testComparePotxAsStream() throws Exception {
        final String sourceName = "source.potx", targetName = "target.potx", resultName = "ff_testComparePotAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
    @Ignore("Files are required")
    public void testComparePpsAsStream() throws Exception {
        final String sourceName = "source.pps", targetName = "target.pps", resultName = "ff_testComparePpsAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
    @Ignore("Files are required")
    public void testComparePpsxAsStream() throws Exception {
        final String sourceName = "source.ppsx", targetName = "target.ppsx", resultName = "ff_testComparePpsxAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
    public void testComparePptxAsStream() throws Exception {
        final String sourceName = "source.pptx", targetName = "target.pptx", resultName = "ff_testComparePptxAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertTrue(52900 < size && size < 53300, "Result file has incorrect size");
        }
    }

    @Test
    @Ignore("Files are required")
    public void testComparePptAsStream() throws Exception {
        final String sourceName = "source.ppt", targetName = "target.ppt", resultName = "ff_testComparePptAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareVsdxAsStream() throws Exception {
        final String sourceName = "source.vsdx", targetName = "target.vsdx", resultName = "ff_testCompareVsdxAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertTrue(22300 < size && size < 22400, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareVsdAsStream() throws Exception {
        final String sourceName = "source.vsd", targetName = "target.vsd", resultName = "ff_testCompareVsdAsStream.vsdx";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertTrue(16100 < size && size < 16200, "Result file has incorrect size");
        }
    }

    @Test
    @Ignore("Files are required")
    public void testCompareVssAsStream() throws Exception {
        final String sourceName = "source.vss", targetName = "target.vss", resultName = "ff_testCompareVssAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
    @Ignore("Files are required")
    public void testCompareVstAsStream() throws Exception {
        final String sourceName = "source.vst", targetName = "target.vst", resultName = "ff_testCompareVstAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
    @Ignore("Files are required")
    public void testCompareVdxAsStream() throws Exception {
        final String sourceName = "source.vdx", targetName = "target.vdx", resultName = "ff_testCompareVstAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareOneAsStream() throws Exception {
        final String sourceName = "source.one", targetName = "target.one", resultName = "ff_testCompareOneAsStream.one";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 11288, "Result file has incorrect size");
        }
    }

    @Test
    @Ignore("Files are required")
    public void testCompareOdtAsStream() throws Exception {
        final String sourceName = "source.odt", targetName = "target.odt", resultName = "ff_testCompareOdtAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
    @Ignore("Files are required")
    public void testCompareOdpAsStream() throws Exception {
        final String sourceName = "source.odp", targetName = "target.odp", resultName = "ff_testCompareOdpAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareOtpAsStream() throws Exception {
        final String sourceName = "source.otp", targetName = "target.otp", resultName = "ff_testCompareOtpAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertTrue(5400 < size && size < 5550, "Result file has incorrect size");
        }
    }

    @Test
    @Ignore("Files are required")
    public void testCompareOdsAsStream() throws Exception {
        final String sourceName = "source.ods", targetName = "target.ods", resultName = "ff_testCompareOdsAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
    @Ignore("Files are required")
    public void testCompareOttAsStream() throws Exception {
        final String sourceName = "source.ott", targetName = "target.ott", resultName = "ff_testCompareOttAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
    @Ignore("Files are required")
    public void testCompareRtfAsStream() throws Exception {
        final String sourceName = "source.rtf", targetName = "target.rtf", resultName = "ff_testCompareRtfAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareTxtAsStream() throws Exception {
        final String sourceName = "source.txt", targetName = "target.txt", resultName = "ff_testCompareTxtAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 775, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareCsvAsStream() throws Exception {
        final String sourceName = "source.csv", targetName = "target.csv", resultName = "ff_testCompareCsvAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 2013, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareHtmlAsStream() throws Exception {
        final String sourceName = "source.html", targetName = "target.html", resultName = "ff_testCompareHtmlAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 754, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareMhtmlAsStream() throws Exception {
        final String sourceName = "source.mhtml", targetName = "target.mhtml", resultName = "ff_testCompareMhtmlAsStream.mhtml";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertTrue(5400 < size && size < 5550, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareMobiAsStream() throws Exception {
        final String sourceName = "source.mobi", targetName = "target.mobi", resultName = "ff_testCompareMobiAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 9728, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareDcmAsStream() throws Exception {
        final String sourceName = "source.dcm", targetName = "target.dcm", resultName = "ff_testCompareDcmAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 191845, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareDjvuAsStream() throws Exception {
        final String sourceName = "source.djvu", targetName = "target.djvu", resultName = "ff_testCompareDjvuAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 2347543, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareDwgAsStream() throws Exception {
        final String sourceName = "source.dwg", targetName = "target.dwg", resultName = "ff_testCompareDwgAsStream.pdf";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 325269, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareDxfAsStream() throws Exception {
        final String sourceName = "source.dxf", targetName = "target.dxf", resultName = "ff_testCompareDwgAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 124500, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareBmpAsStream() throws Exception {
        final String sourceName = "source.bmp", targetName = "target.bmp", resultName = "ff_testCompareBmpAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 175172, "Result file has incorrect size");
        }
    }

    @Test
    @Ignore("Files are required")
    public void testCompareGifAsStream() throws Exception {
        final String sourceName = "source.gif", targetName = "target.gif", resultName = "ff_testCompareGifAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
    @Ignore("Files are required")
    public void testCompareJpegAsStream() throws Exception {
        final String sourceName = "source.jpeg", targetName = "target.jpeg", resultName = "ff_testCompareJpegAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
    public void testComparePngAsStream() throws Exception {
        final String sourceName = "source.png", targetName = "target.png", resultName = "ff_testComparePngAsStream.pdf";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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
        }
            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 174456, "Result file has incorrect size");
    }

    @Test
    public void testCompareEmlAsStream() throws Exception {
        final String sourceName = "source.eml", targetName = "target.eml", resultName = "ff_testCompareEmlAsStream.eml";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertTrue(1900 < size && size < 2000, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareEmlxAsStream() throws Exception {
        final String sourceName = "source.emlx", targetName = "target.emlx", resultName = "ff_testCompareEmlxAsStream.emlx";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertTrue(1900 < size && size < 2000, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareMsgAsStream() throws Exception {
        final String sourceName = "source.msg", targetName = "target.msg", resultName = "ff_testCompareMsgAsStream.msg";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 15872, "Result file has incorrect size");
        }
    }

    @Test
    @Ignore("Files are required")
    public void testCompareCadAsStream() throws Exception {
        final String sourceName = "source.cad", targetName = "target.cad", resultName = "ff_testCompareCadAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareCppAsStream() throws Exception {
        final String sourceName = "source.cpp", targetName = "target.cpp", resultName = "ff_testCompareCppAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 9260, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareCcAsStream() throws Exception {
        final String sourceName = "source.cc", targetName = "target.cc", resultName = "ff_testCompareCcAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 29833, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareCxxAsStream() throws Exception {
        final String sourceName = "source.cxx", targetName = "target.cxx", resultName = "ff_testCompareCxxAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 15042, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareHxxAsStream() throws Exception {
        final String sourceName = "source.hxx", targetName = "target.hxx", resultName = "ff_testCompareHxxAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 14396, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareHhAsStream() throws Exception {
        final String sourceName = "source.hh", targetName = "target.hh", resultName = "ff_testCompareHhAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 15694, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareHppAsStream() throws Exception {
        final String sourceName = "source.hpp", targetName = "target.hpp", resultName = "ff_testCompareHppAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 19232, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareCmakeAsStream() throws Exception {
        final String sourceName = "source.cmake", targetName = "target.cmake", resultName = "ff_testCompareCmakeAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 6629, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareCsAsStream() throws Exception {
        final String sourceName = "source.cs", targetName = "target.cs", resultName = "ff_testCompareCsAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 8559, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareCsxAsStream() throws Exception {
        final String sourceName = "source.csx", targetName = "target.csx", resultName = "ff_testCompareCsxAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 6989, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareCakeAsStream() throws Exception {
        final String sourceName = "source.cake", targetName = "target.cake", resultName = "ff_testCompareCakeAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 3190, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareDiffAsStream() throws Exception {
        final String sourceName = "source.diff", targetName = "target.diff", resultName = "ff_testCompareDiffAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 5425, "Result file has incorrect size");
        }
    }

    @Test
    public void testComparePatchAsStream() throws Exception {
        final String sourceName = "source.patch", targetName = "target.patch", resultName = "ff_testComparePatchAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 981, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareRejAsStream() throws Exception {
        final String sourceName = "source.rej", targetName = "target.rej", resultName = "ff_testCompareRejAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 2999, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareGroovyAsStream() throws Exception {
        final String sourceName = "source.groovy", targetName = "target.groovy", resultName = "ff_testCompareGroovyAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 3415, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareGvyAsStream() throws Exception {
        final String sourceName = "source.gvy", targetName = "target.gvy", resultName = "ff_testCompareGvyAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1074, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareGradleAsStream() throws Exception {
        final String sourceName = "source.gradle", targetName = "target.gradle", resultName = "ff_testCompareGradleAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 14332, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareHamlAsStream() throws Exception {
        final String sourceName = "source.haml", targetName = "target.haml", resultName = "ff_testCompareHamlAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 6686, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareJsAsStream() throws Exception {
        final String sourceName = "source.js", targetName = "target.js", resultName = "ff_testCompareJsAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 10899, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareEs6AsStream() throws Exception {
        final String sourceName = "source.es6", targetName = "target.es6", resultName = "ff_testCompareEs6AsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 3816, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareMjsAsStream() throws Exception {
        final String sourceName = "source.mjs", targetName = "target.mjs", resultName = "ff_testCompareMjsAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 2035, "Result file has incorrect size");
        }
    }

    @Test
    public void testComparePacAsStream() throws Exception {
        final String sourceName = "source.pac", targetName = "target.pac", resultName = "ff_testComparePacAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 6229, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareJsonAsStream() throws Exception {
        final String sourceName = "source.json", targetName = "target.json", resultName = "ff_testCompareJsonAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 4544, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareBowerrcAsStream() throws Exception {
        final String sourceName = "source.bowerrc", targetName = "target.bowerrc", resultName = "ff_testCompareBowerrcAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 2937, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareJshintrcAsStream() throws Exception {
        final String sourceName = "source.jshintrc", targetName = "target.jshintrc", resultName = "ff_testCompareJshintrcAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 20492, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareJscsrcAsStream() throws Exception {
        final String sourceName = "source.jscsrc", targetName = "target.jscsrc", resultName = "ff_testCompareJscsrcAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 13900, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareWEBMANIFESTAsStream() throws Exception {
        final String sourceName = "source.webmanifest", targetName = "target.webmanifest", resultName = "ff_testCompareWEBMANIFESTAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 2865, "Result file has incorrect size");
        }
    }

    @Test
    @Ignore("Files are required")
    public void testCompareJsmapAsStream() throws Exception {
        final String sourceName = "source.jsmap", targetName = "target.jsmap", resultName = "ff_testCompareJsmapAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareHarAsStream() throws Exception {
        final String sourceName = "source.har", targetName = "target.har", resultName = "ff_testCompareHarAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 777526, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareJavaAsStream() throws Exception {
        final String sourceName = "source.java", targetName = "target.java", resultName = "ff_testCompareJavaAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 22771, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareLessAsStream() throws Exception {
        final String sourceName = "source.less", targetName = "target.less", resultName = "ff_testCompareLessAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 15775, "Result file has incorrect size");
        }
    }

    @Test
    @Ignore("Files are required")
    public void testCompareLogAsStream() throws Exception {
        final String sourceName = "source.log", targetName = "target.log", resultName = "ff_testCompareLogAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareMakeAsStream() throws Exception {
        final String sourceName = "source.make", targetName = "target.make", resultName = "ff_testCompareMakeAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 2776, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareMkAsStream() throws Exception {
        final String sourceName = "source.mk", targetName = "target.mk", resultName = "ff_testCompareMkAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 5517, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareMdAsStream() throws Exception {
        final String sourceName = "source.md", targetName = "target.md", resultName = "ff_testCompareMdAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 2124, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareMkdAsStream() throws Exception {
        final String sourceName = "source.mkd", targetName = "target.mkd", resultName = "ff_testCompareMkdAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 3004, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareMdwnAsStream() throws Exception {
        final String sourceName = "source.mdwn", targetName = "target.mdwn", resultName = "ff_testCompareMdwnAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 5537, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareMdownAsStream() throws Exception {
        final String sourceName = "source.mdown", targetName = "target.mdown", resultName = "ff_testCompareMdownAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 4694, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareMarkdownAsStream() throws Exception {
        final String sourceName = "source.markdown", targetName = "target.markdown", resultName = "ff_testCompareMarkdownAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 3162, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareMarkdnAsStream() throws Exception {
        final String sourceName = "source.markdn", targetName = "target.markdn", resultName = "ff_testCompareMarkdnAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 3723, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareMdtxtAsStream() throws Exception {
        final String sourceName = "source.mdtxt", targetName = "target.mdtxt", resultName = "ff_testCompareMdtxtAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 2074, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareMdtextAsStream() throws Exception {
        final String sourceName = "source.mdtext", targetName = "target.mdtext", resultName = "ff_testCompareMdtextAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 4037, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareMlAsStream() throws Exception {
        final String sourceName = "source.ml", targetName = "target.ml", resultName = "ff_testCompareMlAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 5383, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareMliAsStream() throws Exception {
        final String sourceName = "source.mli", targetName = "target.mli", resultName = "ff_testCompareMliAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 8187, "Result file has incorrect size");
        }
    }

    @Test
    @Ignore("Files are required")
    public void testCompareObjcAsStream() throws Exception {
        final String sourceName = "source.objc", targetName = "target.objc", resultName = "ff_testCompareObjcAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
    @Ignore("Files are required")
    public void testCompareObjcpAsStream() throws Exception {
        final String sourceName = "source.objcp", targetName = "target.objcp", resultName = "ff_testCompareObjcpAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
    public void testComparePhpAsStream() throws Exception {
        final String sourceName = "source.php", targetName = "target.php", resultName = "ff_testComparePhpAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 8081, "Result file has incorrect size");
        }
    }

    @Test
    public void testComparePhp4AsStream() throws Exception {
        final String sourceName = "source.php4", targetName = "target.php4", resultName = "ff_testComparePhp4AsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 9346, "Result file has incorrect size");
        }
    }

    @Test
    public void testComparePhp5AsStream() throws Exception {
        final String sourceName = "source.php5", targetName = "target.php5", resultName = "ff_testComparePhp5AsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 6096, "Result file has incorrect size");
        }
    }

    @Test
    public void testComparePhtmlAsStream() throws Exception {
        final String sourceName = "source.phtml", targetName = "target.phtml", resultName = "ff_testComparePhtmlAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 2988, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareCtpAsStream() throws Exception {
        final String sourceName = "source.ctp", targetName = "target.ctp", resultName = "ff_testCompareCtpAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1828, "Result file has incorrect size");
        }
    }

    @Test
    public void testComparePlAsStream() throws Exception {
        final String sourceName = "source.pl", targetName = "target.pl", resultName = "ff_testComparePlAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 3902, "Result file has incorrect size");
        }
    }

    @Test
    public void testComparePmAsStream() throws Exception {
        final String sourceName = "source.pm", targetName = "target.pm", resultName = "ff_testComparePmAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 56964, "Result file has incorrect size");
        }
    }

    @Test
    public void testComparePodAsStream() throws Exception {
        final String sourceName = "source.pod", targetName = "target.pod", resultName = "ff_testComparePodAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 2294, "Result file has incorrect size");
        }
    }

    @Test
    @Ignore("Files are required")
    public void testCompareTAsStream() throws Exception {
        final String sourceName = "source.t", targetName = "target.t", resultName = "ff_testCompareTAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
    public void testComparePsgiAsStream() throws Exception {
        final String sourceName = "source.psgi", targetName = "target.psgi", resultName = "ff_testComparePsgiAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 3321, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareP6AsStream() throws Exception {
        final String sourceName = "source.p6", targetName = "target.p6", resultName = "ff_testCompareP6AsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 4648, "Result file has incorrect size");
        }
    }

    @Test
    public void testComparePl6AsStream() throws Exception {
        final String sourceName = "source.pl6", targetName = "target.pl6", resultName = "ff_testComparePl6AsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 3408, "Result file has incorrect size");
        }
    }

    @Test
    public void testComparePm6AsStream() throws Exception {
        final String sourceName = "source.pm6", targetName = "target.pm6", resultName = "ff_testComparePm6AsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 8278, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareNqpAsStream() throws Exception {
        final String sourceName = "source.nqp", targetName = "target.nqp", resultName = "ff_testCompareNqpAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 8617, "Result file has incorrect size");
        }
    }

    @Test
    @Ignore("Files are required")
    public void testComparePropAsStream() throws Exception {
        final String sourceName = "source.prop", targetName = "target.prop", resultName = "ff_testComparePropAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareCfgAsStream() throws Exception {
        final String sourceName = "source.cfg", targetName = "target.cfg", resultName = "ff_testCompareCfgAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1897, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareConfAsStream() throws Exception {
        final String sourceName = "source.conf", targetName = "target.conf", resultName = "ff_testCompareConfAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1079, "Result file has incorrect size");
        }
    }

    @Test
    @Ignore("Files are required")
    public void testCompareDirAsStream() throws Exception {
        final String sourceName = "source.dir", targetName = "target.dir", resultName = "ff_testCompareDirAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
    public void testComparePyAsStream() throws Exception {
        final String sourceName = "source.py", targetName = "target.py", resultName = "ff_testComparePyAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 6796, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareRpyAsStream() throws Exception {
        final String sourceName = "source.rpy", targetName = "target.rpy", resultName = "ff_testCompareRpyAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 27461, "Result file has incorrect size");
        }
    }

    @Test
    public void testComparePywAsStream() throws Exception {
        final String sourceName = "source.pyw", targetName = "target.pyw", resultName = "ff_testComparePywAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 38580, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareCpyAsStream() throws Exception {
        final String sourceName = "source.cpy", targetName = "target.cpy", resultName = "ff_testCompareCpyAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1610, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareGypAsStream() throws Exception {
        final String sourceName = "source.gyp", targetName = "target.gyp", resultName = "ff_testCompareGypAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 3660, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareGypiAsStream() throws Exception {
        final String sourceName = "source.gypi", targetName = "target.gypi", resultName = "ff_testCompareGypiAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 7210, "Result file has incorrect size");
        }
    }

    @Test
    public void testComparePyiAsStream() throws Exception {
        final String sourceName = "source.pyi", targetName = "target.pyi", resultName = "ff_testComparePyiAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 74223, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareIpyAsStream() throws Exception {
        final String sourceName = "source.ipy", targetName = "target.ipy", resultName = "ff_testCompareIpyAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 2173, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareRstAsStream() throws Exception {
        final String sourceName = "source.rst", targetName = "target.rst", resultName = "ff_testCompareRstAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1617, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareRbAsStream() throws Exception {
        final String sourceName = "source.rb", targetName = "target.rb", resultName = "ff_testCompareRbAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 5288, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareErbAsStream() throws Exception {
        final String sourceName = "source.erb", targetName = "target.erb", resultName = "ff_testCompareErbAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 3642, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareRjsAsStream() throws Exception {
        final String sourceName = "source.rjs", targetName = "target.rjs", resultName = "ff_testCompareRjsAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1588, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareGemspecAsStream() throws Exception {
        final String sourceName = "source.gemspec", targetName = "target.gemspec", resultName = "ff_testCompareGemspecAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 5894, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareRakeAsStream() throws Exception {
        final String sourceName = "source.rake", targetName = "target.rake", resultName = "ff_testCompareRakeAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 2206, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareRuAsStream() throws Exception {
        final String sourceName = "source.ru", targetName = "target.ru", resultName = "ff_testCompareRuAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 2960, "Result file has incorrect size");
        }
    }

    @Test
    public void testComparePodspecAsStream() throws Exception {
        final String sourceName = "source.podspec", targetName = "target.podspec", resultName = "ff_testComparePodspecAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 2526, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareRbiAsStream() throws Exception {
        final String sourceName = "source.rbi", targetName = "target.rbi", resultName = "ff_testCompareRbiAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 2383, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareSassAsStream() throws Exception {
        final String sourceName = "source.sass", targetName = "target.sass", resultName = "ff_testCompareSassAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1742, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareScssAsStream() throws Exception {
        final String sourceName = "source.scss", targetName = "target.scss", resultName = "ff_testCompareScssAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1906, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareScalaAsStream() throws Exception {
        final String sourceName = "source.scala", targetName = "target.scala", resultName = "ff_testCompareScalaAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 5967, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareSbtAsStream() throws Exception {
        final String sourceName = "source.sbt", targetName = "target.sbt", resultName = "ff_testCompareSbtAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 3169, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareScAsStream() throws Exception {
        final String sourceName = "source.sc", targetName = "target.sc", resultName = "ff_testCompareScAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 6022, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareShAsStream() throws Exception {
        final String sourceName = "source.sh", targetName = "target.sh", resultName = "ff_testCompareShAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 12165, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareBashAsStream() throws Exception {
        final String sourceName = "source.bash", targetName = "target.bash", resultName = "ff_testCompareBashAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1662, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareBashrcAsStream() throws Exception {
        final String sourceName = "source.bashrc", targetName = "target.bashrc", resultName = "ff_testCompareBashrcAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 48128, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareEbuildAsStream() throws Exception {
        final String sourceName = "source.ebuild", targetName = "target.ebuild", resultName = "ff_testCompareEbuildAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 55518, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareSqlAsStream() throws Exception {
        final String sourceName = "source.sql", targetName = "target.sql", resultName = "ff_testCompareSqlAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 15026, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareDsqlAsStream() throws Exception {
        final String sourceName = "source.dsql", targetName = "target.dsql", resultName = "ff_testCompareDsqlAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1056, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareVimAsStream() throws Exception {
        final String sourceName = "source.vim", targetName = "target.vim", resultName = "ff_testCompareVimAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 3640, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareYamlAsStream() throws Exception {
        final String sourceName = "source.yaml", targetName = "target.yaml", resultName = "ff_testCompareYamlAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 2548, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareYmlAsStream() throws Exception {
        final String sourceName = "source.yml", targetName = "target.yml", resultName = "ff_testCompareYmlAsStream.html";
        final Path sourcePath = getStoragePath(sourceName, "formats");
        final Path targetPath = getStoragePath(targetName, "formats");
        final Path resultPath = getOutputPath(resultName);

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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 3084, "Result file has incorrect size");
        }
    }
}
