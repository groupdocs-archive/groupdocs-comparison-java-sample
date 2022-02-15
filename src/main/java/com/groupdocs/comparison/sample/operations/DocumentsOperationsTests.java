package com.groupdocs.comparison.sample.operations;


import com.groupdocs.comparison.Comparer;
import com.groupdocs.comparison.ComparerSettings;
import com.groupdocs.comparison.options.CompareOptions;
import org.apache.commons.io.IOUtils;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import static com.groupdocs.comparison.sample.TestRunner.getOutputPath;
import static com.groupdocs.comparison.sample.TestRunner.getStoragePath;
import static org.testng.AssertJUnit.assertFalse;

/**
 * @author Aleksey Permyakov on 10.08.2016.
 */
@SuppressWarnings("all")
public class DocumentsOperationsTests {
    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            assertFalse("Result stream is empty", size == 0);
        }
    }

    @Test
    public void testCompareTwoHtml() throws Exception {

        final String sourceName = "source.html", targetName = "target.html", resultExtension = ".html";
        final Path sourcePath = getStoragePath(sourceName);
        final Path targetPath = getStoragePath(targetName);
        final Path resultPath = getOutputPath(targetName);

        try (ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
             FileOutputStream fileOutputStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);
            comparer.compare(arrayOutputStream);

            System.out.println("Stream size: " + arrayOutputStream.toByteArray().length);
            assertFalse("Result stream is empty", arrayOutputStream.toByteArray().length == 0);
            IOUtils.write(arrayOutputStream.toByteArray(), fileOutputStream);
        }
    }

    @Test
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

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            assertFalse("Result stream is empty", size == 0);
        }
    }

//    @Test
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
//        result.saveDocument(getOutputPath(resultName));
//
//        System.out.println("Stream size: " + size);
//        assertFalse("Result stream is empty", size == 0);
//    }
//
//    @Test
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
//
//        System.out.println("Stream size: " + size);
//        assertFalse("Result stream is empty", size == 0);
//    }
//
//    @Test
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
//        result.saveDocument(getOutputPath(resultName));
//
//        System.out.println("Stream size: " + size);
//        assertFalse("Result stream is empty", size == 0);
//    }
//
//    @Test
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
//
//        System.out.println("Stream size: " + size);
//        assertFalse("Result stream is empty", size == 0);
//    }
//
//    @Test
//    public void testCompareTwoPdfWithSettings() throws Exception {
//
//        final String sourceName = "source.pdf", targetName = "target.pdf", resultExtension = ".pdf";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//
//        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
//        Comparer comparer = new Comparer(sourcePath);
//        comparer.compare(sourcePath, targetPath);
//        result.saveDocument(getOutputPath(resultName));
//
//        System.out.println("Stream size: " + size);
//        assertFalse("Result stream is empty", size == 0);
//    }
//
//    @Test
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
//
//        System.out.println("Stream size: " + size);
//        assertFalse("Result stream is empty", size == 0);
//    }
//
//    @Test
//    public void testCompareTwoPdf() throws Exception {
//
//        final String sourceName = "source.pdf", targetName = "target.pdf", resultExtension = ".pdf";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//
//        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
//        Comparer comparer = new Comparer(sourcePath);
//        comparer.compare(sourcePath, targetPath);
//        result.saveDocument(getOutputPath(resultName));
//
//        System.out.println("Stream size: " + size);
//        assertFalse("Result stream is empty", size == 0);
//    }
//
//    @Test
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
//
//        System.out.println("Stream size: " + size);
//        assertFalse("Result stream is empty", size == 0);
//    }
//
//    @Test
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
//        result.saveDocument(getOutputPath(resultName));
//
//        System.out.println("Stream size: " + size);
//        assertFalse("Result stream is empty", size == 0);
//    }
//
//    @Test
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
//
//        System.out.println("Stream size: " + size);
//        assertFalse("Result stream is empty", size == 0);
//    }
//
//    @Test
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
//        result.saveDocument(getOutputPath(resultName));
//
//        System.out.println("Stream size: " + size);
//        assertFalse("Result stream is empty", size == 0);
//    }
//
//    @Test
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
//
//        System.out.println("Stream size: " + size);
//        assertFalse("Result stream is empty", size == 0);
//    }
//
//    @Test
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
//
//        System.out.println("Stream size: " + size);
//        assertFalse("Result stream is empty", size == 0);
//    }
//
//    @Test
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
//
//        System.out.println("Stream size: " + size);
//        assertFalse("Result stream is empty", size == 0);
//    }
//
//    @Test
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
//
//        System.out.println("Stream size: " + size);
//        assertFalse("Result stream is empty", size == 0);
//
//    }
//
//    @Test
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
//
//        System.out.println("Stream size: " + size);
//        assertFalse("Result stream is empty", size == 0);
//    }
//
//    @Test
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
//
//        System.out.println("Stream size: " + size);
//        assertFalse("Result stream is empty", size == 0);
//    }
//
//    @Test
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
//
//        System.out.println("Stream size: " + size);
//        assertFalse("Result stream is empty", size == 0);
//    }
//
//    @Test
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
//
//        System.out.println("Stream size: " + size);
//        assertFalse("Result stream is empty", size == 0);
//    }
//
//    @Test
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
//
//        System.out.println("Stream size: " + size);
//        assertFalse("Result stream is empty", size == 0);
//    }
//
//    @Test
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
//
//        System.out.println("Stream size: " + size);
//        assertFalse("Result stream is empty", size == 0);
//
//    }
//
//    @Test
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
//
//        System.out.println("Stream size: " + size);
//        assertFalse("Result stream is empty", size == 0);
//    }
//
//    @Test
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
//
//        System.out.println("Stream size: " + size);
//        assertFalse("Result stream is empty", size == 0);
//
//    }
//
//    @Test
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
//
//        System.out.println("Stream size: " + size);
//        assertFalse("Result stream is empty", size == 0);
//    }
//
//    @Test
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
//
//        System.out.println("Stream size: " + size);
//        assertFalse("Result stream is empty", size == 0);
//    }
//
//    @Test
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
//
//        System.out.println("Stream size: " + size);
//        assertFalse("Result stream is empty", size == 0);
//    }
//
//    @Test
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
//
//        System.out.println("Stream size: " + size);
//        assertFalse("Result stream is empty", size == 0);
//    }
//
//    @Test
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
//
//        System.out.println("Stream size: " + size);
//        assertFalse("Result stream is empty", size == 0);
//    }
//
//    @Test
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
//
//        System.out.println("Stream size: " + size);
//        assertFalse("Result stream is empty", size == 0);
//    }
//
//    @Test
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
//
//        System.out.println("Stream size: " + size);
//        assertFalse("Result stream is empty", size == 0);
//    }
//
//    @Test
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
//
//        System.out.println("Stream size: " + size);
//        assertFalse("Result stream is empty", size == 0);
//    }
//
//    @Test
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
//
//        System.out.println("Stream size: " + size);
//        assertFalse("Result stream is empty", size == 0);
//    }
//
//    @Test
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
//
//        System.out.println("Stream size: " + size);
//        assertFalse("Result stream is empty", size == 0);
//    }
//
//    @Test
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
//
//        System.out.println("Stream size: " + size);
//        assertFalse("Result stream is empty", size == 0);
//    }
//
//    @Test
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
//
//        System.out.println("Stream size: " + size);
//        assertFalse("Result stream is empty", size == 0);
//    }
//
//    @Test
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
//
//        System.out.println("Stream size: " + size);
//        assertFalse("Result stream is empty", size == 0);
//    }
//
//    @Test
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
//
//        System.out.println("Stream size: " + size);
//        assertFalse("Result stream is empty", size == 0);
//    }
//
//    @Test
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
//
//        System.out.println("Stream size: " + size);
//        assertFalse("Result stream is empty", size == 0);
//    }
}
