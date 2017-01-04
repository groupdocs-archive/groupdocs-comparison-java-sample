package com.groupdocs.comparison.sample;

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

        System.out.println();

        DocumentsOperations.compareTwoHtmlFromStreams("source.html", "target.html", "result16.html");
        DocumentsOperations.compareTwoHtml("source.html", "target.html");
        DocumentsOperations.compareTwoPdfFromStreamsWithResultPathAndSettings("source.pdf", "target.pdf", "result17.pdf");
        DocumentsOperations.compareTwoPdfFromStreamsWithSettings("source.pdf", "target.pdf");
        DocumentsOperations.compareTwoPdfFromStreamsWithResultPath("source.pdf", "target.pdf", "result18.pdf");
        DocumentsOperations.compareTwoPdfFromStreams("source.pdf", "target.pdf");
        DocumentsOperations.compareTwoPdfWithResultPathAndSettings("source.pdf", "target.pdf", "result19.pdf");
        DocumentsOperations.compareTwoPdfWithSettings("source.pdf", "target.pdf");
        DocumentsOperations.compareTwoPdfWithResultPath("source.pdf", "target.pdf", "result20.pdf");
        DocumentsOperations.compareTwoPdf("source.pdf", "target.pdf");

        System.out.println();

        DocumentsOperations.compareTwoPresentationsFromStreamsWithResultPathAndSettings("source.pptx", "target.pptx", "result21.pptx");
        DocumentsOperations.compareTwoPresentationsFromStreamsWithSettings("source.pptx", "target.pptx");
        DocumentsOperations.compareTwoPresentationsFromStreamsWithResultPath("source.pptx", "target.pptx", "result22.pptx");
        DocumentsOperations.compareTwoPresentationsFromStreams("source.pptx", "target.pptx");
        DocumentsOperations.compareTwoPresentationsWithResultPathAndSettings("source.pptx", "target.pptx", "result23.pptx");
        DocumentsOperations.compareTwoPresentationsWithSettings("source.pptx", "target.pptx");
        DocumentsOperations.compareTwoPresentationsWithResultPath("source.pptx", "target.pptx", "result24.pptx");
        DocumentsOperations.compareTwoPresentations("source.pptx", "target.pptx");

        System.out.println();

        DocumentsOperations.compareTwoTextsFromStreamsWithResultPathAndSettings("source.txt", "target.txt", "result25.txt");
        DocumentsOperations.compareTwoTextsFromStreamsWithSettings("source.txt", "target.txt", "result25.txt");
        DocumentsOperations.compareTwoTextsFromStreamsWithResultPath("source.txt", "target.txt", "result26.txt");
        DocumentsOperations.compareTwoTextsFromStreams("source.txt", "target.txt");
        DocumentsOperations.compareTwoTextsWithResultPathAndSettings("source.txt", "target.txt", "result27.txt");
        DocumentsOperations.compareTwoTextsWithSettings("source.txt", "target.txt");
        DocumentsOperations.compareTwoTextsWithResultPath("source.txt", "target.txt", "result28.txt");
        DocumentsOperations.compareTwoTexts("source.txt", "target.txt");

        System.out.println();

        DocumentsOperations.compareTwoWordsFromStreamsWithResultPathAndSettings("source.docx", "target.docx", "result29.docx");
        DocumentsOperations.compareTwoWordsFromStreamsWithSettings("source.docx", "target.docx");
        DocumentsOperations.compareTwoWordsFromStreamsWithResultPath("source.docx", "target.docx", "result30.docx");
        DocumentsOperations.compareTwoWordsFromStreams("source.docx", "target.docx");
        DocumentsOperations.compareTwoWordsWithResultPathAndSettings("source.docx", "target.docx", "result31.docx");
        DocumentsOperations.compareTwoWordsWithSettings("source.docx", "target.docx");
        DocumentsOperations.compareTwoWordsWithResultPath("source.docx", "target.docx", "result32.docx");
        DocumentsOperations.compareTwoWords("source.docx", "target.docx");

        System.out.println();

        DocumentsOperations.compareTwoWorkbooksFromStreamsWithResultPathAndSettings("source.xlsx", "target.xlsx", "result33.xlsx");
        DocumentsOperations.compareTwoWorkbooksFromStreamsWithSettings("source.xlsx", "target.xlsx");
        DocumentsOperations.compareTwoWorkbooksFromStreamsWithResultPath("source.xlsx", "target.xlsx", "result34.xlsx");
        DocumentsOperations.compareTwoWorkbooksFromStreams("source.xlsx", "target.xlsx");
        DocumentsOperations.compareTwoWorkbooksWithResultPathAndSettings("source.xlsx", "target.xlsx", "result35.xlsx");
        DocumentsOperations.compareTwoWorkbooksWithSettings("source.xlsx", "target.xlsx");
        DocumentsOperations.compareTwoWorkbooksWithResultPath("source.xlsx", "target.xlsx", "result36.xlsx");
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

        System.out.println();
    }
}
