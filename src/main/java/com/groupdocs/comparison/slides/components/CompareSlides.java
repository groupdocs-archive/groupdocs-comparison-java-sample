/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groupdocs.comparison.slides.components;

import com.groupdocs.comparison.common.comparisonsettings.SlidesComparisonSettings;
import com.groupdocs.comparison.slides.ComparisonParagraph;
import com.groupdocs.comparison.slides.ComparisonPresentation;
import com.groupdocs.comparison.slides.ComparisonSlide;
import com.groupdocs.comparison.slides.contracts.ISlidesCompareResult;
import com.groupdocs.comparison.slides.contracts.comparison.ComparisonAutoShapeBase;
import com.groupdocs.comparison.slides.contracts.comparison.ComparisonParagraphBase;
import com.groupdocs.comparison.slides.contracts.comparison.ComparisonPresentationBase;
import com.groupdocs.comparison.slides.contracts.comparison.ComparisonSlideBase;
import com.groupdocs.comparison.slides.contracts.enums.ComparisonSaveFormat;
import com.groupdocs.comparison.slides.contracts.enums.ComparisonShapeType;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 *
 * author Сергей
 */
public class CompareSlides {

    public void CompareSlidesFromDifferentPresentations() throws FileNotFoundException, Exception {
        String sourcePath = "slides/components/data/CompareSlidesFromDifferentPresentations/old.pptx";
        String targetPath = "slides/components/data/CompareSlidesFromDifferentPresentations/new.pptx";

        // Create to streams of presentations
        InputStream sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourcePath);
        InputStream targetStream = this.getClass().getClassLoader().getResourceAsStream(targetPath);

        // Opening two presentations
        ComparisonPresentationBase sourcePresentation = new ComparisonPresentation(sourceStream);
        System.out.println("Presentation with source path: " + sourcePath + " was loaded.");
        ComparisonPresentationBase targetPresentation = new ComparisonPresentation(targetStream);
        System.out.println("Presentation with source path: " + targetPath + " was loaded.");

        // Getting first slide from source presentation
        ComparisonSlideBase sourceSlide = sourcePresentation.getSlides().get_Item(0);
        // Getting second slide from target presentation
        ComparisonSlideBase targetSlide = targetPresentation.getSlides().get_Item(0);

        // Creating settings for comparison of slides
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        // Comparing slides
        ISlidesCompareResult compareResult = sourceSlide.compareWith(targetSlide, SlidesComparisonSettings);
        System.out.println("Slides was compared.");

        // Saving result of comparison to new presentation
        String resultPath = "src/main/resources/slides/components/testresult/CompareSlidesFromDifferentPresentations/result.pptx";
        ComparisonPresentationBase result = compareResult.getPresentation();
        //InputStream resultStream = new FileInputStream(resultPath);
        result.save(resultPath, ComparisonSaveFormat.Pptx);
        //resultStream.close();
        System.out.println("Result of comparison was saved to presentation with the folloving source path"
                + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }

    public void CompareSlidesFromOnePresentations() throws Exception {
        String sourcePath = "slides/components/data/CompareSlidesFromOnePresentations/old.pptx";

        // Create to stream of presentation
        InputStream sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourcePath);

        // Opening source presentation
        ComparisonPresentationBase sourcePresentation = new ComparisonPresentation(sourceStream);
        System.out.println("Presentation with source path: " + sourcePath + " was loaded.");

        // Getting first slide from source presentation
        ComparisonSlideBase sourceSlide = sourcePresentation.getSlides().get_Item(0);
        // Getting second slide from source presentation
        ComparisonSlideBase targetSlide = sourcePresentation.getSlides().get_Item(1);

        // Creating settings for comparison of slides
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        // Comparing slides
        ISlidesCompareResult compareResult = sourceSlide.compareWith(targetSlide, SlidesComparisonSettings);
        System.out.println("Slides was compared.");

        // Saving result of comparison to new presentation
        String resultPath = "src/main/resources/slides/components/testresult/CompareSlidesFromOnePresentations/result.pptx";
        ComparisonPresentationBase result = compareResult.getPresentation();
        //InputStream resultStream = new FileInputStream(resultPath);
        result.save(resultPath, ComparisonSaveFormat.Pptx);
        //resultStream.close();
        System.out.println("Result of comparison was saved to presentation with the folloving source path"
                + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }

    public void CompareSlideFromPresentationsWithCreatingSlide() throws Exception {
        String sourcePath
                = "slides/components/data/CompareSlideFromPresentationsWithCreatingSlide/old.pptx";

        // Create to stream of presentation
        InputStream sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourcePath);

        // Opening two presentations
        ComparisonPresentationBase sourcePresentation = new ComparisonPresentation(sourceStream);
        System.out.println("Presentation with source path: " + sourcePath + " was loaded.");

        // Getting first slide from source presentation
        ComparisonSlideBase sourceSlide = sourcePresentation.getSlides().get_Item(0);
        // Creating Slide
        ComparisonSlideBase targetSlide = new ComparisonSlide();
        ComparisonAutoShapeBase autoShape = targetSlide.getShapes().addAutoShape(ComparisonShapeType.Rectangle, 100, 100, 500, 300);
        ComparisonParagraphBase paragraph = new ComparisonParagraph();
        paragraph.setText("Contrary to popular belief, Lorem Ipsum is not simply random text. It has"
                + " roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard "
                + "McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure");
        autoShape.getTextFrame().getParagraphs().add(paragraph);
        System.out.println("New slide was created.");

        // Creating settings for comparison of slides
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        // Comparing slides
        ISlidesCompareResult compareResult = sourceSlide.compareWith(targetSlide, SlidesComparisonSettings);
        System.out.println("Slides was compared.");

        // Saving result of comparison to new presentation
        String resultPath = "src/main/resources/slides/components/testresult/CompareSlideFromPresentationsWithCreatingSlide/result.pptx";
        ComparisonPresentationBase result = compareResult.getPresentation();
        //InputStream resultStream = new FileInputStream(resultPath);
        result.save(resultPath, ComparisonSaveFormat.Pptx);
        //resultStream.close();
        System.out.println("Result of comparison was saved to presentation with the folloving source path"
                + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }

    public void CompareTwoCreatingSlides() throws Exception {
        // Creating Slides
        ComparisonSlideBase sourceSlide = new ComparisonSlide();
        ComparisonAutoShapeBase sourceAutoShape = sourceSlide.getShapes().addAutoShape(ComparisonShapeType.Rectangle, 100, 100, 500,
                300);
        ComparisonParagraphBase sourceParagraph = new ComparisonParagraph();
        sourceParagraph.setText("Contrary to popular belief, Lorem Ipsum is not simply random text. It has"
                + " roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard "
                + "McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure");
        sourceAutoShape.getTextFrame().getParagraphs().add(sourceParagraph);
        System.out.println("New slide was created.");

        ComparisonSlideBase targetSlide = new ComparisonSlide();
        ComparisonAutoShapeBase targetAutoShape = targetSlide.getShapes().addAutoShape(ComparisonShapeType.Rectangle, 100, 100, 500,
                300);
        ComparisonParagraphBase targetParagraph = new ComparisonParagraph();
        targetParagraph.setText("Contrary to popular belief, the Lorem Ipsum is not simply random text. Richard "
                + "McClintock, a Latin professor at Hampden-Sydney in Virginia, looked up one of the more obscure");
        targetAutoShape.getTextFrame().getParagraphs().add(targetParagraph);
        System.out.println("New slide was created.");

        // Creating settings for comparison of slides
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        // Comparing slides
        ISlidesCompareResult compareResult = sourceSlide.compareWith(targetSlide, SlidesComparisonSettings);
        System.out.println("Slides was compared.");

        // Saving result of comparison to new presentation
        String resultPath = "src/main/resources/slides/components/testresult/CompareTwoCreatingSlides/result.pptx";
        ComparisonPresentationBase result = compareResult.getPresentation();

        result.save(resultPath, ComparisonSaveFormat.Pptx);

        System.out.println("Result of comparison was saved to presentation with the folloving source path"
                + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }
}
