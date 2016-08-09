package com.groupdocs.comparison.sample;
import com.groupdocs.comparison.Comparison;
import com.groupdocs.comparison.common.ComparisonType;
import com.groupdocs.comparison.common.FileType;
import com.groupdocs.comparison.common.comparisonsettings.WordsComparisonSettings;

import java.io.InputStream;

import static com.groupdocs.comparison.sample.Utilities.getOutputPath;
import static com.groupdocs.comparison.sample.Utilities.getStoragePath;

/**
 * The type View generator.
 * @author Aleksey Permyakov
 */
class CommonOperations {

    /**
     * Compare documents from strings.
     * @param source the source
     * @param target the target
     * @throws Exception the exception
     */
    static void compareTwoWords(String source, String target) throws Exception {
        final String sourcePath = getStoragePath(source);
        final String targetPath = getStoragePath(target);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, targetPath);

        System.out.println(result.available());
//        IOUtils.copy(result, new FileOutputStream("D:\\test.docx"));
    }

    /**
     * Compare documents from strings with output path.
     * @param source the source
     * @param target the target
     * @param output the output path
     * @throws Exception the exception
     */
    static void compareTwoWordsWithResultPath(String source, String target, String output) throws Exception {
        final String sourcePath = getStoragePath(source);
        final String targetPath = getStoragePath(target);
        final String outputPath = getOutputPath(output);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, targetPath, outputPath);

        System.out.println(result.available());
    }

    /**
     * Compare documents from strings with output path and target extension.
     * @param source the source
     * @param target the target
     * @param output the output path
     * @throws Exception the exception
     */
    static void compareTwoWordsWithResultPathAndTargetExtension(String source, String target, String output) throws Exception {
        final String sourcePath = getStoragePath(source);
        final String targetPath = getStoragePath(target);
        final String outputPath = getOutputPath(output);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, FileType.Docx);

        System.out.println(result.available());
    }

    /**
     * Compare documents from strings with output path and settings.
     * @param source the source
     * @param target the target
     * @param output the output path
     * @throws Exception the exception
     */
    static void compareTwoWordsWithResultPathAndSettings(String source, String target, String output) throws Exception {
        final String sourcePath = getStoragePath(source);
        final String targetPath = getStoragePath(target);
        final String outputPath = getOutputPath(output);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, new WordsComparisonSettings());

        System.out.println(result.available());
    }

    /**
     * Compare documents from strings with output path and target extension.
     * @param source the source
     * @param target the target
     * @param output the output path
     * @throws Exception the exception
     */
    static void compareTwoWordsWithResultPathSettingsAndTargetExtension(String source, String target, String output) throws Exception {
        final String sourcePath = getStoragePath(source);
        final String targetPath = getStoragePath(target);
        final String outputPath = getOutputPath(output);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, new WordsComparisonSettings(), FileType.Docx);

        System.out.println(result.available());
    }

    /**
     * Compare documents from strings with output path and target extension.
     * @param source the source
     * @param target the target
     * @param output the output path
     * @throws Exception the exception
     */
    static void compareTwoWordsWithResultPathAndType(String source, String target, String output) throws Exception {
        final String sourcePath = getStoragePath(source);
        final String targetPath = getStoragePath(target);
        final String outputPath = getOutputPath(output);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, ComparisonType.Words);

        System.out.println(result.available());
    }

    /**
     * Compare documents from strings with output path type and target extension.
     * @param source the source
     * @param target the target
     * @param output the output path
     * @throws Exception the exception
     */
    static void compareTwoWordsWithResultPathTypeAndTargetExtension(String source, String target, String output) throws Exception {
        final String sourcePath = getStoragePath(source);
        final String targetPath = getStoragePath(target);
        final String outputPath = getOutputPath(output);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, ComparisonType.Words, FileType.Docx);

        System.out.println(result.available());
    }

    /**
     * Compare documents from strings with settings.
     * @param source the source
     * @param target the target
     * @throws Exception the exception
     */
    static void compareTwoWordsWithSettings(String source, String target) throws Exception {
        final String sourcePath = getStoragePath(source);
        final String targetPath = getStoragePath(target);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, targetPath, new WordsComparisonSettings());

        System.out.println(result.available());
//        IOUtils.copy(result, new FileOutputStream("D:\\test.docx"));
    }

    /**
     * Compare documents from strings with settings and type.
     * @param source the source
     * @param target the target
     * @throws Exception the exception
     */
    static void compareTwoWordsWithSettingsAndType(String source, String target) throws Exception {
        final String sourcePath = getStoragePath(source);
        final String targetPath = getStoragePath(target);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, targetPath, ComparisonType.Words, new WordsComparisonSettings());

        System.out.println(result.available());
//        IOUtils.copy(result, new FileOutputStream("D:\\test.docx"));
    }

    /**
     * Compare documents from strings with type.
     * @param source the source
     * @param target the target
     * @throws Exception the exception
     */
    static void compareTwoWordsWithType(String source, String target) throws Exception {
        final String sourcePath = getStoragePath(source);
        final String targetPath = getStoragePath(target);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, targetPath, ComparisonType.Words);

        System.out.println(result.available());
//        IOUtils.copy(result, new FileOutputStream("D:\\test.docx"));
    }

    /**
     * Compare documents from strings with output path settings and type.
     * @param source the source
     * @param target the target
     * @param output the output path
     * @throws Exception the exception
     */
    static void compareTwoWordsWithResultPathSettingsAndType(String source, String target, String output) throws Exception {
        final String sourcePath = getStoragePath(source);
        final String targetPath = getStoragePath(target);
        final String outputPath = getOutputPath(output);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, ComparisonType.Words, new WordsComparisonSettings());

        System.out.println(result.available());
    }

    /**
     * Compare documents from strings with output path settings type and target extension.
     * @param source the source
     * @param target the target
     * @param output the output path
     * @throws Exception the exception
     */
    static void compareTwoWordsWithResultPathSettingsTypeAndExtension(String source, String target, String output) throws Exception {
        final String sourcePath = getStoragePath(source);
        final String targetPath = getStoragePath(target);
        final String outputPath = getOutputPath(output);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, targetPath, outputPath, ComparisonType.Words, new WordsComparisonSettings(), FileType.Docx);

        System.out.println(result.available());
    }

    /**
     * Compare encrypted documents from strings.
     * @param source the source
     * @param sourcePassword the source password
     * @param target the target
     * @param targetPassword the target password
     * @throws Exception the exception
     */
    static void compareTwoEncryptedWords(String source, String sourcePassword, String target, String targetPassword) throws Exception {
        final String sourcePath = getStoragePath(source);
        final String targetPath = getStoragePath(target);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword);

        System.out.println(result.available());
    }

    /**
     * Compare encrypted documents from strings with output path.
     * @param source the source
     * @param sourcePassword the source password
     * @param target the target
     * @param targetPassword the target password
     * @param output the output path
     * @throws Exception the exception
     */
    static void compareTwoEncryptedWordsWithResultPath(String source, String sourcePassword, String target, String targetPassword, String output) throws Exception {
        final String sourcePath = getStoragePath(source);
        final String targetPath = getStoragePath(target);
        final String outputPath = getOutputPath(output);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, outputPath);

        System.out.println(result.available());
    }

    /**
     * Compare encrypted documents from strings with output path and target extension.
     * @param source the source
     * @param sourcePassword the source password
     * @param target the target
     * @param targetPassword the target password
     * @param output the output path
     * @throws Exception the exception
     */
    static void compareTwoEncryptedWordsWithResultPathAndTargetExtension(String source, String sourcePassword, String target, String targetPassword, String output) throws Exception {
        final String sourcePath = getStoragePath(source);
        final String targetPath = getStoragePath(target);
        final String outputPath = getOutputPath(output);

        Comparison comparison = new Comparison();

        InputStream result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, outputPath, FileType.Docx);

        System.out.println(result.available());
    }

    /**
     * Compare encrypted documents from strings with output path and settings.
     * @param source the source
     * @param sourcePassword the source password
     * @param target the target
     * @param targetPassword the target password
     * @param output the output path
     * @throws Exception the exception
     */
    static void compareTwoEncryptedWordsWithResultPathAndSettings(String source, String sourcePassword, String target, String targetPassword, String output) throws Exception {
        final String sourcePath = getStoragePath(source);
        final String targetPath = getStoragePath(target);
        final String outputPath = getOutputPath(output);

        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, outputPath, new WordsComparisonSettings());

        System.out.println(result.available());
    }

    /**
     * Compare encrypted documents from strings with output path settings and target extension.
     * @param source the source
     * @param sourcePassword the source password
     * @param target the target
     * @param targetPassword the target password
     * @param output the output path
     * @throws Exception the exception
     */
    static void compareTwoEncryptedWordsWithResultPathSettingsAndTargetExtension(String source, String sourcePassword, String target, String targetPassword, String output) throws Exception {
        final String sourcePath = getStoragePath(source);
        final String targetPath = getStoragePath(target);
        final String outputPath = getOutputPath(output);

        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, outputPath, new WordsComparisonSettings(), FileType.Docx);

        System.out.println(result.available());
    }

    /**
     * Compare encrypted documents from strings with output path and type.
     * @param source the source
     * @param sourcePassword the source password
     * @param target the target
     * @param targetPassword the target password
     * @param output the output path
     * @throws Exception the exception
     */
    static void compareTwoEncryptedWordsWithResultPathAndType(String source, String sourcePassword, String target, String targetPassword, String output) throws Exception {
        final String sourcePath = getStoragePath(source);
        final String targetPath = getStoragePath(target);
        final String outputPath = getOutputPath(output);

        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, outputPath, ComparisonType.Words);

        System.out.println(result.available());
    }

    /**
     * Compare encrypted documents from strings with output path type and target extension.
     * @param source the source
     * @param sourcePassword the source password
     * @param target the target
     * @param targetPassword the target password
     * @param output the output path
     * @throws Exception the exception
     */
    static void compareTwoEncryptedWordsWithResultPathTypeAndTargetExtension(String source, String sourcePassword, String target, String targetPassword, String output) throws Exception {
        final String sourcePath = getStoragePath(source);
        final String targetPath = getStoragePath(target);
        final String outputPath = getOutputPath(output);

        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, outputPath, ComparisonType.Words, FileType.Docx);

        System.out.println(result.available());
    }

    /**
     * Compare encrypted documents from strings with settings.
     * @param source the source
     * @param sourcePassword the source password
     * @param target the target
     * @param targetPassword the target password
     * @throws Exception the exception
     */
    static void compareTwoEncryptedWordsWithSettings(String source, String sourcePassword, String target, String targetPassword) throws Exception {
        final String sourcePath = getStoragePath(source);
        final String targetPath = getStoragePath(target);

        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, new WordsComparisonSettings());

        System.out.println(result.available());
    }

    /**
     * Compare encrypted documents from strings with settings and type.
     * @param source the source
     * @param sourcePassword the source password
     * @param target the target
     * @param targetPassword the target password
     * @throws Exception the exception
     */
    static void compareTwoEncryptedWordsWithSettingsAndType(String source, String sourcePassword, String target, String targetPassword) throws Exception {
        final String sourcePath = getStoragePath(source);
        final String targetPath = getStoragePath(target);

        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, ComparisonType.Words, new WordsComparisonSettings());

        System.out.println(result.available());
    }

    /**
     * Compare encrypted documents from strings with type.
     * @param source the source
     * @param sourcePassword the source password
     * @param target the target
     * @param targetPassword the target password
     * @throws Exception the exception
     */
    static void compareTwoEncryptedWordsWithType(String source, String sourcePassword, String target, String targetPassword) throws Exception {
        final String sourcePath = getStoragePath(source);
        final String targetPath = getStoragePath(target);

        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, ComparisonType.Words);

        System.out.println(result.available());
    }

    /**
     * Compare encrypted documents from strings with output path settings and type.
     * @param source the source
     * @param sourcePassword the source password
     * @param target the target
     * @param targetPassword the target password
     * @param output the output path
     * @throws Exception the exception
     */
    static void compareTwoEncryptedWordsWithResultPathSettingsAndType(String source, String sourcePassword, String target, String targetPassword, String output) throws Exception {
        final String sourcePath = getStoragePath(source);
        final String targetPath = getStoragePath(target);
        final String outputPath = getOutputPath(output);

        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, outputPath, ComparisonType.Words, new WordsComparisonSettings());

        System.out.println(result.available());
    }

    /**
     * Compare encrypted documents from strings with output path settings type and target extension.
     * @param source the source
     * @param sourcePassword the source password
     * @param target the target
     * @param targetPassword the target password
     * @param output the output path
     * @throws Exception the exception
     */
    static void compareTwoEncryptedWordsWithResultPathSettingsTypeAndTargetExtension(String source, String sourcePassword, String target, String targetPassword, String output) throws Exception {
        final String sourcePath = getStoragePath(source);
        final String targetPath = getStoragePath(target);
        final String outputPath = getOutputPath(output);

        Comparison comparison = new Comparison();
        InputStream result = comparison.compare(sourcePath, sourcePassword, targetPath, targetPassword, outputPath, ComparisonType.Words, new WordsComparisonSettings(), FileType.Docx);

        System.out.println(result.available());
    }
}
