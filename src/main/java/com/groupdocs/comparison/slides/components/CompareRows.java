/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groupdocs.comparison.slides.components;

import com.groupdocs.comparison.common.comparisonsettings.SlidesComparisonSettings;
import com.groupdocs.comparison.slides.ComparisonParagraph;
import com.groupdocs.comparison.slides.ComparisonPresentation;
import com.groupdocs.comparison.slides.ComparisonRow;
import com.groupdocs.comparison.slides.contracts.ISlidesCompareResult;
import com.groupdocs.comparison.slides.contracts.comparison.ComparisonParagraphBase;
import com.groupdocs.comparison.slides.contracts.comparison.ComparisonPresentationBase;
import com.groupdocs.comparison.slides.contracts.comparison.ComparisonRowBase;
import com.groupdocs.comparison.slides.contracts.comparison.ComparisonTableBase;
import com.groupdocs.comparison.slides.contracts.enums.ComparisonSaveFormat;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * author Сергей
 */
public class CompareRows {

    public void CompareRowsFromDifferentPresentations() throws Exception {
        String sourcePath
                = "slides/components/data/CompareRowsFromDifferentPresentations/old.pptx";
        String targetPath
                = "slides/components/data/CompareRowsFromDifferentPresentations/new.pptx";

        InputStream sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourcePath);
        InputStream targetStream = this.getClass().getClassLoader().getResourceAsStream(targetPath);

        // Opening two presentations
        ComparisonPresentationBase sourcePresentation = new ComparisonPresentation(sourceStream);
        System.out.println("Presentation with source path: " + sourcePath + " was loaded.");
        ComparisonPresentationBase targetPresentation = new ComparisonPresentation(targetStream);
        System.out.println("Presentation with source path: " + targetPath + " was loaded.");

        // Getting first Row from source presentation
        ComparisonRowBase sourceRow = ((ComparisonTableBase)sourcePresentation.getSlides().get_Item(0).getShapes().get_Item(0)).getRows().get_Item(0);
        // Getting second Row from source presentation
        ComparisonRowBase targetRow = ((ComparisonTableBase)targetPresentation.getSlides().get_Item(0).getShapes().get_Item(0)).getRows().get_Item(1);

        // Creating settings for comparison of Rows
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        // Comparing Rows
        ISlidesCompareResult compareResult = sourceRow.compareWith(targetRow, SlidesComparisonSettings);
        System.out.println("Rows was compared.");

        // Saving result of comparison to new presentation
        String resultPath = "src/main/resources/slides/components/testresult/CompareRowsFromDifferentPresentations/result.pptx";
        ComparisonPresentationBase result = compareResult.getPresentation();

        result.save(resultPath, ComparisonSaveFormat.Pptx);

        System.out.println("Result of comparison was saved to presentation with the folloving source path"
                + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }

    public void CompareRowsFromOnePresentations() throws Exception {
        String sourcePath = "slides/components/data/CompareRowsFromOnePresentations/old.pptx";

        // Create to stream of presentation
        InputStream sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourcePath);

        // Opening source presentation
        ComparisonPresentationBase sourcePresentation = new ComparisonPresentation(sourceStream);
        System.out.println("Presentation with source path: " + sourcePath + " was loaded.");

        // Getting first Row from source presentation
        ComparisonRowBase sourceRow = ((ComparisonTableBase)sourcePresentation.getSlides().get_Item(0).getShapes().get_Item(0)).getRows().get_Item(0);
        // Getting second Row from source presentation
        ComparisonRowBase targetRow = ((ComparisonTableBase)sourcePresentation.getSlides().get_Item(0).getShapes().get_Item(0)).getRows().get_Item(1);

        // Creating settings for comparison of Rows
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        // Comparing Rows
        ISlidesCompareResult compareResult = sourceRow.compareWith(targetRow, SlidesComparisonSettings);
        System.out.println("Rows was compared.");

        // Saving result of comparison to new presentation
        String resultPath = "src/main/resources/slides/components/testresult/CompareRowsFromOnePresentations/result.pptx";
        ComparisonPresentationBase result = compareResult.getPresentation();

        result.save(resultPath, ComparisonSaveFormat.Pptx);

        System.out.println("Result of comparison was saved to presentation with the folloving source path"
                + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }

    public void CompareRowFromPresentationsWithCreatedRow() throws Exception {
        String sourcePath
                = "slides/components/data/CompareRowFromPresentationsWithCreatingRow/old.pptx";

        // Create to stream of presentation
        InputStream sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourcePath);

        // Opening source presentation
        ComparisonPresentationBase sourcePresentation = new ComparisonPresentation(sourceStream);
        System.out.println("Presentation with source path: " + sourcePath + " was loaded.");

        // Getting first Row from source presentation
        ComparisonRowBase sourceRow = ((ComparisonTableBase)sourcePresentation.getSlides().get_Item(0).getShapes().get_Item(0)).getRows().get_Item(0);
        // Creating Row
        ComparisonRowBase targetRow = new ComparisonRow(new double[]{200, 200}, 50);
        ComparisonParagraphBase paragraph0 = new ComparisonParagraph();
        paragraph0.setText("This is first cell in Row that was created.");
        targetRow.get_Item(0).getTextFrame().getParagraphs().add(paragraph0);
        ComparisonParagraphBase paragraph1 = new ComparisonParagraph();
        paragraph1.setText("This is second cell in Row that was created.");
        targetRow.get_Item(1).getTextFrame().getParagraphs().add(paragraph1);
        System.out.println("New Row was created.");

        // Creating settings for comparison of Rows
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        // Comparing Rows
        ISlidesCompareResult compareResult = sourceRow.compareWith(targetRow, SlidesComparisonSettings);
        System.out.println("Rows was compared.");

        // Saving result of comparison to new presentation
        String resultPath = "src/main/resources/slides/components/testresult/CompareRowFromPresentationsWithCreatingRow/result.pptx";
        ComparisonPresentationBase result = compareResult.getPresentation();

        result.save(resultPath, ComparisonSaveFormat.Pptx);

        System.out.println("Result of comparison was saved to presentation with the folloving source path"
                + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }

    public void CompareTwoCreatedRows() throws Exception {
        // Creating Rows
        ComparisonRowBase sourceRow = new ComparisonRow(new double[]{200, 200}, 50);
        ComparisonParagraphBase sourceParagraph0 = new ComparisonParagraph();
        sourceParagraph0.setText("This is first cell in source Row.");
        sourceRow.get_Item(0).getTextFrame().getParagraphs().add(sourceParagraph0);
        ComparisonParagraphBase sourceParagraph1 = new ComparisonParagraph();
        sourceParagraph1.setText("This is second cell in source Row.");
        sourceRow.get_Item(1).getTextFrame().getParagraphs().add(sourceParagraph1);
        System.out.println("New Row was created.");

        ComparisonRowBase targetRow = new ComparisonRow(new double[]{200, 200}, 50);
        ComparisonParagraphBase targetParagraph0 = new ComparisonParagraph();
        targetParagraph0.setText("This is first cell in target Row.");
        targetRow.get_Item(0).getTextFrame().getParagraphs().add(targetParagraph0);
        ComparisonParagraphBase targetParagraph1 = new ComparisonParagraph();
        targetParagraph1.setText("This is second cell in target Row.");
        targetRow.get_Item(1).getTextFrame().getParagraphs().add(targetParagraph1);
        System.out.println("New Row was created.");

        // Creating settings for comparison of Rows
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        // Comparing Rows
        ISlidesCompareResult compareResult = sourceRow.compareWith(targetRow, SlidesComparisonSettings);
        System.out.println("Rows was compared.");

        // Saving result of comparison to new presentation
        String resultPath = "src/main/resources/slides/components/testresult/CompareTwoCreatingRows/result.pptx";
        ComparisonPresentationBase result = compareResult.getPresentation();

        result.save(resultPath, ComparisonSaveFormat.Pptx);

        System.out.println("Result of comparison was saved to presentation with the folloving source path"
                + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }
}
