package com.groupdocs.comparison.sample.operations;


import com.groupdocs.comparison.Comparer;
import com.groupdocs.comparison.ComparerSettings;
import com.groupdocs.comparison.options.CompareOptions;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import static com.groupdocs.comparison.sample.TestRunner.getOutputPath;
import static com.groupdocs.comparison.sample.TestRunner.getStoragePath;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Aleksey Permyakov on 10.08.2016.
 */
@SuppressWarnings("all")
public class DocumentsOperationsTests {
    private static final Logger LOG = LoggerFactory.getLogger(DocumentsOperationsTests.class);

    @Test(invocationCount = 1)
    public void testCompareTwoHtmlFromStreams() throws Exception {

        final String sourceName = "source.html", targetName = "target.html", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName);
        final Path targetPath = getStoragePath(targetName);
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetStream); // TODO: DEBUG 19.6
            comparer.compare(resultPath);

            LOG.debug("Result file was written as {}", resultPath);
            final long actulalSize = Files.size(resultPath), expectedSize = 688;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareTwoHtml() throws Exception {

        final String sourceName = "source.html", targetName = "target.html", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName);
        final Path targetPath = getStoragePath(targetName);
        final Path resultPath = getOutputPath(resultExtension);

        try (ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
             FileOutputStream fileOutputStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);
            comparer.compare(arrayOutputStream);

            IOUtils.write(arrayOutputStream.toByteArray(), fileOutputStream);

            LOG.debug("Result file was written as {}", resultPath);
            final long actulalSize = Files.size(resultPath), expectedSize = 688;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

    @Test(invocationCount = 1)
    public void testCompareTwoPdfFromStreamsWithResultPathAndSettings() throws Exception {
        final String sourceName = "source.pdf", targetName = "target.pdf", resultExtension = ".pdf";
        final Path sourcePath = getStoragePath(sourceName);
        final Path targetPath = getStoragePath(targetName);
        final Path resultPath = getOutputPath(resultExtension);

        ComparerSettings comparerSettings = new ComparerSettings();
        try (Comparer comparer = new Comparer(sourcePath, comparerSettings)) {
            comparer.add(targetPath);

            CompareOptions compareOptions = new CompareOptions();
            compareOptions.setGenerateSummaryPage(true);
            comparer.compare(resultPath, compareOptions);

            LOG.debug("Result file was written as {}", resultPath);
            final long actulalSize = Files.size(resultPath), expectedSize = 1482024;
            assertThat(actulalSize)
                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
                    .isEqualTo(expectedSize);
        }
    }

//    @Test(invocationCount = 1)
//    public void testCompareTwoPdfFromStreamsWithSettings() throws Exception {
//
//        final String sourceName = "source.pdf", targetName = "target.pdf", resultExtension = ".pdf";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//
//        // Create stream of document
//        InputStream sourceStream = new FileInputStream(sourcePath);
//        InputStream targetStream = new FileInputStream(targetPath);
//
//        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
//        Comparer comparer = new Comparer(sourcePath);
//        comparer.compare(sourceStream, targetStream);
//        result.saveDocument(getOutputPath(resultExtension));
//            LOG.debug("Result file was written as {}", resultPath);
//            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
//            assertThat(actulalSize)
//                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
//                    .isEqualTo(expectedSize);
//    }
//
//    @Test(invocationCount = 1)
//    public void testCompareTwoPdfFromStreamsWithResultPath() throws Exception {
//
//        final String sourceName = "source.pdf", targetName = "target.pdf", resultExtension = ".pdf";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(resultExtension);
//
//        // Create stream of document
//        InputStream sourceStream = new FileInputStream(sourcePath);
//        InputStream targetStream = new FileInputStream(targetPath);
//
//        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
//        Comparer comparer = new Comparer(sourcePath);
//        comparer.compare(sourceStream, targetStream);
//        result.saveDocument(resultPath);
//            LOG.debug("Result file was written as {}", resultPath);
//            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
//            assertThat(actulalSize)
//                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
//                    .isEqualTo(expectedSize);
//    }
//
//    @Test(invocationCount = 1)
//    public void testCompareTwoPdfFromStreams() throws Exception {
//
//        final String sourceName = "source.pdf", targetName = "target.pdf", resultExtension = ".pdf";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//
//        // Create stream of document
//        InputStream sourceStream = new FileInputStream(sourcePath);
//        InputStream targetStream = new FileInputStream(targetPath);
//
//        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
//        Comparer comparer = new Comparer(sourcePath);
//        comparer.compare(sourceStream, targetStream);
//        result.saveDocument(getOutputPath(resultExtension));
//            LOG.debug("Result file was written as {}", resultPath);
//            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
//            assertThat(actulalSize)
//                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
//                    .isEqualTo(expectedSize);
//    }
//
//    @Test(invocationCount = 1)
//    public void testCompareTwoPdfWithResultPathAndSettings() throws Exception {
//
//        final String sourceName = "source.pdf", targetName = "target.pdf", resultExtension = ".pdf";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(resultExtension);
//
//        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
//        Comparer comparer = new Comparer(sourcePath);
//            comparer.add(targetPath);
//        comparer.compare(resultPath);
//            LOG.debug("Result file was written as {}", resultPath);
//            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
//            assertThat(actulalSize)
//                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
//                    .isEqualTo(expectedSize);
//    }
//
//    @Test(invocationCount = 1)
//    public void testCompareTwoPdfWithSettings() throws Exception {
//
//        final String sourceName = "source.pdf", targetName = "target.pdf", resultExtension = ".pdf";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//
//        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
//        Comparer comparer = new Comparer(sourcePath);
//        comparer.compare(sourcePath, targetPath);
//        result.saveDocument(getOutputPath(resultExtension));
//            LOG.debug("Result file was written as {}", resultPath);
//            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
//            assertThat(actulalSize)
//                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
//                    .isEqualTo(expectedSize);
//    }
//
//    @Test(invocationCount = 1)
//    public void testCompareTwoPdfWithResultPath() throws Exception {
//
//        final String sourceName = "source.pdf", targetName = "target.pdf", resultExtension = ".pdf";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(resultExtension);
//
//        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
//        Comparer comparer = new Comparer(sourcePath);
//            comparer.add(targetPath);
//        comparer.compare(resultPath);
//            LOG.debug("Result file was written as {}", resultPath);
//            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
//            assertThat(actulalSize)
//                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
//                    .isEqualTo(expectedSize);
//    }
//
//    @Test(invocationCount = 1)
//    public void testCompareTwoPdf() throws Exception {
//
//        final String sourceName = "source.pdf", targetName = "target.pdf", resultExtension = ".pdf";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//
//        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
//        Comparer comparer = new Comparer(sourcePath);
//        comparer.compare(sourcePath, targetPath);
//        result.saveDocument(getOutputPath(resultExtension));
//            LOG.debug("Result file was written as {}", resultPath);
//            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
//            assertThat(actulalSize)
//                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
//                    .isEqualTo(expectedSize);
//    }
//
//    @Test(invocationCount = 1)
//    public void testCompareTwoPresentationsFromStreamsWithResultPathAndSettings() throws Exception {
//
//        final String sourceName = "source.pptx", targetName = "target.pptx", resultExtension = ".pptx";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(resultExtension);
//
//        // Create stream of document
//        InputStream sourceStream = new FileInputStream(sourcePath);
//        InputStream targetStream = new FileInputStream(targetPath);
//
//        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
//        Comparer comparer = new Comparer(sourcePath);
//        comparer.compare(sourceStream, targetStream);
//        result.saveDocument(resultPath);
//            LOG.debug("Result file was written as {}", resultPath);
//            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
//            assertThat(actulalSize)
//                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
//                    .isEqualTo(expectedSize);
//    }
//
//    @Test(invocationCount = 1)
//    public void testCompareTwoPresentationsFromStreamsWithSettings() throws Exception {
//
//        final String sourceName = "source.pptx", targetName = "target.pptx", resultExtension = ".pptx";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//
//        // Create two streams of presentations
//
//        InputStream sourceStream = new FileInputStream(sourcePath);
//        InputStream targetStream = new FileInputStream(targetPath);
//
//        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
//        Comparer comparer = new Comparer(sourcePath);
//        comparer.compare(sourceStream, targetStream);
//        result.saveDocument(getOutputPath(resultExtension));
//            LOG.debug("Result file was written as {}", resultPath);
//            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
//            assertThat(actulalSize)
//                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
//                    .isEqualTo(expectedSize);
//    }
//
//    @Test(invocationCount = 1)
//    public void testCompareTwoPresentationsFromStreamsWithResultPath() throws Exception {
//
//        final String sourceName = "source.pptx", targetName = "target.pptx", resultExtension = ".pptx";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(resultExtension);
//
//        // Create two streams of presentations
//        InputStream sourceStream = new FileInputStream(sourcePath);
//        InputStream targetStream = new FileInputStream(targetPath);
//
//        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
//        Comparer comparer = new Comparer(sourcePath);
//        comparer.compare(sourceStream, targetStream);
//        result.saveDocument(resultPath);
//            LOG.debug("Result file was written as {}", resultPath);
//            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
//            assertThat(actulalSize)
//                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
//                    .isEqualTo(expectedSize);
//    }
//
//    @Test(invocationCount = 1)
//    public void testCompareTwoPresentationsFromStreams() throws Exception {
//
//        final String sourceName = "source.pptx", targetName = "target.pptx", resultExtension = ".pptx";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//
//        // Create two streams of presentations
//        InputStream sourceStream = new FileInputStream(sourcePath);
//        InputStream targetStream = new FileInputStream(targetPath);
//
//        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
//        Comparer comparer = new Comparer(sourcePath);
//        comparer.compare(sourceStream, targetStream);
//        result.saveDocument(getOutputPath(resultExtension));
//            LOG.debug("Result file was written as {}", resultPath);
//            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
//            assertThat(actulalSize)
//                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
//                    .isEqualTo(expectedSize);
//    }
//
//    @Test(invocationCount = 1)
//    public void testCompareTwoPresentationsWithResultPathAndSettings() throws Exception {
//
//        final String sourceName = "source.pptx", targetName = "target.pptx", resultExtension = ".pptx";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(resultExtension);
//
//        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
//        Comparer comparer = new Comparer(sourcePath);
//            comparer.add(targetPath);
//        comparer.compare(resultPath);
//            LOG.debug("Result file was written as {}", resultPath);
//            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
//            assertThat(actulalSize)
//                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
//                    .isEqualTo(expectedSize);
//    }
//
//    @Test(invocationCount = 1)
//    public void testCompareTwoPresentationsWithSettings() throws Exception {
//
//        final String sourceName = "source.pptx", targetName = "target.pptx", resultExtension = ".pptx";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//
//        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
//        Comparer comparer = new Comparer(sourcePath);
//        comparer.compare(sourcePath, targetPath);
//        result.saveDocument(getOutputPath(resultName));
//            LOG.debug("Result file was written as {}", resultPath);
//            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
//            assertThat(actulalSize)
//                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
//                    .isEqualTo(expectedSize);
//    }
//
//    @Test(invocationCount = 1)
//     public void testCompareTwoPresentationsWithResultPath() throws Exception {
//
//        final String sourceName = "source.pptx", targetName = "target.pptx", resultExtension = ".pptx";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(resultExtension);
//
//        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
//        Comparer comparer = new Comparer(sourcePath);
//            comparer.add(targetPath);
//        comparer.compare(resultPath);
//            LOG.debug("Result file was written as {}", resultPath);
//            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
//            assertThat(actulalSize)
//                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
//                    .isEqualTo(expectedSize);
//    }
//
//    @Test(invocationCount = 1)
//     public void testCompareTwoPresentations() throws Exception {
//
//        final String sourceName = "source.pptx", targetName = "target.pptx", resultExtension = ".pptx";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//
//        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
//        Comparer comparer = new Comparer(sourcePath);
//        comparer.compare(sourcePath, targetPath);
//        result.saveDocument(getOutputPath(resultName));
//            LOG.debug("Result file was written as {}", resultPath);
//            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
//            assertThat(actulalSize)
//                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
//                    .isEqualTo(expectedSize);
//
//    }
//
//    @Test(invocationCount = 1)
//     public void testCompareTwoTextsFromStreamsWithResultPathAndSettings() throws Exception {
//
//        final String sourceName = "source.txt", targetName = "target.txt", resultExtension = ".txt";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(resultExtension);
//
//        // Create two streams of textFiles
//        InputStream sourceStream = new FileInputStream(sourcePath);
//        InputStream targetStream = new FileInputStream(targetPath);
//
//        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
//        Comparer comparer = new Comparer(sourcePath);
//        comparer.compare(sourceStream, targetStream); // TODO: DEBUG 19.6
//        result.saveDocument(resultPath);
//            LOG.debug("Result file was written as {}", resultPath);
//            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
//            assertThat(actulalSize)
//                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
//                    .isEqualTo(expectedSize);
//    }
//
//    @Test(invocationCount = 1)
//     public void testCompareTwoTextsFromStreamsWithSettings() throws Exception {
//
//        final String sourceName = "source.txt", targetName = "target.txt", resultExtension = ".txt";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(resultExtension);
//
//        // Create two streams of text files
//        InputStream sourceStream = new FileInputStream(sourcePath);
//        InputStream targetStream = new FileInputStream(targetPath);
//
//        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
//        Comparer comparer = new Comparer(sourcePath);
//        comparer.compare(sourceStream, targetStream); // TODO: DEBUG 19.6
//        result.saveDocument(resultPath);
//            LOG.debug("Result file was written as {}", resultPath);
//            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
//            assertThat(actulalSize)
//                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
//                    .isEqualTo(expectedSize);
//    }
//
//    @Test(invocationCount = 1)
//     public void testCompareTwoTextsFromStreamsWithResultPath() throws Exception {
//
//        final String sourceName = "source.txt", targetName = "target.txt", resultExtension = ".txt";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(resultExtension);
//
//        // Create two streams of text files
//        InputStream sourceStream = new FileInputStream(sourcePath);
//        InputStream targetStream = new FileInputStream(targetPath);
//
//        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
//        Comparer comparer = new Comparer(sourcePath);
//        comparer.compare(sourceStream, targetStream); // TODO: DEBUG 19.6
//        result.saveDocument(resultPath);
//            LOG.debug("Result file was written as {}", resultPath);
//            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
//            assertThat(actulalSize)
//                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
//                    .isEqualTo(expectedSize);
//    }
//
//    @Test(invocationCount = 1)
//     public void testCompareTwoTextsFromStreams() throws Exception {
//
//        final String sourceName = "source.txt", targetName = "target.txt", resultExtension = ".txt";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//
//        // Create two streams of text files
//        InputStream sourceStream = new FileInputStream(sourcePath);
//        InputStream targetStream = new FileInputStream(targetPath);
//        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
//        Comparer comparer = new Comparer(sourcePath);
//        comparer.compare(sourceStream, targetStream); // TODO: DEBUG 19.6
//        result.saveDocument(getOutputPath(resultName));
//            LOG.debug("Result file was written as {}", resultPath);
//            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
//            assertThat(actulalSize)
//                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
//                    .isEqualTo(expectedSize);
//    }
//
//    @Test(invocationCount = 1)
//     public void testCompareTwoTextsWithResultPathAndSettings() throws Exception {
//
//        final String sourceName = "source.txt", targetName = "target.txt", resultExtension = ".txt";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(resultExtension);
//
//        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
//        Comparer comparer = new Comparer(sourcePath);
//            comparer.add(targetPath);
//        comparer.compare(resultPath);
//            LOG.debug("Result file was written as {}", resultPath);
//            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
//            assertThat(actulalSize)
//                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
//                    .isEqualTo(expectedSize);
//    }
//
//    @Test(invocationCount = 1)
//     public void testCompareTwoTextsWithSettings() throws Exception {
//
//        final String sourceName = "source.txt", targetName = "target.txt", resultExtension = ".txt";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//
//        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
//        Comparer comparer = new Comparer(sourcePath);
//        comparer.compare(sourcePath, targetPath);
//        result.saveDocument(getOutputPath(resultName));
//            LOG.debug("Result file was written as {}", resultPath);
//            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
//            assertThat(actulalSize)
//                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
//                    .isEqualTo(expectedSize);
//
//    }
//
//    @Test(invocationCount = 1)
//     public void testCompareTwoTextsWithResultPath() throws Exception {
//
//        final String sourceName = "source.txt", targetName = "target.txt", resultExtension = ".txt";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(resultExtension);
//
//        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
//        Comparer comparer = new Comparer(sourcePath);
//            comparer.add(targetPath);
//        comparer.compare(resultPath);
//            LOG.debug("Result file was written as {}", resultPath);
//            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
//            assertThat(actulalSize)
//                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
//                    .isEqualTo(expectedSize);
//    }
//
//    @Test(invocationCount = 1)
//     public void testCompareTwoTexts() throws Exception {
//
//        final String sourceName = "source.txt", targetName = "target.txt", resultExtension = ".txt";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//
//        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
//        Comparer comparer = new Comparer(sourcePath);
//        comparer.compare(sourcePath, targetPath);
//        result.saveDocument(getOutputPath(resultName));
//            LOG.debug("Result file was written as {}", resultPath);
//            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
//            assertThat(actulalSize)
//                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
//                    .isEqualTo(expectedSize);
//
//    }
//
//    @Test(invocationCount = 1)
//     public void testCompareTwoWordsFromStreamsWithResultPathAndSettings() throws Exception {
//
//        final String sourceName = "source.docx", targetName = "target.docx", resultExtension = ".docx";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(resultExtension);
//
//        // Create two streams of documents
//        InputStream sourceStream = new FileInputStream(sourcePath);
//        InputStream targetStream = new FileInputStream(targetPath);
//
//        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
//        Comparer comparer = new Comparer(sourcePath);
//        comparer.compare(sourceStream, targetStream);
//        result.saveDocument(resultPath);
//            LOG.debug("Result file was written as {}", resultPath);
//            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
//            assertThat(actulalSize)
//                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
//                    .isEqualTo(expectedSize);
//    }
//
//    @Test(invocationCount = 1)
//     public void testCompareTwoWordsFromStreamsWithSettings() throws Exception {
//
//        final String sourceName = "source.docx", targetName = "target.docx", resultExtension = ".docx";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//
//        // Create two streams of documents
//        InputStream sourceStream = new FileInputStream(sourcePath);
//        InputStream targetStream = new FileInputStream(targetPath);
//
//        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
//        Comparer comparer = new Comparer(sourcePath);
//        comparer.compare(sourceStream, targetStream);
//        result.saveDocument(getOutputPath(resultName));
//            LOG.debug("Result file was written as {}", resultPath);
//            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
//            assertThat(actulalSize)
//                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
//                    .isEqualTo(expectedSize);
//    }
//
//    @Test(invocationCount = 1)
//     public void testCompareTwoWordsFromStreamsWithResultPath() throws Exception {
//
//        final String sourceName = "source.docx", targetName = "target.docx", resultExtension = ".docx";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(resultExtension);
//
//        // Create two streams of documents
//        InputStream sourceStream = new FileInputStream(sourcePath);
//        InputStream targetStream = new FileInputStream(targetPath);
//
//        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
//        Comparer comparer = new Comparer(sourcePath);
//        comparer.compare(sourceStream, targetStream);
//        result.saveDocument(resultPath);
//            LOG.debug("Result file was written as {}", resultPath);
//            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
//            assertThat(actulalSize)
//                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
//                    .isEqualTo(expectedSize);
//    }
//
//    @Test(invocationCount = 1)
//     public void testCompareTwoWordsFromStreams() throws Exception {
//
//        final String sourceName = "source.docx", targetName = "target.docx", resultExtension = ".docx";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//
//        // Create two streams of documents
//        InputStream sourceStream = new FileInputStream(sourcePath);
//        InputStream targetStream = new FileInputStream(targetPath);
//
//        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
//        Comparer comparer = new Comparer(sourcePath);
//        comparer.compare(sourceStream, targetStream);
//        result.saveDocument(getOutputPath(resultName));
//            LOG.debug("Result file was written as {}", resultPath);
//            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
//            assertThat(actulalSize)
//                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
//                    .isEqualTo(expectedSize);
//    }
//
//    @Test(invocationCount = 1)
//     public void testCompareTwoWordsWithResultPathAndSettings() throws Exception {
//
//        final String sourceName = "source.docx", targetName = "target.docx", resultExtension = ".docx";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(resultExtension);
//
//        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
//        Comparer comparer = new Comparer(sourcePath);
//            comparer.add(targetPath);
//        comparer.compare(resultPath);
//            LOG.debug("Result file was written as {}", resultPath);
//            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
//            assertThat(actulalSize)
//                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
//                    .isEqualTo(expectedSize);
//    }
//
//    @Test(invocationCount = 1)
//     public void testCompareTwoWordsWithSettings() throws Exception {
//
//        final String sourceName = "source.docx", targetName = "target.docx", resultExtension = ".docx";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//
//        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
//        Comparer comparer = new Comparer(sourcePath);
//        comparer.compare(sourcePath, targetPath);
//        result.saveDocument(getOutputPath(resultName));
//            LOG.debug("Result file was written as {}", resultPath);
//            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
//            assertThat(actulalSize)
//                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
//                    .isEqualTo(expectedSize);
//    }
//
//    @Test(invocationCount = 1)
//     public void testCompareTwoWordsWithResultPath() throws Exception {
//
//        final String sourceName = "source.docx", targetName = "target.docx", resultExtension = ".docx";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(resultExtension);
//
//        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
//        Comparer comparer = new Comparer(sourcePath);
//            comparer.add(targetPath);
//        comparer.compare(resultPath);
//            LOG.debug("Result file was written as {}", resultPath);
//            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
//            assertThat(actulalSize)
//                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
//                    .isEqualTo(expectedSize);
//    }
//
//    @Test(invocationCount = 1)
//     public void testCompareTwoWorkbooksFromStreamsWithResultPathAndSettings() throws Exception {
//
//        final String sourceName = "source.xlsx", targetName = "target.xlsx", resultExtension = ".xlsx";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(resultExtension);
//
//        // Create two streams of workbooks
//        InputStream sourceStream = new FileInputStream(sourcePath);
//        InputStream targetStream = new FileInputStream(targetPath);
//
//        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
//        Comparer comparer = new Comparer(sourcePath);
//        comparer.compare(sourceStream, targetStream);
//        result.saveDocument(resultPath);
//            LOG.debug("Result file was written as {}", resultPath);
//            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
//            assertThat(actulalSize)
//                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
//                    .isEqualTo(expectedSize);
//    }
//
//    @Test(invocationCount = 1)
//     public void testCompareTwoWorkbooksFromStreamsWithSettings() throws Exception {
//
//        final String sourceName = "source.xlsx", targetName = "target.xlsx", resultExtension = ".xlsx";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//
//        // Create two streams of workbooks
//        InputStream sourceStream = new FileInputStream(sourcePath);
//        InputStream targetStream = new FileInputStream(targetPath);
//
//        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
//        Comparer comparer = new Comparer(sourcePath);
//        comparer.compare(sourceStream, targetStream);
//        result.saveDocument(getOutputPath(resultName));
//            LOG.debug("Result file was written as {}", resultPath);
//            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
//            assertThat(actulalSize)
//                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
//                    .isEqualTo(expectedSize);
//    }
//
//    @Test(invocationCount = 1)
//     public void testCompareTwoWorkbooksFromStreamsWithResultPath() throws Exception {
//
//        final String sourceName = "source.xlsx", targetName = "target.xlsx", resultExtension = ".xlsx";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(resultExtension);
//
//        // Create two streams of workbooks
//        InputStream sourceStream = new FileInputStream(sourcePath);
//        InputStream targetStream = new FileInputStream(targetPath);
//
//        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
//        Comparer comparer = new Comparer(sourcePath);
//        comparer.compare(sourceStream, targetStream);
//        result.saveDocument(resultPath);
//            LOG.debug("Result file was written as {}", resultPath);
//            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
//            assertThat(actulalSize)
//                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
//                    .isEqualTo(expectedSize);
//    }
//
//    @Test(invocationCount = 1)
//     public void testCompareTwoWorkbooksFromStreams() throws Exception {
//
//        final String sourceName = "source.xlsx", targetName = "target.xlsx", resultExtension = ".xlsx";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//
//        // Create two streams of workbooks
//        InputStream sourceStream = new FileInputStream(sourcePath);
//        InputStream targetStream = new FileInputStream(targetPath);
//
//        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
//        Comparer comparer = new Comparer(sourcePath);
//        comparer.compare(sourceStream, targetStream);
//        result.saveDocument(getOutputPath(resultName));
//            LOG.debug("Result file was written as {}", resultPath);
//            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
//            assertThat(actulalSize)
//                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
//                    .isEqualTo(expectedSize);
//    }
//
//    @Test(invocationCount = 1)
//     public void testCompareTwoWorkbooksWithResultPathAndSettings() throws Exception {
//
//        final String sourceName = "source.xlsx", targetName = "target.xlsx", resultExtension = ".xlsx";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(resultExtension);
//
//        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
//        Comparer comparer = new Comparer(sourcePath);
//            comparer.add(targetPath);
//        comparer.compare(resultPath);
//            LOG.debug("Result file was written as {}", resultPath);
//            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
//            assertThat(actulalSize)
//                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
//                    .isEqualTo(expectedSize);
//    }
//
//    @Test(invocationCount = 1)
//     public void testCompareTwoWorkbooksWithSettings() throws Exception {
//
//        final String sourceName = "source.xlsx", targetName = "target.xlsx", resultExtension = ".xlsx";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//
//        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
//        Comparer comparer = new Comparer(sourcePath);
//        comparer.compare(sourcePath, targetPath);
//        result.saveDocument(getOutputPath(resultName));
//            LOG.debug("Result file was written as {}", resultPath);
//            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
//            assertThat(actulalSize)
//                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
//                    .isEqualTo(expectedSize);
//    }
//
//    @Test(invocationCount = 1)
//     public void testCompareTwoWorkbooksWithResultPath() throws Exception {
//
//        final String sourceName = "source.xlsx", targetName = "target.xlsx", resultExtension = ".xlsx";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(resultExtension);
//
//        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
//        Comparer comparer = new Comparer(sourcePath);
//            comparer.add(targetPath);
//        comparer.compare(resultPath);
//            LOG.debug("Result file was written as {}", resultPath);
//            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
//            assertThat(actulalSize)
//                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
//                    .isEqualTo(expectedSize);
//    }
//
//    @Test(invocationCount = 1)
//     public void testCompareTwoWorkbooks() throws Exception {
//
//        final String sourceName = "source.xlsx", targetName = "target.xlsx", resultExtension = ".xlsx";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//
//        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
//        Comparer comparer = new Comparer(sourcePath);
//        comparer.compare(sourcePath, targetPath);
//        result.saveDocument(getOutputPath(resultName));
//            LOG.debug("Result file was written as {}", resultPath);
//            final long actulalSize = Files.size(resultPath), expectedSize = 123L;
//            assertThat(actulalSize)
//                    .withFailMessage("Result file size is expected to be:<%d> but was:<%d>", expectedSize, actulalSize)
//                    .isEqualTo(expectedSize);
//    }
}
