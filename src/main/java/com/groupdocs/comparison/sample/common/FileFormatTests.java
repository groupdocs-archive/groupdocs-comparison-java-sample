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

import static com.groupdocs.comparison.sample.TestRunner.getStoragePath;

public class FileFormatTests extends TestNGSetUp {

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 22291, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 15278, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 8630, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1153, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 3286, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 16095, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 6156, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 112919, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 129536, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertTrue((12600 < size) && (size < 12700), "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertTrue(54500 < size && size < 54750, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareXlsxAsStream() throws Exception {
        final String sourceName = "source.xlsx", targetName = "target.xlsx", resultExtension = ".html";
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertTrue(7775 < size && size < 7785, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertTrue(52900 < size && size < 53300, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertTrue(22300 < size && size < 22400, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertTrue(16100 < size && size < 16200, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 11288, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertTrue(5400 < size && size < 5550, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 775, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 2013, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 754, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertTrue(5400 < size && size < 5550, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 9728, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 191845, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 2347543, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 325269, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 124500, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 175172, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
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
        }
            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 174456, "Result file has incorrect size");
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertTrue(1900 < size && size < 2000, "Result file has incorrect size");
        }
    }

    @Test
    public void testCompareEmlxAsStream() throws Exception {
        final String sourceName = "source.emlx", targetName = "target.emlx", resultExtension = ".emlx";
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertTrue(1900 < size && size < 2000, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 15872, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 9260, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 29833, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 15042, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 14396, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 15694, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 19232, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 6629, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 8559, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 6989, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 3190, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 5425, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 981, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 2999, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 3415, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1074, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 14332, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 6686, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 10899, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 3816, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 2035, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 6229, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 4544, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 2937, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 20492, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 13900, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 2865, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 777526, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 22771, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 15775, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 2776, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 5517, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 2124, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 3004, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 5537, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 4694, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 3162, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 3723, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 2074, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 4037, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 5383, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 8187, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 8081, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 9346, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 6096, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 2988, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1828, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 3902, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 56964, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 2294, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 3321, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 4648, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 3408, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 8278, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 8617, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1897, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1079, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1481840, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 6796, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 27461, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 38580, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1610, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 3660, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 7210, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 74223, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 2173, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1617, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 5288, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 3642, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1588, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 5894, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 2206, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 2960, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 2526, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 2383, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1742, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1906, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 5967, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 3169, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 6022, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 12165, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1662, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 48128, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 55518, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 15026, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 1056, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 3640, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 2548, "Result file has incorrect size");
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertEquals(size, 3084, "Result file has incorrect size");
        }
    }
}
