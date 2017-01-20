package com.groupdocs.comparison.sample;

import com.groupdocs.comparison.sample.operations.CheckOperations;
import com.groupdocs.comparison.sample.operations.CommonOperations;
import com.groupdocs.comparison.sample.operations.DocumentsOperations;
import com.groupdocs.comparison.sample.operations.OptionsOperations;

/**
 * The type Main.
 */
public class Main {

    public static void main(String[] params) throws Exception {

        Utilities.applyLicense();

        CommonOperations.compareTwoWords("source.docx", "target.docx");
        CommonOperations.compareTwoWordsWithResultPath("source.docx", "target.docx", "co_compareTwoWordsWithResultPath.docx");
        CommonOperations.compareTwoWordsWithResultPathAndTargetExtension("source.docx", "target.docx", "co_compareTwoWordsWithResultPathAndTargetExtension.docx");
        CommonOperations.compareTwoWordsWithResultPathAndSettings("source.docx", "target.docx", "co_compareTwoWordsWithResultPathAndSettings.docx");
        CommonOperations.compareTwoWordsWithResultPathSettingsAndTargetExtension("source.docx", "target.docx", "co_compareTwoWordsWithResultPathSettingsAndTargetExtension.docx");
        CommonOperations.compareTwoWordsWithResultPathAndType("source.docx", "target.docx", "co_compareTwoWordsWithResultPathAndType.docx");
        CommonOperations.compareTwoWordsWithResultPathTypeAndTargetExtension("source.docx", "target.docx", "co_compareTwoWordsWithResultPathTypeAndTargetExtension.docx");
        CommonOperations.compareTwoWordsWithSettings("source.docx", "target.docx");
        CommonOperations.compareTwoWordsWithSettingsAndType("source.docx", "target.docx");
        CommonOperations.compareTwoWordsWithType("source.docx", "target.docx");
        CommonOperations.compareTwoWordsWithResultPathSettingsAndType("source.docx", "target.docx", "co_compareTwoWordsWithResultPathSettingsAndType.docx");
        CommonOperations.compareTwoWordsWithResultPathSettingsTypeAndExtension("source.docx", "target.docx", "co_compareTwoWordsWithResultPathSettingsTypeAndExtension.docx");

        System.out.println();

        CommonOperations.compareTwoEncryptedWords("source-encrypted.docx", "pass", "target-encrypted.docx", "pass");
        CommonOperations.compareTwoEncryptedWordsWithResultPath("source-encrypted.docx", "pass", "target-encrypted.docx", "pass", "co_compareTwoEncryptedWordsWithResultPath.docx");
        CommonOperations.compareTwoEncryptedWordsWithResultPathAndTargetExtension("source-encrypted.docx", "pass", "target-encrypted.docx", "pass", "co_compareTwoEncryptedWordsWithResultPathAndTargetExtension.docx");
        CommonOperations.compareTwoEncryptedWordsWithResultPathAndSettings("source-encrypted.docx", "pass", "target-encrypted.docx", "pass", "co_compareTwoEncryptedWordsWithResultPathAndSettings.docx");
        CommonOperations.compareTwoEncryptedWordsWithResultPathSettingsAndTargetExtension("source-encrypted.docx", "pass", "target-encrypted.docx", "pass", "co_compareTwoEncryptedWordsWithResultPathSettingsAndTargetExtension.docx");
        CommonOperations.compareTwoEncryptedWordsWithResultPathAndType("source-encrypted.docx", "pass", "target-encrypted.docx", "pass", "co_compareTwoEncryptedWordsWithResultPathAndType.docx");
        CommonOperations.compareTwoEncryptedWordsWithResultPathTypeAndTargetExtension("source-encrypted.docx", "pass", "target-encrypted.docx", "pass", "co_compareTwoEncryptedWordsWithResultPathTypeAndTargetExtension.docx");
        CommonOperations.compareTwoEncryptedWordsWithSettings("source-encrypted.docx", "pass", "target-encrypted.docx", "pass");
        CommonOperations.compareTwoEncryptedWordsWithSettingsAndType("source-encrypted.docx", "pass", "target-encrypted.docx", "pass");
        CommonOperations.compareTwoEncryptedWordsWithType("source-encrypted.docx", "pass", "target-encrypted.docx", "pass");
        CommonOperations.compareTwoEncryptedWordsWithResultPathSettingsAndType("source-encrypted.docx", "pass", "target-encrypted.docx", "pass", "co_compareTwoEncryptedWordsWithResultPathSettingsAndType.docx");
        CommonOperations.compareTwoEncryptedWordsWithResultPathSettingsTypeAndTargetExtension("source-encrypted.docx", "pass", "target-encrypted.docx", "pass", "co_compareTwoEncryptedWordsWithResultPathSettingsTypeAndTargetExtension.docx");

        System.out.println();

        DocumentsOperations.compareTwoHtmlFromStreams("source.html", "target.html", "do_compareTwoHtmlFromStreams.html");
        DocumentsOperations.compareTwoHtml("source.html", "target.html");
        DocumentsOperations.compareTwoPdfFromStreamsWithResultPathAndSettings("source.pdf", "target.pdf", "do_compareTwoPdfFromStreamsWithResultPathAndSettings.pdf");
        DocumentsOperations.compareTwoPdfFromStreamsWithSettings("source.pdf", "target.pdf");
        DocumentsOperations.compareTwoPdfFromStreamsWithResultPath("source.pdf", "target.pdf", "do_compareTwoPdfFromStreamsWithResultPath.pdf");
        DocumentsOperations.compareTwoPdfFromStreams("source.pdf", "target.pdf");
        DocumentsOperations.compareTwoPdfWithResultPathAndSettings("source.pdf", "target.pdf", "do_compareTwoPdfWithResultPathAndSettings.pdf");
        DocumentsOperations.compareTwoPdfWithSettings("source.pdf", "target.pdf");
        DocumentsOperations.compareTwoPdfWithResultPath("source.pdf", "target.pdf", "do_compareTwoPdfWithResultPath.pdf");
        DocumentsOperations.compareTwoPdf("source.pdf", "target.pdf");

        System.out.println();

        DocumentsOperations.compareTwoPresentationsFromStreamsWithResultPathAndSettings("source.pptx", "target.pptx", "do_compareTwoPresentationsFromStreamsWithResultPathAndSettings.pptx");
        DocumentsOperations.compareTwoPresentationsFromStreamsWithSettings("source.pptx", "target.pptx");
        DocumentsOperations.compareTwoPresentationsFromStreamsWithResultPath("source.pptx", "target.pptx", "do_compareTwoPresentationsFromStreamsWithResultPath.pptx");
        DocumentsOperations.compareTwoPresentationsFromStreams("source.pptx", "target.pptx");
        DocumentsOperations.compareTwoPresentationsWithResultPathAndSettings("source.pptx", "target.pptx", "do_compareTwoPresentationsWithResultPathAndSettings.pptx");
        DocumentsOperations.compareTwoPresentationsWithSettings("source.pptx", "target.pptx");
        DocumentsOperations.compareTwoPresentationsWithResultPath("source.pptx", "target.pptx", "do_compareTwoPresentationsWithResultPath.pptx");
        DocumentsOperations.compareTwoPresentations("source.pptx", "target.pptx");

        System.out.println();

        DocumentsOperations.compareTwoTextsFromStreamsWithResultPathAndSettings("source.txt", "target.txt", "do_compareTwoTextsFromStreamsWithResultPathAndSettings.html");
        DocumentsOperations.compareTwoTextsFromStreamsWithSettings("source.txt", "target.txt", "do_compareTwoTextsFromStreamsWithSettings.html");
        DocumentsOperations.compareTwoTextsFromStreamsWithResultPath("source.txt", "target.txt", "do_compareTwoTextsFromStreamsWithResultPath.html");
        DocumentsOperations.compareTwoTextsFromStreams("source.txt", "target.txt");
        DocumentsOperations.compareTwoTextsWithResultPathAndSettings("source.txt", "target.txt", "do_compareTwoTextsWithResultPathAndSettings.html");
        DocumentsOperations.compareTwoTextsWithSettings("source.txt", "target.txt");
        DocumentsOperations.compareTwoTextsWithResultPath("source.txt", "target.txt", "do_compareTwoTextsWithResultPath.html");
        DocumentsOperations.compareTwoTexts("source.txt", "target.txt");

        System.out.println();

        DocumentsOperations.compareTwoWordsFromStreamsWithResultPathAndSettings("source.docx", "target.docx", "do_compareTwoWordsFromStreamsWithResultPathAndSettings.docx");
        DocumentsOperations.compareTwoWordsFromStreamsWithSettings("source.docx", "target.docx");
        DocumentsOperations.compareTwoWordsFromStreamsWithResultPath("source.docx", "target.docx", "do_compareTwoWordsFromStreamsWithResultPath.docx");
        DocumentsOperations.compareTwoWordsFromStreams("source.docx", "target.docx");
        DocumentsOperations.compareTwoWordsWithResultPathAndSettings("source.docx", "target.docx", "do_compareTwoWordsWithResultPathAndSettings.docx");
        DocumentsOperations.compareTwoWordsWithSettings("source.docx", "target.docx");
        DocumentsOperations.compareTwoWordsWithResultPath("source.docx", "target.docx", "do_compareTwoWordsWithResultPath.docx");
        DocumentsOperations.compareTwoWords("source.docx", "target.docx");

        System.out.println();

        DocumentsOperations.compareTwoWorkbooksFromStreamsWithResultPathAndSettings("source.xlsx", "target.xlsx", "do_compareTwoWorkbooksFromStreamsWithResultPathAndSettings.xlsx");
        DocumentsOperations.compareTwoWorkbooksFromStreamsWithSettings("source.xlsx", "target.xlsx");
        DocumentsOperations.compareTwoWorkbooksFromStreamsWithResultPath("source.xlsx", "target.xlsx", "do_compareTwoWorkbooksFromStreamsWithResultPath.xlsx");
        DocumentsOperations.compareTwoWorkbooksFromStreams("source.xlsx", "target.xlsx");
        DocumentsOperations.compareTwoWorkbooksWithResultPathAndSettings("source.xlsx", "target.xlsx", "do_compareTwoWorkbooksWithResultPathAndSettings.xlsx");
        DocumentsOperations.compareTwoWorkbooksWithSettings("source.xlsx", "target.xlsx");
        DocumentsOperations.compareTwoWorkbooksWithResultPath("source.xlsx", "target.xlsx", "do_compareTwoWorkbooksWithResultPath.xlsx");
        DocumentsOperations.compareTwoWorkbooks("source.xlsx", "target.xlsx");

        System.out.println();

        OptionsOperations.compareTwoWordDocuments("source.docx", "target.docx");
        OptionsOperations.compareTwoWordParagraphs();
        OptionsOperations.compareTwoWordCells();

        // Look at OptionsOperations.compareTwoObjects
//        OptionsOperations.compareTwoWordColumns();
//        OptionsOperations.compareTwoWordRows();
//        OptionsOperations.compareTwoWordTables();

        OptionsOperations.compareTwoObjects();

        OptionsOperations.compareTwoWorkbookDocuments("source.xlsx", "target.xlsx");
        OptionsOperations.compareTwoWorkbookWorksheets("source.xlsx", "target.xlsx");

        // Look at OptionsOperations.compareTwoObjects
//        OptionsOperations.compareTwoWorkbookCells("source.xlsx", "target.xlsx");

        OptionsOperations.compareTwoPdfDocuments("source.pdf", "target.pdf");
        OptionsOperations.compareTwoPresentationDocuments("source.pptx", "target.pptx");
        OptionsOperations.compareTwoPresentationAutoShapes();
        OptionsOperations.compareTwoPresentationAutoShapes2();

        // Look at OptionsOperations.compareTwoObjects
//        OptionsOperations.compareTwoPresentationParagraphs();

        OptionsOperations.compareTwoPresentationCells();
        OptionsOperations.compareTwoPresentationColumns();
        OptionsOperations.compareTwoPresentationRows();

        // Look at OptionsOperations.compareTwoObjects
//        OptionsOperations.compareTwoPresentationTables();

        OptionsOperations.compareTwoTextDocuments("source.txt", "target.txt");
        OptionsOperations.compareTwoHtmlDocuments("source.html", "target.html");

        OptionsOperations.compareSourceDocumentWithTwoTargetDocuments("multi-source.docx", "multi-target1.docx", "multi-target2.docx");
        OptionsOperations.compareSourceDocumentWithThreeTargetDocuments("multi-source.docx", "multi-target1.docx", "multi-target2.docx", "multi-target3.docx");

        System.out.println();

        CheckOperations.COMPARISONJAVA107("original.pdf", "updated.pdf", "COMPARISONJAVA107.pdf");
    }
}
