package com.groupdocs.comparison.text;

import com.groupdocs.comparison.text.documents.CompareTextFiles;
import com.groupdocs.comparison.words.settings.ComparisonWithDifferentSettings;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Samples {

    public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
        CompareTextFiles compareTextFiles = new CompareTextFiles();
        
        compareTextFiles.CompareTwoFilesWithPlainText();
        
        ComparisonWithDifferentSettings comparisonWithDifferentSettings = new ComparisonWithDifferentSettings();
        
        comparisonWithDifferentSettings.CompareDocumentsWithComparisonDepthSetChars();
        comparisonWithDifferentSettings.CompareDocumentsWithComparisonDepthSetWords();
        comparisonWithDifferentSettings.CompareDocumentsWithGenerationSummaryPage();
        comparisonWithDifferentSettings.CompareDocumentsWithOutGenerationSummaryPage();
        comparisonWithDifferentSettings.CompareDocumentsWithOutShowDeletedContent();
        comparisonWithDifferentSettings.CompareDocumentsWithSettingStylesOnDelInsComponents();
        comparisonWithDifferentSettings.CompareDocumentsWithShowDeletedContent();
        comparisonWithDifferentSettings.CompareDocumentsWithWordsSepCharsSetSpace();
    }
}
