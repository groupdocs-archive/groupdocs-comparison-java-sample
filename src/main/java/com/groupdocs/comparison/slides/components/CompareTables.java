/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groupdocs.comparison.slides.components;

import com.groupdocs.comparison.common.comparisonsettings.SlidesComparisonSettings;
import com.groupdocs.comparison.slides.ComparisonParagraph;
import com.groupdocs.comparison.slides.ComparisonPresentation;
import com.groupdocs.comparison.slides.ComparisonTable;
import com.groupdocs.comparison.slides.contracts.ISlidesCompareResult;
import com.groupdocs.comparison.slides.contracts.comparison.ComparisonParagraphBase;
import com.groupdocs.comparison.slides.contracts.comparison.ComparisonPresentationBase;
import com.groupdocs.comparison.slides.contracts.comparison.ComparisonTableBase;
import com.groupdocs.comparison.slides.contracts.enums.ComparisonSaveFormat;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * author Сергей
 */
public class CompareTables {

    public  void CompareTablesFromDifferentPresentations() throws Exception {
        String sourcePath
                = "slides/components/data/CompareTablesFromDifferentPresentations/old.pptx";
        String targetPath
                = "slides/components/data/CompareTablesFromDifferentPresentations/new.pptx";

        InputStream sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourcePath);
        InputStream targetStream = this.getClass().getClassLoader().getResourceAsStream(targetPath);

        // Opening two presentations
        ComparisonPresentationBase sourcePresentation = new ComparisonPresentation(sourceStream);
        System.out.println("Presentation with source path: " + sourcePath + " was loaded.");
        ComparisonPresentationBase targetPresentation = new ComparisonPresentation(targetStream);
        System.out.println("Presentation with source path: " + targetPath + " was loaded.");

        // Getting first Table from source presentation
        ComparisonTableBase sourceTable = (ComparisonTableBase) sourcePresentation.getSlides().get_Item(0).getShapes().get_Item(0);
        // Getting first Table from target presentation
        ComparisonTableBase targetTable = (ComparisonTableBase) targetPresentation.getSlides().get_Item(0).getShapes().get_Item(0);
        // Creating settings for comparison of Tables
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        // Comparing Tables
        ISlidesCompareResult compareResult = sourceTable.compareWith(targetTable, SlidesComparisonSettings);
        System.out.println("Tables was compared.");

        // Saving result of comparison to new presentation
        String resultPath = "src/main/resources/slides/components/testresult/CompareTablesFromDifferentPresentations/result.pptx";
        ComparisonPresentationBase result = compareResult.getPresentation();
        
        result.save(resultPath, ComparisonSaveFormat.Pptx);

        System.out.println("Result of comparison was saved to presentation with the folloving source path"
                + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }

    public void CompareTablesFromOnePresentations() throws Exception {
        String sourcePath = "slides/components/data/CompareTablesFromOnePresentations/old.pptx";
        // Create to stream of presentation
        InputStream sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourcePath);
        // Opening source presentation
        ComparisonPresentationBase sourcePresentation = new ComparisonPresentation(sourceStream);
        System.out.println("Presentation with source path: " + sourcePath + " was loaded.");
        // Getting first Table from source presentation
        ComparisonTableBase sourceTable = (ComparisonTableBase) sourcePresentation.getSlides().get_Item(0).getShapes().get_Item(0);
        // Getting second Table from source presentation
        ComparisonTableBase targetTable = (ComparisonTableBase) sourcePresentation.getSlides().get_Item(1).getShapes().get_Item(0);
        // Creating settings for comparison of Tables
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        // Comparing Tables
        ISlidesCompareResult compareResult = sourceTable.compareWith(targetTable, SlidesComparisonSettings);
        System.out.println("Tables was compared.");

        // Saving result of comparison to new presentation
        String resultPath = "src/main/resources/slides/components/testresult/CompareTablesFromOnePresentations/result.pptx";
        ComparisonPresentationBase result = compareResult.getPresentation();

        result.save(resultPath, ComparisonSaveFormat.Pptx);

        System.out.println("Result of comparison was saved to presentation with the folloving source path"
                + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }

    public void CompareTableFromPresentationsWithCreatingTable() throws Exception {
        String sourcePath
                = "slides/components/data/CompareTableFromPresentationsWithCreatingTable/old.pptx";

        // Create to stream of presentation
        InputStream sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourcePath);

        // Opening source presentation
        ComparisonPresentationBase sourcePresentation = new ComparisonPresentation(sourceStream);
        System.out.println("Presentation with source path: " + sourcePath + " was loaded.");

        // Getting first Table from source presentation
        ComparisonTableBase sourceTable = (ComparisonTableBase) sourcePresentation.getSlides().get_Item(0).getShapes().get_Item(0);
        // Creating Table
        ComparisonTableBase targetTable = new ComparisonTable(100, 100, new double[]{200, 200}, new double[]{50, 50});
        targetTable.get_Item(0, 0).getTextFrame().getParagraphs().get_Item(0).setText("This is first cell in created table.");
        targetTable.get_Item(0, 1).getTextFrame().getParagraphs().get_Item(0).setText("This is second cell in created table.");
        targetTable.get_Item(1, 0).getTextFrame().getParagraphs().get_Item(0).setText("This is third cell in created table.");
        targetTable.get_Item(1, 1).getTextFrame().getParagraphs().get_Item(0).setText("This is fourth cell in created table.");
        System.out.println("New Table was created.");

        // Creating settings for comparison of Tables
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        // Comparing Tables
        ISlidesCompareResult compareResult = sourceTable.compareWith(targetTable, SlidesComparisonSettings);
        System.out.println("Tables was compared.");

        // Saving result of comparison to new presentation
        String resultPath = "src/main/resources/slides/components/testresult/CompareTableFromPresentationsWithCreatingTable/result.pptx";
        ComparisonPresentationBase result = compareResult.getPresentation();

        result.save(resultPath, ComparisonSaveFormat.Pptx);

        System.out.println("Result of comparison was saved to presentation with the folloving source path"
                + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }

    public void CompareTwoCreatingTables() throws Exception {
        // Creating Tables
        ComparisonTableBase sourceTable = new ComparisonTable(100, 100, new double[]{200, 200}, new double[]{50, 50});
        ComparisonParagraphBase sourceParagraph00 = new ComparisonParagraph();
        sourceParagraph00.setText("This is first cell in source table.");
        sourceTable.get_Item(0, 0).getTextFrame().getParagraphs().add(sourceParagraph00);
        ComparisonParagraphBase sourceParagraph01 = new ComparisonParagraph();
        sourceParagraph01.setText("This is second cell in source table.");
        sourceTable.get_Item(0, 1).getTextFrame().getParagraphs().add(sourceParagraph01);
        ComparisonParagraphBase sourceParagraph10 = new ComparisonParagraph();
        sourceParagraph10.setText("This is third cell in source table.");
        sourceTable.get_Item(1, 0).getTextFrame().getParagraphs().add(sourceParagraph10);
        ComparisonParagraphBase sourceParagraph11 = new ComparisonParagraph();
        sourceParagraph11.setText("This is fourth cell in source table.");
        sourceTable.get_Item(1, 1).getTextFrame().getParagraphs().add(sourceParagraph11);
        System.out.println("New Table was created.");

        ComparisonTableBase targetTable = new ComparisonTable(100, 100, new double[]{200, 200}, new double[]{50, 50});
        ComparisonParagraphBase targetParagraph00 = new ComparisonParagraph();
        targetParagraph00.setText("This is first cell in target table.");
        targetTable.get_Item(0, 0).getTextFrame().getParagraphs().add(targetParagraph00);
        ComparisonParagraphBase targetParagraph01 = new ComparisonParagraph();
        targetParagraph01.setText("This is second cell in target table.");
        targetTable.get_Item(0, 1).getTextFrame().getParagraphs().add(targetParagraph01);
        ComparisonParagraphBase targetParagraph10 = new ComparisonParagraph();
        targetParagraph10.setText("This is third cell in target table.");
        targetTable.get_Item(1, 0).getTextFrame().getParagraphs().add(targetParagraph10);
        ComparisonParagraphBase targetParagraph11 = new ComparisonParagraph();
        targetParagraph11.setText("This is fourth cell in target table.");
        targetTable.get_Item(1, 1).getTextFrame().getParagraphs().add(targetParagraph11);
        System.out.println("New Table was created.");

        // Creating settings for comparison of Tables
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        // Comparing Tables
        ISlidesCompareResult compareResult = sourceTable.compareWith(targetTable, SlidesComparisonSettings);
        System.out.println("Tables was compared.");

        // Saving result of comparison to new presentation
        String resultPath = "src/main/resources/slides/components/testresult/CompareTwoCreatingTables/result.pptx";
        ComparisonPresentationBase result = compareResult.getPresentation();

        result.save(resultPath, ComparisonSaveFormat.Pptx);

        System.out.println("Result of comparison was saved to presentation with the folloving source path"
                + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }
}
