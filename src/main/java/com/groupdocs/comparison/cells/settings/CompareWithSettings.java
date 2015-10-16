/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groupdocs.comparison.cells.settings;

import com.aspose.ms.System.Diagnostics.Stopwatch;
import com.groupdocs.comparison.cells.contracts.ICellsCompareResult;
import com.groupdocs.comparison.cells.contracts.nodes.ComparisonWorkbookBase;
import com.groupdocs.comparison.cells.nodes.ComparisonWorkbook;
import com.groupdocs.comparison.common.comparisonsettings.CellsComparisonSettings;
import java.awt.Color;
import java.io.InputStream;

/**
 *
 * @author Сергей
 */
public class CompareWithSettings {

    public void CompareWithDefaultSettings() throws Exception {
        CellsComparisonSettings settings = new CellsComparisonSettings();

        System.out.println("Comparison of documents with default settings has been started");
        Compare("src/main/resources/cells/settings/testresult/Default settings/save.xlsx", settings);
    }

    public void HideDeletedContent() throws Exception {
        CellsComparisonSettings settings = new CellsComparisonSettings();
        settings.setShowDeletedContent(false);

        System.out.println("Comparison of documents without showing deleted content has been started");
        Compare("src/main/resources/cells/settings/testresult/Hide deleted content/save.xlsx", settings);
    }

    public void DisableSummaryPageGeneration() throws Exception {
        CellsComparisonSettings settings = new CellsComparisonSettings();
        settings.setGenerateSummaryPage(false);

        System.out.println("Comparison of documents without summary page generation has been started");
        Compare("src/main/resources/cells/settings/testresult/Disable summary page/save.xlsx", settings);
    }

    public void SetStylePropertiesForDeletedComponents() throws Exception {
        CellsComparisonSettings settings = new CellsComparisonSettings();

        settings.getDeletedItemsStyle().setColor(Color.darkGray);
        settings.getDeletedItemsStyle().setBold(true);
        settings.getDeletedItemsStyle().setItalic(true);
        settings.getDeletedItemsStyle().setStrikeout(true);
        settings.getDeletedItemsStyle().setUnderlined(true);

        System.out.println("Comparison of documents with settings for deleted content has been started");
        Compare("src/main/resources/cells/settings/testresult/Deleted properties/save.xlsx", settings);
    }

    public void SetPropertiesForInsertedComponents() throws Exception {
        CellsComparisonSettings settings = new CellsComparisonSettings();

        settings.getInsertedItemsStyle().setColor(Color.CYAN);
        settings.getInsertedItemsStyle().setBold(true);
        settings.getInsertedItemsStyle().setItalic(true);
        settings.getInsertedItemsStyle().setStrikeout(true);
        settings.getInsertedItemsStyle().setUnderlined(true);

        System.out.println("Comparison of documents with settings for inserted content has been started");
        Compare("src/main/resources/cells/settings/testresult/Inserted properties/save.xlsx", settings);
    }

    public void SetSeparatorsForDeletedAndAddedComponents() throws Exception {
        CellsComparisonSettings settings = new CellsComparisonSettings();
        settings.getDeletedItemsStyle().setBeginSeparatorString("<");
        settings.getDeletedItemsStyle().setEndSeparatorString(">");

        settings.getInsertedItemsStyle().setBeginSeparatorString("|");
        settings.getInsertedItemsStyle().setEndSeparatorString("|");

        System.out.println("Comparison of documents with separators for deleted and added content has been started");
        Compare("src/main/resources/cells/settings/testresult/Separators/save.xlsx", settings);
    }

    public void SetSeparationCharsForText() throws Exception {
        CellsComparisonSettings settings = new CellsComparisonSettings();
        settings.setWordsSeparatorChars(new char[]{'/', '|', ' '});

        System.out.println("Comparison of documents with text separation chars settings has been started");
        Compare("src/main/resources/cells/settings/testresult/Separation chars/save.xlsx", settings);
    }

    private void Compare(String fileName, CellsComparisonSettings settings) throws Exception {
        String sourcePath = "cells/settings/data/target.xlsx";

        String targetPath = "cells/settings/data/source.xlsx";

        InputStream sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourcePath);
        InputStream targetStream = this.getClass().getClassLoader().getResourceAsStream(targetPath);
        
        ComparisonWorkbookBase source = new ComparisonWorkbook(sourceStream);
        ComparisonWorkbookBase target = new ComparisonWorkbook(targetStream);
        Stopwatch watch = new Stopwatch();
        watch.start();

        ICellsCompareResult result = source.compareWith(target, settings);

        System.out.println("Saving result to file");

        result.getWorkbook().save(fileName);
        watch.stop();

        System.out.println("Compared for " + watch.getElapsedMilliseconds() / 1000 + " seconds\n\n");
    }
}
