package com.groupdocs.comparison.words;

import com.groupdocs.comparison.words.components.CompareCells;
import com.groupdocs.comparison.words.components.CompareColumns;
import com.groupdocs.comparison.words.components.CompareParagraphs;
import com.groupdocs.comparison.words.components.CompareRows;
import com.groupdocs.comparison.words.components.CompareTables;
import com.groupdocs.comparison.words.documents.CompareDocumentsWithHyperlinks;
import com.groupdocs.comparison.words.documents.CompareDocumentsWithTables;
import com.groupdocs.comparison.words.documents.CompareDocumentsWithText;
import com.groupdocs.comparison.words.settings.ComparisonWithDifferentSettings;

public class Samples {

    public static void main(String[] args) throws Exception {
        {
            CompareDocumentsWithHyperlinks compareDocumentsWithHyperlinks = new CompareDocumentsWithHyperlinks();
                
             compareDocumentsWithHyperlinks.WithIgnoreLinkSetting();
             compareDocumentsWithHyperlinks.WithoutIgnoreLinkSetting();
                
             CompareDocumentsWithTables compareDocumentsWithTables = new CompareDocumentsWithTables();
                
             compareDocumentsWithTables.WithTablesOnAppropriatePages();
             compareDocumentsWithTables.WithTablesOnDefferentPages();
             compareDocumentsWithTables.WithTablesWitchContainsDifferentCountOfColumns();
             compareDocumentsWithTables.WithTablesWitchContainsDifferentCountOfColumnsAndDifferentCountOfRows();
             compareDocumentsWithTables.WithTablesWitchContainsDifferentCountOfRows();
                
             CompareDocumentsWithText compareDocumentsWithText = new CompareDocumentsWithText();
                
             compareDocumentsWithText.WithTextOnAppropriatePages();
             compareDocumentsWithText.WithTextOnDifferentPages();
                
             ComparisonWithDifferentSettings comparisonWithDifferentSettings = new ComparisonWithDifferentSettings();
                
             comparisonWithDifferentSettings.CompareDocumentsWithComparisonDepthSetChars();
             comparisonWithDifferentSettings.CompareDocumentsWithComparisonDepthSetWords();
             comparisonWithDifferentSettings.CompareDocumentsWithGenerationSummaryPage();
             comparisonWithDifferentSettings.CompareDocumentsWithOutGenerationSummaryPage();
             comparisonWithDifferentSettings.CompareDocumentsWithOutShowDeletedContent();
             comparisonWithDifferentSettings.CompareDocumentsWithSettingStylesOnDelInsComponents();
             comparisonWithDifferentSettings.CompareDocumentsWithShowDeletedContent();
             comparisonWithDifferentSettings.CompareDocumentsWithWordsSepCharsSetSpace();

            CompareCells compareCells = new CompareCells();
            
            compareCells.CompareCellFromDocumentWithCreatingCell();
            compareCells.CompareCellsFromDifferentDocuments();
            compareCells.CompareTwoCreatingCells();
            
            CompareColumns compareColumns = new CompareColumns();
            
            compareColumns.CompareColumnFromDocumentWithCreatingColumn();
            compareColumns.CompareColumnsFromDifferentDocuments();
            compareColumns.CompareTwoCreatingColumns();
            
            CompareParagraphs compareParagraphs = new CompareParagraphs();
            
            compareParagraphs.CompareParagraphFromDocumentWithCreatingParagraph();
            compareParagraphs.CompareParagraphsFromDifferentDocuments();
            compareParagraphs.CompareTwoCreatingParagraphs();
            
            CompareTables compareTables = new CompareTables();
            
            compareTables.CompareTableFromDocumentWithCreatingTable();
            compareTables.CompareTablesFromDifferentDocuments();
            compareTables.CompareTwoCreatingTables();
            
            CompareRows compareRows = new CompareRows();
            
            compareRows.CompareRowFromDocumentWithCreatingRow();
            compareRows.CompareRowsFromDifferentDocuments();
            compareRows.CompareTwoCreatingRows();
        }
    }
}