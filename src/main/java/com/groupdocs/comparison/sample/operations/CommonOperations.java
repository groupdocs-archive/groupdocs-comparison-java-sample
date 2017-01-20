package com.groupdocs.comparison.sample.operations;

import com.groupdocs.comparison.Comparison;
import com.groupdocs.comparison.common.ComparisonType;
import com.groupdocs.comparison.common.FileType;
import com.groupdocs.comparison.common.comparisonsettings.WordsComparisonSettings;
import org.apache.commons.io.IOUtils;

import java.io.FileOutputStream;
import java.io.InputStream;

import static com.groupdocs.comparison.sample.Utilities.getOutputPath;
import static com.groupdocs.comparison.sample.Utilities.getStoragePath;

/**
 * The type View generator.
 *
 * @author Aleksey Permyakov
 */
public class CommonOperations {

    /**
     * Compare documents from strings.
     *
     * @param sourceName the sourceName
     * @param targetName the targetName
     * @throws Exception the exception
     */
    public static void compareTwoWords(String sourceName, String targetName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, targetPath);

        System.out.println(result.available());
        IOUtils.copy(result, new FileOutputStream(getOutputPath("co_compareTwoWords.docx")));
    }

    /**
     * Compare documents from strings with result path.
     *
     * @param sourceName the sourceName
     * @param targetName the targetName
     * @param resultName the result path
     * @throws Exception the exception
     */
    public static void compareTwoWordsWithResultPath(String sourceName, String targetName, String resultName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, targetPath, outputPath);

        System.out.println(result.available());
    }

    /**
     * Compare documents from strings with result path and targetName extension.
     *
     * @param sourceName the sourceName
     * @param targetName the targetName
     * @param resultName the result path
     * @throws Exception the exception
     */
    public static void compareTwoWordsWithResultPathAndTargetExtension(String sourceName, String targetName, String resultName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, FileType.Docx);

        System.out.println(result.available());
    }

    /**
     * Compare documents from strings with result path and settings.
     *
     * @param sourceName the sourceName
     * @param targetName the targetName
     * @param resultName the result path
     * @throws Exception the exception
     */
    public static void compareTwoWordsWithResultPathAndSettings(String sourceName, String targetName, String resultName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, new WordsComparisonSettings());

        System.out.println(result.available());
    }

    /**
     * Compare documents from strings with result path and targetName extension.
     *
     * @param sourceName the sourceName
     * @param targetName the targetName
     * @param resultName the result path
     * @throws Exception the exception
     */
    public static void compareTwoWordsWithResultPathSettingsAndTargetExtension(String sourceName, String targetName, String resultName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, new WordsComparisonSettings(), FileType.Docx);

        System.out.println(result.available());
    }

    /**
     * Compare documents from strings with result path and targetName extension.
     *
     * @param sourceName the sourceName
     * @param targetName the targetName
     * @param resultName the result path
     * @throws Exception the exception
     */
    public static void compareTwoWordsWithResultPathAndType(String sourceName, String targetName, String resultName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, ComparisonType.Words);

        System.out.println(result.available());
    }

    /**
     * Compare documents from strings with result path type and targetName extension.
     *
     * @param sourceName the sourceName
     * @param targetName the targetName
     * @param resultName the result path
     * @throws Exception the exception
     */
    public static void compareTwoWordsWithResultPathTypeAndTargetExtension(String sourceName, String targetName, String resultName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, ComparisonType.Words, FileType.Docx);

        System.out.println(result.available());
    }

    /**
     * Compare documents from strings with settings.
     *
     * @param sourceName the sourceName
     * @param targetName the targetName
     * @throws Exception the exception
     */
    public static void compareTwoWordsWithSettings(String sourceName, String targetName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, targetPath, new WordsComparisonSettings());

        System.out.println(result.available());
        IOUtils.copy(result, new FileOutputStream(getOutputPath("co_compareTwoWordsWithSettings.docx")));
    }

    /**
     * Compare documents from strings with settings and type.
     *
     * @param sourceName the sourceName
     * @param targetName the targetName
     * @throws Exception the exception
     */
    public static void compareTwoWordsWithSettingsAndType(String sourceName, String targetName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, targetPath, ComparisonType.Words, new WordsComparisonSettings());

        System.out.println(result.available());
        IOUtils.copy(result, new FileOutputStream(getOutputPath("co_compareTwoWordsWithSettingsAndType.docx")));
    }

    /**
     * Compare documents from strings with type.
     *
     * @param sourceName the sourceName
     * @param targetName the targetName
     * @throws Exception the exception
     */
    public static void compareTwoWordsWithType(String sourceName, String targetName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, targetPath, ComparisonType.Words);

        System.out.println(result.available());
        IOUtils.copy(result, new FileOutputStream(getOutputPath("co_compareTwoWordsWithType.docx")));
    }

    /**
     * Compare documents from strings with result path settings and type.
     *
     * @param sourceName the sourceName
     * @param targetName the targetName
     * @param resultName the result path
     * @throws Exception the exception
     */
    public static void compareTwoWordsWithResultPathSettingsAndType(String sourceName, String targetName, String resultName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, ComparisonType.Words, new WordsComparisonSettings());

        System.out.println(result.available());
    }

    /**
     * Compare documents from strings with result path settings type and targetName extension.
     *
     * @param sourceName the sourceName
     * @param targetName the targetName
     * @param resultName the result path
     * @throws Exception the exception
     */
    public static void compareTwoWordsWithResultPathSettingsTypeAndExtension(String sourceName, String targetName, String resultName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, ComparisonType.Words, new WordsComparisonSettings(), FileType.Docx);

        System.out.println(result.available());
    }

    /**
     * Compare encrypted documents from strings.
     *
     * @param sourceName     the sourceName
     * @param sourcePassword the source password
     * @param targetName     the targetName
     * @param targetPassword the target password
     * @throws Exception the exception
     */
    public static void compareTwoEncryptedWords(String sourceName, String sourcePassword, String targetName, String targetPassword) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword);

        System.out.println(result.available());
        IOUtils.copy(result, new FileOutputStream(getOutputPath("co_compareTwoEncryptedWords.docx")));
    }

    /**
     * Compare encrypted documents from strings with result path.
     *
     * @param sourceName     the sourceName
     * @param sourcePassword the source password
     * @param targetName     the targetName
     * @param targetPassword the target password
     * @param resultName     the result path
     * @throws Exception the exception
     */
    public static void compareTwoEncryptedWordsWithResultPath(String sourceName, String sourcePassword, String targetName, String targetPassword, String resultName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, outputPath);

        System.out.println(result.available());
    }

    /**
     * Compare encrypted documents from strings with result path and targetName extension.
     *
     * @param sourceName     the sourceName
     * @param sourcePassword the source password
     * @param targetName     the targetName
     * @param targetPassword the target password
     * @param resultName     the result path
     * @throws Exception the exception
     */
    public static void compareTwoEncryptedWordsWithResultPathAndTargetExtension(String sourceName, String sourcePassword, String targetName, String targetPassword, String resultName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, outputPath, FileType.Docx);

        System.out.println(result.available());
    }

    /**
     * Compare encrypted documents from strings with result path and settings.
     *
     * @param sourceName     the sourceName
     * @param sourcePassword the source password
     * @param targetName     the targetName
     * @param targetPassword the target password
     * @param resultName     the result path
     * @throws Exception the exception
     */
    public static void compareTwoEncryptedWordsWithResultPathAndSettings(String sourceName, String sourcePassword, String targetName, String targetPassword, String resultName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, outputPath, new WordsComparisonSettings());

        System.out.println(result.available());
    }

    /**
     * Compare encrypted documents from strings with result path settings and targetName extension.
     *
     * @param sourceName     the sourceName
     * @param sourcePassword the source password
     * @param targetName     the targetName
     * @param targetPassword the target password
     * @param resultName     the result path
     * @throws Exception the exception
     */
    public static void compareTwoEncryptedWordsWithResultPathSettingsAndTargetExtension(String sourceName, String sourcePassword, String targetName, String targetPassword, String resultName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, outputPath, new WordsComparisonSettings(), FileType.Docx);

        System.out.println(result.available());
    }

    /**
     * Compare encrypted documents from strings with result path and type.
     *
     * @param sourceName     the sourceName
     * @param sourcePassword the source password
     * @param targetName     the targetName
     * @param targetPassword the target password
     * @param resultName     the result path
     * @throws Exception the exception
     */
    public static void compareTwoEncryptedWordsWithResultPathAndType(String sourceName, String sourcePassword, String targetName, String targetPassword, String resultName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, outputPath, ComparisonType.Words);

        System.out.println(result.available());
    }

    /**
     * Compare encrypted documents from strings with result path type and targetName extension.
     *
     * @param sourceName     the sourceName
     * @param sourcePassword the source password
     * @param targetName     the targetName
     * @param targetPassword the target password
     * @param resultName     the result path
     * @throws Exception the exception
     */
    public static void compareTwoEncryptedWordsWithResultPathTypeAndTargetExtension(String sourceName, String sourcePassword, String targetName, String targetPassword, String resultName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, outputPath, ComparisonType.Words, FileType.Docx);

        System.out.println(result.available());
    }

    /**
     * Compare encrypted documents from strings with settings.
     *
     * @param sourceName     the sourceName
     * @param sourcePassword the source password
     * @param targetName     the targetName
     * @param targetPassword the target password
     * @throws Exception the exception
     */
    public static void compareTwoEncryptedWordsWithSettings(String sourceName, String sourcePassword, String targetName, String targetPassword) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, new WordsComparisonSettings());

        System.out.println(result.available());
        IOUtils.copy(result, new FileOutputStream(getOutputPath("co_compareTwoEncryptedWordsWithSettings.docx")));
    }

    /**
     * Compare encrypted documents from strings with settings and type.
     *
     * @param sourceName     the sourceName
     * @param sourcePassword the source password
     * @param targetName     the targetName
     * @param targetPassword the target password
     * @throws Exception the exception
     */
    public static void compareTwoEncryptedWordsWithSettingsAndType(String sourceName, String sourcePassword, String targetName, String targetPassword) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, ComparisonType.Words, new WordsComparisonSettings());

        System.out.println(result.available());
        IOUtils.copy(result, new FileOutputStream(getOutputPath("co_compareTwoEncryptedWordsWithSettingsAndType.docx")));
    }

    /**
     * Compare encrypted documents from strings with type.
     *
     * @param sourceName     the sourceName
     * @param sourcePassword the source password
     * @param targetName     the targetName
     * @param targetPassword the target password
     * @throws Exception the exception
     */
    public static void compareTwoEncryptedWordsWithType(String sourceName, String sourcePassword, String targetName, String targetPassword) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, ComparisonType.Words);

        System.out.println(result.available());
        IOUtils.copy(result, new FileOutputStream(getOutputPath("co_compareTwoEncryptedWordsWithType.docx")));
    }

    /**
     * Compare encrypted documents from strings with result path settings and type.
     *
     * @param sourceName     the sourceName
     * @param sourcePassword the source password
     * @param targetName     the targetName
     * @param targetPassword the target password
     * @param resultName     the result path
     * @throws Exception the exception
     */
    public static void compareTwoEncryptedWordsWithResultPathSettingsAndType(String sourceName, String sourcePassword, String targetName, String targetPassword, String resultName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, outputPath, ComparisonType.Words, new WordsComparisonSettings());

        System.out.println(result.available());
    }

    /**
     * Compare encrypted documents from strings with result path settings type and targetName extension.
     *
     * @param sourceName     the sourceName
     * @param sourcePassword the source password
     * @param targetName     the targetName
     * @param targetPassword the target password
     * @param resultName     the result path
     * @throws Exception the exception
     */
    public static void compareTwoEncryptedWordsWithResultPathSettingsTypeAndTargetExtension(String sourceName, String sourcePassword, String targetName, String targetPassword, String resultName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String outputPath = getOutputPath(resultName);

        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, outputPath, ComparisonType.Words, new WordsComparisonSettings(), FileType.Docx);

        System.out.println(result.available());
    }
}
