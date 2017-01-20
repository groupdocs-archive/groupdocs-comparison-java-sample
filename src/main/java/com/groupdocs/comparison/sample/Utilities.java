package com.groupdocs.comparison.sample;


import com.groupdocs.comparison.common.license.License;

import java.io.File;

/**
 * The type Utilities.
 * @author Aleksey Permyakov
 */
public class Utilities {
    /**
     * The constant PROJECT_PATH.
     */
    private static String PROJECT_PATH = new File("Data").getAbsolutePath();
    /**
     * The constant STORAGE_PATH.
     */
    private static String STORAGE_PATH = PROJECT_PATH + "\\Storage";
    /**
     * The constant OUTPUT_HTML_PATH.
     */
    private static String OUTPUT_PATH = PROJECT_PATH + "\\Output";
    /**
     * The constant LICENSE_PATH.
     */
    private static String LICENSE_PATH = STORAGE_PATH + "\\GroupDocs.Total.Java.lic";

    static {
        final java.io.File sp = new java.io.File(STORAGE_PATH);
        final java.io.File op = new java.io.File(OUTPUT_PATH);
        final java.io.File lcp = new java.io.File(LICENSE_PATH);
        if (!lcp.exists()) {
            LICENSE_PATH = System.getenv("GROUPDOCS_TOTAL");
            System.out.println("License file does not exists! Using license from %GROUPDOCS_TOTAL% ...");
        }
        if ((!sp.exists() && !sp.mkdirs()) || (!op.exists() && !op.mkdirs())) {
            System.err.println("Can't create data directories!!!");
        }
    }

    static void applyLicense() {
        License lic = new License();
        if (LICENSE_PATH != null && new File(LICENSE_PATH).exists()) {
            lic.setLicense(LICENSE_PATH);
        }
    }

    public static String getStoragePath(String fileName, String... subDirectories) {
        StringBuilder builder = new StringBuilder(STORAGE_PATH);
        for (String part : subDirectories) {
            builder.append(File.separator).append(part);
        }
        return builder.append(File.separator).append(fileName).toString();
    }

    public static String getOutputPath(String fileName) {
        return OUTPUT_PATH + "\\" + fileName;
    }
}
