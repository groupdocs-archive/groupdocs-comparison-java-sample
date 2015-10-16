package com.groupdocs.comparison.text.documents;

import com.groupdocs.comparison.common.comparisonsettings.TextComparisonSettings;
import com.groupdocs.comparison.text.ComparisonTextFile;
import com.groupdocs.comparison.text.contracts.IComparisonTextFile;
import com.groupdocs.comparison.text.contracts.ITextCompareResult;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CompareTextFiles {

    public void CompareTwoFilesWithPlainText() throws FileNotFoundException, IOException {
        String sourcePath = "text/documents/data/WithPlainText/source.txt";
	String targetPath = "text/documents/data/WithPlainText/target.txt";
	String resultPath = "src/main/resources/text/documents/testresult/WithPlainText/result.txt";
	compare(sourcePath, targetPath, resultPath);
    }

    private void compare(String sourcePath, String targetPath, String resultPath) throws FileNotFoundException, IOException {
        // Create to streams of documents
        InputStream sourceStream = this.getClass().getClassLoader().getResourceAsStream(sourcePath);
        InputStream targetStream = this.getClass().getClassLoader().getResourceAsStream(targetPath);
        // Opening two presentations
        IComparisonTextFile sourcePresentation = new ComparisonTextFile(sourceStream);
        System.out.println("TextFile with source path: " + sourcePath + " was loaded.");
        IComparisonTextFile targetPresentation = new ComparisonTextFile(targetStream);
        System.out.println("TextFile with source path: " + targetPath + " was loaded.");

        // Creating settings for comparison of presentations
        TextComparisonSettings SlidesComparisonSettings = new TextComparisonSettings();

        // Comparing presentations
        ITextCompareResult compareResult = sourcePresentation.compareWith(targetPresentation, SlidesComparisonSettings);
        System.out.println("Presentations was compared.");

        // Saving result of comparison to new presentation
        IComparisonTextFile result = compareResult.getTextFile();
        OutputStream resultStream = new FileOutputStream(resultPath);
        result.save(resultStream);
        resultStream.close();
        System.out.println("Result of comparison was saved to TextFile with the following source path" + resultPath + ".");
        System.out.println("===============================================");
        System.out.println("");
    }
}
