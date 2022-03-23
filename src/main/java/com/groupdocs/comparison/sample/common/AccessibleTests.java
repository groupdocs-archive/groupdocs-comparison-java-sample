package com.groupdocs.comparison.sample.common;

import com.groupdocs.comparison.Comparer;
import com.groupdocs.comparison.ComparerSettings;
import com.groupdocs.comparison.Document;
import com.groupdocs.comparison.common.delegates.Delegates;
import com.groupdocs.comparison.common.exceptions.*;
import com.groupdocs.comparison.interfaces.IDocumentInfo;
import com.groupdocs.comparison.license.License;
import com.groupdocs.comparison.license.Metered;
import com.groupdocs.comparison.localization.SupportedLocales;
import com.groupdocs.comparison.logging.ConsoleLogger;
import com.groupdocs.comparison.logging.ILogger;
import com.groupdocs.comparison.options.*;
import com.groupdocs.comparison.options.enums.MetadataType;
import com.groupdocs.comparison.options.enums.PaperSize;
import com.groupdocs.comparison.options.enums.PasswordSaveOption;
import com.groupdocs.comparison.options.enums.PreviewFormats;
import com.groupdocs.comparison.options.load.LoadOptions;
import com.groupdocs.comparison.options.save.SaveOptions;
import com.groupdocs.comparison.options.style.DetalisationLevel;
import com.groupdocs.comparison.options.style.DiagramMasterSetting;
import com.groupdocs.comparison.options.style.Size;
import com.groupdocs.comparison.options.style.StyleSettings;
import com.groupdocs.comparison.result.*;
import com.groupdocs.comparison.sample.config.TestNGSetUp;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AccessibleTests extends TestNGSetUp {

    @Test(invocationCount = 1)
    public void testComparison() {
        System.out.println(String.format("[OK] %s is accessible", checkMethods(Comparer.class,
                "add",
                "add",
                "add",
                "add",
                "add",
                "add",
                "add",
                "add",
                "add",
                "applyChanges",
                "applyChanges",
                "applyChanges",
                "applyChanges",
                "applyChanges",
                "applyChanges",
                "compare",
                "compare",
                "compare",
                "compare",
                "compare",
                "compare",
                "compare",
                "compare",
                "compare",
                "compare",
                "compare",
                "compare",
                "compare",
                "compare",
                "compare",
                "close",
                "dispose",
                "getChanges",
                "getChanges",
                "getSource",
                "getTargets",
                "getResultString"
        )));
        System.out.println(String.format("[OK] %s is accessible", checkMethods(ComparerSettings.class,
                "getLogger",
                "setLogger")));
        System.out.println(String.format("[OK] %s is accessible", checkMethods(Document.class,
                "generatePreview",
                "getDocumentInfo",
                "getChanges",
                "setChanges",
                "getName",
                "setName",
                "getPassword",
                "getStream",
                "close",
                // ---
                "setPassword"
        )));
    }

    @Test(invocationCount = 1)
    public void testComparisonLicense() {
        System.out.println(String.format("[OK] %s is accessible", checkMethods(License.class,
                "setLicense",
                "setLicense",
                "setLicense",
                "isValidLicense"
        )));
        System.out.println(String.format("[OK] %s is accessible", checkMethods(Metered.class,
                "getConsumptionCredit",
                "getConsumptionQuantity",
                "setMeteredKey"
        )));
    }

    @Test(invocationCount = 1)
    public void testComparisonCommonDelegates() {
        System.out.println(String.format("[OK] %s is accessible", checkMethods(Delegates.CreatePageStream.class,
                "invoke")));
        System.out.println(String.format("[OK] %s is accessible", checkMethods(Delegates.ReleasePageStream.class,
                "invoke")));
    }

    @Test(invocationCount = 1)
    public void testComparisonCommonException() {
        System.out.println(String.format("[OK] %s is accessible", checkMethods(ComparisonException.class)));
        System.out.println(String.format("[OK] %s is accessible", checkMethods(DocumentComparisonException.class)));
        System.out.println(String.format("[OK] %s is accessible", checkMethods(FileFormatException.class)));
        System.out.println(String.format("[OK] %s is accessible", checkMethods(InvalidPasswordException.class)));
        System.out.println(String.format("[OK] %s is accessible", checkMethods(PasswordProtectedFileException.class)));
        System.out.println(String.format("[OK] %s is accessible", checkMethods(UnsupportedFileFormatException.class)));
    }

    @Test(invocationCount = 1)
    public void testComparisonInterfaces() {
        System.out.println(String.format("[OK] %s is accessible", checkMethods(IDocumentInfo.class,
                "getFileType",
                "setFileType",
                "getPageCount",
                "setPageCount",
                "getPagesInfo",
                "setPagesInfo",
                "getSize",
                "setSize")));
    }

    @Test(invocationCount = 1)
    public void testComparisonLocalization() {
        System.out.println(String.format("[OK] %s is accessible", checkMethods(SupportedLocales.class,
                "isLocaleSupported",
                "isLocaleSupported",
                "isLocaleSupported"
        )));
    }

    @Test(invocationCount = 1)
    public void testComparisonLogging() {
        System.out.println(String.format("[OK] %s is accessible", checkMethods(ConsoleLogger.class,
                "trace",
                "trace",
                "isTraceEnabled",
                "debug",
                "debug",
                "isDebugEnabled",
                "warning",
                "warning",
                "isWarningEnabled",
                "error",
                "error",
                "isErrorEnabled"
        )));
        System.out.println(String.format("[OK] %s is accessible", checkMethods(ILogger.class,
                "trace",
                "trace",
                "isTraceEnabled",
                "debug",
                "debug",
                "isDebugEnabled",
                "warning",
                "warning",
                "isWarningEnabled",
                "error",
                "error",
                "isErrorEnabled"
        )));
    }

    @Test(invocationCount = 1)
    public void testComparisonOptions() {
        System.out.println(String.format("[OK] %s is accessible", checkMethods(ApplyChangeOptions.class,
                "isSaveOriginalState",
                "setSaveOriginalState",
                "getChanges",
                "setChanges",
                "setChanges"
        )));
        System.out.println(String.format("[OK] %s is accessible", checkMethods(ChangeType.class,
                "getName"
        )));
        System.out.println(String.format("[OK] %s is accessible", checkMethods(CompareOptions.class,
                "isCalculateCoordinates",
                "getCalculateCoordinates",
                "setCalculateCoordinates",
                "isCompareBookmarks",
                "setCompareBookmarks",
                "isCompareDocumentProperty",
                "setCompareDocumentProperty",
                "isCompareVariableProperty",
                "setCompareVariableProperty",
                "isShowOnlySummaryPage",
                "setShowOnlySummaryPage",
                "isExtendedSummaryPage",
                "setExtendedSummaryPage",
                "isShowRevisions",
                "setShowRevisions",
                "getChangedItemStyle",
                "setChangedItemStyle",
                "getDeletedItemStyle",
                "setDeletedItemStyle",
                "getDetalisationLevel",
                "setDetalisationLevel",
                "isDetectStyleChanges",
                "getDetectStyleChanges",
                "setDetectStyleChanges",
                "getDiagramMasterSetting",
                "setDiagramMasterSetting",
                "getGenerateSummaryPage",
                "setGenerateSummaryPage",
                "getHeaderFootersComparison",
                "setHeaderFootersComparison",
                "isHeaderFootersComparison",
                "getInsertedItemStyle",
                "setInsertedItemStyle",
                "setLeaveGaps",
                "isLeaveGaps",
                "isMarkChangedContent",
                "getMarkChangedContent",
                "setMarkChangedContent",
                "getMarkNestedContent",
                "setMarkNestedContent",
                "getOriginalSize",
                "setOriginalSize",
                "getPaperSize",
                "setPaperSize",
                "getPasswordSaveOption",
                "setPasswordSaveOption",
                "getSensitivityOfComparison",
                "setSensitivityOfComparison",
                "isShowDeletedContent",
                "getShowDeletedContent",
                "setShowDeletedContent",
                "isShowInsertedContent",
                "getShowInsertedContent",
                "setShowInsertedContent",
                "setWordsSeparatorChars"
        )));
        System.out.println(String.format("[OK] %s is accessible", checkMethods(DetalisationLevel.class,
                "getName")));
        System.out.println(String.format("[OK] %s is accessible", checkMethods(DiagramMasterSetting.class,
                "getMasterPath",
                "setMasterPath",
                "getUseSourceMaster",
                "setUseSourceMaster"
        )));
        System.out.println(String.format("[OK] %s is accessible", checkMethods(FileAuthorMetadata.class,
                "getAuthor",
                "setAuthor",
                "getCompany",
                "setCompany",
                "getLastSaveBy",
                "setLastSaveBy",
                // --
                "setCreatedTime",
                "getCreatedTime"
        )));
        System.out.println(String.format("[OK] %s is accessible", checkMethods(GetChangeOptions.class,
                "getFilter",
                "setFilter"
        )));
        System.out.println(String.format("[OK] %s is accessible", checkMethods(LoadOptions.class,
                "getFontDirectories",
                "setFontDirectories",
                "getPassword",
                "setPassword",
                "isLoadText",
                "setLoadText"
        )));
        System.out.println(String.format("[OK] %s is accessible", checkMethods(MetadataType.class,
                "getName"
        )));
        System.out.println(String.format("[OK] %s is accessible", checkMethods(OriginalSize.class,
                "setWidth",
                "getWidth",
                "setHeight",
                "getHeight"
        )));
        System.out.println(String.format("[OK] %s is accessible", checkMethods(PaperSize.class,
                "getName"
        )));
        System.out.println(String.format("[OK] %s is accessible", checkMethods(PasswordSaveOption.class,
                "getName"
        )));
        System.out.println(String.format("[OK] %s is accessible", checkMethods(PreviewFormats.class,
                "getName"
        )));
        System.out.println(String.format("[OK] %s is accessible", checkMethods(PreviewOptions.class,
                "getHeight",
                "setHeight",
                "getPageNumbers",
                "setPageNumbers",
                "getPreviewFormat",
                "setPreviewFormat",
                "getWidth",
                "setWidth",
                "getCreatePageStream",
                "setCreatePageStream",
                "getReleasePageStream",
                "setReleasePageStream"
        )));
        System.out.println(String.format("[OK] %s is accessible", checkMethods(SaveOptions.class,
                "getCloneMetadataType",
                "setCloneMetadataType",
                "getFileAuthorMetadata",
                "setFileAuthorMetadata",
                "getPassword",
                "setPassword",
                "getFolderPath",
                "setFolderPath"
        )));
        System.out.println(String.format("[OK] %s is accessible", checkMethods(Size.class,
                "getHeight",
                "setHeight",
                "getWidth",
                "setWidth"
        )));
        System.out.println(String.format("[OK] %s is accessible", checkMethods(StyleSettings.class,
                "setOriginalSize",
                "getOriginalSize",
                "setStrikethrough",
                "setFontColor",
                "setItalic",
                "getFontColor",
                "isUnderline",
                "getStartStringSeparator",
                "getWordsSeparators",
                "getHighlightColor",
                "setEndStringSeparator",
                "setWordsSeparators",
                "isStrikethrough",
                "setHighlightColor",
                "setStartStringSeparator",
                "getEndStringSeparator",
                "isItalic",
                "isBold",
                "setUnderline",
                "setBold"
        )));
    }

    @Test(invocationCount = 1)
    public void testComparisonResult() {
        System.out.println(String.format("[OK] %s is accessible", checkMethods(CategoryChange.class,
                "getCategory",
                "getChanges",
                "setChanges",
                // ---
                "setCategory"
        )));
        System.out.println(String.format("[OK] %s is accessible", checkMethods(ChangeInfo.class,
                "getAuthors",
                "setAuthors",
                "getBox",
                "setBox",
                "getComparisonAction",
                "setComparisonAction",
                "getComponentType",
                "setComponentType",
                "getId",
                "setId",
                "getPageInfo",
                "setPageInfo",
                "getStyleChanges",
                "setStyleChanges",
                "setTargetText",
                "getTargetText",
                "getSourceText",
                "setSourceText",
                "getText",
                "setText",
                "getType",
                // --
                "setType"
        )));
        System.out.println(String.format("[OK] %s is accessible", checkMethods(ComparisonAction.class,
                "getName"
        )));
        System.out.println(String.format("[OK] %s is accessible", checkMethods(FileInfo.class,
                "getPages",
                "setPages",
                "getFileType"
        )));
        System.out.println(String.format("[OK] %s is accessible", checkMethods(FileType.class,
                "fromFileNameOrExtension",
                "getSupportedFileTypes",
                "getExtension",
                "getFileFormat"
        )));
        System.out.println(String.format("[OK] %s is accessible", checkMethods(PageInfo.class,
                "getHeight",
                "setHeight",
                "getPageNumber",
                "setPageNumber",
                "getWidth",
                "setWidth"
        )));
        System.out.println(String.format("[OK] %s is accessible", checkMethods(Rectangle.class,
                "getHeight",
                "setHeight",
                "getWidth",
                "setWidth",
                "getX",
                "setX",
                "getY",
                "setY"
        )));
        System.out.println(String.format("[OK] %s is accessible", checkMethods(StyleChangeInfo.class,
                "getNewValue",
                "setNewValue",
                "getOldValue",
                "setOldValue",
                "getPropertyName",
                "setPropertyName"
        )));
    }

    private String checkMethods(Class<?> clazz, String... methodsNames) {
        final List<String> methodNamesList = new ArrayList<>(Arrays.asList(methodsNames));
        final Method[] declaredMethods = clazz.getDeclaredMethods();
        final List<Method> methodList = new ArrayList<>(Arrays.asList(declaredMethods));
        final Iterator<Method> iterator = methodList.iterator();
        StringBuilder stringBuilder = new StringBuilder("There are some extra methods in class " + clazz.getCanonicalName());
        final int length = stringBuilder.length();
        while (iterator.hasNext()) {
            final Method method = iterator.next();
            final String methodName = method.getName();
            if (methodName.length() < 3) {
                iterator.remove();
                continue;
            }
            if (Arrays.asList("equals", "toString", "hashCode", "clone").contains(methodName)) {
                continue;
            }
            boolean wasFound = false;
            final Iterator<String> namesIterator = methodNamesList.iterator();
            while (namesIterator.hasNext()) {
                if (namesIterator.next().equals(methodName)) {
                    namesIterator.remove();
                    wasFound = true;
                    break;
                }
            }
            if (!wasFound) {
                stringBuilder.append("\n\t").append(methodName);
            } else {
                System.out.println("[OK]\t>" + methodName);
            }

            iterator.remove();
        }
        if (stringBuilder.length() > length) {
            System.err.println(stringBuilder.toString());
            Assert.fail(stringBuilder.toString());
        }
        if (!methodNamesList.isEmpty()) {
            System.err.println("Some methods were not found in class " + clazz.getCanonicalName() + ":");
            for (String name : methodNamesList) {
                System.err.println("\t>" + name);
            }
            Assert.fail("Some methods were not found in class " + clazz.getCanonicalName() + ":");
        }
        return clazz.getCanonicalName();
    }
}