package com.groupdocs.comparison.sample.operations;

import com.groupdocs.comparison.Comparison;
import com.groupdocs.comparison.common.ComparisonType;
import com.groupdocs.comparison.common.FileType;
import com.groupdocs.comparison.common.comparisonsettings.WordsComparisonSettings;
import com.groupdocs.comparison.sample.Utilities;
import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.FileOutputStream;
import java.io.InputStream;

import static com.groupdocs.comparison.sample.TestRunner.applyLicense;
import static com.groupdocs.comparison.sample.TestRunner.getOutputPath;
import static com.groupdocs.comparison.sample.TestRunner.getStoragePath;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * The type View generator.
 *
 * @author Aleksey Permyakov
 */
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

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, targetPath);

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
        IOUtils.copy(result, new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
    public void testCompareTwoWordsWithResultPath() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoWordsWithResultPath.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, targetPath, outputPath);

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
    }

    @Test
    public void testCompareTwoWordsWithResultPathAndTargetExtension() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoWordsWithResultPathAndTargetExtension.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, FileType.Docx);

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
    }

    @Test
    public void testCompareTwoWordsWithResultPathAndSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoWordsWithResultPathAndSettings.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, new WordsComparisonSettings());

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
    }

    @Test
    public void testCompareTwoWordsWithResultPathSettingsAndTargetExtension() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoWordsWithResultPathSettingsAndTargetExtension.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, new WordsComparisonSettings(), FileType.Docx);

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
    }

    @Test
    public void testCompareTwoWordsWithResultPathAndType() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoWordsWithResultPathAndType.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, ComparisonType.Words);

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
    }

    @Test
    public void testCompareTwoWordsWithResultPathTypeAndTargetExtension() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoWordsWithResultPathTypeAndTargetExtension.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, ComparisonType.Words, FileType.Docx);

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
    }

    @Test
    public void testCompareTwoWordsWithSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoWordsWithSettings.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, targetPath, new WordsComparisonSettings());

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
        IOUtils.copy(result, new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
    public void testCompareTwoWordsWithSettingsAndType() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoWordsWithSettingsAndType.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, targetPath, ComparisonType.Words, new WordsComparisonSettings());

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
        IOUtils.copy(result, new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
    public void testCompareTwoWordsWithType() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoWordsWithType.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, targetPath, ComparisonType.Words);

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
        IOUtils.copy(result, new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
    public void testCompareTwoWordsWithResultPathSettingsAndType() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoWordsWithResultPathSettingsAndType.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, ComparisonType.Words, new WordsComparisonSettings());

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
    }

    @Test
    public void testCompareTwoWordsWithResultPathSettingsTypeAndExtension() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoWordsWithResultPathSettingsTypeAndExtension.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, ComparisonType.Words, new WordsComparisonSettings(), FileType.Docx);

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
    }

    @Test
    public void testCompareTwoEncryptedWords() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoEncryptedWords.docx";
        final String sourcePassword = "pass", targetPassword = "pass";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword);

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
        IOUtils.copy(result, new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
    public void testCompareTwoEncryptedWordsWithResultPath() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoEncryptedWordsWithResultPath.docx";
        final String sourcePassword = "pass", targetPassword = "pass";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, outputPath);

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
    }

    @Test
    public void testCompareTwoEncryptedWordsWithResultPathAndTargetExtension() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoEncryptedWordsWithResultPathAndTargetExtension.docx";
        final String sourcePassword = "pass", targetPassword = "pass";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, outputPath, FileType.Docx);

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
    }

    @Test
    public void testCompareTwoEncryptedWordsWithResultPathAndSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoEncryptedWordsWithResultPathAndSettings.docx";
        final String sourcePassword = "pass", targetPassword = "pass";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, outputPath, new WordsComparisonSettings());

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
    }

    @Test
    public void testCompareTwoEncryptedWordsWithResultPathSettingsAndTargetExtension() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoEncryptedWordsWithResultPathSettingsAndTargetExtension.docx";
        final String sourcePassword = "pass", targetPassword = "pass";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, outputPath, new WordsComparisonSettings(), FileType.Docx);

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
    }

    @Test
    public void testCompareTwoEncryptedWordsWithResultPathAndType() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoEncryptedWordsWithResultPathAndType.docx";
        final String sourcePassword = "pass", targetPassword = "pass";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, outputPath, ComparisonType.Words);

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
    }

    @Test
    public void testCompareTwoEncryptedWordsWithResultPathTypeAndTargetExtension() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoEncryptedWordsWithResultPathTypeAndTargetExtension.docx";
        final String sourcePassword = "pass", targetPassword = "pass";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, outputPath, ComparisonType.Words, FileType.Docx);

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
    }

    @Test
    public void testCompareTwoEncryptedWordsWithSettings() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoEncryptedWordsWithSettings.docx";
        final String sourcePassword = "pass", targetPassword = "pass";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, new WordsComparisonSettings());

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
        IOUtils.copy(result, new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
    public void testCompareTwoEncryptedWordsWithSettingsAndType() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoEncryptedWordsWithSettingsAndType.docx";
        final String sourcePassword = "pass", targetPassword = "pass";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, ComparisonType.Words, new WordsComparisonSettings());

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
        IOUtils.copy(result, new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
    public void testCompareTwoEncryptedWordsWithType() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoEncryptedWordsWithType.docx";
        final String sourcePassword = "pass", targetPassword = "pass";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, ComparisonType.Words);

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
        IOUtils.copy(result, new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
    public void testCompareTwoEncryptedWordsWithResultPathSettingsAndType() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoEncryptedWordsWithResultPathSettingsAndType.docx";
        final String sourcePassword = "pass", targetPassword = "pass";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, outputPath, ComparisonType.Words, new WordsComparisonSettings());

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
    }

    @Test
    public void testCompareTwoEncryptedWordsWithResultPathSettingsTypeAndTargetExtension() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "co_testCompareTwoEncryptedWordsWithResultPathSettingsTypeAndTargetExtension.docx";
        final String sourcePassword = "pass", targetPassword = "pass";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, outputPath, ComparisonType.Words, new WordsComparisonSettings(), FileType.Docx);

        System.out.println("Stream size: " + result.available());
        assertFalse("Result stream is empty", result.available() == 0);
    }
}
