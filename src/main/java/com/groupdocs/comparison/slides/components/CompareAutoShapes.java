/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groupdocs.comparison.slides.components;

import com.groupdocs.comparison.common.comparisonsettings.SlidesComparisonSettings;
import com.groupdocs.comparison.slides.ComparisonAutoShape;
import com.groupdocs.comparison.slides.ComparisonParagraph;
import com.groupdocs.comparison.slides.ComparisonPresentation;
import com.groupdocs.comparison.slides.contracts.ISlidesCompareResult;
import com.groupdocs.comparison.slides.contracts.comparison.ComparisonAutoShapeBase;
import com.groupdocs.comparison.slides.contracts.comparison.ComparisonParagraphBase;
import com.groupdocs.comparison.slides.contracts.comparison.ComparisonPresentationBase;
import com.groupdocs.comparison.slides.contracts.enums.ComparisonSaveFormat;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * author Сергей
 */
public class CompareAutoShapes {

    public void CompareAutoShapesFromDifferentPresentations() throws Exception {
        String sourcePath
                = "slides/components/data/CompareAutoShapesFromDifferentPresentations/old.pptx";
        String targetPath
                = "slides/components/data/CompareAutoShapesFromDifferentPresentations/new.pptx";

        // Create to streams of presentations
        InputStream sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourcePath);
        InputStream targetStream = this.getClass().getClassLoader().getResourceAsStream(targetPath);

        // Opening two presentations
        ComparisonPresentationBase sourcePresentation = new ComparisonPresentation(sourceStream);
        System.out.println("Presentation with source path: " + sourcePath + " was loaded.");
        ComparisonPresentationBase targetPresentation = new ComparisonPresentation(targetStream);
        System.out.println("Presentation with source path: " + targetPath + " was loaded.");

        // Getting first AutoShape from source presentation
        ComparisonAutoShapeBase sourceAutoShape = (ComparisonAutoShapeBase) sourcePresentation.getSlides().get_Item(0).getShapes().get_Item(0);
        // Getting first AutoShape from target presentation
        ComparisonAutoShapeBase targetAutoShape = (ComparisonAutoShapeBase) targetPresentation.getSlides().get_Item(0).getShapes().get_Item(0);

        // Creating settings for comparison of AutoShapes
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        // Comparing AutoShapes
        ISlidesCompareResult compareResult = sourceAutoShape.compareWith(targetAutoShape, SlidesComparisonSettings);
        System.out.println("AutoShapes was compared.");

        // Saving result of comparison to new presentation
        String resultPath = "src/main/resources/slides/components/testresult/CompareAutoShapesFromDifferentPresentations/result.pptx";
        ComparisonPresentationBase result = compareResult.getPresentation();

        result.save(resultPath, ComparisonSaveFormat.Pptx);

        System.out.println("Result of comparison was saved to presentation with the folloving source path"
                + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }

    public  void CompareAutoShapesFromOnePresentations() throws Exception {
        String sourcePath
                = "slides/components/data/CompareAutoShapesFromOnePresentations/old.pptx";

        // Create to stream of presentation
        InputStream sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourcePath);
        
        
        ComparisonPresentationBase sourcePresentation = new ComparisonPresentation(sourceStream);
        System.out.println("Presentation with source path: " + sourcePath + " was loaded.");

        // Getting first AutoShape from source presentation
        ComparisonAutoShapeBase sourceAutoShape = (ComparisonAutoShapeBase) sourcePresentation.getSlides().get_Item(0).getShapes().get_Item(0);
        // Getting second AutoShape from source presentation
        ComparisonAutoShapeBase targetAutoShape = (ComparisonAutoShapeBase) sourcePresentation.getSlides().get_Item(1).getShapes().get_Item(0);

        // Creating settings for comparison of AutoShapes
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        // Comparing AutoShapes
        ISlidesCompareResult compareResult = sourceAutoShape.compareWith(targetAutoShape, SlidesComparisonSettings);
        System.out.println("AutoShapes was compared.");

        // Saving result of comparison to new presentation
        String resultPath = "src/main/resources/slides/components/testresult/CompareAutoShapesFromOnePresentations/result.pptx";
        ComparisonPresentationBase result = compareResult.getPresentation();

        result.save(resultPath, ComparisonSaveFormat.Pptx);

        System.out.println("Result of comparison was saved to presentation with the folloving source path"
                + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }

    public void CompareAutoShapeFromPresentationsWithCreatingAutoShape() throws Exception {
        String sourcePath
                = "slides/components/data/CompareAutoShapeFromPresentationsWithCreatingAutoShape/old.pptx";

        // Create to stream of presentation
        InputStream sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourcePath);

        // Opening source presentation
        ComparisonPresentationBase sourcePresentation = new ComparisonPresentation(sourceStream);
        System.out.println("Presentation with source path: " + sourcePath + " was loaded.");

        // Getting first AutoShape from source presentation
        ComparisonAutoShapeBase sourceAutoShape = (ComparisonAutoShapeBase) sourcePresentation.getSlides().get_Item(0).getShapes().get_Item(0);
			// Creating AutoShape
			ComparisonAutoShapeBase targetAutoShape = new ComparisonAutoShape(100, 100, 500, 300);
        ComparisonParagraphBase paragraph = new ComparisonParagraph();
        paragraph.setText("This AutoShape was created.");
        targetAutoShape.addTextFrame("");
        targetAutoShape.getTextFrame().getParagraphs().add(paragraph);
        System.out.println("New AutoShape was created.");

        // Creating settings for comparison of AutoShapes
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        // Comparing AutoShapes
        ISlidesCompareResult compareResult = sourceAutoShape.compareWith(targetAutoShape, SlidesComparisonSettings);
        System.out.println("AutoShapes was compared.");

        // Saving result of comparison to new presentation
        String resultPath
                = "src/main/resources/slides/components/testresult/CompareAutoShapeFromPresentationsWithCreatingAutoShape/result.pptx";
        ComparisonPresentationBase result = compareResult.getPresentation();

        result.save(resultPath, ComparisonSaveFormat.Pptx);

        System.out.println("Result of comparison was saved to presentation with the folloving source path"
                + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }

    public  void CompareTwoCreatingAutoShapes() throws Exception {
        // Creating AutoShapes
        ComparisonAutoShapeBase sourceAutoShape = new ComparisonAutoShape(100, 100, 500, 300);
        ComparisonParagraphBase sourceParagraph = new ComparisonParagraph();
        sourceParagraph.setText("This is source AutoShape.");
        sourceAutoShape.addTextFrame("");
        sourceAutoShape.getTextFrame().getParagraphs().add(sourceParagraph);
        System.out.println("New AutoShape was created.");

        ComparisonAutoShapeBase targetAutoShape = new ComparisonAutoShape(100, 100, 500, 300);
        ComparisonParagraphBase targetParagraph = new ComparisonParagraph();
        targetParagraph.setText("This is target AutoShape.");
        targetAutoShape.addTextFrame("");
        targetAutoShape.getTextFrame().getParagraphs().add(targetParagraph);
        System.out.println("New AutoShape was created.");

        // Creating settings for comparison of AutoShapes
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        // Comparing AutoShapes
        ISlidesCompareResult compareResult = sourceAutoShape.compareWith(targetAutoShape, SlidesComparisonSettings);
        System.out.println("AutoShapes was compared.");

        // Saving result of comparison to new presentation
        String resultPath = "src/main/resources/slides/components/testresult/CompareTwoCreatingAutoShapes/result.pptx";
        ComparisonPresentationBase result = compareResult.getPresentation();

        result.save(resultPath, ComparisonSaveFormat.Pptx);

        System.out.println("Result of comparison was saved to presentation with the folloving source path"
                + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }
}
