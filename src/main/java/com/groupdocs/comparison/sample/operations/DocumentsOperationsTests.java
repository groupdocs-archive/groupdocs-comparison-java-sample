package com.groupdocs.comparison.sample.operations;

import com.groupdocs.comparison.Comparer;
import com.groupdocs.comparison.common.compareresult.ICompareResult;
import com.groupdocs.comparison.common.comparisonsettings.ComparisonSettings;
import com.groupdocs.comparison.sample.Utilities;
import org.apache.commons.io.IOUtils;
import org.junit.Ignore;
import org.junit.Test;

import java.io.*;

import static com.groupdocs.comparison.sample.TestRunner.*;
import static org.junit.Assert.assertFalse;

/**
 * @author Aleksey Permyakov on 10.08.2016.
 */
@SuppressWarnings("all")
public class DocumentsOperationsTests {

    @Test(timeout = 420000)
    public void testCompareTwoHtmlFromStreams() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.html", targetName = "target.html", resultName = "do_testCompareTwoHtmlFromStreams.html";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create stream of document
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourceStream, targetStream, new ComparisonSettings()); // TODO: DEBUG 19.6
        result.saveDocument(outputPath);

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test(timeout = 300000)
    @Ignore
    public void testCompareTwoHtml() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.html", targetName = "target.html", resultName = "do_testCompareTwoHtml.html";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

//        // Open two htmlFiels
//        IComparisonHtmlDocument sourceDocument = new ComparisonHtmlDocument(sourcePath);
//        IComparisonHtmlDocument targetDocument = new ComparisonHtmlDocument(targetPath);
//
//        // Call method CompareWith()
//        IHtmlCompareResult result = sourceDocument.compareWith(targetDocument, new HtmlComparisonSettings());
//
//        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
//        result.getDocument().save(arrayOutputStream);
//        System.out.println("Stream size: " + arrayOutputStream.toByteArray().length);
//        assertFalse("Result stream is empty", arrayOutputStream.toByteArray().length == 0);
//        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath(resultName)));
    }

    @Test(timeout = 300000)
    public void testCompareTwoPdfFromStreamsWithResultPathAndSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pdf", targetName = "target.pdf", resultName = "do_testCompareTwoPdfFromStreamsWithResultPathAndSettings.pdf";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create stream of document
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourceStream, targetStream, new ComparisonSettings());
        result.saveDocument(outputPath);

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test(timeout = 300000)
    public void testCompareTwoPdfFromStreamsWithSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pdf", targetName = "target.pdf", resultName = "do_testCompareTwoPdfFromStreamsWithSettings.pdf";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create stream of document
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourceStream, targetStream, new ComparisonSettings());
        result.saveDocument(getOutputPath(resultName));

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test(timeout = 300000)
    public void testCompareTwoPdfFromStreamsWithResultPath() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pdf", targetName = "target.pdf", resultName = "do_testCompareTwoPdfFromStreamsWithResultPath.pdf";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create stream of document
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourceStream, targetStream, new ComparisonSettings());
        result.saveDocument(outputPath);

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test(timeout = 300000)
    public void testCompareTwoPdfFromStreams() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pdf", targetName = "target.pdf", resultName = "do_testCompareTwoPdfFromStreams.pdf";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create stream of document
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourceStream, targetStream, new ComparisonSettings());
        result.saveDocument(getOutputPath(resultName));

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test(timeout = 300000)
    public void testCompareTwoPdfWithResultPathAndSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pdf", targetName = "target.pdf", resultName = "do_testCompareTwoPdfWithResultPathAndSettings.pdf";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourcePath, targetPath, new ComparisonSettings());
        result.saveDocument(outputPath);

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test(timeout = 300000)
    public void testCompareTwoPdfWithSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pdf", targetName = "target.pdf", resultName = "do_testCompareTwoPdfWithSettings.pdf";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourcePath, targetPath, new ComparisonSettings());
        result.saveDocument(getOutputPath(resultName));

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test(timeout = 300000)
    public void testCompareTwoPdfWithResultPath() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pdf", targetName = "target.pdf", resultName = "do_testCompareTwoPdfWithResultPath.pdf";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourcePath, targetPath, new ComparisonSettings());
        result.saveDocument(outputPath);

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test(timeout = 300000)
    public void testCompareTwoPdf() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pdf", targetName = "target.pdf", resultName = "do_testCompareTwoPdf.pdf";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourcePath, targetPath, new ComparisonSettings());
        result.saveDocument(getOutputPath(resultName));

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test(timeout = 300000)
    public void testCompareTwoPresentationsFromStreamsWithResultPathAndSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pptx", targetName = "target.pptx", resultName = "do_testCompareTwoPresentationsFromStreamsWithResultPathAndSettings.pptx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create stream of document
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourceStream, targetStream, new ComparisonSettings());
        result.saveDocument(outputPath);

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test(timeout = 300000)
    public void testCompareTwoPresentationsFromStreamsWithSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pptx", targetName = "target.pptx", resultName = "do_testCompareTwoPresentationsFromStreamsWithSettings.pptx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create two streams of presentations

        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourceStream, targetStream, new ComparisonSettings());
        result.saveDocument(getOutputPath(resultName));

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test(timeout = 300000)
    public void testCompareTwoPresentationsFromStreamsWithResultPath() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pptx", targetName = "target.pptx", resultName = "do_testCompareTwoPresentationsFromStreamsWithResultPath.pptx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create two streams of presentations
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourceStream, targetStream, new ComparisonSettings());
        result.saveDocument(outputPath);

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test(timeout = 300000)
    public void testCompareTwoPresentationsFromStreams() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pptx", targetName = "target.pptx", resultName = "do_testCompareTwoPresentationsFromStreams.pptx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create two streams of presentations
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourceStream, targetStream, new ComparisonSettings());
        result.saveDocument(getOutputPath(resultName));

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test(timeout = 300000)
    public void testCompareTwoPresentationsWithResultPathAndSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pptx", targetName = "target.pptx", resultName = "do_testCompareTwoPresentationsWithResultPathAndSettings.pptx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourcePath, targetPath, new ComparisonSettings());
        result.saveDocument(outputPath);

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test(timeout = 300000)
    public void testCompareTwoPresentationsWithSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pptx", targetName = "target.pptx", resultName = "do_testCompareTwoPresentationsWithSettings.pptx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourcePath, targetPath, new ComparisonSettings());
        result.saveDocument(getOutputPath(resultName));

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test(timeout = 300000)
     public void testCompareTwoPresentationsWithResultPath() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pptx", targetName = "target.pptx", resultName = "do_testCompareTwoPresentationsWithResultPath.pptx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourcePath, targetPath, new ComparisonSettings());
        result.saveDocument(outputPath);

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test(timeout = 300000)
     public void testCompareTwoPresentations() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pptx", targetName = "target.pptx", resultName = "do_testCompareTwoPresentations.pptx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourcePath, targetPath, new ComparisonSettings());
        result.saveDocument(getOutputPath(resultName));

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);

    }

    @Test(timeout = 300000)
     public void testCompareTwoTextsFromStreamsWithResultPathAndSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.txt", targetName = "target.txt", resultName = "do_testCompareTwoTextsFromStreamsWithResultPathAndSettings.txt";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create two streams of textFiles
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourceStream, targetStream, new ComparisonSettings()); // TODO: DEBUG 19.6
        result.saveDocument(outputPath);

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test(timeout = 420000)
     public void testCompareTwoTextsFromStreamsWithSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.txt", targetName = "target.txt", resultName = "do_testCompareTwoTextsFromStreamsWithSettings.txt";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create two streams of text files
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourceStream, targetStream, new ComparisonSettings()); // TODO: DEBUG 19.6
        result.saveDocument(outputPath);

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test(timeout = 420000)
     public void testCompareTwoTextsFromStreamsWithResultPath() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.txt", targetName = "target.txt", resultName = "do_testCompareTwoTextsFromStreamsWithResultPath.txt";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create two streams of text files
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourceStream, targetStream, new ComparisonSettings()); // TODO: DEBUG 19.6
        result.saveDocument(outputPath);

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test(timeout = 300000)
     public void testCompareTwoTextsFromStreams() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.txt", targetName = "target.txt", resultName = "do_testCompareTwoTextsFromStreams.txt";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create two streams of text files
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);
        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourceStream, targetStream, new ComparisonSettings()); // TODO: DEBUG 19.6
        result.saveDocument(getOutputPath(resultName));

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test(timeout = 300000)
     public void testCompareTwoTextsWithResultPathAndSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.txt", targetName = "target.txt", resultName = "do_testCompareTwoTextsWithResultPathAndSettings.txt";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourcePath, targetPath, new ComparisonSettings());
        result.saveDocument(outputPath);

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test(timeout = 300000)
     public void testCompareTwoTextsWithSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.txt", targetName = "target.txt", resultName = "do_testCompareTwoTextsWithSettings.txt";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourcePath, targetPath, new ComparisonSettings());
        result.saveDocument(getOutputPath(resultName));

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);

    }

    @Test(timeout = 300000)
     public void testCompareTwoTextsWithResultPath() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.txt", targetName = "target.txt", resultName = "do_testCompareTwoTextsWithResultPath.txt";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourcePath, targetPath, new ComparisonSettings());
        result.saveDocument(outputPath);

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test(timeout = 300000)
     public void testCompareTwoTexts() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.txt", targetName = "target.txt", resultName = "do_testCompareTwoTexts.txt";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourcePath, targetPath, new ComparisonSettings());
        result.saveDocument(getOutputPath(resultName));

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);

    }

    @Test(timeout = 300000)
     public void testCompareTwoWordsFromStreamsWithResultPathAndSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "do_testCompareTwoWordsFromStreamsWithResultPathAndSettings.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create two streams of documents
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourceStream, targetStream, new ComparisonSettings());
        result.saveDocument(outputPath);

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test(timeout = 300000)
     public void testCompareTwoWordsFromStreamsWithSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "do_testCompareTwoWordsFromStreamsWithSettings.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create two streams of documents
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourceStream, targetStream, new ComparisonSettings());
        result.saveDocument(getOutputPath(resultName));

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test(timeout = 300000)
     public void testCompareTwoWordsFromStreamsWithResultPath() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "do_testCompareTwoWordsFromStreamsWithResultPath.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create two streams of documents
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourceStream, targetStream, new ComparisonSettings());
        result.saveDocument(outputPath);

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test(timeout = 300000)
     public void testCompareTwoWordsFromStreams() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "do_testCompareTwoWordsFromStreams.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create two streams of documents
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourceStream, targetStream, new ComparisonSettings());
        result.saveDocument(getOutputPath(resultName));

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test(timeout = 300000)
     public void testCompareTwoWordsWithResultPathAndSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "do_testCompareTwoWordsWithResultPathAndSettings.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourcePath, targetPath, new ComparisonSettings());
        result.saveDocument(outputPath);

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test(timeout = 300000)
     public void testCompareTwoWordsWithSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "do_testCompareTwoWordsWithSettings.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourcePath, targetPath, new ComparisonSettings());
        result.saveDocument(getOutputPath(resultName));

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test(timeout = 300000)
     public void testCompareTwoWordsWithResultPath() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "do_testCompareTwoWordsWithResultPath.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourcePath, targetPath, new ComparisonSettings());
        result.saveDocument(outputPath);

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test(timeout = 300000)
     public void testCompareTwoWorkbooksFromStreamsWithResultPathAndSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.xlsx", targetName = "target.xlsx", resultName = "do_testCompareTwoWorkbooksFromStreamsWithResultPathAndSettings.xlsx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create two streams of workbooks
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourceStream, targetStream, new ComparisonSettings());
        result.saveDocument(outputPath);

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test(timeout = 300000)
     public void testCompareTwoWorkbooksFromStreamsWithSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.xlsx", targetName = "target.xlsx", resultName = "do_testCompareTwoWorkbooksFromStreamsWithSettings.xlsx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create two streams of workbooks
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourceStream, targetStream, new ComparisonSettings());
        result.saveDocument(getOutputPath(resultName));

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test(timeout = 300000)
     public void testCompareTwoWorkbooksFromStreamsWithResultPath() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.xlsx", targetName = "target.xlsx", resultName = "do_testCompareTwoWorkbooksFromStreamsWithResultPath.xlsx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create two streams of workbooks
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourceStream, targetStream, new ComparisonSettings());
        result.saveDocument(outputPath);

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test(timeout = 300000)
     public void testCompareTwoWorkbooksFromStreams() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.xlsx", targetName = "target.xlsx", resultName = "do_testCompareTwoWorkbooksFromStreams.xlsx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create two streams of workbooks
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourceStream, targetStream, new ComparisonSettings());
        result.saveDocument(getOutputPath(resultName));

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test(timeout = 300000)
     public void testCompareTwoWorkbooksWithResultPathAndSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.xlsx", targetName = "target.xlsx", resultName = "do_testCompareTwoWorkbooksWithResultPathAndSettings.xlsx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourcePath, targetPath, new ComparisonSettings());
        result.saveDocument(outputPath);

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test(timeout = 300000)
     public void testCompareTwoWorkbooksWithSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.xlsx", targetName = "target.xlsx", resultName = "do_testCompareTwoWorkbooksWithSettings.xlsx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourcePath, targetPath, new ComparisonSettings());
        result.saveDocument(getOutputPath(resultName));

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test(timeout = 300000)
     public void testCompareTwoWorkbooksWithResultPath() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.xlsx", targetName = "target.xlsx", resultName = "do_testCompareTwoWorkbooksWithResultPath.xlsx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourcePath, targetPath, new ComparisonSettings());
        result.saveDocument(outputPath);

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test(timeout = 300000)
     public void testCompareTwoWorkbooks() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.xlsx", targetName = "target.xlsx", resultName = "do_testCompareTwoWorkbooks.xlsx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourcePath, targetPath, new ComparisonSettings());
        result.saveDocument(getOutputPath(resultName));

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }
}
