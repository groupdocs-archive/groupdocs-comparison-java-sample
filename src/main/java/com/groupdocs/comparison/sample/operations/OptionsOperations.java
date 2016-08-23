package com.groupdocs.comparison.sample.operations;

import com.groupdocs.comparison.cells.contracts.ICellsCompareResult;
import com.groupdocs.comparison.cells.nodes.ComparisonWorkbook;
import com.groupdocs.comparison.common.comparisonsettings.*;
import com.groupdocs.comparison.html.ComparisonHtmlDocument;
import com.groupdocs.comparison.html.contracts.IComparisonHtmlDocument;
import com.groupdocs.comparison.html.contracts.IHtmlCompareResult;
import com.groupdocs.comparison.pdf.ComparisonPdfDocument;
import com.groupdocs.comparison.pdf.contracts.comparedresult.IPdfComparedResult;
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

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static com.groupdocs.comparison.sample.Utilities.getStoragePath;

/**
 * @author Aleksey Permyakov on 10.08.2016.
 */
public class OptionsOperations {
    public static void compareTwoWordDocuments(String sourceName, String targetName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Open two documents
        ComparisonDocument source = new ComparisonDocument(sourcePath);
        ComparisonDocument target = new ComparisonDocument(targetPath);

        // Call method *CompareWith()*
        IWordsCompareResult compareResult = source.compareWith(target, new WordsComparisonSettings());

        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        compareResult.getDocument().save(arrayOutputStream, ComparisonSaveFormat.Docx);
        System.out.println(arrayOutputStream.toByteArray().length);
//        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath("test.docx")));
    }

    public static void compareTwoWordParagraphs() throws Exception {

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
        System.out.println(arrayOutputStream.toByteArray().length);
//        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath("test.docx")));
    }

    public static void compareTwoWordCells() throws Exception {

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
        System.out.println(arrayOutputStream.toByteArray().length);
//        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath("test.docx")));
    }

    public static void compareTwoWordColumns() throws Exception {

        // Creating Columns
        IComparisonColumn sourceColumn = new ComparisonColumn(100, new double[] { 20,20 });
        IComparisonParagraph paragraph = sourceColumn.getCells()[0].addParagraph();
        paragraph.addRun("This is cell.");
        paragraph = sourceColumn.getCells()[1].addParagraph();
        paragraph.addRun("This is Cell of source table.");

        IComparisonColumn targetColumn = new ComparisonColumn(100, new double[] { 20,20 });
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
        System.out.println(arrayOutputStream.toByteArray().length);
//        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath("test.docx")));
    }

    public static void compareTwoWordRows() throws Exception {

        // Creating Rows
        IComparisonRow sourceRow = new ComparisonRow(new double[] { 100, 100 }, 20);
        IComparisonParagraph paragraph = sourceRow.getCells()[0].addParagraph();
        paragraph.addRun("This is cell.");
        paragraph = sourceRow.getCells()[1].addParagraph();
        paragraph.addRun("This is Cell of source table.");

        IComparisonRow targetRow = new ComparisonRow(new double[] { 100, 100 }, 20);
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
        System.out.println(arrayOutputStream.toByteArray().length);
//        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath("test.docx")));
    }

    public static void compareTwoWordTables() throws Exception {
        
        // Creating Tables
        IComparisonTable sourceTable = new ComparisonTable(new double[]{100,100}, new double[] { 20, 20 });
        IComparisonParagraph paragraph = sourceTable.getRows()[0].getCells()[0].addParagraph();
        paragraph.addRun("This is cell.");
        paragraph = sourceTable.getRows()[0].getCells()[1].addParagraph();
        paragraph.addRun("This is Cell of source table.");
        paragraph = sourceTable.getRows()[1].getCells()[0].addParagraph();
        paragraph.addRun("This is Cel of tble.");
        
        IComparisonTable targetTable = new ComparisonTable(new double[]{100,100}, new double[] { 20, 20 });
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
        System.out.println(arrayOutputStream.toByteArray().length);
//        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath("test.docx")));
    }

    public static void compareTwoWorkbookDocuments(String sourceName, String targetName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Open two workbooks
        ComparisonWorkbook source = new ComparisonWorkbook(sourcePath);
        ComparisonWorkbook target = new ComparisonWorkbook(targetPath);

        // Call method CompareWith.
        ICellsCompareResult result = source.compareWith(target, new CellsComparisonSettings());

        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        result.getWorkbook().save(arrayOutputStream, ComparisonSaveFormat.Docx);
        System.out.println(arrayOutputStream.toByteArray().length);
//        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath("test.docx")));
    }

    public static void compareTwoWorkbookWorksheets(String sourceName, String targetName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Open two workbooks
        ComparisonWorkbook source = new ComparisonWorkbook(sourcePath);
        ComparisonWorkbook target = new ComparisonWorkbook(targetPath);

        // Compare worksheets
        CellsComparisonSettings settings = new CellsComparisonSettings();
        ICellsCompareResult result = source.getWorksheets()[1].compareWith(target.getWorksheets()[1], settings);

        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        result.getWorkbook().save(arrayOutputStream, ComparisonSaveFormat.Docx);
        System.out.println(arrayOutputStream.toByteArray().length);
//        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath("test.docx")));
    }

    public static void compareTwoWorkbookCells(String sourceName, String targetName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Open two workbooks
        ComparisonWorkbook source = new ComparisonWorkbook(sourcePath);
        ComparisonWorkbook target = new ComparisonWorkbook(targetPath);

        // Compare cells
        CellsComparisonSettings settings = new CellsComparisonSettings();
        final ICellsCompareResult result = source.getWorksheets()[0].getCellRange().get_Item("A6").compareWith(target.getWorksheets()[0].getCellRange().get_Item("A6"), settings);

        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        result.getWorkbook().save(arrayOutputStream, ComparisonSaveFormat.Docx);
        System.out.println(arrayOutputStream.toByteArray().length);
//        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath("test.docx")));
    }

    public static void compareTwoPdfDocuments(String sourceName, String targetName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Open two documents
        ComparisonPdfDocument source = new ComparisonPdfDocument(sourcePath);
        ComparisonPdfDocument target = new ComparisonPdfDocument(targetPath);

        // Call method CompareWith.
        IPdfComparedResult result = source.compareWith(target, new PdfComparisonSettings());

        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        result.saveTo(arrayOutputStream);
        System.out.println(arrayOutputStream.toByteArray().length);
//        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath("test.pdf")));
    }

    public static void compareTwoPresentationDocuments(String sourceName, String targetName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Open two presentations
        ComparisonPresentation source = new ComparisonPresentation(sourcePath);
        ComparisonPresentation target = new ComparisonPresentation(targetPath);

        // Call method CompareWith.
        ISlidesCompareResult result = source.compareWith(target, new SlidesComparisonSettings());


        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        result.getPresentation(true).save(arrayOutputStream, com.groupdocs.comparison.slides.contracts.enums.ComparisonSaveFormat.Pdf);
        System.out.println(arrayOutputStream.toByteArray().length);
//        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath("test.pdf")));
    }

    public static void compareTwoPresentationAutoShapes() {

        // Creating Slides
        ComparisonSlideBase sourceSlide = new ComparisonSlide();
        ComparisonAutoShapeBase sourceAutoShape = sourceSlide.getShapes().addAutoShape(ComparisonShapeType.Rectangle, 100, 100, 500, 300);
        ComparisonParagraphBase sourceParagraph = new com.groupdocs.comparison.slides.ComparisonParagraph();
        sourceParagraph.setText("Contrary to popular belief, Lorem Ipsum is not simply random text. It has" +
                " roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard " +
                "McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure");
        sourceAutoShape.getTextFrame().getParagraphs().add(sourceParagraph);

        ComparisonSlideBase targetSlide = new ComparisonSlide();
        ComparisonAutoShapeBase targetAutoShape = targetSlide.getShapes().addAutoShape(ComparisonShapeType.Rectangle, 100, 100, 500, 300);
        ComparisonParagraphBase targetParagraph = new com.groupdocs.comparison.slides.ComparisonParagraph();
        targetParagraph.setText("Contrary to popular belief, the Lorem Ipsum is not simply random text. Richard " +
                "McClintock, a Latin professor at Hampden-Sydney in Virginia, looked up one of the more obscure");
        targetAutoShape.getTextFrame().getParagraphs().add(targetParagraph);

        // Creating settings for comparison of slides
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        // Comparing slides
        ISlidesCompareResult compareResult = sourceSlide.compareWith(targetSlide, SlidesComparisonSettings);


        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        compareResult.getPresentation(true).save(arrayOutputStream, com.groupdocs.comparison.slides.contracts.enums.ComparisonSaveFormat.Pdf);
        System.out.println(arrayOutputStream.toByteArray().length);
//        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath("test.pdf")));
    }

    public static void compareTwoPresentationAutoShapes2() throws Exception {

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
        compareResult.getPresentation(true).save(arrayOutputStream, com.groupdocs.comparison.slides.contracts.enums.ComparisonSaveFormat.Pdf);
        System.out.println(arrayOutputStream.toByteArray().length);
//        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath("test.pdf")));
    }

    public static void compareTwoPresentationParagraphs() throws Exception {

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
        compareResult.getPresentation(true).save(arrayOutputStream, com.groupdocs.comparison.slides.contracts.enums.ComparisonSaveFormat.Pdf);
        System.out.println(arrayOutputStream.toByteArray().length);
//        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath("test.pdf")));
    }

    public static void compareTwoPresentationCells() throws Exception {

        // Creating cells
        ComparisonCellBase sourceCell = new com.groupdocs.comparison.slides.ComparisonCell(200, 50, 0, 0);
        ComparisonParagraphBase sourceParagraph = new com.groupdocs.comparison.slides.ComparisonParagraph();
        sourceCell.getTextFrame().getParagraphs().remove(sourceCell.getTextFrame().getParagraphs().get_Item(0));
        sourceParagraph.setText("This is source cell.");
        sourceCell.getTextFrame().getParagraphs().add(sourceParagraph);

        ComparisonCellBase targetCell = new com.groupdocs.comparison.slides.ComparisonCell(200, 50, 0, 0);
        ComparisonParagraphBase targetParagraph = new com.groupdocs.comparison.slides.ComparisonParagraph();
        targetCell.getTextFrame().getParagraphs().remove(targetCell.getTextFrame().getParagraphs().get_Item(0));
        targetParagraph.setText("This is target cell.");
        targetCell.getTextFrame().getParagraphs().add(targetParagraph);

        // Creating settings for comparison of cells
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        // Comparing cells
        ISlidesCompareResult compareResult = sourceCell.compareWith(targetCell, SlidesComparisonSettings);

        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        compareResult.getPresentation(true).save(arrayOutputStream, com.groupdocs.comparison.slides.contracts.enums.ComparisonSaveFormat.Pdf);
        System.out.println(arrayOutputStream.toByteArray().length);
//        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath("test.pdf")));
    }

    public static void compareTwoPresentationColumns() throws Exception {

        // Creating Columns
        ComparisonColumnBase sourceColumn = new com.groupdocs.comparison.slides.ComparisonColumn(new double[] {50, 50}, 200);
        ComparisonParagraphBase sourceParagraph0 = new com.groupdocs.comparison.slides.ComparisonParagraph();
        sourceParagraph0.setText("This is first cell in source Column.");
        sourceColumn.get_Item(0).getTextFrame().getParagraphs().add(sourceParagraph0);
        ComparisonParagraphBase sourceParagraph1 = new com.groupdocs.comparison.slides.ComparisonParagraph();
        sourceParagraph1.setText("This is second cell in source Column.");
        sourceColumn.get_Item(1).getTextFrame().getParagraphs().add(sourceParagraph1);

        ComparisonColumnBase targetColumn = new com.groupdocs.comparison.slides.ComparisonColumn(new double[] {50, 50}, 200);
        ComparisonParagraphBase targetParagraph0 = new com.groupdocs.comparison.slides.ComparisonParagraph();
        targetParagraph0.setText("This is first cell in target Column.");
        targetColumn.get_Item(0).getTextFrame().getParagraphs().add(targetParagraph0);
        ComparisonParagraphBase targetParagraph1 = new com.groupdocs.comparison.slides.ComparisonParagraph();
        targetParagraph1.setText("This is second cell in target Column.");
        targetColumn.get_Item(1).getTextFrame().getParagraphs().add(targetParagraph1);

        // Creating settings for comparison of Columns
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        // Comparing Columns
        ISlidesCompareResult compareResult = sourceColumn.compareWith(targetColumn, SlidesComparisonSettings);

        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        compareResult.getPresentation(true).save(arrayOutputStream, com.groupdocs.comparison.slides.contracts.enums.ComparisonSaveFormat.Pdf);
        System.out.println(arrayOutputStream.toByteArray().length);
//        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath("test.pdf")));
    }

    public static void compareTwoPresentationRows() {

        // Creating Rows
        ComparisonRowBase sourceRow = new com.groupdocs.comparison.slides.ComparisonRow(new double[] {200, 200}, 50);
        ComparisonParagraphBase sourceParagraph0 = new com.groupdocs.comparison.slides.ComparisonParagraph();
        sourceParagraph0.setText("This is first cell in source Row.");
        sourceRow.get_Item(0).getTextFrame().getParagraphs().add(sourceParagraph0);
        ComparisonParagraphBase sourceParagraph1 = new com.groupdocs.comparison.slides.ComparisonParagraph();
        sourceParagraph1.setText("This is second cell in source Row.");
        sourceRow.get_Item(1).getTextFrame().getParagraphs().add(sourceParagraph1);

        ComparisonRowBase targetRow = new com.groupdocs.comparison.slides.ComparisonRow(new double[] {200, 200}, 50);
        ComparisonParagraphBase targetParagraph0 = new com.groupdocs.comparison.slides.ComparisonParagraph();
        targetParagraph0.setText("This is first cell in target Row.");
        targetRow.get_Item(0).getTextFrame().getParagraphs().add(targetParagraph0);
        ComparisonParagraphBase targetParagraph1 = new com.groupdocs.comparison.slides.ComparisonParagraph();
        targetParagraph1.setText("This is second cell in target Row.");
        targetRow.get_Item(1).getTextFrame().getParagraphs().add(targetParagraph1);

        // Creating settings for comparison of Rows
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();
        // Comparing Rows
        ISlidesCompareResult compareResult = sourceRow.compareWith(targetRow, SlidesComparisonSettings);

        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        compareResult.getPresentation(true).save(arrayOutputStream, com.groupdocs.comparison.slides.contracts.enums.ComparisonSaveFormat.Html);
        System.out.println(arrayOutputStream.toByteArray().length);
//        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath("test.html")));
    }

    public static void compareTwoPresentationTables() {
        // Creating Tables
        ComparisonTableBase sourceTable = new com.groupdocs.comparison.slides.ComparisonTable(100, 100, new double[] {200, 200}, new double[] {50, 50});
        ComparisonParagraphBase sourceParagraph00 = new com.groupdocs.comparison.slides.ComparisonParagraph();
        sourceParagraph00.setText("This is first cell in source table.");
        sourceTable.get_Item(0, 0).getTextFrame().getParagraphs().add(sourceParagraph00);
        ComparisonParagraphBase sourceParagraph01 = new com.groupdocs.comparison.slides.ComparisonParagraph();
        sourceParagraph01.setText("This is second cell in source table.");
        sourceTable.get_Item(0, 1).getTextFrame().getParagraphs().add(sourceParagraph01);
        ComparisonParagraphBase sourceParagraph10 = new com.groupdocs.comparison.slides.ComparisonParagraph();
        sourceParagraph10.setText("This is third cell in source table.");
        sourceTable.get_Item(1, 0).getTextFrame().getParagraphs().add(sourceParagraph10);
        ComparisonParagraphBase sourceParagraph11 = new com.groupdocs.comparison.slides.ComparisonParagraph();
        sourceParagraph11.setText("This is fourth cell in source table.");
        sourceTable.get_Item(1, 1).getTextFrame().getParagraphs().add(sourceParagraph11);

        ComparisonTableBase targetTable = new com.groupdocs.comparison.slides.ComparisonTable(100, 100, new double[] {200, 200}, new double[] {50, 50});
        ComparisonParagraphBase targetParagraph00 = new com.groupdocs.comparison.slides.ComparisonParagraph();
        targetParagraph00.setText("This is first cell in target table.");
        targetTable.get_Item(0, 0).getTextFrame().getParagraphs().add(targetParagraph00);
        ComparisonParagraphBase targetParagraph01 = new com.groupdocs.comparison.slides.ComparisonParagraph();
        targetParagraph01.setText("This is second cell in target table.");
        targetTable.get_Item(0, 1).getTextFrame().getParagraphs().add(targetParagraph01);
        ComparisonParagraphBase targetParagraph10 = new com.groupdocs.comparison.slides.ComparisonParagraph();
        targetParagraph10.setText("This is third cell in target table.");
        targetTable.get_Item(1, 0).getTextFrame().getParagraphs().add(targetParagraph10);
        ComparisonParagraphBase targetParagraph11 = new com.groupdocs.comparison.slides.ComparisonParagraph();
        targetParagraph11.setText("This is fourth cell in target table.");
        targetTable.get_Item(1, 1).getTextFrame().getParagraphs().add(targetParagraph11);

        // Creating settings for comparison of Tables
        SlidesComparisonSettings SlidesComparisonSettings = new SlidesComparisonSettings();

        // Comparing Tables
        ISlidesCompareResult compareResult = sourceTable.compareWith(targetTable, SlidesComparisonSettings);

        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        compareResult.getPresentation(true).save(arrayOutputStream, com.groupdocs.comparison.slides.contracts.enums.ComparisonSaveFormat.Html);
        System.out.println(arrayOutputStream.toByteArray().length);
//        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath("test.html")));
    }

    public static void compareTwoTextDocuments(String sourceName, String targetName) throws IOException {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Open two textFiles
        ComparisonTextFile source = new ComparisonTextFile(sourcePath);
        ComparisonTextFile target = new ComparisonTextFile(targetPath);

        // Call method CompareWith.
        ITextCompareResult result = source.compareWith(target, new TextComparisonSettings());

        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        result.getTextFile().save(arrayOutputStream);
        System.out.println(arrayOutputStream.toByteArray().length);
//        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath("test.txt")));
    }

    public static void compareTwoHtmlDocuments(String sourceName, String targetName) throws Exception {
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        // Open two htmlFiels
        IComparisonHtmlDocument source = new ComparisonHtmlDocument(sourcePath);
        IComparisonHtmlDocument target = new ComparisonHtmlDocument(targetPath);

        // Call method CompareWith()
        IHtmlCompareResult result = source.compareWith(target, new HtmlComparisonSettings());

        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        result.getDocument().save(arrayOutputStream);
        System.out.println(arrayOutputStream.toByteArray().length);
//        IOUtils.write(arrayOutputStream.toByteArray(), new FileOutputStream(getOutputPath("test.html")));
    }
}
