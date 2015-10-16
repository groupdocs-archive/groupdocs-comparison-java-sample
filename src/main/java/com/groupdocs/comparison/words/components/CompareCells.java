package com.groupdocs.comparison.words.components;

import com.groupdocs.comparison.common.comparisonsettings.WordsComparisonSettings;
import com.groupdocs.comparison.words.contracts.IWordsCompareResult;
import com.groupdocs.comparison.words.contracts.enums.ComparisonNodeType;
import com.groupdocs.comparison.words.contracts.enums.ComparisonSaveFormat;
import com.groupdocs.comparison.words.contracts.nodes.IComparisonCell;
import com.groupdocs.comparison.words.contracts.nodes.IComparisonDocument;
import com.groupdocs.comparison.words.contracts.nodes.IComparisonParagraph;
import com.groupdocs.comparison.words.contracts.nodes.IComparisonTable;
import com.groupdocs.comparison.words.nodes.ComparisonCell;
import com.groupdocs.comparison.words.nodes.ComparisonDocument;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CompareCells {

    public void CompareCellsFromDifferentDocuments() throws FileNotFoundException, Exception {
        String sourcePath = "words/components/data/CompareCellsFromDifferentDocuments/source.docx";
        String targetPath = "words/components/data/CompareCellsFromDifferentDocuments/target.docx";

        // Create to streams of documents
        InputStream sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourcePath);
        InputStream targetStream = this.getClass().getClassLoader().getResourceAsStream(targetPath);

        // Opening two documents
        IComparisonDocument sourceDocument = new ComparisonDocument(sourceStream);
        System.out.println("Document with source path: " + sourcePath + " was loaded.");
        IComparisonDocument targetDocument = new ComparisonDocument(targetStream);
        System.out.println("Document with source path: " + targetPath + " was loaded.");

        // Getting first cell from source document
        IComparisonCell sourceCell = ((IComparisonTable)(sourceDocument.getSections()[0].getBody().getChildNodes(ComparisonNodeType.Table, false)[0])).getRows()[0].getCells()[0];
        // Getting first cell from target document
        IComparisonCell targetCell = ((IComparisonTable)(targetDocument.getSections()[0].getBody().getChildNodes(ComparisonNodeType.Table, false)[0])).getRows()[0].getCells()[0];

        // Creating settings for comparison of cells
        WordsComparisonSettings settings = new WordsComparisonSettings();
        // Comparing cells
        IWordsCompareResult compareResult = sourceCell.compareWith(targetCell, settings);
        System.out.println("Cells was compared.");

        // Saving result of comparison to new document
        String resultPath = "src/main/resources/words/components/testresult/CompareCellsFromDifferentDocuments/result.docx";
        IComparisonDocument result = compareResult.getDocument();
        OutputStream resultStream = new FileOutputStream(resultPath);
        result.save(resultStream, ComparisonSaveFormat.Docx);
        resultStream.close();
        System.out.println("Result of comparison was saved to document with the following source path " + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }

    public void CompareCellFromDocumentWithCreatingCell() throws FileNotFoundException, Exception {
        String sourcePath = "words/components/data/CompareCellFromDocumentWithCreatingCell/source.docx";

        // Create to stream of document
        InputStream sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourcePath);

        // Opening source document
        IComparisonDocument sourceDocument = new ComparisonDocument(sourceStream);
        System.out.println("Document with source path: " + sourcePath + " was loaded.");

        // Getting first cell from source document
        IComparisonCell sourceCell = ((IComparisonTable)(sourceDocument.getSections()[0].getBody().getChildNodes(ComparisonNodeType.Table, false)[0])).getRows()[0].getCells()[0];

        // Creating Cell
        IComparisonCell targetCell = new ComparisonCell();
        IComparisonParagraph paragraph = targetCell.addParagraph();
        paragraph.addRun("This is cell.");
        System.out.println("New Cell was created.");

        // Creating settings for comparison of Cells
        WordsComparisonSettings settings = new WordsComparisonSettings();
        // Comparing Cells
        IWordsCompareResult compareResult = sourceCell.compareWith(targetCell, settings);
        System.out.println("Cells was compared.");

        // Saving result of comparison to new document
        String resultPath = "src/main/resources/words/components/testresult/CompareCellFromDocumentWithCreatingCell/result.docx";
        IComparisonDocument result = compareResult.getDocument();
        OutputStream resultStream = new FileOutputStream(resultPath);
        result.save(resultStream, ComparisonSaveFormat.Docx);
        resultStream.close();
        System.out.println("Result of comparison was saved to document with the following source path " + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }

    public void CompareTwoCreatingCells() throws Exception {
        // Creating Cells
        IComparisonCell sourceCell = new ComparisonCell();
        IComparisonParagraph paragraph = sourceCell.addParagraph();
        paragraph.addRun("This is Cell of source table.");
        System.out.println("New Column was created.");

        IComparisonCell targetCell = new ComparisonCell();
        paragraph = targetCell.addParagraph();
        paragraph.addRun("This is Cell of target table.");
        System.out.println("New Column was created.");

        // Creating settings for comparison of Cells
        WordsComparisonSettings settings = new WordsComparisonSettings();
        // Comparing Cells
        IWordsCompareResult compareResult = sourceCell.compareWith(targetCell, settings);
        System.out.println("Cells was compared.");

        // Saving result of comparison to new document
        String resultPath = "src/main/resources/words/components/testresult/CompareTwoCreatingCells/result.docx";
        IComparisonDocument result = compareResult.getDocument();
        OutputStream resultStream = new FileOutputStream(resultPath);
        result.save(resultStream, ComparisonSaveFormat.Docx);
        resultStream.close();
        System.out.println("Result of comparison was saved to document with the following source path" + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }
}
