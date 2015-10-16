package com.groupdocs.comparison.cells.documents;

import com.aspose.ms.System.Diagnostics.Stopwatch;
import com.groupdocs.comparison.cells.contracts.ICellsCompareResult;
import com.groupdocs.comparison.cells.contracts.nodes.ComparisonWorkbookBase;
import com.groupdocs.comparison.cells.nodes.ComparisonWorkbook;
import com.groupdocs.comparison.common.comparisonsettings.CellsComparisonSettings;

/**
 *
 * @author Сергей
 */
public class CompareWorkbooks {

    public void compareTwoWorkbooks() throws Exception {
        String sourcePath = "src/main/resources/cells/workbooks/data/source.xlsx";
        String targetPath = "src/main/resources/cells/workbooks/data/target.xlsx";
        
        String filePath = "src/main/resources/cells/workbooks/result/result.xlsx";
        
        ComparisonWorkbookBase source = new ComparisonWorkbook(sourcePath);
        ComparisonWorkbookBase target = new ComparisonWorkbook(targetPath);

        CellsComparisonSettings settings = new CellsComparisonSettings();
        System.out.println("Comparing two workbooks with the same quantity of worksheets");
        ICellsCompareResult result = source.compareWith(target, settings);
        System.out.println("Workbooks were successfully compared");
        result.getWorkbook().save(filePath);
        System.out.println("Results were successfully saved to file");
    }
}
