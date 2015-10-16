/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groupdocs.comparison.slides.documents;

import com.groupdocs.comparison.common.comparisonsettings.SlidesComparisonSettings;
import com.groupdocs.comparison.slides.ComparisonPresentation;
import com.groupdocs.comparison.slides.contracts.ISlidesCompareResult;
import com.groupdocs.comparison.slides.contracts.comparison.ComparisonPresentationBase;
import com.groupdocs.comparison.slides.contracts.enums.ComparisonSaveFormat;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 *
 * @author Сергей
 */
public class ComparePresentationsWithTables {

    public  void ComparePresentationsWithTablesOnAppropriateSlides() throws Exception {
        String sourcePath = "slides/presentations/data/WithTablesOnAppropriateSlides/old.pptx";
        String targetPath = "slides/presentations/data/WithTablesOnAppropriateSlides/new.pptx";
        String resultPath = "src/main/resources/slides/presentations/testresult/WithTablesOnAppropriateSlides/result.pptx";
        // Creating settings for comparison of presentations
        Compare(sourcePath, targetPath, resultPath);
    }

    public  void ComparePresentationsWithTablesOnDifferentSlides() throws Exception {
        String sourcePath = "slides/presentations/data/WithTablesOnDifferentSlides/old.pptx";
        String targetPath = "slides/presentations/data/WithTablesOnDifferentSlides/new.pptx";
        String resultPath = "src/main/resources/slides/presentations/testresult/WithTablesOnDifferentSlides/result.pptx";

        Compare(sourcePath, targetPath, resultPath);
    }

    public  void ComparePresentationsWithTablesWitchConyainsDifferentCountOfRows() throws Exception {
        String sourcePath
                = "slides/presentations/data/WithTablesWitchConyainsDifferentCountOfRows/old.pptx";
        String targetPath
                = "slides/presentations/data/WithTablesWitchConyainsDifferentCountOfRows/new.pptx";
        String resultPath = "src/main/resources/slides/presentations/testresult/WithTablesWitchConyainsDifferentCountOfRows/result.pptx";

        Compare(sourcePath, targetPath, resultPath);
    }

    public  void ComparePresentationsWithTablesWitchConyainsDifferentCountOfColumns() throws Exception {
        String sourcePath
                = "slides/presentations/data/WithTablesWitchConyainsDifferentCountOfColumns/old.pptx";
        String targetPath
                = "slides/presentations/data/WithTablesWitchConyainsDifferentCountOfColumns/new.pptx";
        String resultPath = "src/main/resources/slides/presentations/testresult/WithTablesWitchConyainsDifferentCountOfColumns/result.pptx";

        Compare(sourcePath, targetPath, resultPath);
    }

    public  void ComparePresentationsWithTablesWitchConyainsDifferentCountOfColumnsAndDifferentCountOfRows() throws Exception {
        String sourcePath
                = "slides/presentations/data/WithTablesWitchConyainsDifferentCountOfColumnsAndDifferentCountOfRows/old.pptx";
        String targetPath
                = "slides/presentations/data/WithTablesWitchConyainsDifferentCountOfColumnsAndDifferentCountOfRows/new.pptx";
        String resultPath
                = "src/main/resources/slides/presentations/testresult/WithTablesWitchConyainsDifferentCountOfColumnsAndDifferentCountOfRows/result.pptx";

        Compare(sourcePath, targetPath, resultPath);
    }

    private  void Compare(String sourcePath, String targetPath, String resultPath) throws Exception {
        // Create to streams of presentations
        InputStream sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourcePath);
        InputStream targetStream = this.getClass().getClassLoader().getResourceAsStream(targetPath);
        // Opening two presentations
        ComparisonPresentationBase sourcePresentation = new ComparisonPresentation(sourceStream);
        System.out.println("Presentation with source path: " + sourcePath + " was loaded.");
        ComparisonPresentationBase targetPresentation = new ComparisonPresentation(targetStream);
        System.out.println("Presentation with source path: " + targetPath + " was loaded.");

        SlidesComparisonSettings slidesComparisonSettings = new SlidesComparisonSettings();
        
        // Comparing presentations
        ISlidesCompareResult compareResult = sourcePresentation.compareWith(targetPresentation, slidesComparisonSettings);
        System.out.println("Presentations was compared.");

        // Saving result of comparison to new presentation
        ComparisonPresentationBase result = compareResult.getPresentation();

        result.save(resultPath, ComparisonSaveFormat.Pptx);

        System.out.println("Result of comparison was saved to presentation with the folloving source path" + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }
}
