package com.groupdocs.comparison.sample;


import com.groupdocs.comparison.common.license.License;

import java.io.File;

/**
 * The type Utilities.
 * @author Aleksey Permyakov
 */
class Utilities {
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
        final File sp = new File(STORAGE_PATH);
        final File op = new File(OUTPUT_PATH);
        if ((!sp.exists() && !sp.mkdirs()) || (!op.exists() && !op.mkdirs())) {
            System.err.println("Can't create data directories!!!");
        }
    }

    static void applyLicense() {
        License license = new License();
        license.setLicense(LICENSE_PATH);
    }

    static String getStoragePath(String fileName) {
        return STORAGE_PATH + "\\" + fileName;
    }

    static String getOutputPath(String fileName) {
        return OUTPUT_PATH + "\\" + fileName;
    }
}
