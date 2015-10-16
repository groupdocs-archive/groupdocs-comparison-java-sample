/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groupdocs.comparison.slides.components;

import com.groupdocs.comparison.common.comparisonsettings.SlidesComparisonSettings;
import com.groupdocs.comparison.slides.ComparisonColumn;
import com.groupdocs.comparison.slides.ComparisonParagraph;
import com.groupdocs.comparison.slides.ComparisonPresentation;
import com.groupdocs.comparison.slides.contracts.ISlidesCompareResult;
import com.groupdocs.comparison.slides.contracts.comparison.ComparisonColumnBase;
import com.groupdocs.comparison.slides.contracts.comparison.ComparisonParagraphBase;
import com.groupdocs.comparison.slides.contracts.comparison.ComparisonPresentationBase;
import com.groupdocs.comparison.slides.contracts.comparison.ComparisonTableBase;
import com.groupdocs.comparison.slides.contracts.enums.ComparisonSaveFormat;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 *
 * author Сергей
 */
public class CompareColumns {

    public void CompareColumnsFromDifferentPresentations() throws Exception {
        String sourcePath
                = "slides/components/data/CompareColumnsFromDifferentPresentations/old.pptx";
        String targetPath
                = "slides/components/data/CompareColumnsFromDifferentPresentations/new.pptx";

        // Create to streams of presentations
        InputStream sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourcePath);
        InputStream targetStream = this.getClass().getClassLoader().getResourceAsStream(targetPath);

        // Opening two presentations
        ComparisonPresentationBase sourcePresentation = new ComparisonPresentation(sourceStream);
        System.out.println("Presentation with source path: " + sourcePath + " was loaded.");
        ComparisonPresentationBase targetPresentation = new ComparisonPresentation(targetStream);
        System.out.println("Presentation with source path: " + targetPath + " was loaded.");

        // Getting first Column from source presentation
        ComparisonColumnBase sourceColumn = ((ComparisonTableBase)sourcePresentation.getSlides().get_Item(0).getShapes().get_Item(0)).getColumns().get_Item(0);
        // Getting first Column from target presentation
        ComparisonColumnBase targetColumn = ((ComparisonTableBase)targetPresentation.getSlides().get_Item(0).getShapes().get_Item(0)).getColumns().get_Item(0);

        // Creating settings for comparison of Columns
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        // Comparing Columns
        ISlidesCompareResult compareResult = sourceColumn.compareWith(targetColumn, SlidesComparisonSettings);
        System.out.println("Columns was compared.");

        // Saving result of comparison to new presentation
        String resultPath = "src/main/resources/slides/components/testresult/CompareColumnsFromDifferentPresentations/result.pptx";
        ComparisonPresentationBase result = compareResult.getPresentation();

        result.save(resultPath, ComparisonSaveFormat.Pptx);

        System.out.println("Result of comparison was saved to presentation with the folloving source path"
                + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }

    public void CompareColumnsFromOnePresentations() throws Exception {
        String sourcePath
                = "slides/components/data/CompareColumnsFromOnePresentations/old.pptx";

        // Create to stream of presentation
        InputStream sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourcePath);

        // Opening source presentation
        ComparisonPresentationBase sourcePresentation = new ComparisonPresentation(sourceStream);
        System.out.println("Presentation with source path: " + sourcePath + " was loaded.");

        // Getting first Column from source presentation
        ComparisonColumnBase sourceColumn = ((ComparisonTableBase)sourcePresentation.getSlides().get_Item(0).getShapes().get_Item(0)).getColumns().get_Item(0);
        // Getting second Column from source presentation
        ComparisonColumnBase targetColumn = ((ComparisonTableBase)sourcePresentation.getSlides().get_Item(0).getShapes().get_Item(0)).getColumns().get_Item(1);

        // Creating settings for comparison of Columns
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        // Comparing Columns
        ISlidesCompareResult compareResult = sourceColumn.compareWith(targetColumn, SlidesComparisonSettings);
        System.out.println("Columns was compared.");

        // Saving result of comparison to new presentation
        String resultPath = "src/main/resources/slides/components/testresult/CompareColumnsFromOnePresentations/result.pptx";
        ComparisonPresentationBase result = compareResult.getPresentation();

        result.save(resultPath, ComparisonSaveFormat.Pptx);

        System.out.println("Result of comparison was saved to presentation with the folloving source path"
                + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }

    public void CompareColumnFromPresentationsWithCreatingColumn() throws Exception {
        String sourcePath
                = "slides/components/data/CompareColumnFromPresentationsWithCreatingColumn/old.pptx";

        // Create to stream of presentation
        InputStream sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourcePath);

        // Opening source presentation
        ComparisonPresentationBase sourcePresentation = new ComparisonPresentation(sourceStream);
        System.out.println("Presentation with source path: " + sourcePath + " was loaded.");

        // Getting first Column from source presentation
        ComparisonColumnBase sourceColumn = ((ComparisonTableBase)sourcePresentation.getSlides().get_Item(0).getShapes().get_Item(0)).getColumns().get_Item(0);
        // Creating Column
        ComparisonColumnBase targetColumn = new ComparisonColumn(new double[]{50, 50}, 200);
        targetColumn.get_Item(0).getTextFrame().getParagraphs().get_Item(0).setText("This is first cell in Column that was created.");
        targetColumn.get_Item(1).getTextFrame().getParagraphs().get_Item(0).setText("This is second cell in Column that was created.");
        System.out.println("New Column was created.");

        // Creating settings for comparison of Columns
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        // Comparing Columns
        ISlidesCompareResult compareResult = sourceColumn.compareWith(targetColumn, SlidesComparisonSettings);
        System.out.println("Columns was compared.");

        // Saving result of comparison to new presentation
        String resultPath = "src/main/resources/slides/components/testresult/CompareColumnFromPresentationsWithCreatingColumn/result.pptx";
        ComparisonPresentationBase result = compareResult.getPresentation();

        result.save(resultPath, ComparisonSaveFormat.Pptx);

        System.out.println("Result of comparison was saved to presentation with the folloving source path"
                + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }

    public void CompareTwoCreatingColumns() throws Exception {
        // Creating Columns
        ComparisonColumnBase sourceColumn = new ComparisonColumn(new double[]{50, 50}, 200);
        ComparisonParagraphBase sourceParagraph0 = new ComparisonParagraph();
        sourceParagraph0.setText("This is first cell in source Column.");
        sourceColumn.get_Item(0).getTextFrame().getParagraphs().add(sourceParagraph0);
        ComparisonParagraphBase sourceParagraph1 = new ComparisonParagraph();
        sourceParagraph1.setText("This is second cell in source Column.");
        sourceColumn.get_Item(1).getTextFrame().getParagraphs().add(sourceParagraph1);
        System.out.println("New Column was created.");

        ComparisonColumnBase targetColumn = new ComparisonColumn(new double[]{50, 50}, 200);
        ComparisonParagraphBase targetParagraph0 = new ComparisonParagraph();
        targetParagraph0.setText("This is first cell in target Column.");
        targetColumn.get_Item(0).getTextFrame().getParagraphs().add(targetParagraph0);
        ComparisonParagraphBase targetParagraph1 = new ComparisonParagraph();
        targetParagraph1.setText("This is second cell in target Column.");
        targetColumn.get_Item(1).getTextFrame().getParagraphs().add(targetParagraph1);
        System.out.println("New Column was created.");

        // Creating settings for comparison of Columns
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        // Comparing Columns
        ISlidesCompareResult compareResult = sourceColumn.compareWith(targetColumn, SlidesComparisonSettings);
        System.out.println("Columns was compared.");

        // Saving result of comparison to new presentation
        String resultPath = "src/main/resources/slides/components/testresult/CompareTwoCreatingColumns/result.pptx";
        ComparisonPresentationBase result = compareResult.getPresentation();

        result.save(resultPath, ComparisonSaveFormat.Pptx);

        System.out.println("Result of comparison was saved to presentation with the folloving source path"
                + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }
}
