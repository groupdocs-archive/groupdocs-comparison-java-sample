package com.groupdocs.comparison.words.documents;

import com.groupdocs.comparison.common.comparisonsettings.WordsComparisonSettings;
import com.groupdocs.comparison.words.contracts.IWordsCompareResult;
import com.groupdocs.comparison.words.contracts.enums.ComparisonSaveFormat;
import com.groupdocs.comparison.words.contracts.nodes.IComparisonDocument;
import com.groupdocs.comparison.words.nodes.ComparisonDocument;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author gruzi_000
 */
public class CompareDocumentsWithTables {

    public void WithTablesOnAppropriatePages() throws Exception {
        String sourcePath = "words/documents/data/WithTablesOnAppropriatePages/source.docx";
        String targetPath = "words/documents/data/WithTablesOnAppropriatePages/target.docx";
        String resultPath = "src/main/resources/words/documents/testresult/WithTablesOnAppropriatePages/result.docx";
        Compare(sourcePath, targetPath, resultPath);
    }

    public void WithTablesOnDefferentPages() throws Exception {
        String sourcePath = "words/documents/data/WithTablesOnDefferentPages/source.docx";
        String targetPath = "words/documents/data/WithTablesOnDefferentPages/target.docx";
        String resultPath = "src/main/resources/words/documents/testresult/WithTablesOnDefferentPages/result.docx";
        Compare(sourcePath, targetPath, resultPath);
    }

    public void WithTablesWitchContainsDifferentCountOfColumns() throws Exception {
        String sourcePath = "words/documents/data/WithTablesWitchContainsDifferentCountOfColumns/source.docx";
        String targetPath = "words/documents/data/WithTablesWitchContainsDifferentCountOfColumns/target.docx";
        String resultPath = "src/main/resources/words/documents/testresult/WithTablesWitchContainsDifferentCountOfColumns/result.docx";
        Compare(sourcePath, targetPath, resultPath);
    }

    public void WithTablesWitchContainsDifferentCountOfRows() throws Exception {
        String sourcePath = "words/documents/data/WithTablesWitchContainsDifferentCountOfRows/source.docx";
        String targetPath = "words/documents/data/WithTablesWitchContainsDifferentCountOfRows/target.docx";
        String resultPath = "src/main/resources/words/documents/testresult/WithTablesWitchContainsDifferentCountOfRows/result.docx";
        Compare(sourcePath, targetPath, resultPath);
    }

    public void WithTablesWitchContainsDifferentCountOfColumnsAndDifferentCountOfRows() throws Exception {
        String sourcePath = "words/documents/data/WithTablesWitchContainsDifferentCountOfColumnAndDifferentCountOfRows/source.docx";
        String targetPath = "words/documents/data/WithTablesWitchContainsDifferentCountOfColumnAndDifferentCountOfRows/target.docx";
        String resultPath = "src/main/resources/words/documents/testresult/WithTablesWitchContainsDifferentCountOfColumnAndDifferentCountOfRows/result.docx";
        Compare(sourcePath, targetPath, resultPath);
    }

    private void Compare(String sourcePath, String targetPath, String resultPath) throws Exception {
        // Create to streams of documents
        InputStream sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourcePath);
        InputStream targetStream = this.getClass().getClassLoader().getResourceAsStream(targetPath);
        // Opening two documents
        IComparisonDocument sourcePresentation = new ComparisonDocument(sourceStream);
        System.out.println("Document with source path: " + sourcePath + " was loaded.");
        IComparisonDocument targetPresentation = new ComparisonDocument(targetStream);
        System.out.println("Document with source path: " + targetPath + " was loaded.");

        // Creating settings for comparison of documents
        WordsComparisonSettings comparisonSettings = new WordsComparisonSettings();

        // Comparing documents
        IWordsCompareResult compareResult = sourcePresentation.compareWith(targetPresentation, comparisonSettings);
        System.out.println("Documents was compared.");

        // Saving result of comparison to new document
        IComparisonDocument result = compareResult.getDocument();
        OutputStream resultStream = new FileOutputStream(resultPath);
        result.save(resultStream, ComparisonSaveFormat.Docx);
        resultStream.close();
        System.out.println("Result of comparison was saved to document with the following source path " + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }
}
