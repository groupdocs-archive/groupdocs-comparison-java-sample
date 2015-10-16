package com.groupdocs.comparison.text.settings;

import com.groupdocs.comparison.common.comparisonsettings.ComparisonDepth;
import com.groupdocs.comparison.common.comparisonsettings.TextComparisonSettings;
import com.groupdocs.comparison.text.ComparisonTextFile;
import com.groupdocs.comparison.text.contracts.IComparisonTextFile;
import com.groupdocs.comparison.text.contracts.ITextCompareResult;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ComparisonWithDifferentSettings {

    public void CompareTextFilesWithGenerationSummaryPage() throws IOException {
        String resultPath = "./../../Settings/testresult/WithGenerationSummaryPage/result.txt";
        // Creating settings for comparison of textFiles
        TextComparisonSettings comparisonSettings = new TextComparisonSettings();
        comparisonSettings.setGenerateSummaryPage(true);
        Compare(resultPath, comparisonSettings);
    }

    public void CompareTextFilesWithOutGenerationSummaryPage() throws IOException {
        String resultPath = "./../../Settings/testresult/WithOutGenerationSummaryPage/result.txt";
        // Creating settings for comparison of textFiles
        TextComparisonSettings comparisonSettings = new TextComparisonSettings();
        comparisonSettings.setGenerateSummaryPage(false);
        Compare(resultPath, comparisonSettings);
    }

    public void CompareTextFilesWithShowDeletedContent() throws IOException {
        String resultPath = "./../../Settings/testresult/WithShowDeletedContent/result.txt";
        // Creating settings for comparison of textFiles
        TextComparisonSettings comparisonSettings = new TextComparisonSettings();
        comparisonSettings.setShowDeletedContent(true);
        Compare(resultPath, comparisonSettings);
    }

    public void CompareTextFilesWithOutShowDeletedContent() throws IOException {
        String resultPath = "./../../Settings/testresult/WithOutShowDeletedContent/result.txt";
        // Creating settings for comparison of textFiles
        TextComparisonSettings comparisonSettings = new TextComparisonSettings();
        comparisonSettings.setShowDeletedContent(false);
        Compare(resultPath, comparisonSettings);
    }

    public void CompareTextFilesWithComparisonDepthSetWords() throws IOException {
        String resultPath = "./../../Settings/testresult/WithComparisonDepthSetWords/result.txt";
        // Creating settings for comparison of textFiles
        TextComparisonSettings comparisonSettings = new TextComparisonSettings();
        comparisonSettings.setComparisonDepth(ComparisonDepth.Words);
        Compare(resultPath, comparisonSettings);
    }

    public void CompareTextFilesWithComparisonDepthSetChars() throws IOException {
        String resultPath = "./../../Settings/testresult/WithComparisonDepthSetChars/result.txt";
        // Creating settings for comparison of textFiles
        TextComparisonSettings comparisonSettings = new TextComparisonSettings();
        comparisonSettings.setComparisonDepth(ComparisonDepth.Chars);
        Compare(resultPath, comparisonSettings);
    }

    public void CompareTextFilesWithWordsSepCharsSetSpace() throws IOException {
        String resultPath = "./../../Settings/testresult/WithWordsSepCharsSetSpace/result.txt";
        // Creating settings for comparison of textFiles
        TextComparisonSettings comparisonSettings = new TextComparisonSettings();
        comparisonSettings.setWordsSeparatorChars(new char[]{' '});
        Compare(resultPath, comparisonSettings);
    }

    public void CompareTextFilesWithSettingStylesOnDelInsComponents() throws IOException {
        String resultPath = "./../../Settings/testresult/WithSettingStylesOnDelInsComponents/result.txt";
        // Creating settings for comparison of TextFiles
        TextComparisonSettings comparisonSettings = new TextComparisonSettings();
        comparisonSettings.getDeletedItemsStyle().setBeginSeparatorString("<begin deleted text>");
        comparisonSettings.getDeletedItemsStyle().setEndSeparatorString("<end deleted text>");
        comparisonSettings.getInsertedItemsStyle().setBeginSeparatorString("<begin inserted text>");
        comparisonSettings.getInsertedItemsStyle().setEndSeparatorString("<end inserted text>");
        Compare(resultPath, comparisonSettings);
    }

    private void Compare(String resultPath, TextComparisonSettings comparisonSettings) throws FileNotFoundException, IOException {
        String sourcePath = "Groupdocs.Comparison.Samples.Text.Settings.data.source.txt";
        String targetPath = "Groupdocs.Comparison.Samples.Text.Settings.data.target.txt";
        // Create to streams of textFiles
        InputStream sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourcePath);
        InputStream targetStream = this.getClass().getClassLoader().getResourceAsStream(targetPath);
        // Opening two textFiles
        IComparisonTextFile sourcePresentation = new ComparisonTextFile(sourceStream);
        System.out.println("TextFile with source path: " + sourcePath + " was loaded.");
        IComparisonTextFile targetPresentation = new ComparisonTextFile(targetStream);
        System.out.println("TextFile with source path: " + targetPath + " was loaded.");

        // Comparing textFiles
        ITextCompareResult compareResult = sourcePresentation.compareWith(targetPresentation, comparisonSettings);
        System.out.println("textFiles was compared.");

        // Saving result of comparison to new textFile
        IComparisonTextFile result = compareResult.getTextFile();
        OutputStream resultStream = new FileOutputStream(resultPath);
        result.save(resultStream);
        resultStream.close();
        System.out.println("Result of comparison was saved to textFile with the folloving source path"
                + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }

}
