package com.groupdocs.comparison.pdf;

import com.groupdocs.comparison.common.comparisonsettings.PdfComparisonSettings;
import com.groupdocs.comparison.pdf.contracts.comparedresult.IPdfComparedResult;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Comparing {

    public void ProcessComparing(String title, String sourceFileName, String targetFileName, String resultPath, PdfComparisonSettings comparisonSettings) throws Exception {
        System.out.println(title);

        InputStream sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourceFileName);
        InputStream targetStream = this.getClass().getClassLoader().getResourceAsStream(targetFileName);

        ComparisonPdfDocument sourcePdfDocument = new ComparisonPdfDocument(sourceStream);
        ComparisonPdfDocument targetPdfDocument = new ComparisonPdfDocument(targetStream);

        if (comparisonSettings == null) {
            comparisonSettings = new PdfComparisonSettings();
        }
        System.out.println("");
        System.out.println("Comparing...");

        IPdfComparedResult comparedPdfResult = sourcePdfDocument.compareWith(targetPdfDocument, comparisonSettings);

        System.out.println("End comparing!");
        System.out.println("Saving Result...");

        OutputStream resultStream = new FileOutputStream(resultPath);
        comparedPdfResult.saveTo(resultStream);

        System.out.println("Result was saved to file: " + resultPath + ".");
        System.out.println("===============================================================");
        System.out.println("");
    }
}
