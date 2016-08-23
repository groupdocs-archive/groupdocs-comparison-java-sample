package com.groupdocs.comparison.sample.operations;

import com.groupdocs.comparison.Comparison;
import com.groupdocs.comparison.common.ComparisonType;
import com.groupdocs.comparison.common.comparisonsettings.*;
import com.groupdocs.comparison.html.ComparisonHtmlDocument;
import com.groupdocs.comparison.html.contracts.IComparisonHtmlDocument;
import com.groupdocs.comparison.html.contracts.IHtmlCompareResult;
import org.apache.commons.io.IOUtils;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

import static com.groupdocs.comparison.sample.Utilities.getOutputPath;
import static com.groupdocs.comparison.sample.Utilities.getStoragePath;

/**
 * @author Aleksey Permyakov on 10.08.2016.
 */
public class DocumentsOperations {
    public static void compareTwoHtmlFromStreams(String sourceName, String targetName, String resultName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create stream of document
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, outputPath);

        System.out.println(result.available());
//        IOUtils.copy(result, new FileOutputStream(getOutputPath("test.docx")));
    }

    public static void compareTwoHtml(String sourceName, String targetName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Open two htmlFiels
        IComparisonHtmlDocument sourceDocument = new ComparisonHtmlDocument(sourcePath);
        IComparisonHtmlDocument targetDocument = new ComparisonHtmlDocument(targetPath);

        // Call method CompareWith()
        IHtmlCompareResult result = sourceDocument.compareWith(targetDocument, new HtmlComparisonSettings());

        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        result.getDocument().save(arrayOutputStream);
        System.out.println(arrayOutputStream.toByteArray().length);
//        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath("test.html")));
    }

    public static void compareTwoPdfFromStreamsWithResultPathAndSettings(String sourceName, String targetName, String resultName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create stream of document
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, outputPath, ComparisonType.Pdf, new PdfComparisonSettings());

        System.out.println(result.available());
    }

    public static void compareTwoPdfFromStreamsWithSettings(String sourceName, String targetName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create stream of document
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, ComparisonType.Pdf, new PdfComparisonSettings());

        System.out.println(result.available());
//        IOUtils.copy(result, new FileOutputStream(getOutputPath("test.pdf")));
    }

    public static void compareTwoPdfFromStreamsWithResultPath(String sourceName, String targetName, String resultName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create stream of document
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, outputPath, ComparisonType.Pdf);

        System.out.println(result.available());
    }

    public static void compareTwoPdfFromStreams(String sourceName, String targetName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create stream of document
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, ComparisonType.Pdf);

        System.out.println(result.available());
//        IOUtils.copy(result, new FileOutputStream(getOutputPath("test.pdf")));
    }

    public static void compareTwoPdfWithResultPathAndSettings(String sourceName, String targetName, String resultName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, ComparisonType.Pdf, new PdfComparisonSettings());

        System.out.println(result.available());
    }

    public static void compareTwoPdfWithSettings(String sourceName, String targetName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, targetPath, ComparisonType.Pdf, new PdfComparisonSettings());

        System.out.println(result.available());
//        IOUtils.copy(result, new FileOutputStream(getOutputPath("test.pdf")));
    }

    public static void compareTwoPdfWithResultPath(String sourceName, String targetName, String resultName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, ComparisonType.Pdf);

        System.out.println(result.available());
    }

    public static void compareTwoPdf(String sourceName, String targetName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, targetPath, ComparisonType.Pdf);

        System.out.println(result.available());
//        IOUtils.copy(result, new FileOutputStream(getOutputPath("test.pdf")));
    }

    public static void compareTwoPresentationsFromStreamsWithResultPathAndSettings(String sourceName, String targetName, String resultName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create stream of document
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, outputPath, ComparisonType.Slides, new SlidesComparisonSettings());

        System.out.println(result.available());
    }

    public static void compareTwoPresentationsFromStreamsWithSettings(String sourceName, String targetName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create two streams of presentations

        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, ComparisonType.Slides, new SlidesComparisonSettings());

        System.out.println(result.available());
//        IOUtils.copy(result, new FileOutputStream(getOutputPath("test.pptx")));
    }

    public static void compareTwoPresentationsFromStreamsWithResultPath(String sourceName, String targetName, String resultName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create two streams of presentations
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, outputPath, ComparisonType.Slides);

        System.out.println(result.available());
    }

    public static void compareTwoPresentationsFromStreams(String sourceName, String targetName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create two streams of presentations
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, ComparisonType.Slides);

        System.out.println(result.available());
        IOUtils.copy(result, new FileOutputStream(getOutputPath("test.pptx")));
    }

    public static void compareTwoPresentationsWithResultPathAndSettings(String sourceName, String targetName, String resultName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, ComparisonType.Slides, new SlidesComparisonSettings());

        System.out.println(result.available());
    }

    public static void compareTwoPresentationsWithSettings(String sourceName, String targetName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, targetPath, ComparisonType.Slides, new SlidesComparisonSettings());

        System.out.println(result.available());
        IOUtils.copy(result, new FileOutputStream(getOutputPath("test.pptx")));
    }

    public static void compareTwoPresentationsWithResultPath(String sourceName, String targetName, String resultName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, ComparisonType.Slides);

        System.out.println(result.available());
    }

    public static void compareTwoPresentations(String sourceName, String targetName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, targetPath, ComparisonType.Slides);

        System.out.println(result.available());
        IOUtils.copy(result, new FileOutputStream(getOutputPath("test.pptx")));
    }

    public static void compareTwoTextsFromStreamsWithResultPathAndSettings(String sourceName, String targetName, String resultName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create two streams of textFiles
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, outputPath, ComparisonType.Text, new TextComparisonSettings());

        System.out.println(result.available());
    }

    public static void compareTwoTextsFromStreamsWithSettings(String sourceName, String targetName, String resultName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create two streams of text files
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, outputPath, ComparisonType.Text, new TextComparisonSettings());

        System.out.println(result.available());
        IOUtils.copy(result, new FileOutputStream(getOutputPath("test.txt")));
    }

    public static void compareTwoTextsFromStreamsWithResultPath(String sourceName, String targetName, String resultName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create two streams of text files
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, outputPath, ComparisonType.Text);

        System.out.println(result.available());
    }

    public static void compareTwoTextsFromStreams(String sourceName, String targetName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create two streams of text files
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);
        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, ComparisonType.Text);

        System.out.println(result.available());
        IOUtils.copy(result, new FileOutputStream(getOutputPath("test.txt")));
    }

    public static void compareTwoTextsWithResultPathAndSettings(String sourceName, String targetName, String resultName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, ComparisonType.Text, new TextComparisonSettings());

        System.out.println(result.available());
    }

    public static void compareTwoTextsWithSettings(String sourceName, String targetName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, targetPath, ComparisonType.Text, new TextComparisonSettings());

        System.out.println(result.available());
        IOUtils.copy(result, new FileOutputStream(getOutputPath("test.txt")));
    }

    public static void compareTwoTextsWithResultPath(String sourceName, String targetName, String resultName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, ComparisonType.Text);

        System.out.println(result.available());
    }

    public static void compareTwoTexts(String sourceName, String targetName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, targetPath, ComparisonType.Text);

        System.out.println(result.available());
        IOUtils.copy(result, new FileOutputStream(getOutputPath("test.txt")));
    }

    public static void compareTwoWordsFromStreamsWithResultPathAndSettings(String sourceName, String targetName, String resultName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create two streams of documents
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, outputPath, ComparisonType.Words, new WordsComparisonSettings());

        System.out.println(result.available());
    }

    public static void compareTwoWordsFromStreamsWithSettings(String sourceName, String targetName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create two streams of documents
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, ComparisonType.Words, new WordsComparisonSettings());

        System.out.println(result.available());
        IOUtils.copy(result, new FileOutputStream(getOutputPath("test.docx")));
    }

    public static void compareTwoWordsFromStreamsWithResultPath(String sourceName, String targetName, String resultName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create two streams of documents
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, outputPath, ComparisonType.Words);

        System.out.println(result.available());
    }

    public static void compareTwoWordsFromStreams(String sourceName, String targetName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create two streams of documents
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, ComparisonType.Words);

        System.out.println(result.available());
        IOUtils.copy(result, new FileOutputStream(getOutputPath("test.docx")));
    }

    public static void compareTwoWordsWithResultPathAndSettings(String sourceName, String targetName, String resultName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, ComparisonType.Words, new WordsComparisonSettings());

        System.out.println(result.available());
    }

    public static void compareTwoWordsWithSettings(String sourceName, String targetName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, targetPath, ComparisonType.Words, new WordsComparisonSettings());

        System.out.println(result.available());
        IOUtils.copy(result, new FileOutputStream(getOutputPath("test.docx")));
    }

    public static void compareTwoWordsWithResultPath(String sourceName, String targetName, String resultName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, ComparisonType.Words);

        System.out.println(result.available());
    }

    public static void compareTwoWords(String sourceName, String targetName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, targetPath, ComparisonType.Words);

        System.out.println(result.available());
        IOUtils.copy(result, new FileOutputStream(getOutputPath("test.docx")));
    }

    public static void compareTwoWorkbooksFromStreamsWithResultPathAndSettings(String sourceName, String targetName, String resultName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create two streams of workbooks
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, outputPath, ComparisonType.Cells, new CellsComparisonSettings());

        System.out.println(result.available());
    }

    public static void compareTwoWorkbooksFromStreamsWithSettings(String sourceName, String targetName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create two streams of workbooks
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of GroupDocs.Comparison.Comparison and call method Compare.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, ComparisonType.Cells, new CellsComparisonSettings());

        System.out.println(result.available());
        IOUtils.copy(result, new FileOutputStream(getOutputPath("test.xlsx")));
    }

    public static void compareTwoWorkbooksFromStreamsWithResultPath(String sourceName, String targetName, String resultName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create two streams of workbooks
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, outputPath, ComparisonType.Cells);

        System.out.println(result.available());
    }

    public static void compareTwoWorkbooksFromStreams(String sourceName, String targetName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create two streams of workbooks
        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourceStream, targetStream, ComparisonType.Cells);

        System.out.println(result.available());
        IOUtils.copy(result, new FileOutputStream(getOutputPath("test.xlsx")));
    }

    public static void compareTwoWorkbooksWithResultPathAndSettings(String sourceName, String targetName, String resultName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, ComparisonType.Cells, new CellsComparisonSettings());

        System.out.println(result.available());
    }

    public static void compareTwoWorkbooksWithSettings(String sourceName, String targetName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, targetPath, ComparisonType.Cells, new CellsComparisonSettings());

        System.out.println(result.available());
        IOUtils.copy(result, new FileOutputStream(getOutputPath("test.xlsx")));
    }

    public static void compareTwoWorkbooksWithResultPath(String sourceName, String targetName, String resultName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, ComparisonType.Cells);

        System.out.println(result.available());
    }

    public static void compareTwoWorkbooks(String sourceName, String targetName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Create instance of *GroupDocs.Comparison.Comparison* and call method *Compare*.
        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, targetPath, ComparisonType.Cells);

        System.out.println(result.available());
        IOUtils.copy(result, new FileOutputStream(getOutputPath("test.xlsx")));
    }
}
