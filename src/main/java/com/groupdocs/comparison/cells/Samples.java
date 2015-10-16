/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groupdocs.comparison.cells;

import com.groupdocs.comparison.cells.components.CompareCells;
import com.groupdocs.comparison.cells.components.CompareWorksheets;
import com.groupdocs.comparison.cells.documents.CompareWorkbooks;
import com.groupdocs.comparison.cells.settings.CompareWithSettings;

/**
 *
 * @author Сергей
 */
public class Samples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        CompareCells compareCells = new CompareCells();
        /**
         * Comparing two cells from different workbooks
         */
        compareCells.CompareCellsOnDifferentWorkbooks();

        /**
         * Comparing two cells from one workbook
         */
        compareCells.CompareCellsOnTheSameWorkbook();

        /**
         * Comparing a cell with error value with text cell
         */
        compareCells.CompareErrorCellWithNonError();

        /**
         * Comparing a cell which contains formula with cell which contains
         * number
         */
        compareCells.CompareFormulaCellWithNumberedCell();

        /**
         * Comparing a cell which contains formula with cell which contains
         * usual text
         */
        compareCells.CompareFormulaCellWithTextCell();

        /**
         * Comparing two cells which contains non-standard style
         */
        compareCells.CompareStyledCellWithAnotherStyledCell();

        /**
         * Comparing two text cells
         */
        compareCells.CompareTextCellWithAnotherTextCell();

        CompareWorksheets comparisonWorksheet = new CompareWorksheets();

        /**
         * Comparing two worksheets from one workbook
         */
        comparisonWorksheet.CompareWorksheetsFromOneDocuments();

        /**
         * Comparing two worksheets from two different workbooks
         */
        comparisonWorksheet.CompareWorksheetsFromDifferentDocuments();

        /**
         * Comparing not empty with empty worksheets
         */
        comparisonWorksheet.CompareEmptyWorksheetWithNotEmpty();

        CompareWithSettings compareWithSettings = new CompareWithSettings();

        /**
         * Compares two documents with default settings
         */
        compareWithSettings.CompareWithDefaultSettings();

        /**
         * Compares two workbooks with disabled summary page generation
         */
        compareWithSettings.DisableSummaryPageGeneration();

        /**
         * Compares two workbooks with hiding of deleted content
         */
        compareWithSettings.HideDeletedContent();

        /**
         * Compares two workbooks with properties for inserted components
         */
        compareWithSettings.SetPropertiesForInsertedComponents();

        /**
         * Compares two workbooks and sets chars for text separation
         */
        compareWithSettings.SetSeparationCharsForText();

        /**
         * Compares two workbooks and sets separators for deleted and added
         * components
         */
        compareWithSettings.SetSeparatorsForDeletedAndAddedComponents();

        /**
         * Compares two workbooks and sets properties for deleted content
         */
        compareWithSettings.SetStylePropertiesForDeletedComponents();

        CompareWorkbooks compareWorkbooks = new CompareWorkbooks();

        /**
         * Compares two usual workbooks
         */
        compareWorkbooks.compareTwoWorkbooks();
    }

}
