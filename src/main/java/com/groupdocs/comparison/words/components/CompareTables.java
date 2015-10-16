package com.groupdocs.comparison.words.components;

import com.groupdocs.comparison.common.comparisonsettings.WordsComparisonSettings;
import com.groupdocs.comparison.words.contracts.IWordsCompareResult;
import com.groupdocs.comparison.words.contracts.enums.ComparisonNodeType;
import com.groupdocs.comparison.words.contracts.enums.ComparisonSaveFormat;
import com.groupdocs.comparison.words.contracts.nodes.IComparisonDocument;
import com.groupdocs.comparison.words.contracts.nodes.IComparisonParagraph;
import com.groupdocs.comparison.words.contracts.nodes.IComparisonTable;
import com.groupdocs.comparison.words.nodes.ComparisonDocument;
import com.groupdocs.comparison.words.nodes.ComparisonTable;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CompareTables {

    public void CompareTablesFromDifferentDocuments() throws Exception {
        
        String sourcePath = "words/components/data/CompareTablesFromDifferentDocuments/source.docx";
        String targetPath = "words/components/data/CompareTablesFromDifferentDocuments/target.docx";

        // Create to streams of documents
        InputStream sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourcePath);
        InputStream targetStream = this.getClass().getClassLoader().getResourceAsStream(targetPath);

        // Opening two documents
        IComparisonDocument sourceDocument = new ComparisonDocument(sourceStream);
        System.out.println("Document with source path: " + sourcePath + " was loaded.");
        IComparisonDocument targetDocument = new ComparisonDocument(targetStream);
        System.out.println("Document with source path: " + targetPath + " was loaded.");

        // Getting first Table from source document
        IComparisonTable sourceTable = (IComparisonTable)sourceDocument.getSections()[0].getBody().getChildNodes(ComparisonNodeType.Table, false)[0];
        // Getting first Table from target document
        IComparisonTable targetTable = (IComparisonTable)targetDocument.getSections()[0].getBody().getChildNodes(ComparisonNodeType.Table, false)[0];

        // Creating settings for comparison of Tables
        WordsComparisonSettings settings = new WordsComparisonSettings();
        // Comparing Tables
        IWordsCompareResult compareResult = sourceTable.compareWith(targetTable, settings);
        System.out.println("Tables was compared.");

        // Saving result of comparison to new document
        String resultPath = "src/main/resources/words/components/testresult/CompareTablesFromDifferentDocuments/result.docx";
        IComparisonDocument result = compareResult.getDocument();
        OutputStream resultStream = new FileOutputStream(resultPath);
        result.save(resultStream, ComparisonSaveFormat.Docx);
        resultStream.close();
        System.out.println("Result of comparison was saved to document with the following source path " + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }

    public void CompareTableFromDocumentWithCreatingTable() throws Exception {
        
        String sourcePath = "words/components/data/CompareTableFromDocumentWithCreatingTable/source.docx";

        // Create to stream of document
        InputStream sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourcePath);

        // Opening source document
        IComparisonDocument sourceDocument = new ComparisonDocument(sourceStream);
        System.out.println("Document with source path: " + sourcePath + " was loaded.");

        // Getting first Table from source document
        IComparisonTable sourceTable = (IComparisonTable)sourceDocument.getSections()[0].getBody().getChildNodes(ComparisonNodeType.Table, false)[0];

        // Creating Table
        IComparisonTable targetTable = new ComparisonTable(new double[]{100, 100, 100}, new double[]{20, 20});
        IComparisonParagraph paragraph = targetTable.getRows()[0].getCells()[0].addParagraph();
        paragraph.addRun("This is cell.");
        paragraph = targetTable.getRows()[0].getCells()[1].addParagraph();
        paragraph.addRun("This is Cell of target table.");
        paragraph = targetTable.getRows()[1].getCells()[1].addParagraph();
        paragraph.addRun("This is Cell.");
        System.out.println("New Table was created.");

        // Creating settings for comparison of Tables
        WordsComparisonSettings settings = new WordsComparisonSettings();
        // Comparing Tables
        IWordsCompareResult compareResult = sourceTable.compareWith(targetTable, settings);
        System.out.println("Tables was compared.");

        // Saving result of comparison to new document
        String resultPath = "src/main/resources/words/components/testresult/CompareTableFromDocumentWithCreatingTable/result.docx";
        IComparisonDocument result = compareResult.getDocument();
        OutputStream resultStream = new FileOutputStream(resultPath);
        result.save(resultStream, ComparisonSaveFormat.Docx);
        resultStream.close();
        System.out.println("Result of comparison was saved to document with the following source path " + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }

    public void CompareTwoCreatingTables() throws Exception {
        // Creating Tables
        IComparisonTable sourceTable = new ComparisonTable(new double[]{100, 100}, new double[]{20, 20});
        IComparisonParagraph paragraph = sourceTable.getRows()[0].getCells()[0].addParagraph();
        paragraph.addRun("This is cell.");
        paragraph = sourceTable.getRows()[0].getCells()[1].addParagraph();
        paragraph.addRun("This is Cell of source table.");
        paragraph = sourceTable.getRows()[1].getCells()[0].addParagraph();
        paragraph.addRun("This is Cel of tble.");
        System.out.println("New Table was created.");

        IComparisonTable targetTable = new ComparisonTable(new double[]{100, 100}, new double[]{20, 20});
        paragraph = targetTable.getRows()[0].getCells()[0].addParagraph();
        paragraph.addRun("This is cell.");
        paragraph = targetTable.getRows()[0].getCells()[1].addParagraph();
        paragraph.addRun("This is Cell of target table.");
        paragraph = targetTable.getRows()[1].getCells()[0].addParagraph();
        paragraph.addRun("This is Cell of table.");
        System.out.println("New Table was created.");

        // Creating settings for comparison of Tables
        WordsComparisonSettings settings = new WordsComparisonSettings();
        // Comparing Tables
        IWordsCompareResult compareResult = sourceTable.compareWith(targetTable, settings);
        System.out.println("Tables was compared.");

        // Saving result of comparison to new document
        String resultPath = "src/main/resources/words/components/testresult/CompareTwoCreatingTables/result.docx";
        IComparisonDocument result = compareResult.getDocument();
        OutputStream resultStream = new FileOutputStream(resultPath);
        result.save(resultStream, ComparisonSaveFormat.Docx);
        resultStream.close();
        System.out.println("Result of comparison was saved to document with the following source path " + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }
}
