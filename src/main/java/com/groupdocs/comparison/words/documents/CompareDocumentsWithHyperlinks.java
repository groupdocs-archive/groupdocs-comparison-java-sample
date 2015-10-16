package com.groupdocs.comparison.words.documents;

import com.aspose.ms.System.IO.Stream;
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
public class CompareDocumentsWithHyperlinks {

    public void WithIgnoreLinkSetting() throws Exception {
        String sourcePath = "words/documents/data/WithIgnoreLinkSetting/source.docx";
        String targetPath = "words/documents/data/WithIgnoreLinkSetting/target.docx";
        String resultPath = "src/main/resources/words/documents/testresult/WithIgnoreLinkSetting/result.docx";
        WordsComparisonSettings comparisonSettings = new WordsComparisonSettings();
        comparisonSettings.setProcessHyperLinksAsAText(true);
        Compare(sourcePath, targetPath, resultPath, comparisonSettings);
    }

    public void WithoutIgnoreLinkSetting() throws Exception {
        String sourcePath = "words/documents/data/WithoutIgnoreLinkSetting/source.docx";
        String targetPath = "words/documents/data/WithoutIgnoreLinkSetting/target.docx";
        String resultPath = "src/main/resources/words/documents/testresult/WithoutIgnoreLinkSetting/result.docx";
        WordsComparisonSettings comparisonSettings = new WordsComparisonSettings();
        Compare(sourcePath, targetPath, resultPath, comparisonSettings);
    }

    private void Compare(String sourcePath, String targetPath, String resultPath,
        WordsComparisonSettings comparisonSettings) throws Exception {
        // Create to streams of documents
        InputStream sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourcePath);
        InputStream targetStream = this.getClass().getClassLoader().getResourceAsStream(targetPath);
        // Opening two documents
        IComparisonDocument sourcePresentation = new ComparisonDocument(sourceStream);
        System.out.println("Document with source path: " + sourcePath + " was loaded.");
        IComparisonDocument targetPresentation = new ComparisonDocument(targetStream);
        System.out.println("Document with source path: " + targetPath + " was loaded.");

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
