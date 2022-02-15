package com.groupdocs.comparison.sample.operations;

import com.groupdocs.comparison.Comparer;
import com.groupdocs.comparison.ComparerSettings;
import com.groupdocs.comparison.license.Metered;
import com.groupdocs.comparison.options.CompareOptions;
import com.groupdocs.comparison.options.load.LoadOptions;
import com.groupdocs.comparison.sample.config.TestNGSetUp;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import static com.groupdocs.comparison.sample.TestRunner.getStoragePath;

/**
 * The type View generator.
 *
 * @author Aleksey Permyakov
 */
@SuppressWarnings("all")
public class CommonOperationsTests extends TestNGSetUp {

    @Test
    public void testMeteredLicenseAndLimits() {
        if (Boolean.parseBoolean("true")) { // Not ot comment sources below
            throw new SkipException("publicKey and privateKey must be set");
        }
        String publicKey = "*****"; // Your public license key
        String privateKey = "*****"; // Your private license key
        Metered metered = new Metered();
        metered.setMeteredKey(publicKey, privateKey);
        System.out.println("License set successfully.");

        // Get amount (MB) consumed
        double amountConsumed = Metered.getConsumptionQuantity();
        System.out.println("Amount (MB) consumed: " + amountConsumed);

        // Get count of credits consumed
        double creditsConsumed = Metered.getConsumptionCredit();
        System.out.println("Credits consumed: " + creditsConsumed);
    }

    // region docx

    @Test
    public void testCompareTwoWordsWithString() throws Exception {
        final String sourceName = "source.docx", targetName = "target.docx", resultExtension = ".docx";
        final Path sourcePath = getStoragePath(sourceName);
        final Path targetPath = getStoragePath(targetName);

        try (Comparer comparer = new Comparer(sourcePath.toAbsolutePath().toString())) {
            comparer.add(targetPath.toAbsolutePath().toString());
            comparer.compare();
        }
    }

    @Test
    public void testCompareTwoWordsWithPath() throws Exception {
        final String sourceName = "source.docx", targetName = "target.docx", resultExtension = ".docx";
        final Path sourcePath = getStoragePath(sourceName);
        final Path targetPath = getStoragePath(targetName);

        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);
            comparer.compare();
        }
    }

    @Test
    public void testCompareTwoWordsWithStream() throws Exception {
        final String sourceName = "source.docx", targetName = "target.docx", resultExtension = ".docx";
        final Path sourcePath = getStoragePath(sourceName);
        final Path targetPath = getStoragePath(targetName);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             Comparer comparer = new Comparer(sourceStream)) {
            comparer.add(targetStream);
            comparer.compare();
        }
    }

    @Test
    public void testCompareTwoWordsWithStringAndResult() throws Exception {
        final String sourceName = "source.docx", targetName = "target.docx", resultExtension = ".docx";
        final Path sourcePath = getStoragePath(sourceName);
        final Path targetPath = getStoragePath(targetName);
        final Path resultPath = getOutputPath(resultExtension);

        try (Comparer comparer = new Comparer(sourcePath.toAbsolutePath().toString())) {
            comparer.add(targetPath.toAbsolutePath().toString());
            comparer.compare(resultPath.toAbsolutePath().toString());

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertNotEquals(size, 0, "Result is empty");
        }
    }

    @Test
    public void testCompareTwoWordsWithPathAndResult() throws Exception {
        final String sourceName = "source.docx", targetName = "target.docx", resultExtension = ".docx";
        final Path sourcePath = getStoragePath(sourceName);
        final Path targetPath = getStoragePath(targetName);
        final Path resultPath = getOutputPath(resultExtension);

        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);
            comparer.compare(resultPath);

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertNotEquals(size, 0, "Result is empty");
        }
    }

    @Test
    public void testCompareTwoWordsWithStreamAndResult() throws Exception {
        final String sourceName = "source.docx", targetName = "target.docx", resultExtension = ".docx";
        final Path sourcePath = getStoragePath(sourceName);
        final Path targetPath = getStoragePath(targetName);
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream)) {
            comparer.add(targetStream);
            comparer.compare(resultStream);

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertNotEquals(size, 0, "Result is empty");
        }
    }

    @Test
    public void testCompareTwoWordsWithStringAndResultAndComparerSettings() throws Exception {
        final String sourceName = "source.docx", targetName = "target.docx", resultExtension = ".docx";
        final Path sourcePath = getStoragePath(sourceName);
        final Path targetPath = getStoragePath(targetName);
        final Path resultPath = getOutputPath(resultExtension);

        ComparerSettings comparerSettings = new ComparerSettings();
        try (Comparer comparer = new Comparer(sourcePath.toAbsolutePath().toString(), comparerSettings)) {
            comparer.add(targetPath.toAbsolutePath().toString());
            comparer.compare(resultPath.toAbsolutePath().toString());

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertNotEquals(size, 0, "Result is empty");
        }
    }

    @Test
    public void testCompareTwoWordsWithPathAndResultAndComparerSettings() throws Exception {
        final String sourceName = "source.docx", targetName = "target.docx", resultExtension = ".docx";
        final Path sourcePath = getStoragePath(sourceName);
        final Path targetPath = getStoragePath(targetName);
        final Path resultPath = getOutputPath(resultExtension);

        ComparerSettings comparerSettings = new ComparerSettings();
        try (Comparer comparer = new Comparer(sourcePath, comparerSettings)) {
            comparer.add(targetPath);
            comparer.compare(resultPath);

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertNotEquals(size, 0, "Result is empty");
        }
    }

    @Test
    public void testCompareTwoWordsWithStreamAndResultAndComparerSettings() throws Exception {
        final String sourceName = "source.docx", targetName = "target.docx", resultExtension = ".docx";
        final Path sourcePath = getStoragePath(sourceName);
        final Path targetPath = getStoragePath(targetName);
        final Path resultPath = getOutputPath(resultExtension);

        ComparerSettings comparerSettings = new ComparerSettings();
        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, comparerSettings)) {
            comparer.add(targetStream);
            comparer.compare(resultStream);

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertNotEquals(size, 0, "Result is empty");
        }
    }

    @Test
    public void testCompareTwoWordsWithStringAndResultAndGenerateSummaryPage() throws Exception {
        final String sourceName = "source.docx", targetName = "target.docx", resultExtension = ".docx";
        final Path sourcePath = getStoragePath(sourceName);
        final Path targetPath = getStoragePath(targetName);
        final Path resultPath = getOutputPath(resultExtension);

        try (Comparer comparer = new Comparer(sourcePath.toAbsolutePath().toString())) {
            comparer.add(targetPath.toAbsolutePath().toString());

            CompareOptions compareOptions = new CompareOptions();
            compareOptions.setGenerateSummaryPage(true);
            comparer.compare(resultPath.toAbsolutePath().toString(),
                    new CompareOptions.Builder()
                            .setGenerateSummaryPage(true)
                            .build());

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertNotEquals(size, 0, "Result is empty");
        }
    }

    @Test
    public void testCompareTwoWordsWithPathAndResultAndGenerateSummaryPage() throws Exception {
        final String sourceName = "source.docx", targetName = "target.docx", resultExtension = ".docx";
        final Path sourcePath = getStoragePath(sourceName);
        final Path targetPath = getStoragePath(targetName);
        final Path resultPath = getOutputPath(resultExtension);

        try (Comparer comparer = new Comparer(sourcePath)) {
            comparer.add(targetPath);

            comparer.compare(resultPath,
                    new CompareOptions.Builder()
                            .setGenerateSummaryPage(true)
                            .build());

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertNotEquals(size, 0, "Result is empty");
        }
    }

    @Test
    public void testCompareTwoWordsWithStreamAndResultAndGenerateSummaryPage() throws Exception {
        final String sourceName = "source.docx", targetName = "target.docx", resultExtension = ".docx";
        final Path sourcePath = getStoragePath(sourceName);
        final Path targetPath = getStoragePath(targetName);
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream)) {
            comparer.add(targetStream);
            comparer.compare(resultStream,
                    new CompareOptions.Builder()
                            .setGenerateSummaryPage(true)
                            .build());

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertNotEquals(size, 0, "Result is empty");
        }
    }

    // endregion

    // region docx with password

    @Test
    public void testCompareTwoEncryptedWordsWithString() throws Exception {
        final String sourceName = "source-encrypted.docx", targetName = "target-encrypted.docx", resultExtension = ".docx";
        final String sourcePassword = "pass", targetPassword = "pass";
        final Path sourcePath = getStoragePath(sourceName);
        final Path targetPath = getStoragePath(targetName);

        try (Comparer comparer = new Comparer(sourcePath.toAbsolutePath().toString(), new LoadOptions(sourcePassword))) {
            comparer.add(targetPath.toAbsolutePath().toString(), new LoadOptions(targetPassword));
            comparer.compare();
        }
    }

    @Test
    public void testCompareTwoEncryptedWordsWithPath() throws Exception {
        final String sourceName = "source-encrypted.docx", targetName = "target-encrypted.docx", resultExtension = ".docx";
        final String sourcePassword = "pass", targetPassword = "pass";
        final Path sourcePath = getStoragePath(sourceName);
        final Path targetPath = getStoragePath(targetName);

        try (Comparer comparer = new Comparer(sourcePath, new LoadOptions(sourcePassword))) {
            comparer.add(targetPath, new LoadOptions(targetPassword));
            comparer.compare();
        }
    }

    @Test
    public void testCompareTwoEncryptedWordsWithStream() throws Exception {
        final String sourceName = "source-encrypted.docx", targetName = "target-encrypted.docx", resultExtension = ".docx";
        final String sourcePassword = "pass", targetPassword = "pass";
        final Path sourcePath = getStoragePath(sourceName);
        final Path targetPath = getStoragePath(targetName);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new LoadOptions(sourcePassword))) {
            comparer.add(targetStream, new LoadOptions(targetPassword));
            comparer.compare();
        }
    }

    @Test
    public void testCompareTwoEncryptedWordsWithStringAndResult() throws Exception {
        final String sourceName = "source-encrypted.docx", targetName = "target-encrypted.docx", resultExtension = ".docx";
        final String sourcePassword = "pass", targetPassword = "pass";
        final Path sourcePath = getStoragePath(sourceName);
        final Path targetPath = getStoragePath(targetName);
        final Path resultPath = getOutputPath(resultExtension);

        try (Comparer comparer = new Comparer(sourcePath.toAbsolutePath().toString(), new LoadOptions(sourcePassword))) {
            comparer.add(targetPath.toAbsolutePath().toString(), new LoadOptions(targetPassword));
            comparer.compare(resultPath.toAbsolutePath().toString());

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertNotEquals(size, 0, "Result is empty");
        }
    }

    @Test
    public void testCompareTwoEncryptedWordsWithPathAndResult() throws Exception {
        final String sourceName = "source-encrypted.docx", targetName = "target-encrypted.docx", resultExtension = ".docx";
        final String sourcePassword = "pass", targetPassword = "pass";
        final Path sourcePath = getStoragePath(sourceName);
        final Path targetPath = getStoragePath(targetName);
        final Path resultPath = getOutputPath(resultExtension);

        try (Comparer comparer = new Comparer(sourcePath, new LoadOptions(sourcePassword))) {
            comparer.add(targetPath, new LoadOptions(targetPassword));
            comparer.compare(resultPath);

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertNotEquals(size, 0, "Result is empty");
        }
    }

    @Test
    public void testCompareTwoEncryptedWordsWithStreamAndResult() throws Exception {
        final String sourceName = "source-encrypted.docx", targetName = "target-encrypted.docx", resultExtension = ".docx";
        final String sourcePassword = "pass", targetPassword = "pass";
        final Path sourcePath = getStoragePath(sourceName);
        final Path targetPath = getStoragePath(targetName);
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new LoadOptions(sourcePassword))) {
            comparer.add(targetStream, new LoadOptions(targetPassword));
            comparer.compare(resultStream);

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertNotEquals(size, 0, "Result is empty");
        }
    }

    @Test
    public void testCompareTwoEncryptedWordsWithStringAndResultAndComparerSettings() throws Exception {
        final String sourceName = "source-encrypted.docx", targetName = "target-encrypted.docx", resultExtension = ".docx";
        final String sourcePassword = "pass", targetPassword = "pass";
        final Path sourcePath = getStoragePath(sourceName);
        final Path targetPath = getStoragePath(targetName);
        final Path resultPath = getOutputPath(resultExtension);

        ComparerSettings comparerSettings = new ComparerSettings();
        try (Comparer comparer = new Comparer(sourcePath.toAbsolutePath().toString(), new LoadOptions(sourcePassword), comparerSettings)) {
            comparer.add(targetPath.toAbsolutePath().toString(), new LoadOptions(targetPassword));
            comparer.compare(resultPath.toAbsolutePath().toString());

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertNotEquals(size, 0, "Result is empty");
        }
    }

    @Test
    public void testCompareTwoEncryptedWordsWithPathAndResultAndComparerSettings() throws Exception {
        final String sourceName = "source-encrypted.docx", targetName = "target-encrypted.docx", resultExtension = ".docx";
        final String sourcePassword = "pass", targetPassword = "pass";
        final Path sourcePath = getStoragePath(sourceName);
        final Path targetPath = getStoragePath(targetName);
        final Path resultPath = getOutputPath(resultExtension);

        ComparerSettings comparerSettings = new ComparerSettings();
        try (Comparer comparer = new Comparer(sourcePath, new LoadOptions(sourcePassword), comparerSettings)) {
            comparer.add(targetPath, new LoadOptions(targetPassword));
            comparer.compare(resultPath);

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertNotEquals(size, 0, "Result is empty");
        }
    }

    @Test
    public void testCompareTwoEncryptedWordsWithStreamAndResultAndComparerSettings() throws Exception {
        final String sourceName = "source-encrypted.docx", targetName = "target-encrypted.docx", resultExtension = ".docx";
        final String sourcePassword = "pass", targetPassword = "pass";
        final Path sourcePath = getStoragePath(sourceName);
        final Path targetPath = getStoragePath(targetName);
        final Path resultPath = getOutputPath(resultExtension);

        ComparerSettings comparerSettings = new ComparerSettings();
        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new LoadOptions(sourcePassword), comparerSettings)) {
            comparer.add(targetStream, new LoadOptions(targetPassword));
            comparer.compare(resultStream);

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertNotEquals(size, 0, "Result is empty");
        }
    }

    @Test
    public void testCompareTwoEncryptedWordsWithStringAndResultAndGenerateSummaryPage() throws Exception {
        final String sourceName = "source-encrypted.docx", targetName = "target-encrypted.docx", resultExtension = ".docx";
        final String sourcePassword = "pass", targetPassword = "pass";
        final Path sourcePath = getStoragePath(sourceName);
        final Path targetPath = getStoragePath(targetName);
        final Path resultPath = getOutputPath(resultExtension);

        try (Comparer comparer = new Comparer(sourcePath.toAbsolutePath().toString(), new LoadOptions(sourcePassword))) {
            comparer.add(targetPath.toAbsolutePath().toString(), new LoadOptions(targetPassword));

            CompareOptions compareOptions = new CompareOptions();
            compareOptions.setGenerateSummaryPage(true);
            comparer.compare(resultPath.toAbsolutePath().toString(),
                    new CompareOptions.Builder()
                            .setGenerateSummaryPage(true)
                            .build());

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertNotEquals(size, 0, "Result is empty");
        }
    }

    @Test
    public void testCompareTwoEncryptedWordsWithPathAndResultAndGenerateSummaryPage() throws Exception {
        final String sourceName = "source-encrypted.docx", targetName = "target-encrypted.docx", resultExtension = ".docx";
        final String sourcePassword = "pass", targetPassword = "pass";
        final Path sourcePath = getStoragePath(sourceName);
        final Path targetPath = getStoragePath(targetName);
        final Path resultPath = getOutputPath(resultExtension);

        try (Comparer comparer = new Comparer(sourcePath, new LoadOptions(sourcePassword))) {
            comparer.add(targetPath, new LoadOptions(targetPassword));

            comparer.compare(resultPath,
                    new CompareOptions.Builder()
                            .setGenerateSummaryPage(true)
                            .build());

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertNotEquals(size, 0, "Result is empty");
        }
    }

    @Test
    public void testCompareTwoEncryptedWordsWithStreamAndResultAndGenerateSummaryPage() throws Exception {
        final String sourceName = "source-encrypted.docx", targetName = "target-encrypted.docx", resultExtension = ".docx";
        final String sourcePassword = "pass", targetPassword = "pass";
        final Path sourcePath = getStoragePath(sourceName);
        final Path targetPath = getStoragePath(targetName);
        final Path resultPath = getOutputPath(resultExtension);

        try (InputStream sourceStream = new FileInputStream(sourcePath.toFile());
             InputStream targetStream = new FileInputStream(targetPath.toFile());
             OutputStream resultStream = new FileOutputStream(resultPath.toFile());
             Comparer comparer = new Comparer(sourceStream, new LoadOptions(sourcePassword))) {
            comparer.add(targetStream, new LoadOptions(targetPassword));
            comparer.compare(resultStream,
                    new CompareOptions.Builder()
                            .setGenerateSummaryPage(true)
                            .build());

            final long size = Files.size(resultPath);
            System.out.println("Stream size: " + size);
            Assert.assertNotEquals(size, 0, "Result is empty");
        }
    }

    // endregion
}
