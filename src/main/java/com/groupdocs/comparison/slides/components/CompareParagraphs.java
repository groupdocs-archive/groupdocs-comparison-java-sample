/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groupdocs.comparison.slides.components;

import com.groupdocs.comparison.common.comparisonsettings.SlidesComparisonSettings;
import com.groupdocs.comparison.slides.ComparisonParagraph;
import com.groupdocs.comparison.slides.ComparisonPresentation;
import com.groupdocs.comparison.slides.contracts.ISlidesCompareResult;
import com.groupdocs.comparison.slides.contracts.comparison.ComparisonAutoShapeBase;
import com.groupdocs.comparison.slides.contracts.comparison.ComparisonParagraphBase;
import com.groupdocs.comparison.slides.contracts.comparison.ComparisonPresentationBase;
import com.groupdocs.comparison.slides.contracts.enums.ComparisonSaveFormat;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 *
 * author Сергей
 */
public class CompareParagraphs {

    public void CompareParagraphsFromDifferentPresentations() throws Exception {
        String sourcePath
                = "slides/components/data/CompareParagraphsFromDifferentPresentations/old.pptx";
        String targetPath
                = "slides/components/data/CompareParagraphsFromDifferentPresentations/new.pptx";

        // Create to streams of presentations
        InputStream sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourcePath);
        InputStream targetStream = this.getClass().getClassLoader().getResourceAsStream(targetPath);

        // Opening two presentations
        ComparisonPresentationBase sourcePresentation = new ComparisonPresentation(sourceStream);
        System.out.println("Presentation with source path: " + sourcePath + " was loaded.");
        ComparisonPresentationBase targetPresentation = new ComparisonPresentation(targetStream);
        System.out.println("Presentation with source path: " + targetPath + " was loaded.");

        // Getting first Paragraph from source presentation
        ComparisonParagraphBase sourceParagraph = ((ComparisonAutoShapeBase) sourcePresentation.getSlides().get_Item(0).getShapes().get_Item(0)).getTextFrame().getParagraphs().get_Item(0);
        // Getting first Paragraph from target presentation
        ComparisonParagraphBase targetParagraph = ((ComparisonAutoShapeBase) targetPresentation.getSlides().get_Item(0).getShapes().get_Item(0)).getTextFrame().getParagraphs().get_Item(0);

        // Creating settings for comparison of Paragraphs
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        // Comparing Paragraphs
        ISlidesCompareResult compareResult = sourceParagraph.compareWith(targetParagraph, SlidesComparisonSettings);
        System.out.println("Paragraphs was compared.");

        // Saving result of comparison to new presentation
        String resultPath = "src/main/resources/slides/components/testresult/CompareParagraphsFromDifferentPresentations/result.pptx";
        ComparisonPresentationBase result = compareResult.getPresentation();

        result.save(resultPath, ComparisonSaveFormat.Pptx);

        System.out.println("Result of comparison was saved to presentation with the folloving source path"
                + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }

    public void CompareParagraphsFromOnePresentations() throws Exception {
        String sourcePath
                = "slides/components/data/CompareParagraphsFromOnePresentations/old.pptx";

        // Create to stream of presentation
        InputStream sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourcePath);

        // Opening source presentation
        ComparisonPresentationBase sourcePresentation = new ComparisonPresentation(sourceStream);
        System.out.println("Presentation with source path: " + sourcePath + " was loaded.");

        // Getting first Paragraph from source presentation
        ComparisonParagraphBase sourceParagraph = ((ComparisonAutoShapeBase) sourcePresentation.getSlides().get_Item(0).getShapes().get_Item(0)).getTextFrame().getParagraphs().get_Item(0);
        // Getting second Paragraph from source presentation
        ComparisonParagraphBase targetParagraph = ((ComparisonAutoShapeBase) sourcePresentation.getSlides().get_Item(0).getShapes().get_Item(0)).getTextFrame().getParagraphs().get_Item(1);

        // Creating settings for comparison of Paragraphs
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        // Comparing Paragraphs
        ISlidesCompareResult compareResult = sourceParagraph.compareWith(targetParagraph, SlidesComparisonSettings);
        System.out.println("Paragraphs was compared.");

        // Saving result of comparison to new presentation
        String resultPath = "src/main/resources/slides/components/testresult/CompareParagraphsFromOnePresentations/result.pptx";
        ComparisonPresentationBase result = compareResult.getPresentation();
        result.save(resultPath, ComparisonSaveFormat.Pptx);

        System.out.println("Result of comparison was saved to presentation with the folloving source path"
                + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }

    public void CompareParagraphFromPresentationsWithCreatedParagraph() throws Exception {
        String sourcePath
                = "slides/components/data/CompareParagraphFromPresentationsWithCreatingParagraph/old.pptx";

        // Create to stream of presentation
        InputStream sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourcePath);

        // Opening source presentation
        ComparisonPresentationBase sourcePresentation = new ComparisonPresentation(sourceStream);
        System.out.println("Presentation with source path: " + sourcePath + " was loaded.");

        // Getting first Paragraph from source presentation
        ComparisonParagraphBase sourceParagraph = ((ComparisonAutoShapeBase) sourcePresentation.getSlides().get_Item(0).getShapes().get_Item(0)).getTextFrame().getParagraphs().get_Item(0);
        // Creating Paragraph
        ComparisonParagraphBase targetParagraph = new ComparisonParagraph();
        targetParagraph.setText("This Paragraph was created.");
        System.out.println("New Paragraph was created.");

        // Creating settings for comparison of Paragraphs
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        // Comparing Paragraphs
        ISlidesCompareResult compareResult = sourceParagraph.compareWith(targetParagraph, SlidesComparisonSettings);
        System.out.println("Paragraphs was compared.");

        // Saving result of comparison to new presentation
        String resultPath
                = "src/main/resources/slides/components/testresult/CompareParagraphFromPresentationsWithCreatingParagraph/result.pptx";
        ComparisonPresentationBase result = compareResult.getPresentation();

        result.save(resultPath, ComparisonSaveFormat.Pptx);

        System.out.println("Result of comparison was saved to presentation with the folloving source path"
                + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }

    public void CompareTwoCreatedParagraphs() throws Exception {
        // Creating Paragraphs
        ComparisonParagraphBase sourceParagraph = new ComparisonParagraph();
        sourceParagraph.setText("This is source Paragraph.");
        System.out.println("New Paragraph was created.");

        ComparisonParagraphBase targetParagraph = new ComparisonParagraph();
        targetParagraph.setText("This is target Paragraph.");
        System.out.println("New Paragraph was created.");

        // Creating settings for comparison of Paragraphs
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        // Comparing Paragraphs
        ISlidesCompareResult compareResult = sourceParagraph.compareWith(targetParagraph, SlidesComparisonSettings);
        System.out.println("Paragraphs was compared.");

        // Saving result of comparison to new presentation
        String resultPath = "src/main/resources/slides/components/testresult/CompareTwoCreatingParagraphs/result.pptx";
        ComparisonPresentationBase result = compareResult.getPresentation();

        result.save(resultPath, ComparisonSaveFormat.Pptx);

        System.out.println("Result of comparison was saved to presentation with the folloving source path"
                + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }
}
