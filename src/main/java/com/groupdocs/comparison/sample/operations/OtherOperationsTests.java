package com.groupdocs.comparison.sample.operations;

import com.groupdocs.comparison.Comparer;
import com.groupdocs.comparison.Informer;
import com.groupdocs.comparison.changes.ChangeInfo;
import com.groupdocs.comparison.changes.Rectangle;
import com.groupdocs.comparison.common.PageImage;
import com.groupdocs.comparison.common.TypeChanged;
import com.groupdocs.comparison.common.compareresult.ICompareResult;
import com.groupdocs.comparison.common.comparisonsettings.ComparisonSettings;
import com.groupdocs.comparison.common.comparisonsettings.DetailLevel;
import com.groupdocs.comparison.common.documentinfo.DocumentInfo;
import com.groupdocs.comparison.sample.Utilities;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.util.List;

import static com.groupdocs.comparison.sample.TestRunner.*;


/**
 * @author Aleksey Permyakov on 10.08.2016.
 */
@SuppressWarnings("all")
public class OtherOperationsTests {

    @Test(timeout = 300000)
    public void testHowToGetWidthAndHeightOfPageImages() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx";
        final String sourcePath = getStoragePath(sourceName);

        Comparer comparer = new Comparer();
        // get the list of pages as images
        List<PageImage> sourceImages = comparer.convertToImages(sourcePath);
        // getting sizes of first page
        int height = sourceImages.get(0).getHeight();
        int width = sourceImages.get(0).getWidth();

        Assert.assertNotNull(height);
        Assert.assertNotNull(width);
    }

    @Test(timeout = 300000)
    public void testHowToGetCoordinateOfTheFirstChange() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        Comparer comparer = new Comparer();
        // Settings
        ComparisonSettings comparisonSettings = new ComparisonSettings();
        comparisonSettings.setCalculateComponentCoordinates(true);
        // Compare documents
        ICompareResult compareResult = comparer.compare(sourcePath, targetPath, comparisonSettings);
        // Getting sizes of the first change
        ChangeInfo[] changes = compareResult.getChanges();
        // Coordinates of first change
        final Rectangle rectangle = changes[0].getBox();

        Assert.assertNotNull(rectangle);
    }

    @Test(timeout = 300000)
    public void testHowToUseCoordinatesOfChanges() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "result.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String resultPath = getOutputPath(targetName);

        ComparisonSettings comparisonSettings = new ComparisonSettings();
        comparisonSettings.setStyleChangeDetection(true);
        //this setting specify that we want to have change coordinates
        comparisonSettings.setCalculateComponentCoordinates(true);
        comparisonSettings.setDetailLevel(DetailLevel.High);

        Comparer comparer = new Comparer();
        ICompareResult result = comparer.compare(sourcePath, targetPath, comparisonSettings);
        result.saveDocument(resultPath);


        List<PageImage> resultImages = comparer.convertToImages(resultPath);
        final ChangeInfo[] changes = result.getChanges();

        Assert.assertNotNull(changes);

        // Below the one of cases how we could use changes coordinates.
        // We are passing through pages object and draw a rectangle in the coordinates of changes
        for (PageImage pageImage : resultImages) {
            final InputStream pageStream = pageImage.getPageStream();

            Assert.assertNotNull(pageStream);

            final BufferedImage bufferedImage = ImageIO.read(pageStream);
            final Graphics graphics = bufferedImage.getGraphics();
            for (ChangeInfo changeInfo : changes) {
                final Rectangle rectangle = changeInfo.getBox();
                //if something was Inserted draw a Blue rectange
                if (changeInfo.getType() == TypeChanged.Inserted) {
                    graphics.setColor(Color.BLUE);
                    graphics.drawRect((int) rectangle.getX(), (int) rectangle.getY(), (int) rectangle.getWidth(), (int) rectangle.getHeight());
                }
                //if something was Deleted draw a Red rectange
                if (changeInfo.getType() == TypeChanged.Deleted) {

                    graphics.setColor(Color.RED);
                    graphics.drawRect((int) rectangle.getX(), (int) rectangle.getY(), (int) rectangle.getWidth(), (int) rectangle.getHeight());
                }
                //if something was Changes draw a Green rectange
                if (changeInfo.getType() == TypeChanged.StyleChanged) {
                    graphics.setColor(Color.GREEN);
                    graphics.drawRect((int) rectangle.getX(), (int) rectangle.getY(), (int) rectangle.getWidth(), (int) rectangle.getHeight());
                }
            }
            ImageIO.write(bufferedImage, "png", new File(resultPath.replace(resultName, "result_" + pageImage.getPageNumber()) + ".png"));
            graphics.dispose();
            pageStream.close();
        }
    }

    @Test(timeout = 300000)
    public void testHowToGetImageRepresentationOfDocumentPages() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "result.docx";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);
        final String resultPath = getOutputPath(targetName);

        Comparer comparer = new Comparer();
        ComparisonSettings comparisonSettings = new ComparisonSettings();
        comparisonSettings.setStyleChangeDetection(true);

        // Compare document
        ICompareResult result = comparer.compare(sourcePath, targetPath, comparisonSettings);

        Assert.assertNotNull(result);

        result.saveDocument(resultPath);
        // Get list of pages
        List<PageImage> resultImages = comparer.convertToImages(resultPath);

        Assert.assertNotNull(resultImages);

        // Save them as bitmap to separate folder
        for (PageImage pageImage : resultImages) {
            final InputStream pageStream = pageImage.getPageStream();

            Assert.assertNotNull(pageStream);

            final BufferedImage bufferedImage = ImageIO.read(pageStream);
            ImageIO.write(bufferedImage, "png", new File(resultPath.replace(resultName, "result_" + pageImage.getPageNumber()) + ".png"));
        }
    }

    @Test(timeout = 300000)
    public void testHowToGetDocumentInfo() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.docx", targetName = "target.docx", resultName = "result.docx";
        final String sourcePath = getStoragePath(sourceName);

        Informer informer = new Informer();
        // Get information about document from filePath
        DocumentInfo documentInfo = informer.getDocumentInfo(sourcePath);

        Assert.assertNotNull(documentInfo);
        Assert.assertTrue(documentInfo.getNumberOfPages() > 0);
        Assert.assertNotNull(documentInfo.getPagesData());
        Assert.assertTrue(documentInfo.getPagesData().size() > 0);
    }

    @Test(timeout = 300000)
    public void testHowToSetComparionDetailLevel() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.txt", targetName = "target.txt";
        final String sourcePath = getStoragePath(sourceName);
        final String targetPath = getStoragePath(targetName);

        ComparisonSettings comparisonSettings = new ComparisonSettings();
        comparisonSettings.setSensitivityOfComparison(100);
        Comparer compare = new Comparer();
        ICompareResult result = compare.compare(sourcePath, targetPath, comparisonSettings);

        Assert.assertNotNull(result);
        Assert.assertNotNull(result.getChanges());
        Assert.assertTrue(result.getChanges().length > 0);
    }
}
