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
public class ComparePresentationsWithAutoshapes {

    public  void ComparePresentationsWithAutoShapesOnAppropriateSlides() throws Exception {
        String sourcePath
                = "slides/presentations/data/WithAutoShapesOnAppropriateSlides/old.pptx";
        String targetPath
                = "slides/presentations/data/WithAutoShapesOnAppropriateSlides/new.pptx";
        String resultPath = "src/main/resources/slides/presentations/testresult/WithAutoShapesOnAppropriateSlides/result.pptx";
        Compare(sourcePath, targetPath, resultPath);
    }

    public  void ComparePresentationsWithAutoShapesOnDifferentSlides() throws Exception {
        String sourcePath = "slides/presentations/data/WithAutoShapesOnDifferentSlides/old.pptx";
        String targetPath = "slides/presentations/data/WithAutoShapesOnDifferentSlides/new.pptx";
        String resultPath = "src/main/resources/slides/presentations/testresult/WithAutoShapesOnDifferentSlides/result.pptx";
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
