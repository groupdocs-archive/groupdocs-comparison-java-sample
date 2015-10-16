/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groupdocs.comparison.pdf.documents;

import com.groupdocs.comparison.pdf.Comparing;

/**
 *
 * @author gruzi_000
 */
public class ResultComparingConsistsInsertedAndDeletedPages {
    		public void Case1(String dir) throws Exception
		{
			String ResultPath = dir + "/" + "filePDF1_pdf was compared with filePDF3_pdf.pdf";
			String SourceFileName = "pdf/data/filePDF1.pdf";
			String TargetFileName = "pdf/data/filePDF3.pdf";

			Comparing c = new Comparing();
                        c.ProcessComparing("Comparison with the odd pages (case 1): ", SourceFileName, TargetFileName, ResultPath, null);
		}

		public void Case1_Reverse(String dir) throws Exception
		{
			String ResultPath = dir + "/" + "filePDF3_pdf was compared with filePDF1_pdf.pdf";
			String SourceFileName = "pdf/data/filePDF3.pdf";
			String TargetFileName = "pdf/data/filePDF1.pdf";

			Comparing c = new Comparing();
                        c.ProcessComparing("Comparison with the odd pages (case 1, reverse): ", SourceFileName, TargetFileName,
				ResultPath, null);
		}

		public void Case2(String dir) throws Exception
		{
			String ResultPath = dir + "/" + "filePDF2_pdf was compared with filePDF3_pdf.pdf";
			String SourceFileName = "pdf/data/filePDF2.pdf";
			String TargetFileName = "pdf/data/filePDF3.pdf";

			Comparing c = new Comparing();
                        c.ProcessComparing("Comparison with the odd pages (case 2): ", SourceFileName, TargetFileName, ResultPath, null);
		}

		public void Case2_Reverse(String dir) throws Exception
		{
			String ResultPath = dir + "/" + "filePDF3_pdf was compared with filePDF2_pdf.pdf";
			String SourceFileName = "pdf/data/filePDF3.pdf";
			String TargetFileName = "pdf/data/filePDF2.pdf";

			Comparing c = new Comparing();
                        c.ProcessComparing("Comparison with the odd pages (case 2, reverse): ", SourceFileName, TargetFileName,
				ResultPath, null);
		}

		public void Case3(String dir) throws Exception
		{
			String ResultPath = dir + "/" + "filePDF1_pdf was compared with filePDF5_pdf.pdf";
			String SourceFileName = "pdf/data/filePDF1.pdf";
			String TargetFileName = "pdf/data/filePDF5.pdf";

			Comparing c = new Comparing();
                        c.ProcessComparing("Comparison with the odd pages (case 3): ", SourceFileName, TargetFileName, ResultPath, null);
		}

		public void Case3_Reverse(String dir) throws Exception
		{
			String ResultPath = dir + "/" + "filePDF5_pdf was compared with filePDF1_pdf.pdf";
			String SourceFileName = "pdf/data/filePDF5.pdf";
			String TargetFileName = "pdf/data/filePDF1.pdf";

			Comparing c = new Comparing();
                        c.ProcessComparing("Comparison with the odd pages (case 3, reverse): ", SourceFileName, TargetFileName,
				ResultPath, null);
		}

		public void Case4(String dir) throws Exception
		{
			String ResultPath = dir + "/" + "filePDF2_pdf was compared with filePDF5_pdf.pdf";
			String SourceFileName = "pdf/data/filePDF2.pdf";
			String TargetFileName = "pdf/data/filePDF5.pdf";

			Comparing c = new Comparing();
                        c.ProcessComparing("Comparison with the odd pages (case 4): ", SourceFileName, TargetFileName, ResultPath, null);
		}

		public void Case4_Reverse(String dir) throws Exception
		{
			String ResultPath = dir + "/" + "filePDF5_pdf was compared with filePDF2_pdf.pdf";
			String SourceFileName = "pdf/data/filePDF5.pdf";
			String TargetFileName = "pdf/data/filePDF2.pdf";

			Comparing c = new Comparing();
                        c.ProcessComparing("Comparison with the odd pages (case 4, reverse): ", SourceFileName, TargetFileName,
				ResultPath, null);
		}
}
