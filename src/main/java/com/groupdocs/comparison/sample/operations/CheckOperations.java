package com.groupdocs.comparison.sample.operations;

import com.groupdocs.comparison.Comparison;
import com.groupdocs.comparison.common.ComparisonType;
import com.groupdocs.comparison.common.comparisonsettings.PdfComparisonSettings;
import org.apache.commons.io.IOUtils;

import java.io.FileOutputStream;
import java.io.InputStream;

import static com.groupdocs.comparison.sample.Utilities.getOutputPath;
import static com.groupdocs.comparison.sample.Utilities.getStoragePath;

/**
 * @author aleksey permyakov
 */
public class CheckOperations {
    public static void COMPARISONJAVA107(String sourceName, String targetName, String resultName) throws Exception {
        final String sourcePath = getStoragePath(sourceName, "COMPARISONJAVA107");
        final String targetPath = getStoragePath(targetName, "COMPARISONJAVA107");
        final String resultPath = getOutputPath(resultName);

        Comparison comp = new Comparison();

        final InputStream compareResult = comp.compare(sourcePath, targetPath, resultPath, ComparisonType.Pdf);

        System.out.println(compareResult.available());
        IOUtils.copy(compareResult, new FileOutputStream(getOutputPath(resultName)));
    }
}
