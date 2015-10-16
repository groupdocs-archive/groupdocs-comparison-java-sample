/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groupdocs.comparison.cells.components;

import com.groupdocs.comparison.cells.contracts.ICellsCompareResult;
import com.groupdocs.comparison.cells.contracts.nodes.ComparisonWorkbookBase;
import com.groupdocs.comparison.cells.nodes.ComparisonWorkbook;
import com.groupdocs.comparison.common.comparisonsettings.CellsComparisonSettings;

/**
 *
 * @author Сергей
 */
public class CompareWorksheets {

    ComparisonWorkbookBase source;
    ComparisonWorkbookBase target;

    public CompareWorksheets() throws Exception {
        String sourcePath = "src/main/resources/cells/components/worksheets/data/source.xlsx";
        String targetPath = "src/main/resources/cells/components/worksheets/data/target.xlsx";

        source = new ComparisonWorkbook(sourcePath);
        target = new ComparisonWorkbook(targetPath);
    }

    public void CompareWorksheetsFromOneDocuments() throws Exception {
        String filePath = "src/main/resources/cells/components/worksheets/result/samedoc/result.xlsx";
        CellsComparisonSettings settings = new CellsComparisonSettings();
        System.out.println("Comparing two worksheet with different content");
        ICellsCompareResult result = source.getWorksheet(1).compareWith(source.getWorksheet(2), settings);
        System.out.println("Worksheets were successfully compared");
        result.getWorkbook().save(filePath);
        System.out.println("Results were successfully saved to a file\n\n");
    }

    public void CompareWorksheetsFromDifferentDocuments() throws Exception {
        System.out.println("Comparing two worksheet from different workbooks");
        String filePath = "src/main/resources/cells/components/worksheets/result/samedoc/different.xlsx";
        compare(1, 1, filePath);
    }

    public void CompareEmptyWorksheetWithNotEmpty() throws Exception {
        System.out.println("Comparing two worksheet first worksheet is empty");
        String filePath = "src/main/resources/cells/components/worksheets/result/withempty/result.xlsx";
        compare(3, 1, filePath);
    }

    private void compare(int sourceWorksheet, int targetWorksheet, String filePath) throws Exception {
        CellsComparisonSettings settings = new CellsComparisonSettings();
        ICellsCompareResult result = source.getWorksheet(sourceWorksheet).compareWith(target.getWorksheet(targetWorksheet), settings);
        System.out.println("Worksheets were successfully compared");
        result.getWorkbook().save(filePath);
        System.out.println("Results were successfully saved to a file\n\n");
    }
}
