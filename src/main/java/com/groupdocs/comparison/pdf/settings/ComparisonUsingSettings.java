package com.groupdocs.comparison.pdf.settings;

import com.groupdocs.comparison.common.comparisonsettings.ComparisonDepth;
import com.groupdocs.comparison.common.comparisonsettings.PdfComparisonSettings;
import com.groupdocs.comparison.common.comparisonsettings.StyleSettings;
import com.groupdocs.comparison.pdf.Comparing;
import java.awt.Color;

public class ComparisonUsingSettings {
    		public void DefaultSettings(String dir) throws Exception
		{
			String ResultPath = dir+"/"+"DefaultSettings - filePDFSourceWithCountPages5_pdf was compared with filePDFTargetWithCountPages5_pdf.pdf";
			String SourceFileName = "pdf/data/filePDFSourceWithCountPages5.pdf";
			String TargetFileName = "pdf/data/filePDFTargetWithCountPages5.pdf";

			Comparing c = new Comparing();
                        c.ProcessComparing("Comparison pdf using DefaultSettings: ", SourceFileName, TargetFileName, ResultPath, null);
		}

		public void GenerationSummaryPageIsFalse(String dir) throws Exception
		{
			String ResultPath = dir+"/"+"GenerateSummaryPage = false - filePDFSourceWithCountPages5_pdf was compared with filePDFTargetWithCountPages5_pdf.pdf";
			String SourceFileName = "pdf/data/filePDFSourceWithCountPages5.pdf";
			String TargetFileName = "pdf/data/filePDFTargetWithCountPages5.pdf";

			PdfComparisonSettings settings = new PdfComparisonSettings();
			settings.setGenerateSummaryPage(false);

			Comparing c = new Comparing();
                        c.ProcessComparing("Comparison pdf using setting of GenerateSummaryPage equal false: ", SourceFileName,
				TargetFileName, ResultPath, settings);
		}

		public void InsertedItemsStyleIsDefined(String dir) throws Exception
		{
			String ResultPath = dir+"/"+"InsertedItemsStyleIsDefined - filePDFSourceWithCountPages5_pdf was compared with filePDFTargetWithCountPages5_pdf.pdf";
			String SourceFileName = "pdf/data/filePDFSourceWithCountPages5.pdf";
			String TargetFileName = "pdf/data/filePDFTargetWithCountPages5.pdf";

			PdfComparisonSettings settings = new PdfComparisonSettings();
                        StyleSettings style = new StyleSettings();
                        style.setColor(Color.green);
                        style.setSize(20);
                        style.setBeginSeparatorString("[");
                        style.setEndSeparatorString("]");
                        settings.setInsertedItemsStyle(style);
			Comparing c = new Comparing();
                        c.ProcessComparing("Comparison pdf using setting of InsertedItemsStyle: ", SourceFileName, TargetFileName, ResultPath, settings);
		}

		public void DeletedItemsStyleIsDefined(String dir) throws Exception
		{
			String ResultPath = dir+"/"+"DeletedItemsStyleIsDefined - filePDFSourceWithCountPages5_pdf was compared with filePDFTargetWithCountPages5_pdf.pdf";
			String SourceFileName = "pdf/data/filePDFSourceWithCountPages5.pdf";
			String TargetFileName = "pdf/data/filePDFTargetWithCountPages5.pdf";

			PdfComparisonSettings settings = new PdfComparisonSettings();
                        StyleSettings style = new StyleSettings();
                        style.setColor(Color.MAGENTA);
                        style.setBeginSeparatorString("{");
                        style.setEndSeparatorString("}");
                        settings.setInsertedItemsStyle(style);

			Comparing c = new Comparing();
                        c.ProcessComparing("Comparison pdf using setting of InsertedItemsStyle: ", SourceFileName, TargetFileName,
				ResultPath, settings);
		}

		public void ShowDeletedContentIsFalse(String dir) throws Exception
		{
			String ResultPath = dir+"/"+"ShowDeletedContentIsFalse - filePDFSourceWithCountPages5_pdf was compared with filePDFTargetWithCountPages5_pdf.pdf";
			String SourceFileName = "pdf/data/filePDFSourceWithCountPages5.pdf";
			String TargetFileName = "pdf/data/filePDFTargetWithCountPages5.pdf";

			PdfComparisonSettings settings = new PdfComparisonSettings();
                        settings.setShowDeletedContent(false);

			Comparing c = new Comparing();
                        c.ProcessComparing("Comparison pdf using setting of ShowDeletedContent equal false: ", SourceFileName,
				TargetFileName, ResultPath, settings);
		}

		public void ComparisonDepthIsChars(String dir) throws Exception
		{
			String ResultPath = dir+"/"+"ComparisonDepthIsChars - Source1_pdf was compared with Target1_pdf.pdf";
			String SourceFileName = "pdf/data/Source1.pdf";
			String TargetFileName = "pdf/data/Target1.pdf";

			PdfComparisonSettings settings = new PdfComparisonSettings();
                        settings.setComparisonDepth(ComparisonDepth.Chars);

			Comparing c = new Comparing();
                        c.ProcessComparing("Comparison pdf using setting of ComparisonDepth equal Chars: ", SourceFileName,
				TargetFileName, ResultPath, settings);
		}

		public void ComparisonDepthIsWords(String dir) throws Exception
		{
			String ResultPath = dir+"/"+"ComparisonDepthIsWords - Source1_pdf was compared with Target1_pdf.pdf";
			String SourceFileName = "pdf/data/Source1.pdf";
			String TargetFileName = "pdf/data/Target1.pdf";

			PdfComparisonSettings settings = new PdfComparisonSettings();
                        settings.setComparisonDepth(ComparisonDepth.Words);

			Comparing c = new Comparing();
                        c.ProcessComparing("Comparison pdf using setting of ComparisonDepth equal Words: ", SourceFileName,
				TargetFileName, ResultPath, settings);
		}
}
