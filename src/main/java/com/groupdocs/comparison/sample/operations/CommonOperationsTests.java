package com.groupdocs.comparison.sample.operations;

import com.groupdocs.comparison.Comparer;
import com.groupdocs.comparison.common.compareresult.ICompareResult;
import com.groupdocs.comparison.common.comparisonsettings.ComparisonSettings;
import com.groupdocs.comparison.sample.Utilities;
import org.junit.Before;
import org.junit.Test;

import static com.groupdocs.comparison.sample.TestRunner.*;
import static org.junit.Assert.assertFalse;

/**
 * The type View generator.
 *
 * @author Aleksey Permyakov
 */
@SuppressWarnings("all")
public class CommonOperationsTests {

    @Before
    public void before() {
        applyLicense();
    }

    @Test
    public void testCompareTwoWords() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoWords.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        Comparer comparison = new Comparer();

        ICompareResult result = comparison.compare(sourcePath, targetPath, new ComparisonSettings());
        result.saveDocument(getOutputPath(resultName));

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test
    public void testCompareTwoWordsWithResultPath() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoWordsWithResultPath.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparer comparison = new Comparer();

        ICompareResult result = comparison.compare(sourcePath, targetPath, new ComparisonSettings());
        result.saveDocument(outputPath);

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test
    public void testCompareTwoWordsWithResultPathAndTargetExtension() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoWordsWithResultPathAndTargetExtension.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparer comparison = new Comparer();

        ICompareResult result = comparison.compare(sourcePath, targetPath, new ComparisonSettings());
        result.saveDocument(outputPath);

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test
    public void testCompareTwoWordsWithResultPathAndSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoWordsWithResultPathAndSettings.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparer comparison = new Comparer();

        ICompareResult result = comparison.compare(sourcePath, targetPath, new ComparisonSettings());
        result.saveDocument(outputPath);

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test
    public void testCompareTwoWordsWithResultPathSettingsAndTargetExtension() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoWordsWithResultPathSettingsAndTargetExtension.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparer comparison = new Comparer();

        ICompareResult result = comparison.compare(sourcePath, targetPath, new ComparisonSettings());
        result.saveDocument(outputPath);

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test
    public void testCompareTwoWordsWithResultPathAndType() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoWordsWithResultPathAndType.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparer comparison = new Comparer();

        ICompareResult result = comparison.compare(sourcePath, targetPath, new ComparisonSettings());
        result.saveDocument(outputPath);

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test
    public void testCompareTwoWordsWithResultPathTypeAndTargetExtension() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoWordsWithResultPathTypeAndTargetExtension.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparer comparison = new Comparer();

        ICompareResult result = comparison.compare(sourcePath, targetPath, new ComparisonSettings());
        result.saveDocument(outputPath);

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test
    public void testCompareTwoWordsWithSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoWordsWithSettings.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        Comparer comparison = new Comparer();

        ICompareResult result = comparison.compare(sourcePath, targetPath, new ComparisonSettings());
        result.saveDocument(getOutputPath(resultName));

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test
    public void testCompareTwoWordsWithSettingsAndType() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoWordsWithSettingsAndType.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        Comparer comparison = new Comparer();

        ICompareResult result = comparison.compare(sourcePath, targetPath, new ComparisonSettings());
        result.saveDocument(getOutputPath(resultName));

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test
    public void testCompareTwoWordsWithType() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoWordsWithType.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        Comparer comparison = new Comparer();

        ICompareResult result = comparison.compare(sourcePath, targetPath, new ComparisonSettings());
        result.saveDocument(getOutputPath(resultName));

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test
    public void testCompareTwoWordsWithResultPathSettingsAndType() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoWordsWithResultPathSettingsAndType.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparer comparison = new Comparer();

        ICompareResult result = comparison.compare(sourcePath, targetPath, new ComparisonSettings());
        result.saveDocument(outputPath);

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test
    public void testCompareTwoWordsWithResultPathSettingsTypeAndExtension() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoWordsWithResultPathSettingsTypeAndExtension.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparer comparison = new Comparer();

        ICompareResult result = comparison.compare(sourcePath, targetPath, new ComparisonSettings());
        result.saveDocument(outputPath);

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test
    public void testCompareTwoEncryptedWords() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoEncryptedWords.docx";
        final String sourcePassword = "pass", targetPassword = "pass";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        Comparer comparison = new Comparer();

        ICompareResult result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, new ComparisonSettings());
        result.saveDocument(getOutputPath(resultName));

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test
    public void testCompareTwoEncryptedWordsWithResultPath() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoEncryptedWordsWithResultPath.docx";
        final String sourcePassword = "pass", targetPassword = "pass";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparer comparison = new Comparer();

        ICompareResult result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, new ComparisonSettings());
        result.saveDocument(outputPath);

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test
    public void testCompareTwoEncryptedWordsWithResultPathAndTargetExtension() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoEncryptedWordsWithResultPathAndTargetExtension.docx";
        final String sourcePassword = "pass", targetPassword = "pass";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparer comparison = new Comparer();

        ICompareResult result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, new ComparisonSettings());
        result.saveDocument(outputPath);

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test
    public void testCompareTwoEncryptedWordsWithResultPathAndSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoEncryptedWordsWithResultPathAndSettings.docx";
        final String sourcePassword = "pass", targetPassword = "pass";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, new ComparisonSettings());
        result.saveDocument(outputPath);

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test
    public void testCompareTwoEncryptedWordsWithResultPathSettingsAndTargetExtension() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoEncryptedWordsWithResultPathSettingsAndTargetExtension.docx";
        final String sourcePassword = "pass", targetPassword = "pass";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, new ComparisonSettings());
        result.saveDocument(outputPath);

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test
    public void testCompareTwoEncryptedWordsWithResultPathAndType() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoEncryptedWordsWithResultPathAndType.docx";
        final String sourcePassword = "pass", targetPassword = "pass";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, new ComparisonSettings());
        result.saveDocument(outputPath);

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test
    public void testCompareTwoEncryptedWordsWithResultPathTypeAndTargetExtension() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoEncryptedWordsWithResultPathTypeAndTargetExtension.docx";
        final String sourcePassword = "pass", targetPassword = "pass";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, new ComparisonSettings());
        result.saveDocument(outputPath);

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test
    public void testCompareTwoEncryptedWordsWithSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoEncryptedWordsWithSettings.docx";
        final String sourcePassword = "pass", targetPassword = "pass";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, new ComparisonSettings());
        result.saveDocument(getOutputPath(resultName));

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test
    public void testCompareTwoEncryptedWordsWithSettingsAndType() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoEncryptedWordsWithSettingsAndType.docx";
        final String sourcePassword = "pass", targetPassword = "pass";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, new ComparisonSettings());
        result.saveDocument(getOutputPath(resultName));

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test
    public void testCompareTwoEncryptedWordsWithType() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoEncryptedWordsWithType.docx";
        final String sourcePassword = "pass", targetPassword = "pass";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, new ComparisonSettings());
        result.saveDocument(getOutputPath(resultName));

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test
    public void testCompareTwoEncryptedWordsWithResultPathSettingsAndType() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoEncryptedWordsWithResultPathSettingsAndType.docx";
        final String sourcePassword = "pass", targetPassword = "pass";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, new ComparisonSettings());
        result.saveDocument(outputPath);

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }

    @Test
    public void testCompareTwoEncryptedWordsWithResultPathSettingsTypeAndTargetExtension() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoEncryptedWordsWithResultPathSettingsTypeAndTargetExtension.docx";
        final String sourcePassword = "pass", targetPassword = "pass";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, new ComparisonSettings());
        result.saveDocument(outputPath);

        System.out.println("Stream size: " + result.getStream().available());
        assertFalse("Result stream is empty", result.getStream().available() == 0);
    }
}
