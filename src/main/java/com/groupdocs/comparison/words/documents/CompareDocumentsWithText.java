package com.groupdocs.comparison.words.documents;

import com.groupdocs.comparison.common.comparisonsettings.WordsComparisonSettings;
import com.groupdocs.comparison.words.contracts.IWordsCompareResult;
import com.groupdocs.comparison.words.contracts.enums.ComparisonSaveFormat;
import com.groupdocs.comparison.words.contracts.nodes.IComparisonDocument;
import com.groupdocs.comparison.words.nodes.ComparisonDocument;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CompareDocumentsWithText {

    public void WithTextOnAppropriatePages() throws Exception {
        String sourcePath = "words/documents/data/WithTextOnAppropriatePages/source.docx";
        String targetPath = "words/documents/data/WithTextOnAppropriatePages/target.docx";
        String resultPath = "src/main/resources/words/documents/testresult/WithTextOnAppropriatePages/result.docx";
        Compare(sourcePath, targetPath, resultPath);
    }

    public void WithTextOnDifferentPages() throws Exception {
        String sourcePath = "words/documents/data/WithTextOnDifferentPages/source.docx";
        String targetPath = "words/documents/data/WithTextOnDifferentPages/target.docx";
        String resultPath = "src/main/resources/words/documents/testresult/WithTextOnDifferentPages/result.docx";
        Compare(sourcePath, targetPath, resultPath);
    }

    private void Compare(String sourcePath, String targetPath, String resultPath) throws FileNotFoundException, Exception {
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
