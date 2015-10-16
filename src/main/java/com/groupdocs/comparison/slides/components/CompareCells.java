/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groupdocs.comparison.slides.components;

import static com.aspose.ms.System.Net.Sockets.SocketType.Stream;
import com.groupdocs.comparison.common.comparisonsettings.SlidesComparisonSettings;
import com.groupdocs.comparison.slides.ComparisonCell;
import com.groupdocs.comparison.slides.ComparisonParagraph;
import com.groupdocs.comparison.slides.ComparisonPresentation;
import com.groupdocs.comparison.slides.contracts.ISlidesCompareResult;
import com.groupdocs.comparison.slides.contracts.comparison.ComparisonCellBase;
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
public class CompareCells {

    public void CompareCellsFromDifferentPresentations() throws Exception {
        String sourcePath
                = "slides/components/data/CompareCellsFromDifferentPresentations/old.pptx";
        String targetPath
                = "slides/components/data/CompareCellsFromDifferentPresentations/new.pptx";

        // Create to streams of presentations
        InputStream sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourcePath);
        InputStream targetStream = this.getClass().getClassLoader().getResourceAsStream(targetPath);

        // Opening two presentations
        ComparisonPresentationBase sourcePresentation = new ComparisonPresentation(sourceStream);
        System.out.println("Presentation with source path: " + sourcePath + " was loaded.");
        ComparisonPresentationBase targetPresentation = new ComparisonPresentation(targetStream);
        System.out.println("Presentation with source path: " + targetPath + " was loaded.");

        // Getting first cell from source presentation
        ComparisonCellBase sourceCell = ((ComparisonTableBase) sourcePresentation.getSlides().get_Item(0).getShapes().get_Item(0)).get_Item(0, 0);
        // Getting first cell from target presentation
        ComparisonCellBase targetCell = ((ComparisonTableBase) targetPresentation.getSlides().get_Item(0).getShapes().get_Item(0)).get_Item(0, 0);

        // Creating settings for comparison of cells
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        // Comparing cells
        ISlidesCompareResult compareResult = sourceCell.compareWith(targetCell, SlidesComparisonSettings);
        System.out.println("Cells was compared.");

        // Saving result of comparison to new presentation
        String resultPath = "src/main/resources/slides/components/testresult/CompareCellsFromDifferentPresentations/result.pptx";
        ComparisonPresentationBase result = compareResult.getPresentation();

        result.save(resultPath, ComparisonSaveFormat.Pptx);

        System.out.println("Result of comparison was saved to presentation with the folloving source path"
                + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }

    public void CompareCellsFromOnePresentations() throws Exception {
        String sourcePath = "slides/components/data/CompareCellsFromOnePresentations/old.pptx";

        // Create to stream of presentation
        InputStream sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourcePath);

        // Opening source presentation
        ComparisonPresentationBase sourcePresentation = new ComparisonPresentation(sourceStream);
        System.out.println("Presentation with source path: " + sourcePath + " was loaded.");

        // Getting first cell from source presentation
        ComparisonCellBase sourceCell = ((ComparisonTableBase) sourcePresentation.getSlides().get_Item(0).getShapes().get_Item(0)).get_Item(0, 0);
        // Getting last cell from source presentation
        ComparisonCellBase targetCell = ((ComparisonTableBase) sourcePresentation.getSlides().get_Item(0).getShapes().get_Item(0)).get_Item(2, 1);

        // Creating settings for comparison of cells
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        // Comparing cells
        ISlidesCompareResult compareResult = sourceCell.compareWith(targetCell, SlidesComparisonSettings);
        System.out.println("Cells was compared.");

        // Saving result of comparison to new presentation
        String resultPath = "src/main/resources/slides/components/testresult/CompareCellsFromOnePresentations/result.pptx";
        ComparisonPresentationBase result = compareResult.getPresentation();

        result.save(resultPath, ComparisonSaveFormat.Pptx);

        System.out.println("Result of comparison was saved to presentation with the folloving source path"
                + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }

    public void CompareCellFromPresentationsWithCreatingCell() throws Exception {
        String sourcePath
                = "slides/components/data/CompareCellFromPresentationsWithCreatingCell/old.pptx";

        // Create to stream of presentation
        InputStream sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourcePath);

        // Opening source presentation
        ComparisonPresentationBase sourcePresentation = new ComparisonPresentation(sourceStream);
        System.out.println("Presentation with source path: " + sourcePath + " was loaded.");

        // Getting first cell from source presentation
        ComparisonCellBase sourceCell = ((ComparisonTableBase) sourcePresentation.getSlides().get_Item(0).getShapes().get_Item(0)).get_Item(0, 0);
        // Creating Cell
        ComparisonCellBase targetCell = new ComparisonCell(200, 50, 0, 0);
        ComparisonParagraphBase paragraph = new ComparisonParagraph();
        paragraph.setText("This cell was created.");
        targetCell.getTextFrame().getParagraphs().remove(targetCell.getTextFrame().getParagraphs().get_Item(0));
        targetCell.getTextFrame().getParagraphs().add(paragraph);
        System.out.println("New cell was created.");

        // Creating settings for comparison of cells
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        // Comparing cells
        ISlidesCompareResult compareResult = sourceCell.compareWith(targetCell, SlidesComparisonSettings);
        System.out.println("Cells was compared.");

        // Saving result of comparison to new presentation
        String resultPath = "src/main/resources/slides/components/testresult/CompareCellFromPresentationsWithCreatingCell/result.pptx";
        ComparisonPresentationBase result = compareResult.getPresentation();

        result.save(resultPath, ComparisonSaveFormat.Pptx);

        System.out.println("Result of comparison was saved to presentation with the folloving source path"
                + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }

    public void CompareTwoCreatingCells() throws Exception {
        // Creating cells
        ComparisonCellBase sourceCell = new ComparisonCell(200, 50, 0, 0);
        ComparisonParagraphBase sourceParagraph = new ComparisonParagraph();
        sourceCell.getTextFrame().getParagraphs().remove(sourceCell.getTextFrame().getParagraphs().get_Item(0));
        sourceParagraph.setText("This is source cell.");
        sourceCell.getTextFrame().getParagraphs().add(sourceParagraph);
        System.out.println("New cell was created.");

        ComparisonCellBase targetCell = new ComparisonCell(200, 50, 0, 0);
        ComparisonParagraphBase targetParagraph = new ComparisonParagraph();
        targetCell.getTextFrame().getParagraphs().remove(targetCell.getTextFrame().getParagraphs().get_Item(0));
        targetParagraph.setText("This is target cell.");
        targetCell.getTextFrame().getParagraphs().add(targetParagraph);
        System.out.println("New cell was created.");

        // Creating settings for comparison of cells
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        // Comparing cells
        ISlidesCompareResult compareResult = sourceCell.compareWith(targetCell, SlidesComparisonSettings);
        System.out.println("Cells was compared.");

        // Saving result of comparison to new presentation
        String resultPath = "src/main/resources/slides/components/testresult/CompareTwoCreatingCells/result.pptx";
        ComparisonPresentationBase result = compareResult.getPresentation();

        result.save(resultPath, ComparisonSaveFormat.Pptx);

        System.out.println("Result of comparison was saved to presentation with the folloving source path"
                + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }
}
