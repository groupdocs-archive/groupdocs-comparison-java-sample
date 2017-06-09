package com.groupdocs.comparison.sample.tasks;

import com.groupdocs.comparison.Comparer;
import com.groupdocs.comparison.Comparison;
import com.groupdocs.comparison.MultiComparer;
import com.groupdocs.comparison.common.ComparisonType;
import com.groupdocs.comparison.common.ICompareResult;
import com.groupdocs.comparison.common.comparisonsettings.ComparisonSettings;
import com.groupdocs.comparison.common.comparisonsettings.ImagingComparisonSettings;
import com.groupdocs.comparison.common.images.ComparisonSlidesImageSettings;
import com.groupdocs.comparison.imaging.ComparisonDjvuImage;
import com.groupdocs.comparison.imaging.contracts.IImageCompareResult;
import com.groupdocs.comparison.imaging.contracts.IPdfDocument;
import com.groupdocs.comparison.sample.Utilities;
import com.groupdocs.comparison.slides.ComparisonPresentation;
import com.groupdocs.comparison.slides.contracts.comparison.ComparisonPresentationBase;
import org.apache.commons.io.IOUtils;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.groupdocs.comparison.sample.TestRunner.applyLicense;
import static com.groupdocs.comparison.sample.TestRunner.getOutputPath;
import static com.groupdocs.comparison.sample.TestRunner.getStoragePath;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

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

        Comparison comp = new Comparison();

        final InputStream compareResult = comp.compare(sourcePath, targetPath, resultPath, ComparisonType.Pdf);

        System.out.println("Stream size: " + compareResult.available());
        assertFalse("Result stream is empty", compareResult.available() == 0);
        IOUtils.copy(compareResult, new FileOutputStream(getOutputPath(resultName)));
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
        final String sourceName = "source.docx", targetName1 = "target_1.docx", targetName2 = "target_2.docx", targetName3 = "target_3.docx", resultName = "testCOMPARISONJAVA228.docx";
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
    public void testCOMPARISONJAVA229() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.djvu", targetName = "target.djvu", resultName = "COMPARISONJAVA229.pdf";
        final String sourcePath = getStoragePath(sourceName, "COMPARISONJAVA229");
        final String targetPath = getStoragePath(targetName, "COMPARISONJAVA229");
        final String resultPath = getOutputPath(resultName);

        InputStream sourceStream = new FileInputStream(sourcePath);
        InputStream targetStream = new FileInputStream(targetPath);

        ComparisonDjvuImage sourceImage = new ComparisonDjvuImage(sourceStream);
        ComparisonDjvuImage targetImage = new ComparisonDjvuImage(targetStream);

        ImagingComparisonSettings settings = new ImagingComparisonSettings();

        //Compare
        IImageCompareResult cr = sourceImage.compareWith(targetImage, settings);
        IPdfDocument resultPdf = cr.getPdfDocument();

        //save results into a file
        resultPdf.save(resultPath);
        sourceStream.close();
        targetStream.close();
    }

    @Test
    public void testCOMPARISONJAVA230() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pptx", resultName = "";
        final String sourcePath = getStoragePath(sourceName, "COMPARISONJAVA230");
        final String resultPath = getOutputPath(resultName);

        //Open  document
        ComparisonPresentationBase presentation = new ComparisonPresentation(sourcePath);
        //Set settings
        ComparisonSlidesImageSettings settings = new ComparisonSlidesImageSettings();
        //Save as Image
        presentation.saveAsImages(resultPath, settings);

        ArrayList<ByteArrayOutputStream> imageStream = new ArrayList<ByteArrayOutputStream>();
        //Open  document
        ComparisonPresentationBase presentationStream = new ComparisonPresentation(sourcePath);
        //Set settings
        ComparisonSlidesImageSettings settingsStream = new ComparisonSlidesImageSettings();
        //Save as Image
        presentationStream.saveAsImages(imageStream, settingsStream);
        for (ByteArrayOutputStream arrayOutputStream : imageStream) {
            assertTrue("Image content is empty!", imageStream.size() > 0);
        }
    }

    @Test
    public void testCOMPARISONJAVAXXX() throws Exception {
        //
    }
}
