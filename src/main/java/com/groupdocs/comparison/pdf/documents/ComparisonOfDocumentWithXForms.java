package com.groupdocs.comparison.pdf.documents;

import com.groupdocs.comparison.common.comparisonsettings.ComparisonDepth;
import com.groupdocs.comparison.common.comparisonsettings.PdfComparisonSettings;
import com.groupdocs.comparison.pdf.Comparing;

public class ComparisonOfDocumentWithXForms {

    public void Case1(String dir) throws Exception {
        String ResultPath = dir + "/" + "xForm1_pdf was compared with xForm2_pdf.pdf";
        String SourceFileName = "pdf/data/xForm1.pdf";
        String TargetFileName = "pdf/data/xForm2.pdf";

        PdfComparisonSettings comparisonSettings = new PdfComparisonSettings();
        comparisonSettings.setComparisonDepth(ComparisonDepth.Words); 

        Comparing c = new Comparing();
        c.ProcessComparing("Comparison of a document with xForms (case 1): ", SourceFileName, TargetFileName,
                ResultPath, comparisonSettings);
    }

    public void Case1_Reverse(String dir) throws Exception {
        String ResultPath = dir + "/" + "xForm2_pdf was compared with xForm1_pdf.pdf";
        String SourceFileName = "pdf/data/xForm2.pdf";
        String TargetFileName = "pdf/data/xForm1.pdf";

        PdfComparisonSettings comparisonSettings = new PdfComparisonSettings();
        comparisonSettings.setComparisonDepth(ComparisonDepth.Words); 

        Comparing c = new Comparing();
        c.ProcessComparing("Comparison of a document with xForms (case 1, reverse): ", SourceFileName, TargetFileName,
                ResultPath, comparisonSettings);
    }

    public void Case2(String dir) throws Exception {
        String ResultPath = dir + "/" + "xForm3_pdf was compared with xForm4_pdf.pdf";
        String SourceFileName = "pdf/data/xForm3.pdf";
        String TargetFileName = "pdf/data/xForm4.pdf";

        PdfComparisonSettings comparisonSettings = new PdfComparisonSettings();
        comparisonSettings.setComparisonDepth(ComparisonDepth.Words); 

        Comparing c = new Comparing();
        c.ProcessComparing("Comparison of a document with xForms (case 2): ", SourceFileName, TargetFileName,
                ResultPath, comparisonSettings);
    }

    public void Case2_Reverse(String dir) throws Exception {
        String ResultPath = dir + "/" + "xForm4_pdf was compared with xForm3_pdf.pdf";
        String SourceFileName = "pdf/data/xForm4.pdf";
        String TargetFileName = "pdf/data/xForm3.pdf";

        PdfComparisonSettings comparisonSettings = new PdfComparisonSettings();
        comparisonSettings.setComparisonDepth(ComparisonDepth.Words);     
        
        Comparing c = new Comparing();
        c.ProcessComparing("Comparison of a document with xForms (case 2, reverse): ", SourceFileName, TargetFileName,
                ResultPath, comparisonSettings);
    }

    public void DocumentsWithXFormsWhenDeletionAndInsertionRows(String dir) throws Exception {
        String ResultPath = dir + "/" + "TargetWith2PagesFirstIs3_pdf was compared with SourceWith2PagesFirstIs3_pdf.pdf";
        String SourceFileName = "pdf/data/TargetWith2PagesFirstIs3.pdf";
        String TargetFileName = "pdf/data/SourceWith2PagesFirstIs3.pdf";

        PdfComparisonSettings comparisonSettings = new PdfComparisonSettings();
        comparisonSettings.setComparisonDepth(ComparisonDepth.Chars);        
        
        Comparing c = new Comparing();
        c.ProcessComparing("Comparison of a document with xForms contains deletion and insertion rows: ", SourceFileName, TargetFileName,
                ResultPath, comparisonSettings);
    }

    public void DocumentsWithXFormsWhenDeletionRowsWereMovedToNextNewPage(String dir) throws Exception {
        String ResultPath = dir + "/" + "SourceWith2PagesFirstIs3_pdf was compared with TargetWith2PagesFirstIs3_pdf.pdf";
        String SourceFileName = "pdf/data/SourceWith2PagesFirstIs3.pdf";
        String TargetFileName = "pdf/data/TargetWith2PagesFirstIs3.pdf";

        PdfComparisonSettings comparisonSettings = new PdfComparisonSettings();
        comparisonSettings.setComparisonDepth(ComparisonDepth.Chars);
        Comparing c = new Comparing();
        c.ProcessComparing("Comparison of a document with xForms when deletion rows were moved to next new page: ", SourceFileName, TargetFileName,
                ResultPath, comparisonSettings);
    }
}
