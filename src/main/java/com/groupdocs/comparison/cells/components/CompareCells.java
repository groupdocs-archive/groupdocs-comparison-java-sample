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
import java.io.InputStream;

/**
 *
 * @author Сергей
 */
public class CompareCells {

    ComparisonWorkbookBase source;
    ComparisonWorkbookBase target;
    InputStream sourceStream;
    InputStream targetStream;

    public CompareCells() throws Exception {

        String sourcePath = "src/main/resources/cells/components/cells/data/source.xlsx";
        String targetPath = "src/main/resources/cells/components/cells/data/target.xlsx";
        sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourcePath);
        targetStream = this.getClass().getClassLoader().getResourceAsStream(targetPath);

        source = new ComparisonWorkbook(sourcePath);
        target = new ComparisonWorkbook(targetPath);
    }

    public void CompareCellsOnTheSameWorkbook() throws Exception {
        CellsComparisonSettings settings = new CellsComparisonSettings();
        System.out.println("Comparing two cells on the same workbook and the same worksheet");
        ICellsCompareResult result = source.getWorksheet(0).getCellRange().getCell("A1").compareWith(source.getWorksheet(0).getCellRange().getCell("A1"), settings);
        System.out.println("Comparison Done. Creating a file with result changes");
        result.getWorkbook().save("src/main/resources/cells/components/cells/result/sameworkbook/result.xlsx");
        System.out.println("File with result changes was successfully created\n\n");
    }

    public void CompareCellsOnDifferentWorkbooks() throws Exception {
        System.out.println("Comparing two cells on different workbook and the same worksheet");
        compare("src/main/resources/cells/components/cells/result/differentworkbooks/result.xlsx", "A1", "B1");
    }

    public void CompareFormulaCellWithTextCell() throws Exception {
        System.out.println("Comparing two cells on different workbook where source cell contains a formula and target cell contains plain text");
        compare("src/main/resources/cells/components/cells/result/formulavstext/result.xlsx", "A2", "A2");
    }

    public void CompareFormulaCellWithNumberedCell() throws Exception {
        System.out.println("Comparing two cells on different workbook where source cell contains a formula and target cell contains number");
        compare("src/main/resources/cells/components/cells/result/formulavsnumber/result.xlsx", "A3", "A3");
    }

    public void CompareTextCellWithAnotherTextCell() throws Exception {
        System.out.println("Comparing two cells on different workbook where source and target cells contain plain text");
        compare("src/main/resources/cells/components/cells/result/textvstext/result.xlsx", "A4", "A4");
    }

    public void CompareStyledCellWithAnotherStyledCell() throws Exception {
        System.out.println("Comparing two cells on different workbook where source and target cells contain plain text with different style of its characters");
        compare("src/main/resources/cells/components/cells/result/styledcells/result.xlsx", "A5", "A5");
    }

    public void CompareErrorCellWithNonError() throws Exception {
        System.out.println("Comparing two cells on different workbook where source and target cells contain plain text");
        compare("src/main/resources/cells/components/cells/result/errorvstext/result.xlsx", "A6", "A6");
    }

    private void compare(String fileName, String sourceCell, String targetCell) throws Exception {
        CellsComparisonSettings settings = new CellsComparisonSettings();
        ICellsCompareResult result = source.getWorksheet(0).getCellRange().getCell(sourceCell).compareWith(target.getWorksheet(0).getCellRange().getCell(targetCell), settings);
        System.out.println("Comparison Done. Creating a file with result changes");
        result.getWorkbook().save(fileName);
        System.out.println("File with result changes was successfully created\n\n");
    }
}
