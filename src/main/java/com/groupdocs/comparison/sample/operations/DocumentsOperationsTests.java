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

        final String sourceName = "source.html", targetName = "target.html", resultName = "do_testCompareTwoHtmlFromStreams.html";
        final Path sourcePath = getStoragePath(sourceName);
        final Path targetPath = getStoragePath(targetName);
        final Path resultPath = getOutputPath(resultName);

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

        final String sourceName = "source.html", targetName = "target.html", resultName = "do_testCompareTwoHtml.html";
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
        final String sourceName = "source.pdf", targetName = "target.pdf", resultName = "do_testCompareTwoPdfFromStreamsWithResultPathAndSettings.pdf";
        final Path sourcePath = getStoragePath(sourceName);
        final Path targetPath = getStoragePath(targetName);
        final Path resultPath = getOutputPath(resultName);

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
//        final String sourceName = "source.pdf", targetName = "target.pdf", resultName = "do_testCompareTwoPdfFromStreamsWithSettings.pdf";
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
//        final String sourceName = "source.pdf", targetName = "target.pdf", resultName = "do_testCompareTwoPdfFromStreamsWithResultPath.pdf";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(resultName);
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
//        final String sourceName = "source.pdf", targetName = "target.pdf", resultName = "do_testCompareTwoPdfFromStreams.pdf";
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
//        final String sourceName = "source.pdf", targetName = "target.pdf", resultName = "do_testCompareTwoPdfWithResultPathAndSettings.pdf";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(resultName);
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
//        final String sourceName = "source.pdf", targetName = "target.pdf", resultName = "do_testCompareTwoPdfWithSettings.pdf";
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
//        final String sourceName = "source.pdf", targetName = "target.pdf", resultName = "do_testCompareTwoPdfWithResultPath.pdf";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(resultName);
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
//        final String sourceName = "source.pdf", targetName = "target.pdf", resultName = "do_testCompareTwoPdf.pdf";
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
//        final String sourceName = "source.pptx", targetName = "target.pptx", resultName = "do_testCompareTwoPresentationsFromStreamsWithResultPathAndSettings.pptx";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(resultName);
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
//        final String sourceName = "source.pptx", targetName = "target.pptx", resultName = "do_testCompareTwoPresentationsFromStreamsWithSettings.pptx";
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
//        final String sourceName = "source.pptx", targetName = "target.pptx", resultName = "do_testCompareTwoPresentationsFromStreamsWithResultPath.pptx";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(resultName);
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
//        final String sourceName = "source.pptx", targetName = "target.pptx", resultName = "do_testCompareTwoPresentationsFromStreams.pptx";
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
//        final String sourceName = "source.pptx", targetName = "target.pptx", resultName = "do_testCompareTwoPresentationsWithResultPathAndSettings.pptx";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(resultName);
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
//        final String sourceName = "source.pptx", targetName = "target.pptx", resultName = "do_testCompareTwoPresentationsWithSettings.pptx";
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
//        final String sourceName = "source.pptx", targetName = "target.pptx", resultName = "do_testCompareTwoPresentationsWithResultPath.pptx";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(resultName);
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
//        final String sourceName = "source.pptx", targetName = "target.pptx", resultName = "do_testCompareTwoPresentations.pptx";
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
//        final String sourceName = "source.txt", targetName = "target.txt", resultName = "do_testCompareTwoTextsFromStreamsWithResultPathAndSettings.txt";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(resultName);
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
//        final String sourceName = "source.txt", targetName = "target.txt", resultName = "do_testCompareTwoTextsFromStreamsWithSettings.txt";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(resultName);
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
//        final String sourceName = "source.txt", targetName = "target.txt", resultName = "do_testCompareTwoTextsFromStreamsWithResultPath.txt";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(resultName);
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
//        final String sourceName = "source.txt", targetName = "target.txt", resultName = "do_testCompareTwoTextsFromStreams.txt";
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
//        final String sourceName = "source.txt", targetName = "target.txt", resultName = "do_testCompareTwoTextsWithResultPathAndSettings.txt";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(resultName);
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
//        final String sourceName = "source.txt", targetName = "target.txt", resultName = "do_testCompareTwoTextsWithSettings.txt";
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
//        final String sourceName = "source.txt", targetName = "target.txt", resultName = "do_testCompareTwoTextsWithResultPath.txt";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(resultName);
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
//        final String sourceName = "source.txt", targetName = "target.txt", resultName = "do_testCompareTwoTexts.txt";
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
//        final String sourceName = "source.docx", targetName = "target.docx", resultName = "do_testCompareTwoWordsFromStreamsWithResultPathAndSettings.docx";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(resultName);
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
//        final String sourceName = "source.docx", targetName = "target.docx", resultName = "do_testCompareTwoWordsFromStreamsWithSettings.docx";
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
//        final String sourceName = "source.docx", targetName = "target.docx", resultName = "do_testCompareTwoWordsFromStreamsWithResultPath.docx";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(resultName);
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
//        final String sourceName = "source.docx", targetName = "target.docx", resultName = "do_testCompareTwoWordsFromStreams.docx";
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
//        final String sourceName = "source.docx", targetName = "target.docx", resultName = "do_testCompareTwoWordsWithResultPathAndSettings.docx";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(resultName);
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
//        final String sourceName = "source.docx", targetName = "target.docx", resultName = "do_testCompareTwoWordsWithSettings.docx";
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
//        final String sourceName = "source.docx", targetName = "target.docx", resultName = "do_testCompareTwoWordsWithResultPath.docx";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(resultName);
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
//        final String sourceName = "source.xlsx", targetName = "target.xlsx", resultName = "do_testCompareTwoWorkbooksFromStreamsWithResultPathAndSettings.xlsx";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(resultName);
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
//        final String sourceName = "source.xlsx", targetName = "target.xlsx", resultName = "do_testCompareTwoWorkbooksFromStreamsWithSettings.xlsx";
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
//        final String sourceName = "source.xlsx", targetName = "target.xlsx", resultName = "do_testCompareTwoWorkbooksFromStreamsWithResultPath.xlsx";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(resultName);
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
//        final String sourceName = "source.xlsx", targetName = "target.xlsx", resultName = "do_testCompareTwoWorkbooksFromStreams.xlsx";
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
//        final String sourceName = "source.xlsx", targetName = "target.xlsx", resultName = "do_testCompareTwoWorkbooksWithResultPathAndSettings.xlsx";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(resultName);
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
//        final String sourceName = "source.xlsx", targetName = "target.xlsx", resultName = "do_testCompareTwoWorkbooksWithSettings.xlsx";
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
//        final String sourceName = "source.xlsx", targetName = "target.xlsx", resultName = "do_testCompareTwoWorkbooksWithResultPath.xlsx";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(resultName);
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
//        final String sourceName = "source.xlsx", targetName = "target.xlsx", resultName = "do_testCompareTwoWorkbooks.xlsx";
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
