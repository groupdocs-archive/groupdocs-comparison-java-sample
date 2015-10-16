package com.groupdocs.comparison.words.components;

import com.groupdocs.comparison.common.comparisonsettings.WordsComparisonSettings;
import com.groupdocs.comparison.words.contracts.IWordsCompareResult;
import com.groupdocs.comparison.words.contracts.enums.ComparisonNodeType;
import com.groupdocs.comparison.words.contracts.enums.ComparisonSaveFormat;
import com.groupdocs.comparison.words.contracts.nodes.IComparisonDocument;
import com.groupdocs.comparison.words.contracts.nodes.IComparisonParagraph;
import com.groupdocs.comparison.words.nodes.ComparisonDocument;
import com.groupdocs.comparison.words.nodes.ComparisonParagraph;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author gruzi_000
 */
public class CompareParagraphs {

    public void CompareParagraphsFromDifferentDocuments() throws FileNotFoundException, Exception {

        String sourcePath = "words/components/data/CompareParagraphsFromDifferentDocuments/source.docx";
        String targetPath = "words/components/data/CompareParagraphsFromDifferentDocuments/target.docx";

        // Create to streams of documents
        InputStream sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourcePath);
        InputStream targetStream = this.getClass().getClassLoader().getResourceAsStream(targetPath);

        // Opening two documents
        IComparisonDocument sourceDocument = new ComparisonDocument(sourceStream);
        System.out.println("Document with source path: " + sourcePath + " was loaded.");
        IComparisonDocument targetDocument = new ComparisonDocument(targetStream);
        System.out.println("Document with source path: " + targetPath + " was loaded.");


        // Getting first Paragraph from source document
        IComparisonParagraph sourceParagraph = (IComparisonParagraph)(sourceDocument.getSections()[0].getBody().getChildNodes(ComparisonNodeType.Paragraph, false)[0]);
        // Getting first Paragraph from target document
        IComparisonParagraph targetParagraph = (IComparisonParagraph)(targetDocument.getSections()[0].getBody().getChildNodes(ComparisonNodeType.Paragraph, false)[0]);

        // Creating settings for comparison of Paragraphs
        WordsComparisonSettings settings = new WordsComparisonSettings();
        // Comparing Paragraphs
        IWordsCompareResult compareResult = sourceParagraph.compareWith(targetParagraph, settings);
        System.out.println("Paragraphs was compared.");

        // Saving result of comparison to new document
        String resultPath = "src/main/resources/words/components/testresult/CompareParagraphsFromDifferentDocuments/result.docx";
        IComparisonDocument result = compareResult.getDocument();
        OutputStream resultStream = new FileOutputStream(resultPath);
        result.save(resultStream, ComparisonSaveFormat.Docx);
        resultStream.close();
        System.out.println("Result of comparison was saved to document with the following source path " + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }

    public void CompareParagraphFromDocumentWithCreatingParagraph() throws FileNotFoundException, Exception {

        String sourcePath = "words/components/data/CompareParagraphFromDocumentWithCreatingParagraph/source.docx";

        // Create to stream of document
        InputStream sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourcePath);

        // Opening source document
        IComparisonDocument sourceDocument = new ComparisonDocument(sourceStream);
        System.out.println("Document with source path: " + sourcePath + " was loaded.");

        // Getting first Paragraph from source document
        IComparisonParagraph sourceParagraph = (IComparisonParagraph)(sourceDocument.getSections()[0].getBody().getChildNodes(ComparisonNodeType.Paragraph, false)[0]);

        // Creating Paragraph
        IComparisonParagraph targetParagraph = new ComparisonParagraph();
        targetParagraph.addRun("This paragraph was created.");
        System.out.println("New Paragraph was created.");

        // Creating settings for comparison of Paragraphs
        WordsComparisonSettings settings = new WordsComparisonSettings();
        // Comparing Paragraphs
        IWordsCompareResult compareResult = sourceParagraph.compareWith(targetParagraph, settings);
        System.out.println("Paragraphs was compared.");

        // Saving result of comparison to new document
        String resultPath = "src/main/resources/words/components/testresult/CompareParagraphFromDocumentWithCreatingParagraph/result.docx";
        IComparisonDocument result = compareResult.getDocument();
        OutputStream resultStream = new FileOutputStream(resultPath);
        result.save(resultStream, ComparisonSaveFormat.Docx);
        resultStream.close();
        System.out.println("Result of comparison was saved to document with the following source path " + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }

    public void CompareTwoCreatingParagraphs() throws Exception {
        // Creating Paragraphs
        IComparisonParagraph sourceParagraph = new ComparisonParagraph();
        sourceParagraph.addRun("This is source Paragraph.");
        System.out.println("New Paragraph was created.");

        IComparisonParagraph targetParagraph = new ComparisonParagraph();
        targetParagraph.addRun("This is target Paragraph.");
        System.out.println("New Paragraph was created.");

        // Creating settings for comparison of Paragraphs
        WordsComparisonSettings settings = new WordsComparisonSettings();
        // Comparing Paragraphs
        IWordsCompareResult compareResult = sourceParagraph.compareWith(targetParagraph, settings);
        System.out.println("Paragraphs was compared.");

        // Saving result of comparison to new document
        String resultPath = "src/main/resources/words/components/testresult/CompareTwoCreatingParagraphs/result.docx";
        IComparisonDocument result = compareResult.getDocument();
        OutputStream resultStream = new FileOutputStream(resultPath);
        result.save(resultStream, ComparisonSaveFormat.Docx);
        resultStream.close();
        System.out.println("Result of comparison was saved to document with the following source path " + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }
}
