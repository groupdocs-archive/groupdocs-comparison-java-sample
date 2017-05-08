package com.groupdocs.comparison.sample.operations;

import com.groupdocs.comparison.Comparison;
import com.groupdocs.comparison.common.ComparisonType;
import com.groupdocs.comparison.common.FileType;
import com.groupdocs.comparison.common.comparisonsettings.*;
import com.groupdocs.comparison.html.ComparisonHtmlDocument;
import com.groupdocs.comparison.html.contracts.IComparisonHtmlDocument;
import com.groupdocs.comparison.html.contracts.IHtmlCompareResult;
import com.groupdocs.comparison.sample.Utilities;
import org.apache.commons.io.IOUtils;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.*;

import static com.groupdocs.comparison.sample.TestRunner.getOutputPath;
import static com.groupdocs.comparison.sample.TestRunner.getStoragePath;
import static com.groupdocs.comparison.sample.Utilities.applyLicense;
import static org.junit.Assert.assertFalse;

/**
 * @author Aleksey Permyakov on 10.08.2016.
 */
public class DocumentsOperationsTests {

    @Before
    public void before() {
        applyLicense();
    }

    @Test
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
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, outputPath);

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
    }

    @Test
    @Ignore // FIXME: 08.05.2017 too long
    public void testCompareTwoHtml() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.html", targetName = "target.html", resultName = "do_testCompareTwoHtml.html";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Open two htmlFiels
        IComparisonHtmlDocument sourceDocument = new ComparisonHtmlDocument(sourcePath);
        IComparisonHtmlDocument targetDocument = new ComparisonHtmlDocument(targetPath);

        // Call method CompareWith()
        IHtmlCompareResult result = sourceDocument.compareWith(targetDocument, new HtmlComparisonSettings());

        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        result.getDocument().save(arrayOutputStream);
        System.out.println("Stream size: " + arrayOutputStream.toByteArray().length);
        assertFalse("Result stream is empty", arrayOutputStream.toByteArray().length == 0);
        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
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
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, outputPath, ComparisonType.Pdf, new PdfComparisonSettings());

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
    }

    @Test
    public void testCompareTwoPdfFromStreamsWithSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pdf", targetName = "target.pdf", resultName = "do_testCompareTwoPdfFromStreamsWithSettings.pdf";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create stream of document
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, ComparisonType.Pdf, new PdfComparisonSettings());

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
        IOUtils.copy(result, new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
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
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, outputPath, ComparisonType.Pdf);

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
    }

    @Test
    public void testCompareTwoPdfFromStreams() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pdf", targetName = "target.pdf", resultName = "do_testCompareTwoPdfFromStreams.pdf";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create stream of document
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, ComparisonType.Pdf);

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
        IOUtils.copy(result, new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
    public void testCompareTwoPdfWithResultPathAndSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pdf", targetName = "target.pdf", resultName = "do_testCompareTwoPdfWithResultPathAndSettings.pdf";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, ComparisonType.Pdf, new PdfComparisonSettings());

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
    }

    @Test
    public void testCompareTwoPdfWithSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pdf", targetName = "target.pdf", resultName = "do_testCompareTwoPdfWithSettings.pdf";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, targetPath, ComparisonType.Pdf, new PdfComparisonSettings());

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
        IOUtils.copy(result, new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
    public void testCompareTwoPdfWithResultPath() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pdf", targetName = "target.pdf", resultName = "do_testCompareTwoPdfWithResultPath.pdf";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, ComparisonType.Pdf);

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
    }

    @Test
    public void testCompareTwoPdf() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pdf", targetName = "target.pdf", resultName = "do_testCompareTwoPdf.pdf";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, targetPath, ComparisonType.Pdf);

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
        IOUtils.copy(result, new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
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
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, outputPath, ComparisonType.Slides, new SlidesComparisonSettings());

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
    }

    @Test
    public void testCompareTwoPresentationsFromStreamsWithSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pptx", targetName = "target.pptx", resultName = "do_testCompareTwoPresentationsFromStreamsWithSettings.pptx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create two streams of presentations

        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, ComparisonType.Slides, new SlidesComparisonSettings());

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
        IOUtils.copy(result, new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
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
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, outputPath, ComparisonType.Slides);

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
    }

    @Test
    public void testCompareTwoPresentationsFromStreams() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pptx", targetName = "target.pptx", resultName = "do_testCompareTwoPresentationsFromStreams.pptx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create two streams of presentations
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, ComparisonType.Slides);

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
        IOUtils.copy(result, new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
    public void testCompareTwoPresentationsWithResultPathAndSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pptx", targetName = "target.pptx", resultName = "do_testCompareTwoPresentationsWithResultPathAndSettings.pptx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, ComparisonType.Slides, new SlidesComparisonSettings());

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
    }

    @Test
    public void testCompareTwoPresentationsWithSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pptx", targetName = "target.pptx", resultName = "do_testCompareTwoPresentationsWithSettings.pptx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, targetPath, ComparisonType.Slides, new SlidesComparisonSettings());

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
        IOUtils.copy(result, new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
     public void testCompareTwoPresentationsWithResultPath() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pptx", targetName = "target.pptx", resultName = "do_testCompareTwoPresentationsWithResultPath.pptx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, ComparisonType.Slides, FileType.Undefined);

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
    }

    @Test
     public void testCompareTwoPresentations() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pptx", targetName = "target.pptx", resultName = "do_testCompareTwoPresentations.pptx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, targetPath, ComparisonType.Slides);

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
        IOUtils.copy(result, new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
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
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, outputPath, ComparisonType.Text, new TextComparisonSettings());

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
    }

    @Test
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
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, outputPath, ComparisonType.Text, new TextComparisonSettings());

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
        IOUtils.copy(result, new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
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
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, outputPath, ComparisonType.Text);

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
    }

    @Test
     public void testCompareTwoTextsFromStreams() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.txt", targetName = "target.txt", resultName = "do_testCompareTwoTextsFromStreams.txt";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create two streams of text files
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);
        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, ComparisonType.Text);

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
        IOUtils.copy(result, new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
     public void testCompareTwoTextsWithResultPathAndSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.txt", targetName = "target.txt", resultName = "do_testCompareTwoTextsWithResultPathAndSettings.txt";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, ComparisonType.Text, new TextComparisonSettings());

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
    }

    @Test
     public void testCompareTwoTextsWithSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.txt", targetName = "target.txt", resultName = "do_testCompareTwoTextsWithSettings.txt";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, targetPath, ComparisonType.Text, new TextComparisonSettings());

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
        IOUtils.copy(result, new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
     public void testCompareTwoTextsWithResultPath() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.txt", targetName = "target.txt", resultName = "do_testCompareTwoTextsWithResultPath.txt";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, ComparisonType.Text);

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
    }

    @Test
     public void testCompareTwoTexts() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.txt", targetName = "target.txt", resultName = "do_testCompareTwoTexts.txt";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, targetPath, ComparisonType.Text);

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
        IOUtils.copy(result, new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
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
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, outputPath, ComparisonType.Words, new WordsComparisonSettings());

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
    }

    @Test
     public void testCompareTwoWordsFromStreamsWithSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "do_testCompareTwoWordsFromStreamsWithSettings.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create two streams of documents
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, ComparisonType.Words, new WordsComparisonSettings());

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
        IOUtils.copy(result, new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
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
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, outputPath, ComparisonType.Words);

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
    }

    @Test
     public void testCompareTwoWordsFromStreams() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "do_testCompareTwoWordsFromStreams.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create two streams of documents
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, ComparisonType.Words);

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
        IOUtils.copy(result, new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
     public void testCompareTwoWordsWithResultPathAndSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "do_testCompareTwoWordsWithResultPathAndSettings.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, ComparisonType.Words, new WordsComparisonSettings());

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
    }

    @Test
     public void testCompareTwoWordsWithSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "do_testCompareTwoWordsWithSettings.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, targetPath, ComparisonType.Words, new WordsComparisonSettings());

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
        IOUtils.copy(result, new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
     public void testCompareTwoWordsWithResultPath() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "do_testCompareTwoWordsWithResultPath.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, ComparisonType.Words);

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
    }

    @Test
     public void testCompareTwoWords() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "do_testCompareTwoWords.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, targetPath, ComparisonType.Words);

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
        IOUtils.copy(result, new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
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
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, outputPath, ComparisonType.Cells, new CellsComparisonSettings());

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
    }

    @Test
     public void testCompareTwoWorkbooksFromStreamsWithSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.xlsx", targetName = "target.xlsx", resultName = "do_testCompareTwoWorkbooksFromStreamsWithSettings.xlsx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create two streams of workbooks
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, ComparisonType.Cells, new CellsComparisonSettings());

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
        IOUtils.copy(result, new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
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
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, outputPath, ComparisonType.Cells);

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
    }

    @Test
     public void testCompareTwoWorkbooksFromStreams() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.xlsx", targetName = "target.xlsx", resultName = "do_testCompareTwoWorkbooksFromStreams.xlsx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create two streams of workbooks
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, ComparisonType.Cells);

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
        IOUtils.copy(result, new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
     public void testCompareTwoWorkbooksWithResultPathAndSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.xlsx", targetName = "target.xlsx", resultName = "do_testCompareTwoWorkbooksWithResultPathAndSettings.xlsx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, ComparisonType.Cells, new CellsComparisonSettings());

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
    }

    @Test
     public void testCompareTwoWorkbooksWithSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.xlsx", targetName = "target.xlsx", resultName = "do_testCompareTwoWorkbooksWithSettings.xlsx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, targetPath, ComparisonType.Cells, new CellsComparisonSettings());

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
        IOUtils.copy(result, new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
     public void testCompareTwoWorkbooksWithResultPath() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.xlsx", targetName = "target.xlsx", resultName = "do_testCompareTwoWorkbooksWithResultPath.xlsx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, ComparisonType.Cells);

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
    }

    @Test
     public void testCompareTwoWorkbooks() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.xlsx", targetName = "target.xlsx", resultName = "do_testCompareTwoWorkbooks.xlsx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, targetPath, ComparisonType.Cells); // FIXME: 18.01.2017 Bug

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
        IOUtils.copy(result, new FileOutputStream(getOutputPath(resultName)));
    }
}
