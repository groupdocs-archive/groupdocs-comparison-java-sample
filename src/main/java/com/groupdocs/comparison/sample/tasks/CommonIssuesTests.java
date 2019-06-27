package com.groupdocs.comparison.sample.tasks;

import com.groupdocs.comparison.Comparer;
import com.groupdocs.comparison.MultiComparer;
import com.groupdocs.comparison.common.changes.ChangeInfo;
import com.groupdocs.comparison.common.compareresult.ICompareResult;
import com.groupdocs.comparison.common.comparisonsettings.ComparisonSettings;
import com.groupdocs.comparison.common.license.License;
import com.groupdocs.comparison.sample.Utilities;
import org.apache.commons.io.IOUtils;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
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

    @Test(timeout = 300000)
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

    @Test(timeout = 300000)
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

    @Test(timeout = 300000)
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

    @Test(timeout = 300000)
    public void testCOMPARISONJAVA252() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pptx", targetName = "target.pptx", resultName = "COMPARISONJAVA252-output.ppt";
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
    @Test(timeout = 300000)
    public void testCOMPARISONJAVA247() throws Exception {
        Utilities.showTestHeader();
        unsetLicense();
        assertFalse(License.isValidLicense());
        applyLicense();
        assertTrue(License.isValidLicense());
    }

    @Test(timeout = 300000)
    public void testCOMPARISONJAVA419() throws Exception {
        Utilities.showTestHeader();
        {
            final String sourceName = "source-highlights.rtf", targetName = "target-highlights.rtf", resultName = "COMPARISONJAVA419-highlights.rtf";
            final String sourcePath = getStoragePath(sourceName, "COMPARISONJAVA419");
            final String targetPath = getStoragePath(targetName, "COMPARISONJAVA419");
            final String resultPath = getOutputPath(resultName);
            // Create instance of GroupDocs.Comparison.Comparer and call method
            // Compare.
            Comparer comparison = new Comparer();
            ComparisonSettings settings = new ComparisonSettings();
            settings.setStyleChangeDetection(true);
            settings.setGenerateSummaryPage(true);
            ICompareResult result = comparison.compare(sourcePath, targetPath, settings);
            result.saveDocument(resultPath);
        }
        {
            final String sourceName = "source-not-highlights.rtf", targetName = "target-not-highlights.rtf", resultName = "COMPARISONJAVA419-not-highlights.rtf";
            final String sourcePath = getStoragePath(sourceName, "COMPARISONJAVA419");
            final String targetPath = getStoragePath(targetName, "COMPARISONJAVA419");
            final String resultPath = getOutputPath(resultName);
            // Create instance of GroupDocs.Comparison.Comparer and call method
            // Compare.
            Comparer comparison = new Comparer();
            ComparisonSettings settings = new ComparisonSettings();
            settings.setStyleChangeDetection(true);
            settings.setGenerateSummaryPage(true);
            ICompareResult result = comparison.compare(sourcePath, targetPath, settings);
            result.saveDocument(resultPath);
        }
        {
            final String sourceName = "source-3.rtf",
                    targetName = "target-3.rtf",
                    resultName = "COMPARISONJAVA419-3.rtf";
            final String sourcePath = getStoragePath(sourceName, "COMPARISONJAVA419");
            final String targetPath = getStoragePath(targetName, "COMPARISONJAVA419");
            final String resultPath = getOutputPath(resultName);
            // Create instance of GroupDocs.Comparison.Comparer and call method
            // Compare.
            Comparer comparison = new Comparer();
            ComparisonSettings settings = new ComparisonSettings();
            settings.setStyleChangeDetection(true);
            settings.setGenerateSummaryPage(true);
            ICompareResult result = comparison.compare(sourcePath, targetPath, settings);
            result.saveDocument(resultPath);
        }
    }

    @Test(timeout = 300000)
    public void testCOMPARISONJAVA418() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "Test.pdf", targetName = "Test_Copy.pdf", resultName = "COMPARISONJAVA418-output.pdf";
        final String sourcePath = getStoragePath(sourceName, "COMPARISONJAVA418");
        final String targetPath = getStoragePath(targetName, "COMPARISONJAVA418");
        final String resultPath = getOutputPath(resultName);
        // Create instance of Comparer and call method
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourcePath, targetPath, new ComparisonSettings());
        result.saveDocument(resultPath);
    }

    @Test(timeout = 300000)
    public void testCOMPARISONJAVA383() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pdf", targetName = "target.pdf", resultName = "COMPARISONJAVA383-output.pdf";
        final String sourcePath = getStoragePath(sourceName, "COMPARISONJAVA383");
        final String targetPath = getStoragePath(targetName, "COMPARISONJAVA383");
        final String resultPath = getOutputPath(resultName);
        // Create instance of Comparer and call method
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourcePath, targetPath, new ComparisonSettings());
        result.saveDocument(resultPath);
    }

    @Test(timeout = 300000)
    public void testCOMPARISONJAVA381() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pdf", targetName = "target.pdf", resultName = "COMPARISONJAVA381-output.pdf";
        final String sourcePath = getStoragePath(sourceName, "COMPARISONJAVA381");
        final String targetPath = getStoragePath(targetName, "COMPARISONJAVA381");
        final String resultPath = getOutputPath(resultName);
        // Create instance of Comparer and call method
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourcePath, targetPath, new ComparisonSettings());
        result.saveDocument(resultPath);
    }

    @Test(timeout = 300000)
    public void testCOMPARISONJAVA380() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pdf", targetName = "target.pdf", resultName = "COMPARISONJAVA380-output.pdf";
        final String sourcePath = getStoragePath(sourceName, "COMPARISONJAVA380");
        final String targetPath = getStoragePath(targetName, "COMPARISONJAVA380");
        final String resultPath = getOutputPath(resultName);
        // Create instance of Comparer and call method
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourcePath, targetPath, new ComparisonSettings());
        result.saveDocument(resultPath);
    }

    @Test(timeout = 300000)
    public void testCOMPARISONJAVA377() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.html", targetName = "target.html", resultName = "COMPARISONJAVA377-output.html";
        final String sourcePath = getStoragePath(sourceName, "COMPARISONJAVA377");
        final String targetPath = getStoragePath(targetName, "COMPARISONJAVA377");
        final String resultPath = getOutputPath(resultName);
        // Create instance of Comparer and call method
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(sourcePath, targetPath, new ComparisonSettings()); // TODO: DEBUG 19.6
        result.saveDocument(resultPath);
    }

    @Test(timeout = 300000)
    @Ignore
    public void testCOMPARISONJAVA231() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "compara1.pdf", targetName = "compara2.pdf", resultName = "COMPARISONJAVA231-output.pdf";
        final String sourcePath = getStoragePath(sourceName, "COMPARISONJAVA231");
        final String targetPath = getStoragePath(targetName, "COMPARISONJAVA231");
        final String resultPath = getOutputPath(resultName);
        // Create instance of Comparer and call method
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(new FileInputStream(sourcePath), new FileInputStream(targetPath), new ComparisonSettings());
        result.saveDocument(resultPath);
    }

    @Test(timeout = 300000)
    public void testCOMPARISONJAVA420() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pdf", targetName = "target.pdf", resultName = "COMPARISONJAVA420-output.pdf";
        final String sourcePath = getStoragePath(sourceName, "COMPARISONJAVA420");
        final String targetPath = getStoragePath(targetName, "COMPARISONJAVA420");
        final String resultPath = getOutputPath(resultName);
        // Create instance of Comparer and call method
        Comparer comparer = new Comparer();
        ComparisonSettings settings = new ComparisonSettings();
        settings.setGenerateSummaryPage(true);
        settings.setStyleChangeDetection(true);

        ICompareResult result = comparer.compare(new FileInputStream(sourcePath), new FileInputStream(targetPath), settings);
        result.saveDocument(resultPath);

        System.out.println("Finished compare " + result.getChanges().length + " changes.");
        System.out.println("Report written to " + resultPath);
    }

    @Test(timeout = 300000)
    public void testCOMPARISONJAVA421() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pdf", targetName = "target.pdf", resultName = "COMPARISONJAVA421-output.pdf";
        final String sourcePath = getStoragePath(sourceName, "COMPARISONJAVA421");
        final String targetPath = getStoragePath(targetName, "COMPARISONJAVA421");
        final String resultPath = getOutputPath(resultName);
        // Create instance of Comparer and call method
        Comparer comparison = new Comparer();
        ICompareResult result = comparison.compare(new FileInputStream(sourcePath), new FileInputStream(targetPath), new ComparisonSettings());
        result.saveDocument(resultPath);
    }

    @Test(timeout = 300000)
    public void testCOMPARISONJAVA425() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pdf", targetName = "target.pdf", resultName = "COMPARISONJAVA425-output.pdf";
        final String sourcePath = getStoragePath(sourceName, "COMPARISONJAVA425");
        final String targetPath = getStoragePath(targetName, "COMPARISONJAVA425");
        final String resultPath = getOutputPath(resultName);

        Comparer comparer = new Comparer();
        ComparisonSettings settings = new ComparisonSettings();
        settings.setGenerateSummaryPage(true);
        settings.setStyleChangeDetection(true);

        ICompareResult result = comparer.compare(new FileInputStream(sourcePath), new FileInputStream(targetPath), settings);
        result.saveDocument(resultPath);

        System.out.println("Finished compare " + result.getChanges().length + " changes.");
        System.out.println("Report written to " + resultPath);
    }

    @Test(timeout = 300000)
    public void testCOMPARISONJAVA426() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pdf", targetName = "target.pdf", resultName = "COMPARISONJAVA426-output.pdf";
        final String sourcePath = getStoragePath(sourceName, "COMPARISONJAVA426");
        final String targetPath = getStoragePath(targetName, "COMPARISONJAVA426");
        final String resultPath = getOutputPath(resultName);

        Comparer comparer = new Comparer();
        ComparisonSettings settings = new ComparisonSettings();
        settings.setGenerateSummaryPage(true);
        settings.setStyleChangeDetection(true);

        ICompareResult result = comparer.compare(new FileInputStream(sourcePath), new FileInputStream(targetPath), settings);
        result.saveDocument(resultPath);

        System.out.println("Finished compare " + result.getChanges().length + " changes.");
        System.out.println("Report written to " + resultPath);
    }

    @Test(timeout = 300000)
    public void testCOMPARISONJAVA430() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pdf", targetName = "target.pdf", resultName = "COMPARISONJAVA430-output.pdf";
        final String sourcePath = getStoragePath(sourceName, "COMPARISONJAVA430");
        final String targetPath = getStoragePath(targetName, "COMPARISONJAVA430");
        final String resultPath = getOutputPath(resultName);

        Comparer comparer = new Comparer();
        ComparisonSettings settings = new ComparisonSettings();
        settings.setShowDeletedContent(true);
        settings.setGenerateSummaryPage(true);
        settings.setStyleChangeDetection(true);

        ICompareResult result = comparer.compare(sourcePath, targetPath, settings);
        result.saveDocument(resultPath);

        System.out.println("Finished compare " + result.getChanges().length + " changes.");
        System.out.println("Report written to " + resultPath);
    }

    @Test(timeout = 300000)
    public void testCOMPARISONJAVA431() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pdf", targetName = "target.pdf", resultName = "COMPARISONJAVA431-output.pdf";
        final String sourcePath = getStoragePath(sourceName, "COMPARISONJAVA431");
        final String targetPath = getStoragePath(targetName, "COMPARISONJAVA431");
        final String resultPath = getOutputPath(resultName);

        Comparer comparer = new Comparer();
        ComparisonSettings settings = new ComparisonSettings();
        settings.setShowDeletedContent(true);
        settings.setGenerateSummaryPage(true);
        settings.setStyleChangeDetection(true);

        ICompareResult result = comparer.compare(sourcePath, targetPath, settings);
        result.saveDocument(resultPath);

        System.out.println("Finished compare " + result.getChanges().length + " changes.");
        System.out.println("Report written to " + resultPath);
    }

    @Test(timeout = 300000)
    public void testCOMPARISONJAVA374() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pdf", targetName = "target.pdf", resultName = "COMPARISONJAVA374-output.pdf";
        final String sourcePath = getStoragePath(sourceName, "COMPARISONJAVA374");
        final String targetPath = getStoragePath(targetName, "COMPARISONJAVA374");
        final String resultPath = getOutputPath(resultName);
        //
        final Comparer comparer = new Comparer();
        // create setting for comparing
        final ComparisonSettings settings = new ComparisonSettings();
        List<Thread> threads = new ArrayList<Thread>();

        for (int n = 0; n < 10; n++) {
            // compare two documents
            final Thread thread = new Thread() {
                @Override
                public void run() {
                    try {
                        ICompareResult compareResult = comparer.compare(new FileInputStream(sourcePath), null, new FileInputStream(targetPath), null, settings); // TODO: DEBUG 19.6
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                        fail();
                    }
                }
            };
            thread.start();
            threads.add(thread);
        }
        Thread.sleep(300);
        for (Thread thread : threads) {
            if (!thread.isInterrupted()) {
                thread.interrupt();
            }
        }
    }

    @Test(timeout = 300000)
    public void testCOMPARISONJAVA374_2() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "hot_frog.pdf", targetName = "hot_frog-1.pdf", resultName = "COMPARISONJAVA374_2-output.pdf";
        final String sourcePath = getStoragePath(sourceName, "COMPARISONJAVA374_2");
        final String targetPath = getStoragePath(targetName, "COMPARISONJAVA374_2");
        final String resultPath = getOutputPath(resultName);
        //
        final Comparer comparer = new Comparer();
        // create setting for comparing
        final ComparisonSettings settings = new ComparisonSettings();
        List<Thread> threads = new ArrayList<Thread>();

        for (int n = 0; n < 30; n++) {
            // compare two documents
            final Thread thread = new Thread() {
                @Override
                public void run() {
                    try {
                        ICompareResult compareResult = comparer.compare(new FileInputStream(sourcePath), null, new FileInputStream(targetPath), null, settings);
                        assertNotNull(compareResult);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                        fail();
                    }
                }
            };
            thread.start();
            threads.add(thread);
        }
        Thread.sleep(300);
        for (Thread thread : threads) {
            if (!thread.isInterrupted()) {
                thread.interrupt();
            }
        }
    }

    @Test(timeout = 300000)
    public void testCOMPARISONJAVA373() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "karta_izo_parole.docx", targetName = "karta_izo_parole1.docx", resultName = "COMPARISONJAVA373-output.docx";
        final String sourcePath = getStoragePath(sourceName, "COMPARISONJAVA373");
        final String targetPath = getStoragePath(targetName, "COMPARISONJAVA373");
        final String resultPath = getOutputPath(resultName);
        //
        final Comparer comparer = new Comparer();
        // create setting for comparing
        final ComparisonSettings settings = new ComparisonSettings();

        ICompareResult compareResult = comparer.compare(new FileInputStream(sourcePath), "parole", new FileInputStream(targetPath), "parole", settings);

        compareResult.saveDocument(resultPath);
    }

    @Test(timeout = 300000)
    public void testCOMPARISONJAVA372() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "git_internals.pptx", targetName = "git_internals-1.pptx", resultName = "COMPARISONJAVA372-output.pptx";
        final String sourcePath = getStoragePath(sourceName, "COMPARISONJAVA372");
        final String targetPath = getStoragePath(targetName, "COMPARISONJAVA372");
        final String resultPath = getOutputPath(resultName);
        //
        final Comparer comparer = new Comparer();
        // create setting for comparing
        final ComparisonSettings settings = new ComparisonSettings();

        ICompareResult compareResult = comparer.compare(sourcePath, targetPath, settings);

        final List<InputStream> images = compareResult.getImages();
    }

    @Test(timeout = 300000)
    public void testCOMPARISONJAVA379() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "hot_frog.pdf", targetName = "hot_frog-1.pdf", resultName = "COMPARISONJAVA379-output.pptx";
        final String sourcePath = getStoragePath(sourceName, "COMPARISONJAVA379");
        final String targetPath = getStoragePath(targetName, "COMPARISONJAVA379");
        final String resultPath = getOutputPath(resultName);
        //
        List<String> targetList = new ArrayList<String>();
        targetList.add(sourcePath);
        targetList.add(targetPath);
        // create new comparer
        MultiComparer multiComparer = new MultiComparer();
        // create setting for comparing
        ComparisonSettings settings = new ComparisonSettings();

        ICompareResult compareResult = multiComparer.compare(sourcePath, targetList, settings);
        final ChangeInfo[] changes = compareResult.getChanges();
        System.out.println("Changes count - " + changes.length);
    }

    @Test(timeout = 300000)
    public void testCOMPARISONJAVA376() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "letter.txt", targetName = "letter2.txt", resultName = "COMPARISONJAVA376-output.pptx";
        final String sourcePath = getStoragePath(sourceName, "COMPARISONJAVA376");
        final String targetPath = getStoragePath(targetName, "COMPARISONJAVA376");
        final String resultPath = getOutputPath(resultName);
        //
        Comparer comparer = new Comparer();
        // create setting for comparing
        ComparisonSettings settings = new ComparisonSettings();

        // compare two documents
        ICompareResult compare = comparer.compare(sourcePath, targetPath, settings);

        if (compare == null) {
            System.err.println("compare result is null");
            fail();
        } else {
            System.out.println(compare.getChanges().length);
            compare.saveDocument(resultPath);
        }
    }

    @Test(timeout = 300000)
    public void testCOMPARISONJAVA447() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source.pdf", targetName = "target.pdf", resultName = "COMPARISONJAVA447-output.pdf";
        final String sourcePath = getStoragePath(sourceName, "COMPARISONJAVA447");
        final String targetPath = getStoragePath(targetName, "COMPARISONJAVA447");
        final String resultPath = getOutputPath(resultName);
        ComparisonSettings settings = new ComparisonSettings();
        settings.setStyleChangeDetection(true);

        Comparer comparer = new Comparer();
        ICompareResult result = comparer.compare(sourcePath, targetPath, settings);

        result.saveDocument(resultPath);
        assertEquals(0, result.getCountOfErrors());
    }

    @Test(timeout = 300000)
    public void testCOMPARISONJAVA78() throws Exception {
        Utilities.showTestHeader();
        final String sourceName = "source50p.pdf", targetName = "target50p.pdf", resultName = "COMPARISONJAVA78-output.pdf";
        final String sourcePath = getStoragePath(sourceName, "COMPARISONJAVA78");
        final String targetPath = getStoragePath(targetName, "COMPARISONJAVA78");
        final String resultPath = getOutputPath(resultName);

        for (int n = 0; n < 10; n++) {
            final long before = new Date().getTime();

            InputStream sourceStream = new FileInputStream(sourcePath);
            InputStream targetStream = new FileInputStream(targetPath);
            // Compare.
            Comparer comparison = new Comparer();
            ICompareResult result = comparison.compare(sourceStream, targetStream, new ComparisonSettings());
            result.saveDocument(resultPath);

            final long after = new Date().getTime();
            final double resultTime = (after - before) / 1000d;

            System.out.println("Time: " + resultTime + " sec");
            assertTrue(resultTime < 10);
        }
    }

//    @Test(timeout = 300000)
//    public void testCOMPARISONJAVAXXX() throws Exception {
//        //
//    }
}
