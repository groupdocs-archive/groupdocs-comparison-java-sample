package com.groupdocs.comparison.sample.operations;


import org.testng.annotations.Test;

/**
 * @author Aleksey Permyakov on 10.08.2016.
 */
@SuppressWarnings("all")
public class OtherOperationsTests {

    @Test
    public void testMock() throws Exception {
    }
//    @Test
//    public void testHowToGetWidthAndHeightOfPageImages() throws Exception {
//
//        final String sourceName = "source.docx";
//        final Path sourcePath = getStoragePath(sourceName);
//
//        Comparer comparer = new Comparer(sourcePath);
//        // get the list of pages as images
//        List<PageImage> sourceImages = comparer.convertToImages(sourcePath);
//        // getting sizes of first page
//        int height = sourceImages.get(0).getHeight();
//        int width = sourceImages.get(0).getWidth();
//
//        Assert.assertNotNull(height);
//        Assert.assertNotNull(width);
//    }
//
//    @Test
//    public void testHowToGetCoordinateOfTheFirstChange() throws Exception {
//
//        final String sourceName = "source.docx", targetName = "target.docx";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//
//        Comparer comparer = new Comparer(sourcePath);
//        // Settings
//        ComparisonSettings comparisonSettings = new ComparisonSettings();
//        comparisonSettings.setCalculateCoordinates(true);
//        // Compare documents
//        ICompareResult compareResult = comparer.compare(sourcePath, targetPath, comparisonSettings);
//        // Getting sizes of the first change
//        ChangeInfo[] changes = compareResult.getChanges();
//        // Coordinates of first change
//        final Rectangle rectangle = changes[0].getBox();
//
//        Assert.assertNotNull(rectangle);
//    }
//
//    @Test
//    public void testHowToUseCoordinatesOfChanges() throws Exception {
//
//        final String sourceName = "source.docx", targetName = "target.docx", resultName = "result.docx";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(targetName);
//
//        ComparisonSettings comparisonSettings = new ComparisonSettings();
//        comparisonSettings.setDetectStyleChanges(true);
//        //this setting specify that we want to have change coordinates
//        comparisonSettings.setCalculateCoordinates(true);
//        comparisonSettings.setDetailLevel(DetailLevel.High);
//
//        Comparer comparer = new Comparer(sourcePath);
//        comparer.compare(sourcePath, targetPath, comparisonSettings);
//        result.saveDocument(resultPath);
//
//
//        List<PageImage> resultImages = comparer.convertToImages(resultPath);
//        final ChangeInfo[] changes = result.getChanges();
//
//        Assert.assertNotNull(changes);
//
//        // Below the one of cases how we could use changes coordinates.
//        // We are passing through pages object and draw a rectangle in the coordinates of changes
//        for (PageImage pageImage : resultImages) {
//            final InputStream pageStream = pageImage.getPageStream();
//
//            Assert.assertNotNull(pageStream);
//
//            final BufferedImage bufferedImage = ImageIO.read(pageStream);
//            final Graphics graphics = bufferedImage.getGraphics();
//            for (ChangeInfo changeInfo : changes) {
//                final Rectangle rectangle = changeInfo.getBox();
//                //if something was Inserted draw a Blue rectange
//                if (changeInfo.getType() == TypeChanged.Inserted) {
//                    graphics.setColor(Color.BLUE);
//                    graphics.drawRect((int) rectangle.getX(), (int) rectangle.getY(), (int) rectangle.getWidth(), (int) rectangle.getHeight());
//                }
//                //if something was Deleted draw a Red rectange
//                if (changeInfo.getType() == TypeChanged.Deleted) {
//
//                    graphics.setColor(Color.RED);
//                    graphics.drawRect((int) rectangle.getX(), (int) rectangle.getY(), (int) rectangle.getWidth(), (int) rectangle.getHeight());
//                }
//                //if something was Changes draw a Green rectange
//                if (changeInfo.getType() == TypeChanged.StyleChanged) {
//                    graphics.setColor(Color.GREEN);
//                    graphics.drawRect((int) rectangle.getX(), (int) rectangle.getY(), (int) rectangle.getWidth(), (int) rectangle.getHeight());
//                }
//            }
//            ImageIO.write(bufferedImage, "png", new File(resultPath.replace(resultName, "result_" + pageImage.getPageNumber()) + ".png"));
//            graphics.dispose();
//            pageStream.close();
//        }
//    }
//
//    @Test
//    public void testHowToGetImageRepresentationOfDocumentPages() throws Exception {
//
//        final String sourceName = "source.docx", targetName = "target.docx", resultName = "result.docx";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//        final Path resultPath = getOutputPath(targetName);
//
//        Comparer comparer = new Comparer(sourcePath);
//        ComparisonSettings comparisonSettings = new ComparisonSettings();
//        comparisonSettings.setDetectStyleChanges(true);
//
//        // Compare document
//        comparer.compare(sourcePath, targetPath, comparisonSettings);
//
//        Assert.assertNotNull(result);
//
//        result.saveDocument(resultPath);
//        // Get list of pages
//        List<PageImage> resultImages = comparer.convertToImages(resultPath);
//
//        Assert.assertNotNull(resultImages);
//
//        // Save them as bitmap to separate folder
//        for (PageImage pageImage : resultImages) {
//            final InputStream pageStream = pageImage.getPageStream();
//
//            Assert.assertNotNull(pageStream);
//
//            final BufferedImage bufferedImage = ImageIO.read(pageStream);
//            ImageIO.write(bufferedImage, "png", new File(resultPath.replace(resultName, "result_" + pageImage.getPageNumber()) + ".png"));
//        }
//    }
//
//    @Test
//    public void testHowToGetDocumentInfo() throws Exception {
//
//        final String sourceName = "source.docx", targetName = "target.docx", resultName = "result.docx";
//        final Path sourcePath = getStoragePath(sourceName);
//
//        Informer informer = new Informer();
//        // Get information about document from filePath
//        DocumentInfo documentInfo = informer.getDocumentInfo(sourcePath);
//
//        Assert.assertNotNull(documentInfo);
//        Assert.assertTrue(documentInfo.getNumberOfPages() > 0);
//        Assert.assertNotNull(documentInfo.getPagesData());
//        Assert.assertTrue(documentInfo.getPagesData().size() > 0);
//    }
//
//    @Test
//    public void testHowToSetComparionDetailLevel() throws Exception {
//
//        final String sourceName = "source.txt", targetName = "target.txt";
//        final Path sourcePath = getStoragePath(sourceName);
//        final Path targetPath = getStoragePath(targetName);
//
//        ComparisonSettings comparisonSettings = new ComparisonSettings();
//        comparisonSettings.setSensitivityOfComparison(100);
//        Comparer compare = new Comparer(sourcePath);
//        compare.compare(sourcePath, targetPath, comparisonSettings);
//
//        Assert.assertNotNull(result);
//        Assert.assertNotNull(result.getChanges());
//        Assert.assertTrue(result.getChanges().length > 0);
//    }
}
