package com.groupdocs.comparison.sample.operations;

import com.groupdocs.comparison.cells.contracts.ICellsCompareResult;
import com.groupdocs.comparison.cells.nodes.ComparisonWorkbook;
import com.groupdocs.comparison.common.comparisonsettings.*;
import com.groupdocs.comparison.html.ComparisonHtmlDocument;
import com.groupdocs.comparison.html.contracts.IComparisonHtmlDocument;
import com.groupdocs.comparison.html.contracts.IHtmlCompareResult;
import com.groupdocs.comparison.pdf.ComparisonPdfDocument;
import com.groupdocs.comparison.pdf.contracts.comparedresult.IPdfComparedResult;
import com.groupdocs.comparison.sample.Utilities;
import com.groupdocs.comparison.slides.ComparisonAutoShape;
import com.groupdocs.comparison.slides.ComparisonPresentation;
import com.groupdocs.comparison.slides.ComparisonSlide;
import com.groupdocs.comparison.slides.contracts.ISlidesCompareResult;
import com.groupdocs.comparison.slides.contracts.comparison.*;
import com.groupdocs.comparison.slides.contracts.enums.ComparisonShapeType;
import com.groupdocs.comparison.text.ComparisonTextFile;
import com.groupdocs.comparison.text.contracts.ITextCompareResult;
import com.groupdocs.comparison.words.contracts.IWordsCompareResult;
import com.groupdocs.comparison.words.contracts.enums.ComparisonSaveFormat;
import com.groupdocs.comparison.words.contracts.nodes.*;
import com.groupdocs.comparison.words.nodes.*;
import org.apache.commons.io.IOUtils;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.groupdocs.comparison.sample.TestRunner.applyLicense;
import static com.groupdocs.comparison.sample.TestRunner.getOutputPath;
import static com.groupdocs.comparison.sample.TestRunner.getStoragePath;
import static org.junit.Assert.assertFalse;


/**
 * @author Aleksey Permyakov on 10.08.2016.
 */
@SuppressWarnings("all")
public class OptionsOperationsTests {

    @Before
    public void before() {
        applyLicense();
    }

    @Test
    public void testCompareTwoWordDocuments() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "oo_testCompareTwoWordDocuments.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Open two documents
        ComparisonDocument source = new ComparisonDocument(sourcePath);
        ComparisonDocument target = new ComparisonDocument(targetPath);

        // Call method *CompareWith()*
        IWordsCompareResult compareResult = source.compareWith(target, new WordsComparisonSettings());

        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        compareResult.getDocument().save(arrayOutputStream, ComparisonSaveFormat.Docx);
        System.out.println("Stream size: " + arrayOutputStream.toByteArray().length);
        assertFalse("Result stream is empty", arrayOutputStream.toByteArray().length == 0);
        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
    public void testCompareTwoWordParagraphs() throws Exception {
        Utilities.showTestHeader();
        final String resultName = "oo_testCompareTwoWordParagraphs.docx";

        // Creating Paragraphs
        IComparisonParagraph sourceParagraph = new ComparisonParagraph();
        sourceParagraph.addRun("This is source Paragraph.");

        IComparisonParagraph targetParagraph = new ComparisonParagraph();
        targetParagraph.addRun("This is target Paragraph.");

        // Creating settings for comparison of Paragraphs
        WordsComparisonSettings settings = new WordsComparisonSettings();
        // Comparing Paragraphs
        IWordsCompareResult compareResult = sourceParagraph.compareWith(targetParagraph, settings);

        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        compareResult.getDocument().save(arrayOutputStream, ComparisonSaveFormat.Docx);
        System.out.println("Stream size: " + arrayOutputStream.toByteArray().length);
        assertFalse("Result stream is empty", arrayOutputStream.toByteArray().length == 0);
        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
    public void testCompareTwoWordCells() throws Exception {
        Utilities.showTestHeader();
        final String resultName = "oo_testCompareTwoWordCells.docx";

        // Creating Cells
        IComparisonCell sourceCell = new ComparisonCell();
        IComparisonParagraph paragraph = sourceCell.addParagraph();
        paragraph.addRun("This is Cell of source table.");

        IComparisonCell targetCell = new ComparisonCell();
        paragraph = targetCell.addParagraph();
        paragraph.addRun("This is Cell of target table.");

        // Creating settings for comparison of Cells
        WordsComparisonSettings settings = new WordsComparisonSettings();
        // Comparing Cells
        IWordsCompareResult compareResult = sourceCell.compareWith(targetCell, settings);

        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        compareResult.getDocument().save(arrayOutputStream, ComparisonSaveFormat.Docx);
        System.out.println("Stream size: " + arrayOutputStream.toByteArray().length);
        assertFalse("Result stream is empty", arrayOutputStream.toByteArray().length == 0);
        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
    public void testCompareTwoWordColumns() throws Exception {
        Utilities.showTestHeader();
        final String resultName = "oo_testCompareTwoWordColumns.docx";

        // Creating Columns
        IComparisonColumn sourceColumn = new ComparisonColumn(100, new double[]{20, 20});
        IComparisonParagraph paragraph = sourceColumn.getCells()[0].addParagraph();
        paragraph.addRun("This is cell.");
        paragraph = sourceColumn.getCells()[1].addParagraph();
        paragraph.addRun("This is Cell of source table.");

        IComparisonColumn targetColumn = new ComparisonColumn(100, new double[]{20, 20});
        paragraph = targetColumn.getCells()[0].addParagraph();
        paragraph.addRun("This is cell.");
        paragraph = targetColumn.getCells()[1].addParagraph();
        paragraph.addRun("This is Cell of target table.");

        // Creating settings for comparison of Columns
        WordsComparisonSettings settings = new WordsComparisonSettings();
        // Comparing Columns
        IWordsCompareResult compareResult = sourceColumn.compareWith(targetColumn, settings);

        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        compareResult.getDocument().save(arrayOutputStream, ComparisonSaveFormat.Docx);
        System.out.println("Stream size: " + arrayOutputStream.toByteArray().length);
        assertFalse("Result stream is empty", arrayOutputStream.toByteArray().length == 0);
        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
    public void testCompareTwoWordRows() throws Exception {
        Utilities.showTestHeader();
        final String resultName = "oo_testCompareTwoWordRows.docx";

        // Creating Rows
        IComparisonRow sourceRow = new ComparisonRow(new double[]{100, 100}, 20);
        IComparisonParagraph paragraph = sourceRow.getCells()[0].addParagraph();
        paragraph.addRun("This is cell.");
        paragraph = sourceRow.getCells()[1].addParagraph();
        paragraph.addRun("This is Cell of source table.");

        IComparisonRow targetRow = new ComparisonRow(new double[]{100, 100}, 20);
        paragraph = targetRow.getCells()[0].addParagraph();
        paragraph.addRun("This is cell.");
        paragraph = targetRow.getCells()[1].addParagraph();
        paragraph.addRun("This is Cell of target table.");

        // Creating settings for comparison of Rows
        WordsComparisonSettings settings = new WordsComparisonSettings();
        // Comparing Rows
        IWordsCompareResult compareResult = sourceRow.compareWith(targetRow, settings);

        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        compareResult.getDocument().save(arrayOutputStream, ComparisonSaveFormat.Docx);
        System.out.println("Stream size: " + arrayOutputStream.toByteArray().length);
        assertFalse("Result stream is empty", arrayOutputStream.toByteArray().length == 0);
        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
    public void testCompareTwoWordTables() throws Exception {
        Utilities.showTestHeader();
        final String resultName = "oo_testCompareTwoWordTables.docx";

        // Creating Tables
        IComparisonTable sourceTable = new ComparisonTable(new double[]{100, 100}, new double[]{20, 20});
        IComparisonParagraph paragraph = sourceTable.getRows()[0].getCells()[0].addParagraph();
        paragraph.addRun("This is cell.");
        paragraph = sourceTable.getRows()[0].getCells()[1].addParagraph();
        paragraph.addRun("This is Cell of source table.");
        paragraph = sourceTable.getRows()[1].getCells()[0].addParagraph();
        paragraph.addRun("This is Cel of tble.");

        IComparisonTable targetTable = new ComparisonTable(new double[]{100, 100}, new double[]{20, 20});
        paragraph = targetTable.getRows()[0].getCells()[0].addParagraph();
        paragraph.addRun("This is cell.");
        paragraph = targetTable.getRows()[0].getCells()[1].addParagraph();
        paragraph.addRun("This is Cell of target table.");
        paragraph = targetTable.getRows()[1].getCells()[0].addParagraph();
        paragraph.addRun("This is Cell of table.");

        // Creating settings for comparison of Tables
        WordsComparisonSettings settings = new WordsComparisonSettings();
        // Comparing Tables
        IWordsCompareResult compareResult = sourceTable.compareWith(targetTable, settings);

        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        compareResult.getDocument().save(arrayOutputStream, ComparisonSaveFormat.Docx);
        System.out.println("Stream size: " + arrayOutputStream.toByteArray().length);
        assertFalse("Result stream is empty", arrayOutputStream.toByteArray().length == 0);
        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
    public void testCompareTwoWorkbookDocuments() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.xlsx", targetName = "target.xlsx", resultName = "oo_testCompareTwoWorkbookDocuments.xlsx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Open two workbooks
        ComparisonWorkbook source = new ComparisonWorkbook(sourcePath);
        ComparisonWorkbook target = new ComparisonWorkbook(targetPath);

        // Call method CompareWith.
        ICellsCompareResult result = source.compareWith(target, new CellsComparisonSettings());

        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        result.getWorkbook().save(arrayOutputStream, com.groupdocs.comparison.cells.contracts.enums.ComparisonSaveFormat.Xlsx);
        System.out.println("Stream size: " + arrayOutputStream.toByteArray().length);
        assertFalse("Result stream is empty", arrayOutputStream.toByteArray().length == 0);
        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
    public void testCompareTwoWorkbookWorksheets() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.xlsx", targetName = "target.xlsx", resultName = "oo_testCompareTwoWorkbookWorksheets.xlsx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Open two workbooks
        ComparisonWorkbook source = new ComparisonWorkbook(sourcePath);
        ComparisonWorkbook target = new ComparisonWorkbook(targetPath);

        // Compare worksheets
        CellsComparisonSettings settings = new CellsComparisonSettings();
        ICellsCompareResult result = source.getWorksheets()[1].compareWith(target.getWorksheets()[1], settings);

        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        result.getWorkbook().save(arrayOutputStream, com.groupdocs.comparison.cells.contracts.enums.ComparisonSaveFormat.Xlsx);
        System.out.println("Stream size: " + arrayOutputStream.toByteArray().length);
        assertFalse("Result stream is empty", arrayOutputStream.toByteArray().length == 0);
        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath(resultName)));
    }

    @Test // TODO: 29.05.2017 Bug?
    public void testCompareTwoWorkbookCells() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.xlsx", targetName = "target.xlsx", resultName = "oo_testCompareTwoWorkbookCells.xlsx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Open two workbooks
        ComparisonWorkbook source = new ComparisonWorkbook(sourcePath);
        ComparisonWorkbook target = new ComparisonWorkbook(targetPath);

        // Compare cells
        CellsComparisonSettings settings = new CellsComparisonSettings();
        final ICellsCompareResult result = source.getWorksheets()[0].getCellRange().getItem("A6").compareWith(target.getWorksheets()[0].getCellRange().getItem("A6"), settings);

        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        result.getWorkbook().save(arrayOutputStream, com.groupdocs.comparison.cells.contracts.enums.ComparisonSaveFormat.Xlsx);
        System.out.println("Stream size: " + arrayOutputStream.toByteArray().length);
        assertFalse("Result stream is empty", arrayOutputStream.toByteArray().length == 0);
        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
    public void testCompareTwoPdfDocuments() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pdf", targetName = "target.pdf", resultName = "oo_testCompareTwoPdfDocuments.pdf";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Open two documents
        ComparisonPdfDocument source = new ComparisonPdfDocument(sourcePath);
        ComparisonPdfDocument target = new ComparisonPdfDocument(targetPath);

        // Call method CompareWith.
        IPdfComparedResult result = source.compareWith(target, new PdfComparisonSettings());

        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        result.saveTo(arrayOutputStream);
        System.out.println("Stream size: " + arrayOutputStream.toByteArray().length);
        assertFalse("Result stream is empty", arrayOutputStream.toByteArray().length == 0);
        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
    public void testCompareTwoPresentationDocuments() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pptx", targetName = "target.pptx", resultName = "oo_testCompareTwoPresentationDocuments.pdf";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Open two presentations
        ComparisonPresentation source = new ComparisonPresentation(sourcePath);
        ComparisonPresentation target = new ComparisonPresentation(targetPath);

        // Call method CompareWith.
        ISlidesCompareResult result = source.compareWith(target, new SlidesComparisonSettings());

        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        result.getPresentation(true).save(arrayOutputStream, com.groupdocs.comparison.slides.contracts.enums.ComparisonSaveFormat.Pdf);
        System.out.println("Stream size: " + arrayOutputStream.toByteArray().length);
        assertFalse("Result stream is empty", arrayOutputStream.toByteArray().length == 0);
        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
    public void testCompareTwoPresentationAutoShapes2() throws Exception {
        Utilities.showTestHeader();
        final String resultName = "oo_testCompareTwoPresentationAutoShapes2.pptx";

        // Creating AutoShapes
        ComparisonAutoShapeBase sourceAutoShape = new ComparisonAutoShape(100, 100, 500, 300);
        ComparisonParagraphBase sourceParagraph = new com.groupdocs.comparison.slides.ComparisonParagraph();
        sourceParagraph.setText("This is source AutoShape.");
        sourceAutoShape.addTextFrame("");
        sourceAutoShape.getTextFrame().getParagraphs().add(sourceParagraph);

        ComparisonAutoShapeBase targetAutoShape = new ComparisonAutoShape(100, 100, 500, 300);
        ComparisonParagraphBase targetParagraph = new com.groupdocs.comparison.slides.ComparisonParagraph();
        targetParagraph.setText("This is target AutoShape.");
        targetAutoShape.addTextFrame("");
        targetAutoShape.getTextFrame().getParagraphs().add(targetParagraph);

        // Creating settings for comparison of AutoShapes
        SlidesComparisonSettings settings = new SlidesComparisonSettings();
        // Comparing AutoShapes
        ISlidesCompareResult compareResult = sourceAutoShape.compareWith(targetAutoShape, settings);

        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        compareResult.getPresentation(true).save(arrayOutputStream, com.groupdocs.comparison.slides.contracts.enums.ComparisonSaveFormat.Pptx);
        System.out.println("Stream size: " + arrayOutputStream.toByteArray().length);
        assertFalse("Result stream is empty", arrayOutputStream.toByteArray().length == 0);
        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
    public void testCompareTwoPresentationParagraphs() throws Exception {
        Utilities.showTestHeader();
        final String resultName = "oo_testCompareTwoPresentationParagraphs.pptx";

        // Creating Paragraphs
        ComparisonParagraphBase sourceParagraph = new com.groupdocs.comparison.slides.ComparisonParagraph();
        sourceParagraph.setText("This is source Paragraph.");

        ComparisonParagraphBase targetParagraph = new com.groupdocs.comparison.slides.ComparisonParagraph();
        targetParagraph.setText("This is target Paragraph.");

        // Creating settings for comparison of Paragraphs
        SlidesComparisonSettings settings = new SlidesComparisonSettings();
        // Comparing Paragraphs
        ISlidesCompareResult compareResult = sourceParagraph.compareWith(targetParagraph, settings);

        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        compareResult.getPresentation(true).save(arrayOutputStream, com.groupdocs.comparison.slides.contracts.enums.ComparisonSaveFormat.Pptx);
        System.out.println("Stream size: " + arrayOutputStream.toByteArray().length);
        assertFalse("Result stream is empty", arrayOutputStream.toByteArray().length == 0);
        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath(resultName)));
    }

    @Test // TODO: 22.05.2017 Specified argument was out of the range of valid values
    @Ignore
    public void testCompareTwoPresentationCells() throws Exception {
        Utilities.showTestHeader();
        final String resultName = "oo_testCompareTwoPresentationCells.pptx";

        // Creating cells
        ComparisonCellBase sourceCell = new com.groupdocs.comparison.slides.ComparisonCell(200, 50, 0, 0);
        ComparisonParagraphBase sourceParagraph = new com.groupdocs.comparison.slides.ComparisonParagraph();
        sourceCell.getTextFrame().getParagraphs().remove(sourceCell.getTextFrame().getParagraphs().get(0));
        sourceParagraph.setText("This is source cell.");
        sourceCell.getTextFrame().getParagraphs().add(sourceParagraph);

        ComparisonCellBase targetCell = new com.groupdocs.comparison.slides.ComparisonCell(200, 50, 0, 0);
        ComparisonParagraphBase targetParagraph = new com.groupdocs.comparison.slides.ComparisonParagraph();
        targetCell.getTextFrame().getParagraphs().remove(targetCell.getTextFrame().getParagraphs().get(0));
        targetParagraph.setText("This is target cell.");
        targetCell.getTextFrame().getParagraphs().add(targetParagraph);

        // Creating settings for comparison of cells
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        // Comparing cells
        ISlidesCompareResult compareResult = sourceCell.compareWith(targetCell, SlidesComparisonSettings);

        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        compareResult.getPresentation(true).save(arrayOutputStream, com.groupdocs.comparison.slides.contracts.enums.ComparisonSaveFormat.Pdf);
        System.out.println("Stream size: " + arrayOutputStream.toByteArray().length);
        assertFalse("Result stream is empty", arrayOutputStream.toByteArray().length == 0);
        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
    public void testCompareTwoPresentationColumns() throws Exception {
        Utilities.showTestHeader();
        final String resultName = "oo_testCompareTwoPresentationColumns.pptx";

        // Creating Columns
        ComparisonColumnBase sourceColumn = new com.groupdocs.comparison.slides.ComparisonColumn(new double[]{50, 50}, 200);
        ComparisonParagraphBase sourceParagraph0 = new com.groupdocs.comparison.slides.ComparisonParagraph();
        sourceParagraph0.setText("This is first cell in source Column.");
        sourceColumn.getItem(0).getTextFrame().getParagraphs().add(sourceParagraph0);
        ComparisonParagraphBase sourceParagraph1 = new com.groupdocs.comparison.slides.ComparisonParagraph();
        sourceParagraph1.setText("This is second cell in source Column.");
        sourceColumn.getItem(1).getTextFrame().getParagraphs().add(sourceParagraph1);

        ComparisonColumnBase targetColumn = new com.groupdocs.comparison.slides.ComparisonColumn(new double[]{50, 50}, 200);
        ComparisonParagraphBase targetParagraph0 = new com.groupdocs.comparison.slides.ComparisonParagraph();
        targetParagraph0.setText("This is first cell in target Column.");
        targetColumn.getItem(0).getTextFrame().getParagraphs().add(targetParagraph0);
        ComparisonParagraphBase targetParagraph1 = new com.groupdocs.comparison.slides.ComparisonParagraph();
        targetParagraph1.setText("This is second cell in target Column.");
        targetColumn.getItem(1).getTextFrame().getParagraphs().add(targetParagraph1);

        // Creating settings for comparison of Columns
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        // Comparing Columns
        ISlidesCompareResult compareResult = sourceColumn.compareWith(targetColumn, SlidesComparisonSettings);

        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        compareResult.getPresentation(true).save(arrayOutputStream, com.groupdocs.comparison.slides.contracts.enums.ComparisonSaveFormat.Pptx);
        System.out.println("Stream size: " + arrayOutputStream.toByteArray().length);
        assertFalse("Result stream is empty", arrayOutputStream.toByteArray().length == 0);
        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
    public void testCompareTwoPresentationRows() throws Exception {
        Utilities.showTestHeader();
        final String resultName = "oo_testCompareTwoPresentationRows.pptx";

        // Creating Rows
        ComparisonRowBase sourceRow = new com.groupdocs.comparison.slides.ComparisonRow(new double[]{200, 200}, 50);
        ComparisonParagraphBase sourceParagraph0 = new com.groupdocs.comparison.slides.ComparisonParagraph();
        sourceParagraph0.setText("This is first cell in source Row.");
        sourceRow.getItem(0).getTextFrame().getParagraphs().add(sourceParagraph0);
        ComparisonParagraphBase sourceParagraph1 = new com.groupdocs.comparison.slides.ComparisonParagraph();
        sourceParagraph1.setText("This is second cell in source Row.");
        sourceRow.getItem(1).getTextFrame().getParagraphs().add(sourceParagraph1);

        ComparisonRowBase targetRow = new com.groupdocs.comparison.slides.ComparisonRow(new double[]{200, 200}, 50);
        ComparisonParagraphBase targetParagraph0 = new com.groupdocs.comparison.slides.ComparisonParagraph();
        targetParagraph0.setText("This is first cell in target Row.");
        targetRow.getItem(0).getTextFrame().getParagraphs().add(targetParagraph0);
        ComparisonParagraphBase targetParagraph1 = new com.groupdocs.comparison.slides.ComparisonParagraph();
        targetParagraph1.setText("This is second cell in target Row.");
        targetRow.getItem(1).getTextFrame().getParagraphs().add(targetParagraph1);

        // Creating settings for comparison of Rows
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        // Comparing Rows
        ISlidesCompareResult compareResult = sourceRow.compareWith(targetRow, SlidesComparisonSettings);

        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        compareResult.getPresentation(true).save(arrayOutputStream, com.groupdocs.comparison.slides.contracts.enums.ComparisonSaveFormat.Pptx);
        System.out.println("Stream size: " + arrayOutputStream.toByteArray().length);
        assertFalse("Result stream is empty", arrayOutputStream.toByteArray().length == 0);
        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
    public void testCompareTwoTextDocuments() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.txt", targetName = "target.txt", resultName = "oo_testCompareTwoTextDocuments.txt";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Open two textFiles
        ComparisonTextFile source = new ComparisonTextFile(sourcePath);
        ComparisonTextFile target = new ComparisonTextFile(targetPath);

        // Call method CompareWith.
        ITextCompareResult result = source.compareWith(target, new TextComparisonSettings());

        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        result.getTextFile().save(arrayOutputStream);
        System.out.println("Stream size: " + arrayOutputStream.toByteArray().length);
        assertFalse("Result stream is empty", arrayOutputStream.toByteArray().length == 0);
        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
    public void testCompareTwoHtmlDocuments() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.html", targetName = "target.html", resultName = "oo_testCompareTwoHtmlDocuments.html";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Open two htmlFiels
        IComparisonHtmlDocument source = new ComparisonHtmlDocument(sourcePath);
        IComparisonHtmlDocument target = new ComparisonHtmlDocument(targetPath);

        // Call method CompareWith()
        IHtmlCompareResult result = source.compareWith(target, new HtmlComparisonSettings());

        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        result.getDocument().save(arrayOutputStream);
        System.out.println("Stream size: " + arrayOutputStream.toByteArray().length);
        assertFalse("Result stream is empty", arrayOutputStream.toByteArray().length == 0);
        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
    public void testCompareTwoObjects() throws Exception {
        Utilities.showTestHeader();
        final String resultName = "oo_testCompareTwoObjects.docx";
        //Create new document
        IComparisonDocument sourceDoc = new ComparisonDocument();
        IComparisonTable sourceTable = new ComparisonTable(new double[]{100}, new double[]{20, 20});
        IComparisonParagraph paragraph = new ComparisonParagraph();
        paragraph.addRun("This is cell.");
        sourceTable.getColumns()[0].getCells()[0].appendChild(paragraph);
        paragraph = new ComparisonParagraph();
        paragraph.addRun("This is Cell of source table.");
        sourceTable.getColumns()[0].getCells()[1].appendChild(paragraph);
        sourceDoc.getSections()[0].getBody().appendChild(sourceTable);

        IComparisonDocument targetDoc = new ComparisonDocument();
        IComparisonTable targetTable = new ComparisonTable(new double[]{100}, new double[]{20, 20});
        paragraph = new ComparisonParagraph();
        paragraph.addRun("This is cell.");
        targetTable.getColumns()[0].getCells()[0].appendChild(paragraph);
        paragraph = new ComparisonParagraph();
        paragraph.addRun("This is Cell of target table.");
        targetTable.getColumns()[0].getCells()[1].appendChild(paragraph);
        targetDoc.getSections()[0].getBody().appendChild(targetTable);

        WordsComparisonSettings settings = new WordsComparisonSettings();

        IWordsCompareResult compareResult = sourceDoc.compareWith(targetDoc, settings);

        //Get document from compare result and save document
        final String outFile = getOutputPath(resultName);
        compareResult.getDocument().save(outFile, ComparisonSaveFormat.Docx);
        System.out.println("Stream size: " + new File(outFile).length());
        assertFalse("Result stream is empty", new File(outFile).length() == 0);
    }

    @Test
    public void testCompareSourceDocumentWithTwoTargetDocuments() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "multi-source.docx", target1Name = "multi-target1.docx", target2Name = "multi-target2.docx", resultName = "oo_testCompareSourceDocumentWithTwoTargetDocuments.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String target1Path = getStoragePath(target1Name);
        final String target2Path = getStoragePath(target2Name);

        // Create list of targets documents
        List<IComparisonDocument> ListOfTargetDocuments = new ArrayList<IComparisonDocument>();

        // Open documents
        ComparisonDocument source = new ComparisonDocument(sourcePath);
        ComparisonDocument target1 = new ComparisonDocument(target1Path);
        ComparisonDocument target2 = new ComparisonDocument(target2Path);

        // Add target documents in list
        ListOfTargetDocuments.add(target1);
        ListOfTargetDocuments.add(target2);

        // Call method MultiCompareWith.
        IWordsCompareResult result = source.multiCompareWith(ListOfTargetDocuments, new WordsComparisonSettings());

        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        result.getDocument().save(arrayOutputStream, ComparisonSaveFormat.Docx);
        System.out.println("Stream size: " + arrayOutputStream.toByteArray().length);
        assertFalse("Result stream is empty", arrayOutputStream.toByteArray().length == 0);
        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath(resultName)));
    }

    @Test
    public void testCompareSourceDocumentWithThreeTargetDocuments() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "multi-source.docx", target1Name = "multi-target1.docx", target2Name = "multi-target2.docx", target3Name = "multi-target3.docx", resultName = "oo_testCompareSourceDocumentWithThreeTargetDocuments.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String target1Path = getStoragePath(target1Name);
        final String target2Path = getStoragePath(target2Name);
        final String target3Path = getStoragePath(target3Name);

        // Create list of targets documents
        List<IComparisonDocument> ListOfTargetDocuments = new ArrayList<IComparisonDocument>();

        // Open documents
        ComparisonDocument source = new ComparisonDocument(sourcePath);
        ComparisonDocument target1 = new ComparisonDocument(target1Path);
        ComparisonDocument target2 = new ComparisonDocument(target2Path);
        ComparisonDocument target3 = new ComparisonDocument(target3Path);

        // Add target documents in list
        ListOfTargetDocuments.add(target1);
        ListOfTargetDocuments.add(target2);
        ListOfTargetDocuments.add(target3);

        // Call method MultiCompareWith.
        IWordsCompareResult result = source.multiCompareWith(ListOfTargetDocuments, new WordsComparisonSettings());

        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        result.getDocument().save(arrayOutputStream, ComparisonSaveFormat.Docx);
        System.out.println("Stream size: " + arrayOutputStream.toByteArray().length);
        assertFalse("Result stream is empty", arrayOutputStream.toByteArray().length == 0);
        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath(resultName)));
    }
}
