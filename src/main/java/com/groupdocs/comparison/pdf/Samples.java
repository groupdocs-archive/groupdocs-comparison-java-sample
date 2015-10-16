/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groupdocs.comparison.pdf;

import com.groupdocs.comparison.pdf.documents.ComparisonOfDocumentWithTables;
import com.groupdocs.comparison.pdf.documents.ComparisonOfDocumentWithXForms;
import com.groupdocs.comparison.pdf.documents.ComparisonOfSimpleText;
import com.groupdocs.comparison.pdf.documents.ResultComparingConsistsInsertedAndDeletedPages;
import com.groupdocs.comparison.pdf.settings.ComparisonUsingSettings;

/**
 *
 * @author gruzi_000
 */
public class Samples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        ComparisonUsingSettings comparisonUsingSettings = new ComparisonUsingSettings();
        
        comparisonUsingSettings.ComparisonDepthIsChars("src/main/resources/pdf/settings");
        comparisonUsingSettings.ComparisonDepthIsWords("src/main/resources/pdf/settings");
        comparisonUsingSettings.DefaultSettings("src/main/resources/pdf/settings");
        comparisonUsingSettings.DeletedItemsStyleIsDefined("src/main/resources/pdf/settings");
        comparisonUsingSettings.GenerationSummaryPageIsFalse("src/main/resources/pdf/settings");
        comparisonUsingSettings.InsertedItemsStyleIsDefined("src/main/resources/pdf/settings");
        comparisonUsingSettings.ShowDeletedContentIsFalse("src/main/resources/pdf/settings");
        
        ResultComparingConsistsInsertedAndDeletedPages resultComparingConsistsInsertedAndDeletedPages = new ResultComparingConsistsInsertedAndDeletedPages();
        
        resultComparingConsistsInsertedAndDeletedPages.Case1("src/main/resources/pdf/documents");
        resultComparingConsistsInsertedAndDeletedPages.Case1_Reverse("src/main/resources/pdf/documents");
        resultComparingConsistsInsertedAndDeletedPages.Case2("src/main/resources/pdf/documents");
        resultComparingConsistsInsertedAndDeletedPages.Case2_Reverse("src/main/resources/pdf/documents");
        resultComparingConsistsInsertedAndDeletedPages.Case3("src/main/resources/pdf/documents");
        resultComparingConsistsInsertedAndDeletedPages.Case3_Reverse("src/main/resources/pdf/documents");
        resultComparingConsistsInsertedAndDeletedPages.Case4("src/main/resources/pdf/documents");
        resultComparingConsistsInsertedAndDeletedPages.Case4_Reverse("src/main/resources/pdf/documents");
        
        ComparisonOfSimpleText comparisonOfSimpleText = new ComparisonOfSimpleText();
        
        comparisonOfSimpleText.Case1("src/main/resources/pdf/documents");
        comparisonOfSimpleText.Case1_Reverse("src/main/resources/pdf/documents");
        comparisonOfSimpleText.Case2("src/main/resources/pdf/documents");
        comparisonOfSimpleText.Case2_Reverse("src/main/resources/pdf/documents");
        comparisonOfSimpleText.Case3("src/main/resources/pdf/documents");
        comparisonOfSimpleText.Case3_Reverse("src/main/resources/pdf/documents");
        
        ComparisonOfDocumentWithXForms comparisonOfDocumentWithXForms = new ComparisonOfDocumentWithXForms();
        
        comparisonOfDocumentWithXForms.Case1("src/main/resources/pdf/documents");
        comparisonOfDocumentWithXForms.Case1_Reverse("src/main/resources/pdf/documents");
        comparisonOfDocumentWithXForms.Case2("src/main/resources/pdf/documents");
        comparisonOfDocumentWithXForms.Case2_Reverse("src/main/resources/pdf/documents");
        comparisonOfDocumentWithXForms.DocumentsWithXFormsWhenDeletionAndInsertionRows("src/main/resources/pdf/documents");
        comparisonOfDocumentWithXForms.DocumentsWithXFormsWhenDeletionRowsWereMovedToNextNewPage("src/main/resources/pdf/documents");
        
        ComparisonOfDocumentWithTables comparisonOfDocumentWithTables = new ComparisonOfDocumentWithTables();
        
        comparisonOfDocumentWithTables.Case1("src/main/resources/pdf/documents");
        comparisonOfDocumentWithTables.Case1_Reverse("src/main/resources/pdf/documents");
        comparisonOfDocumentWithTables.Case2("src/main/resources/pdf/documents");
        comparisonOfDocumentWithTables.Case2_Reverse("src/main/resources/pdf/documents");
    }
    
}
