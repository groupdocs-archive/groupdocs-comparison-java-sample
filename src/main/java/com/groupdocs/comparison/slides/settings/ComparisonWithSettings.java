/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groupdocs.comparison.slides.settings;

import com.groupdocs.comparison.common.comparisonsettings.ComparisonDepth;
import com.groupdocs.comparison.common.comparisonsettings.SlidesComparisonSettings;
import com.groupdocs.comparison.slides.ComparisonPresentation;
import com.groupdocs.comparison.slides.contracts.ISlidesCompareResult;
import com.groupdocs.comparison.slides.contracts.comparison.ComparisonPresentationBase;
import com.groupdocs.comparison.slides.contracts.enums.ComparisonSaveFormat;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 *
 * @author Сергей
 */
public class ComparisonWithSettings {

    public  void ComparePresentationsWithGenerationSummaryPage() throws Exception {
        String resultPath = "src/main/resources/slides/settings/testresult/WithGenerationSummaryPage/result.pptx";
        // Creating settings for comparison of presentations
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        SlidesComparisonSettings.setGenerateSummaryPage(true);
        Compare(resultPath, SlidesComparisonSettings);
    }

    public  void ComparePresentationsWithOutGenerationSummaryPage() throws Exception {
        String resultPath = "src/main/resources/slides/settings/testresult/WithOutGenerationSummaryPage/result.pptx";
        // Creating settings for comparison of presentations
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        SlidesComparisonSettings.setGenerateSummaryPage(true);
        Compare(resultPath, SlidesComparisonSettings);
    }

    public  void ComparePresentationsWithShowDeletedContent() throws Exception {
        String resultPath = "src/main/resources/slides/settings/testresult/WithShowDeletedContent/result.pptx";
        // Creating settings for comparison of presentations
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        SlidesComparisonSettings.setShowDeletedContent(true);
        Compare(resultPath, SlidesComparisonSettings);
    }

    public  void ComparePresentationsWithOutShowDeletedContent() throws Exception {
        String resultPath = "src/main/resources/slides/settings/testresult/WithOutShowDeletedContent/result.pptx";
        // Creating settings for comparison of presentations
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        SlidesComparisonSettings.setShowDeletedContent(false);
        Compare(resultPath, SlidesComparisonSettings);
    }

    public  void ComparePresentationsWithComparisonDepthSetWords() throws Exception {
        String resultPath = "src/main/resources/slides/settings/testresult/WithComparisonDepthSetWords/result.pptx";
        // Creating settings for comparison of presentations
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        SlidesComparisonSettings.setComparisonDepth(ComparisonDepth.Words);
        Compare(resultPath, SlidesComparisonSettings);
    }

    public  void ComparePresentationsWithComparisonDepthSetChars() throws Exception {
        String resultPath = "src/main/resources/slides/settings/testresult/WithComparisonDepthSetChars/result.pptx";
        // Creating settings for comparison of presentations
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        SlidesComparisonSettings.setComparisonDepth(ComparisonDepth.Chars);
        Compare(resultPath, SlidesComparisonSettings);
    }

    public  void ComparePresentationsWithWordsSepCharsSetSpace() throws Exception {
        String resultPath = "src/main/resources/slides/settings/testresult/WithWordsSepCharsSetSpace/result.pptx";
        // Creating settings for comparison of presentations
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        SlidesComparisonSettings.setWordsSeparatorChars(new char[]{' '});
        Compare(resultPath, SlidesComparisonSettings);
    }

    public  void ComparePresentationsWithSettingStylesOnDelInsComponents() throws Exception {
        String resultPath = "src/main/resources/slides/settings/testresult/WithSettingStylesOnDelInsComponents/result.pptx";
        // Creating settings for comparison of presentations
        SlidesComparisonSettings settings = new SlidesComparisonSettings();
        settings.getInsertedItemsStyle().setColor(Color.BLUE);
        settings.getDeletedItemsStyle().setColor(Color.cyan);
        Compare(resultPath, settings);
    }

    private  void Compare(String resultPath, SlidesComparisonSettings SlidesComparisonSettings) throws Exception {
        String sourcePath = "slides/settings/data/source.pptx";
        String targetPath = "slides/settings/data/target.pptx";
        // Create to streams of presentations
        InputStream sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourcePath);
        InputStream targetStream = this.getClass().getClassLoader().getResourceAsStream(targetPath);
        // Opening two presentations
        ComparisonPresentationBase sourcePresentation = new ComparisonPresentation(sourceStream);
        System.out.println("Presentation with source path: " + sourcePath + " was loaded.");
        ComparisonPresentationBase targetPresentation = new ComparisonPresentation(targetStream);
        System.out.println("Presentation with source path: " + targetPath + " was loaded.");

        // Comparing presentations
        ISlidesCompareResult compareResult = sourcePresentation.compareWith(targetPresentation, SlidesComparisonSettings);
        System.out.println("Presentations was compared.");

        // Saving result of comparison to new presentation
        ComparisonPresentationBase result = compareResult.getPresentation();

        result.save(resultPath, ComparisonSaveFormat.Pptx);

        System.out.println("Result of comparison was saved to presentation with the folloving source path" + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }
}
