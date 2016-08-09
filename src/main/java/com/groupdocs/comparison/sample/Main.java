package com.groupdocs.comparison.sample;

/**
 * The type Main.
 */
public class Main {

    public static void main(String[] params) throws Exception {
        Utilities.applyLicense();

        CommonOperations.compareTwoWords("source.docx", "target.docx");
        CommonOperations.compareTwoWordsWithResultPath("source.docx", "target.docx", "result1.docx");
        CommonOperations.compareTwoWordsWithResultPathAndTargetExtension("source.docx", "target.docx", "result2.docx");
        CommonOperations.compareTwoWordsWithResultPathAndSettings("source.docx", "target.docx", "result3.docx");
        CommonOperations.compareTwoWordsWithResultPathSettingsAndTargetExtension("source.docx", "target.docx", "result4.docx");
        CommonOperations.compareTwoWordsWithResultPathAndType("source.docx", "target.docx", "result5.docx");
        CommonOperations.compareTwoWordsWithResultPathTypeAndTargetExtension("source.docx", "target.docx", "result6.docx");
        CommonOperations.compareTwoWordsWithSettings("source.docx", "target.docx");
        CommonOperations.compareTwoWordsWithSettingsAndType("source.docx", "target.docx");
        CommonOperations.compareTwoWordsWithType("source.docx", "target.docx");
        CommonOperations.compareTwoWordsWithResultPathSettingsAndType("source.docx", "target.docx", "result7.docx");
        CommonOperations.compareTwoWordsWithResultPathSettingsTypeAndExtension("source.docx", "target.docx", "result8.docx");

        System.out.println();

        CommonOperations.compareTwoEncryptedWords("source-encrypted.docx", "pass", "target-encrypted.docx", "pass");
        CommonOperations.compareTwoEncryptedWordsWithResultPath("source-encrypted.docx", "pass", "target-encrypted.docx", "pass", "result9.docx");
        CommonOperations.compareTwoEncryptedWordsWithResultPathAndTargetExtension("source-encrypted.docx", "pass", "target-encrypted.docx", "pass", "result10.docx");
        CommonOperations.compareTwoEncryptedWordsWithResultPathAndSettings("source-encrypted.docx", "pass", "target-encrypted.docx", "pass", "result11.docx");
        CommonOperations.compareTwoEncryptedWordsWithResultPathSettingsAndTargetExtension("source-encrypted.docx", "pass", "target-encrypted.docx", "pass", "result12.docx");
        CommonOperations.compareTwoEncryptedWordsWithResultPathAndType("source-encrypted.docx", "pass", "target-encrypted.docx", "pass", "result12.docx");
        CommonOperations.compareTwoEncryptedWordsWithResultPathTypeAndTargetExtension("source-encrypted.docx", "pass", "target-encrypted.docx", "pass", "result13.docx");
        CommonOperations.compareTwoEncryptedWordsWithSettings("source-encrypted.docx", "pass", "target-encrypted.docx", "pass");
        CommonOperations.compareTwoEncryptedWordsWithSettingsAndType("source-encrypted.docx", "pass", "target-encrypted.docx", "pass");
        CommonOperations.compareTwoEncryptedWordsWithType("source-encrypted.docx", "pass", "target-encrypted.docx", "pass");
        CommonOperations.compareTwoEncryptedWordsWithResultPathSettingsAndType("source-encrypted.docx", "pass", "target-encrypted.docx", "pass", "result14.docx");
        CommonOperations.compareTwoEncryptedWordsWithResultPathSettingsTypeAndTargetExtension("source-encrypted.docx", "pass", "target-encrypted.docx", "pass", "result15.docx");
    }
}
