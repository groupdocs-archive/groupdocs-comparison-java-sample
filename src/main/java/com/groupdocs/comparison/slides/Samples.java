/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groupdocs.comparison.slides;

import com.groupdocs.comparison.slides.components.CompareAutoShapes;
import com.groupdocs.comparison.slides.components.CompareCells;
import com.groupdocs.comparison.slides.components.CompareColumns;
import com.groupdocs.comparison.slides.components.CompareSlides;
import com.groupdocs.comparison.slides.components.CompareParagraphs;
import com.groupdocs.comparison.slides.components.CompareTables;
import com.groupdocs.comparison.slides.components.CompareRows;
import com.groupdocs.comparison.slides.documents.ComparePresentationsWithAutoshapes;

/**
 *
 * @author Сергей
 */
import com.groupdocs.comparison.slides.documents.ComparePresentationsWithTables;
import com.groupdocs.comparison.slides.settings.ComparisonWithSettings;

public class Samples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        CompareSlides compareSlides = new CompareSlides();
        compareSlides.CompareSlidesFromDifferentPresentations();
        compareSlides.CompareSlidesFromOnePresentations();
        compareSlides.CompareSlideFromPresentationsWithCreatingSlide();
        compareSlides.CompareTwoCreatingSlides();

        CompareCells compareCells = new CompareCells();
        compareCells.CompareCellsFromDifferentPresentations();
        compareCells.CompareCellsFromOnePresentations();
        compareCells.CompareCellFromPresentationsWithCreatingCell();
        compareCells.CompareTwoCreatingCells();

        CompareParagraphs compareParagraphs = new CompareParagraphs();
        compareParagraphs.CompareParagraphFromPresentationsWithCreatedParagraph();
        compareParagraphs.CompareParagraphsFromDifferentPresentations();
        compareParagraphs.CompareParagraphsFromOnePresentations();
        compareParagraphs.CompareTwoCreatedParagraphs();

        CompareAutoShapes compareAutoShapes = new CompareAutoShapes();
        compareAutoShapes.CompareAutoShapeFromPresentationsWithCreatingAutoShape();
        compareAutoShapes.CompareAutoShapesFromDifferentPresentations();
        compareAutoShapes.CompareAutoShapesFromOnePresentations();
        compareAutoShapes.CompareTwoCreatingAutoShapes();

        CompareTables compareTables = new CompareTables();
        compareTables.CompareTableFromPresentationsWithCreatingTable();
        compareTables.CompareTablesFromDifferentPresentations();
        compareTables.CompareTablesFromOnePresentations();
        compareTables.CompareTwoCreatingTables();

        CompareRows compareRows = new CompareRows();
        compareRows.CompareRowFromPresentationsWithCreatedRow();
        compareRows.CompareRowsFromDifferentPresentations();
        compareRows.CompareRowsFromOnePresentations();
        compareRows.CompareTwoCreatedRows();

        CompareColumns compareColumns = new CompareColumns();
        compareColumns.CompareColumnFromPresentationsWithCreatingColumn();
        compareColumns.CompareColumnsFromDifferentPresentations();
        compareColumns.CompareColumnsFromOnePresentations();
        compareColumns.CompareTwoCreatingColumns();

        ComparePresentationsWithAutoshapes comparePresentationsWithAutoShapes = new ComparePresentationsWithAutoshapes();
        comparePresentationsWithAutoShapes.ComparePresentationsWithAutoShapesOnAppropriateSlides();
        comparePresentationsWithAutoShapes.ComparePresentationsWithAutoShapesOnDifferentSlides();

        ComparePresentationsWithTables comparePresentationsWithTables = new ComparePresentationsWithTables();
        comparePresentationsWithTables.ComparePresentationsWithTablesOnAppropriateSlides();
        comparePresentationsWithTables.ComparePresentationsWithTablesOnDifferentSlides();
        comparePresentationsWithTables.ComparePresentationsWithTablesWitchConyainsDifferentCountOfRows();
        comparePresentationsWithTables.ComparePresentationsWithTablesWitchConyainsDifferentCountOfColumns();
        comparePresentationsWithTables.ComparePresentationsWithTablesWitchConyainsDifferentCountOfColumnsAndDifferentCountOfRows();

        ComparisonWithSettings comparisonWithDifferentSettings = new ComparisonWithSettings();
        comparisonWithDifferentSettings.ComparePresentationsWithComparisonDepthSetChars();
        comparisonWithDifferentSettings.ComparePresentationsWithComparisonDepthSetWords();
        comparisonWithDifferentSettings.ComparePresentationsWithGenerationSummaryPage();
        comparisonWithDifferentSettings.ComparePresentationsWithOutGenerationSummaryPage();
        comparisonWithDifferentSettings.ComparePresentationsWithOutShowDeletedContent();
        comparisonWithDifferentSettings.ComparePresentationsWithShowDeletedContent();
        comparisonWithDifferentSettings.ComparePresentationsWithWordsSepCharsSetSpace();
        comparisonWithDifferentSettings.ComparePresentationsWithSettingStylesOnDelInsComponents();
    }

}
