package com.groupdocs.comparison.pdf.documents;

import com.groupdocs.comparison.pdf.Comparing;

public class ComparisonOfDocumentWithTables {
		public void Case1(String dir) throws Exception
		{
			String ResultPath = dir+"/"+"filePDFWithTable1_pdf was compared with filePDFWithTable2_pdf.pdf";
			String SourceFileName = "pdf/data/filePDFWithTable1.pdf";
			String TargetFileName = "pdf/data/filePDFWithTable2.pdf";

			Comparing c = new Comparing();
                        c.ProcessComparing("Comparison of a document with tables (case 1): ", SourceFileName, TargetFileName,
				ResultPath, null);
		}

		public void Case1_Reverse(String dir) throws Exception
		{
			String ResultPath =  dir+"/"+"filePDFWithTable2_pdf was compared with filePDFWithTable1_pdf.pdf";
			String SourceFileName = "pdf/data/filePDFWithTable2.pdf";
			String TargetFileName = "pdf/data/filePDFWithTable1.pdf";

			Comparing c = new Comparing();
                        c.ProcessComparing("Comparison of a document with tables (case 1, reverse): ", SourceFileName, TargetFileName,
				ResultPath, null);
		}

		public void Case2(String dir) throws Exception
		{
			String ResultPath =  dir+"/"+"filePDFWithTable1_pdf was compared with filePDFWithTable3_pdf.pdf";
			String SourceFileName = "pdf/data/filePDFWithTable1.pdf";
			String TargetFileName = "pdf/data/filePDFWithTable3.pdf";

			Comparing c = new Comparing();
                        c.ProcessComparing("Comparison of a document with tables (case 2): ", SourceFileName, TargetFileName,
				ResultPath, null);
		}

		public void Case2_Reverse(String dir) throws Exception
		{
			String ResultPath =  dir+"/"+"filePDFWithTable3_pdf was compared with filePDFWithTable1_pdf.pdf";
			String SourceFileName = "pdf/data/filePDFWithTable3.pdf";
			String TargetFileName = "pdf/data/filePDFWithTable1.pdf";

			Comparing c = new Comparing();
                        c.ProcessComparing("Comparison of a document with tables (case 2, reverse): ", SourceFileName, TargetFileName,
				ResultPath, null);
		}
}
