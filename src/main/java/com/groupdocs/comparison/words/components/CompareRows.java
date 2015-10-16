package com.groupdocs.comparison.words.components;

import com.groupdocs.comparison.common.comparisonsettings.WordsComparisonSettings;
import com.groupdocs.comparison.words.contracts.IWordsCompareResult;
import com.groupdocs.comparison.words.contracts.enums.ComparisonNodeType;
import com.groupdocs.comparison.words.contracts.enums.ComparisonSaveFormat;
import com.groupdocs.comparison.words.contracts.nodes.IComparisonDocument;
import com.groupdocs.comparison.words.contracts.nodes.IComparisonParagraph;
import com.groupdocs.comparison.words.contracts.nodes.IComparisonRow;
import com.groupdocs.comparison.words.contracts.nodes.IComparisonTable;
import com.groupdocs.comparison.words.nodes.ComparisonDocument;
import com.groupdocs.comparison.words.nodes.ComparisonRow;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author gruzi_000
 */
public class CompareRows {

    public void CompareRowsFromDifferentDocuments() throws Exception {
        
        String sourcePath = "words/components/data/CompareRowsFromDifferentDocuments/source.docx";
        String targetPath = "words/components/data/CompareRowsFromDifferentDocuments/target.docx";

        // Create to streams of documents
        InputStream sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourcePath);
        InputStream targetStream = this.getClass().getClassLoader().getResourceAsStream(targetPath);

        // Opening two documents
        IComparisonDocument sourceDocument = new ComparisonDocument(sourceStream);
        System.out.println("Document with source path: " + sourcePath + " was loaded.");
        IComparisonDocument targetDocument = new ComparisonDocument(targetStream);
        System.out.println("Document with source path: " + targetPath + " was loaded.");

        // Getting first Row from source document
        IComparisonRow sourceRow = ((IComparisonTable)sourceDocument.getSections()[0].getBody().getChildNodes(ComparisonNodeType.Table, false)[0]).getRows()[0];
        // Getting first Row from target document
        IComparisonRow targetRow = ((IComparisonTable)targetDocument.getSections()[0].getBody().getChildNodes(ComparisonNodeType.Table, false)[0]).getRows()[0];

        // Creating settings for comparison of Rows
        WordsComparisonSettings settings = new WordsComparisonSettings();
        // Comparing Rows
        IWordsCompareResult compareResult = sourceRow.compareWith(targetRow, settings);
        System.out.println("Rows was compared.");

        // Saving result of comparison to new document
        String resultPath = "src/main/resources/words/components/testresult/CompareRowsFromDifferentDocuments/result.docx";
        IComparisonDocument result = compareResult.getDocument();
        OutputStream resultStream = new FileOutputStream(resultPath);
        result.save(resultStream, ComparisonSaveFormat.Docx);
        resultStream.close();
        System.out.println("Result of comparison was saved to document with the following source path " + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }

    public void CompareRowFromDocumentWithCreatingRow() throws Exception {
        
        String sourcePath = "words/components/data/CompareCellFromDocumentWithCreatingCell/source.docx";

        // Create to stream of document
        InputStream sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourcePath);

        // Opening source document
        IComparisonDocument sourceDocument = new ComparisonDocument(sourceStream);
        System.out.println("Document with source path: " + sourcePath + " was loaded.");

        // Getting first Row from source document
        IComparisonRow sourceRow = ((IComparisonTable)(sourceDocument.getSections()[0].getBody().getChildNodes(ComparisonNodeType.Table, false)[0])).getRows()[0];

        // Creating Row
        IComparisonRow targetRow = new ComparisonRow(new double[]{100, 100, 100}, 20);
        IComparisonParagraph paragraph = targetRow.getCells()[0].addParagraph();
        paragraph.addRun("This is cell.");
        paragraph = targetRow.getCells()[1].addParagraph();
        paragraph.addRun("This is Cell of target table.");
        paragraph = targetRow.getCells()[2].addParagraph();
        paragraph.addRun("This is Cell.");
        System.out.println("New Row was created.");

        // Creating settings for comparison of Rows
        WordsComparisonSettings settings = new WordsComparisonSettings();
        // Comparing Rows
        IWordsCompareResult compareResult = sourceRow.compareWith(targetRow, settings);
        System.out.println("Rows was compared.");

        // Saving result of comparison to new document
        String resultPath = "src/main/resources/words/components/testresult/CompareRowFromDocumentWithCreatingRow/result.docx";
        IComparisonDocument result = compareResult.getDocument();
        OutputStream resultStream = new FileOutputStream(resultPath);
        result.save(resultStream, ComparisonSaveFormat.Docx);
        resultStream.close();
        System.out.println("Result of comparison was saved to document with the following source path " + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }

    public void CompareTwoCreatingRows() throws Exception {
        // Creating Rows
        IComparisonRow sourceRow = new ComparisonRow(new double[]{100, 100}, 20);
        IComparisonParagraph paragraph = sourceRow.getCells()[0].addParagraph();
        paragraph.addRun("This is cell.");
        paragraph = sourceRow.getCells()[1].addParagraph();
        paragraph.addRun("This is Cell of source table.");
        System.out.println("New Row was created.");

        IComparisonRow targetRow = new ComparisonRow(new double[]{100, 100}, 20);
        paragraph = targetRow.getCells()[0].addParagraph();
        paragraph.addRun("This is cell.");
        paragraph = targetRow.getCells()[1].addParagraph();
        paragraph.addRun("This is Cell of target table.");
        System.out.println("New Row was created.");

        // Creating settings for comparison of Rows
        WordsComparisonSettings settings = new WordsComparisonSettings();
        // Comparing Rows
        IWordsCompareResult compareResult = sourceRow.compareWith(targetRow, settings);
        System.out.println("Rows was compared.");

        // Saving result of comparison to new document
        String resultPath = "src/main/resources/words/components/testresult/CompareTwoCreatingRows/result.docx";
        IComparisonDocument result = compareResult.getDocument();
        OutputStream resultStream = new FileOutputStream(resultPath);
        result.save(resultStream, ComparisonSaveFormat.Docx);
        resultStream.close();
        System.out.println("Result of comparison was saved to document with the following source path " + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }
}
