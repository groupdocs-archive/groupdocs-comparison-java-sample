package com.groupdocs.comparison.sample.tasks;

import com.groupdocs.comparison.Comparer;
import com.groupdocs.comparison.MultiComparer;
import com.groupdocs.comparison.common.compareresult.ICompareResult;
import com.groupdocs.comparison.common.comparisonsettings.ComparisonSettings;
import com.groupdocs.comparison.common.license.License;
import com.groupdocs.comparison.sample.Utilities;
import org.apache.commons.io.IOUtils;
import org.junit.Before;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import static com.groupdocs.comparison.sample.TestRunner.*;
import static org.junit.Assert.*;

/**
 * @author Aleksey Permyakov
 */
@SuppressWarnings("all")
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

        Comparer comp = new Comparer();
        ComparisonSettings settings = new ComparisonSettings();

        final ICompareResult compareResult = comp.compare(sourcePath, targetPath, settings);
        compareResult.saveDocument(resultPath);

        System.out.println("Stream size: " + compareResult.getStream().available());
        assertFalse("Result stream is empty", compareResult.getStream().available() == 0);
    }

    @Test
    public void testCOMPARISONJAVA226() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "COMPARISONJAVA226.docx";
        final String sourcePath = getStoragePath(sourceName, "COMPARISONJAVA226");
        final String targetPath = getStoragePath(targetName, "COMPARISONJAVA226");
        final String resultPath = getOutputPath(resultName);

        ComparisonSettings settings = new ComparisonSettings();

        Comparer comparer = new Comparer();
        ICompareResult result = comparer.compare(sourcePath, targetPath, new ComparisonSettings());
        assertNotNull("The result is null", result);
        final InputStream resultStream = result.getStream();
        assertTrue("The result stream is empty", resultStream.available() > 0);
        IOUtils.copy(resultStream, new FileOutputStream(resultPath));
    }

    @Test
    public void testCOMPARISONJAVA228() throws Exception {
        final String sourceName = "source.docx", targetName1 = "target_1.docx", targetName2 = "target_2.docx", targetName3 = "target_3.docx", resultName = "COMPARISONJAVA228.docx";
        final String sourcePath = getStoragePath(sourceName, "COMPARISONJAVA228");
        final String targetPath1 = getStoragePath(targetName1, "COMPARISONJAVA228");
        final String targetPath2 = getStoragePath(targetName2, "COMPARISONJAVA228");
        final String targetPath3 = getStoragePath(targetName3, "COMPARISONJAVA228");
        final String outputPath = getOutputPath(resultName);

        List<String> targets = Arrays.asList(
                targetPath1,
                targetPath2,
                targetPath3
        );
        MultiComparer comparer = new MultiComparer();
        ICompareResult result = comparer.compare(sourcePath, targets, new ComparisonSettings());
        result.saveDocument(outputPath);
    }

    @Test
    public void testCOMPARISONJAVA252() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pptx", targetName = "target.pptx", resultName = "output.ppt";
        final String sourcePath = getStoragePath(sourceName, "COMPARISONJAVA252");
        final String targetPath = getStoragePath(targetName, "COMPARISONJAVA252");
        final String resultPath = getOutputPath(resultName);

        Comparer comparison = new Comparer();
        final ComparisonSettings comparisonSettings = new ComparisonSettings();
        ICompareResult result = comparison.compare(new FileInputStream(sourcePath), new FileInputStream(targetPath), comparisonSettings);
        result.saveDocument(resultPath);
    }

    /**
     * Check wheather the license is valid
     */
    @Test
    public void testCOMPARISONJAVA247() throws Exception {
        Utilities.showTestHeader();
        unsetLicense();
        assertFalse(License.isValidLicense());
        applyLicense();
        assertTrue(License.isValidLicense());
    }

    @Test
    public void testCOMPARISONJAVAXXX() throws Exception {
        //
    }
}
