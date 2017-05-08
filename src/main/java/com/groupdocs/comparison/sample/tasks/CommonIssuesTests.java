package com.groupdocs.comparison.sample.tasks;

import com.groupdocs.comparison.Comparison;
import com.groupdocs.comparison.common.ComparisonType;
import com.groupdocs.comparison.sample.Utilities;
import org.apache.commons.io.IOUtils;
import org.junit.Before;
import org.junit.Test;

import java.io.FileOutputStream;
import java.io.InputStream;

import static com.groupdocs.comparison.sample.TestRunner.getOutputPath;
import static com.groupdocs.comparison.sample.TestRunner.getStoragePath;
import static com.groupdocs.comparison.sample.Utilities.applyLicense;
import static org.junit.Assert.assertFalse;

/**
 * @author Aleksey Permyakov
 */
public class CommonIssuesTests {

    @Before
    public void before() {
        applyLicense();
    }

    @Test
    public void testCOMPARISONJAVA107() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "original.pdf", targetName = "updated.pdf", resultName = "COMPARISONJAVA107.pdf";
        final String sourcePath = getStoragePath(sourceName, "COMPARISONJAVA107");
        final String targetPath = getStoragePath(targetName, "COMPARISONJAVA107");
        final String resultPath = getOutputPath(resultName);

        Comparison comp = new Comparison();

        final InputStream compareResult = comp.compare(sourcePath, targetPath, resultPath, ComparisonType.Pdf);

        System.out.println("Stream size: " + compareResult.available());
        assertFalse("Result stream is empty", compareResult.available() == 0);
        IOUtils.copy(compareResult, new FileOutputStream(getOutputPath(resultName)));
    }
    @Test
    public void testCOMPARISONJAVAXXX() throws Exception {
        //
    }
}
