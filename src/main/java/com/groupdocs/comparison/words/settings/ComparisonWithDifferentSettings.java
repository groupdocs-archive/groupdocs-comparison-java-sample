package com.groupdocs.comparison.words.settings;

import com.groupdocs.comparison.common.comparisonsettings.ComparisonDepth;
import com.groupdocs.comparison.common.comparisonsettings.WordsComparisonSettings;
import com.groupdocs.comparison.words.contracts.IWordsCompareResult;
import com.groupdocs.comparison.words.contracts.enums.ComparisonSaveFormat;
import com.groupdocs.comparison.words.contracts.nodes.IComparisonDocument;
import com.groupdocs.comparison.words.nodes.ComparisonDocument;
import java.awt.Color;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ComparisonWithDifferentSettings {

    public void CompareDocumentsWithGenerationSummaryPage() throws Exception {
        String resultPath = "src/main/resources/words/settings/testresult/WithGenerationSummaryPage/result.docx";
        // Creating settings for comparison of Documents
        WordsComparisonSettings comparisonSettings = new WordsComparisonSettings();
        comparisonSettings.setGenerateSummaryPage(true);
        Compare(resultPath, comparisonSettings);
    }

    public void CompareDocumentsWithOutGenerationSummaryPage() throws Exception {
        String resultPath = "src/main/resources/words/settings/testresult/WithOutGenerationSummaryPage/result.docx";
        // Creating settings for comparison of Documents
        WordsComparisonSettings comparisonSettings = new WordsComparisonSettings();
        comparisonSettings.setGenerateSummaryPage(false);
        Compare(resultPath, comparisonSettings);
    }

    public void CompareDocumentsWithShowDeletedContent() throws Exception {
        String resultPath = "src/main/resources/words/settings/testresult/WithShowDeletedContent/result.docx";
        // Creating settings for comparison of Documents
        WordsComparisonSettings comparisonSettings = new WordsComparisonSettings();
        comparisonSettings.setShowDeletedContent(true);
        Compare(resultPath, comparisonSettings);
    }

    public void CompareDocumentsWithOutShowDeletedContent() throws Exception {
        String resultPath = "src/main/resources/words/settings/testresult/WithOutShowDeletedContent/result.docx";
        // Creating settings for comparison of Documents
        WordsComparisonSettings comparisonSettings = new WordsComparisonSettings();
        comparisonSettings.setShowDeletedContent(false);
        Compare(resultPath, comparisonSettings);
    }

    public void CompareDocumentsWithComparisonDepthSetWords() throws Exception {
        String resultPath = "src/main/resources/words/settings/testresult/WithComparisonDepthSetWords/result.docx";
        // Creating settings for comparison of Documents
        WordsComparisonSettings comparisonSettings = new WordsComparisonSettings();
        comparisonSettings.setComparisonDepth(ComparisonDepth.Words);
        Compare(resultPath, comparisonSettings);
    }

    public void CompareDocumentsWithComparisonDepthSetChars() throws Exception {
        String resultPath = "src/main/resources/words/settings/testresult/WithComparisonDepthSetChars/result.docx";
        // Creating settings for comparison of Documents
        WordsComparisonSettings comparisonSettings = new WordsComparisonSettings();
        comparisonSettings.setComparisonDepth(ComparisonDepth.Chars);
        Compare(resultPath, comparisonSettings);
    }

    public void CompareDocumentsWithWordsSepCharsSetSpace() throws Exception {
        String resultPath = "src/main/resources/words/settings/testresult/WithWordsSepCharsSetSpace/result.docx";
        // Creating settings for comparison of Documents
        WordsComparisonSettings comparisonSettings = new WordsComparisonSettings();
        comparisonSettings.setWordsSeparatorChars(new char[]{' '});
        Compare(resultPath, comparisonSettings);
    }

    public void CompareDocumentsWithSettingStylesOnDelInsComponents() throws Exception {
        String resultPath = "src/main/resources/words/settings/testresult/WithSettingStylesOnDelInsComponents/result.docx";
        // Creating settings for comparison of Documents
        WordsComparisonSettings comparisonSettings = new WordsComparisonSettings();
        comparisonSettings.getDeletedItemsStyle().setColor(Color.GREEN);
        
        comparisonSettings.getInsertedItemsStyle().setColor(Color.YELLOW);
        Compare(resultPath, comparisonSettings);
    }

    private void Compare(String resultPath, WordsComparisonSettings comparisonSettings) throws Exception {
        String sourcePath = "words/settings/data/source.docx";
        String targetPath = "words/settings/data/target.docx";
        // Create to streams of Documents
        InputStream sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourcePath);
        InputStream targetStream = this.getClass().getClassLoader().getResourceAsStream(targetPath);
        // Opening two Documents
        IComparisonDocument sourcePresentation = new ComparisonDocument(sourceStream);
        System.out.println("Document with source path: " + sourcePath + " was loaded.");
        IComparisonDocument targetPresentation = new ComparisonDocument(targetStream);
        System.out.println("Document with source path: " + targetPath + " was loaded.");

        // Comparing Documents
        IWordsCompareResult compareResult = sourcePresentation.compareWith(targetPresentation, comparisonSettings);
        System.out.println("Documents was compared.");

        // Saving result of comparison to new document
        IComparisonDocument result = compareResult.getDocument();
        OutputStream resultStream = new FileOutputStream(resultPath);
        result.save(resultStream, ComparisonSaveFormat.Docx);
        resultStream.close();
        System.out.println("Result of comparison was saved to document with the folloving source path " + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }
}
