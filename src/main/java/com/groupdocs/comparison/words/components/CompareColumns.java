package com.groupdocs.comparison.words.components;

import com.groupdocs.comparison.common.comparisonsettings.WordsComparisonSettings;
import com.groupdocs.comparison.words.contracts.IWordsCompareResult;
import com.groupdocs.comparison.words.contracts.enums.ComparisonNodeType;
import com.groupdocs.comparison.words.contracts.enums.ComparisonSaveFormat;
import com.groupdocs.comparison.words.contracts.nodes.IComparisonColumn;
import com.groupdocs.comparison.words.contracts.nodes.IComparisonDocument;
import com.groupdocs.comparison.words.contracts.nodes.IComparisonParagraph;
import com.groupdocs.comparison.words.contracts.nodes.IComparisonTable;
import com.groupdocs.comparison.words.nodes.ComparisonColumn;
import com.groupdocs.comparison.words.nodes.ComparisonDocument;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author gruzi_000
 */
public class CompareColumns {

    public void CompareColumnsFromDifferentDocuments() throws Exception {
        String sourcePath = "words/components/data/CompareColumnsFromDifferentDocuments/source.docx";
        String targetPath = "words/components/data/CompareColumnsFromDifferentDocuments/target.docx";

        // Create to streams of documents
        InputStream sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourcePath);
        InputStream targetStream = this.getClass().getClassLoader().getResourceAsStream(targetPath);

        // Opening two documents
        IComparisonDocument sourceDocument = new ComparisonDocument(sourceStream);
        System.out.println("Document with source path: " + sourcePath + " was loaded.");
        IComparisonDocument targetDocument = new ComparisonDocument(targetStream);
        System.out.println("Document with source path: " + targetPath + " was loaded.");

        // Getting first Column from source document
        IComparisonColumn sourceColumn = ((IComparisonTable)(sourceDocument.getSections()[0].getBody().getChildNodes(ComparisonNodeType.Table, false)[0])).getColumns()[0];
        // Getting first Column from target document
        IComparisonColumn targetColumn = ((IComparisonTable)(targetDocument.getSections()[0].getBody().getChildNodes(ComparisonNodeType.Table, false)[0])).getColumns()[0];

        // Creating settings for comparison of Columns
        WordsComparisonSettings settings = new WordsComparisonSettings();
        // Comparing Columns
        IWordsCompareResult compareResult = sourceColumn.compareWith(targetColumn, settings);
        System.out.println("Columns was compared.");

        // Saving result of comparison to new document
        String resultPath = "src/main/resources/words/components/testresult/CompareColumnsFromDifferentDocuments/result.docx";
        IComparisonDocument result = compareResult.getDocument();
        OutputStream resultStream = new FileOutputStream(resultPath);
        result.save(resultStream, ComparisonSaveFormat.Docx);
        resultStream.close();
        System.out.println("Result of comparison was saved to document with the following source path" + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }

    public void CompareColumnFromDocumentWithCreatingColumn() throws Exception {
        String sourcePath = "words/components/data/CompareColumnFromDocumentWithCreatingColumn/source.docx";

        // Create to stream of document
        InputStream sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourcePath);

        // Opening source document
        IComparisonDocument sourceDocument = new ComparisonDocument(sourceStream);
        System.out.println("Document with source path: " + sourcePath + " was loaded.");

        // Getting first Column from source document
        IComparisonColumn sourceColumn = ((IComparisonTable)(sourceDocument.getSections()[0].getBody().getChildNodes(ComparisonNodeType.Table, false)[0])).getColumns()[0];

        // Creating Column
        IComparisonColumn targetColumn = new ComparisonColumn(100, new double[]{20, 20, 20});
        IComparisonParagraph paragraph = targetColumn.getCells()[0].addParagraph();
        paragraph.addRun("This is cell.");
        paragraph = targetColumn.getCells()[1].addParagraph();
        paragraph.addRun("This is Cell of target table.");
        paragraph = targetColumn.getCells()[2].addParagraph();
        paragraph.addRun("This is Cell.");
        System.out.println("New Column was created.");

        // Creating settings for comparison of Columns
        WordsComparisonSettings settings = new WordsComparisonSettings();
        // Comparing Columns
        IWordsCompareResult compareResult = sourceColumn.compareWith(targetColumn, settings);
        System.out.println("Columns was compared.");

        // Saving result of comparison to new document
        String resultPath = "src/main/resources/words/components/testresult/CompareColumnFromDocumentWithCreatingColumn/result.docx";
        IComparisonDocument result = compareResult.getDocument();
        OutputStream resultStream = new FileOutputStream(resultPath);
        result.save(resultStream, ComparisonSaveFormat.Docx);
        resultStream.close();
        System.out.println("Result of comparison was saved to document with the following source path " + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }

    public void CompareTwoCreatingColumns() throws Exception {
        // Creating Columns
        IComparisonColumn sourceColumn = new ComparisonColumn(100, new double[]{20, 20});
        IComparisonParagraph paragraph = sourceColumn.getCells()[0].addParagraph();
        paragraph.addRun("This is cell.");
        paragraph = sourceColumn.getCells()[1].addParagraph();
        paragraph.addRun("This is Cell of source table.");
        System.out.println("New Column was created.");

        IComparisonColumn targetColumn = new ComparisonColumn(100, new double[]{20, 20});
        paragraph = targetColumn.getCells()[0].addParagraph();
        paragraph.addRun("This is cell.");
        paragraph = targetColumn.getCells()[1].addParagraph();
        paragraph.addRun("This is Cell of target table.");
        System.out.println("New Column was created.");

        // Creating settings for comparison of Columns
        WordsComparisonSettings settings = new WordsComparisonSettings();
        // Comparing Columns
        IWordsCompareResult compareResult = sourceColumn.compareWith(targetColumn, settings);
        System.out.println("Columns was compared.");

        // Saving result of comparison to new document
        String resultPath = "src/main/resources/words/components/testresult/CompareTwoCreatingColumns/result.docx";
        IComparisonDocument result = compareResult.getDocument();
        OutputStream resultStream = new FileOutputStream(resultPath);
        result.save(resultStream, ComparisonSaveFormat.Docx);
        resultStream.close();
        System.out.println("Result of comparison was saved to document with the following source path " + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }
}
