package com.groupdocs.comparison.pdf.documents;

import com.groupdocs.comparison.pdf.Comparing;

public class ComparisonOfSimpleText {
    		public void Case1(String dir) throws Exception
		{
			String ResultPath = dir + "/" + "Source1_pdf was compared with Target1_pdf.pdf";
			String SourceFileName = "pdf/data/Source1.pdf";
			String TargetFileName = "pdf/data/Target1.pdf";

			Comparing c = new Comparing();
                        c.ProcessComparing("Comparison of a simple text (case 1): ", SourceFileName, TargetFileName, ResultPath, null);
		}

		public void Case1_Reverse(String dir) throws Exception
		{
			String ResultPath = dir + "/" + "Target1_pdf was compared with Source1_pdf.pdf";
			String SourceFileName = "pdf/data/Target1.pdf";
			String TargetFileName = "pdf/data/Source1.pdf";

			Comparing c = new Comparing();
                        c.ProcessComparing("Comparison of a simple text (case 1, reverse): ", SourceFileName, TargetFileName,
				ResultPath, null);
		}

		public void Case2(String dir) throws Exception
		{
			String ResultPath = dir + "/" + "Source2_pdf was compared with Target2_pdf.pdf";
			String SourceFileName = "pdf/data/Source2.pdf";
			String TargetFileName = "pdf/data/Target2.pdf";

			Comparing c = new Comparing();
                        c.ProcessComparing("Comparison of a simple text (case 1): ", SourceFileName, TargetFileName, ResultPath, null);
		}

		public void Case2_Reverse(String dir) throws Exception
		{
			String ResultPath = dir + "/" + "Target2_pdf was compared with Source2_pdf.pdf";
			String SourceFileName = "pdf/data/Target2.pdf";
			String TargetFileName = "pdf/data/Source2.pdf";

			Comparing c = new Comparing();
                        c.ProcessComparing("Comparison of a simple text (case 1, reverse): ", SourceFileName, TargetFileName,
				ResultPath, null);
		}

		public void Case3(String dir) throws Exception
		{
			String ResultPath = dir + "/" + "filePDF1_pdf was compared with filePDF2_pdf.pdf";
			String SourceFileName = "pdf/data/filePDF1.pdf";
			String TargetFileName = "pdf/data/filePDF2.pdf";

			Comparing c = new Comparing();
                        c.ProcessComparing("Comparison of a simple text (case 1): ", SourceFileName, TargetFileName, ResultPath, null);
		}

		public void Case3_Reverse(String dir) throws Exception
		{
			String ResultPath = dir + "/" + "filePDF2_pdf was compared with filePDF1_pdf.pdf";
			String SourceFileName = "pdf/data/filePDF2.pdf";
			String TargetFileName = "pdf/data/filePDF1.pdf";

			Comparing c = new Comparing();
                        c.ProcessComparing("Comparison of a simple text (case 1, reverse): ", SourceFileName, TargetFileName,
				ResultPath, null);
		}
}
