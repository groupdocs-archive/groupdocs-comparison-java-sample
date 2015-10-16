using System;
using System.IO;
using System.Reflection;
using GroupDocs.Comparison.Common.ComparisonSettings;
using GroupDocs.Comparison.Text;
using GroupDocs.Comparison.Text.Contracts;

namespace Groupdocs.Comparison.Samples.Text.Settings
{
	internal class ComparisonWithDifferentSettings
	{
		public static void CompareTextFilesWithGenerationSummaryPage()
		{
			string resultPath = @"./../../Settings/testresult/WithGenerationSummaryPage/result.txt";
			// Creating settings for comparison of textFiles
			TextComparisonSettings comparisonSettings = new TextComparisonSettings();
			comparisonSettings.GenerateSummaryPage = true;
			Compare(resultPath, comparisonSettings);
		}

		public static void CompareTextFilesWithOutGenerationSummaryPage()
		{
			string resultPath = @"./../../Settings/testresult/WithOutGenerationSummaryPage/result.txt";
			// Creating settings for comparison of textFiles
			TextComparisonSettings comparisonSettings = new TextComparisonSettings();
			comparisonSettings.GenerateSummaryPage = false;
			Compare(resultPath, comparisonSettings);
		}

		public static void CompareTextFilesWithShowDeletedContent()
		{
			string resultPath = @"./../../Settings/testresult/WithShowDeletedContent/result.txt";
			// Creating settings for comparison of textFiles
			TextComparisonSettings comparisonSettings = new TextComparisonSettings();
			comparisonSettings.ShowDeletedContent = true;
			Compare(resultPath, comparisonSettings);
		}

		public static void CompareTextFilesWithOutShowDeletedContent()
		{
			string resultPath = @"./../../Settings/testresult/WithOutShowDeletedContent/result.txt";
			// Creating settings for comparison of textFiles
			TextComparisonSettings comparisonSettings = new TextComparisonSettings();
			comparisonSettings.ShowDeletedContent = false;
			Compare(resultPath, comparisonSettings);
		}

		public static void CompareTextFilesWithComparisonDepthSetWords()
		{
			string resultPath = @"./../../Settings/testresult/WithComparisonDepthSetWords/result.txt";
			// Creating settings for comparison of textFiles
			TextComparisonSettings comparisonSettings = new TextComparisonSettings();
			comparisonSettings.ComparisonDepth = ComparisonDepth.Words;
			Compare(resultPath, comparisonSettings);
		}

		public static void CompareTextFilesWithComparisonDepthSetChars()
		{
			string resultPath = @"./../../Settings/testresult/WithComparisonDepthSetChars/result.txt";
			// Creating settings for comparison of textFiles
			TextComparisonSettings comparisonSettings = new TextComparisonSettings();
			comparisonSettings.ComparisonDepth = ComparisonDepth.Chars;
			Compare(resultPath, comparisonSettings);
		}

		public static void CompareTextFilesWithWordsSepCharsSetSpace()
		{
			string resultPath = @"./../../Settings/testresult/WithWordsSepCharsSetSpace/result.txt";
			// Creating settings for comparison of textFiles
			TextComparisonSettings comparisonSettings = new TextComparisonSettings();
			comparisonSettings.WordsSeparatorChars = new char[] {' '};
			Compare(resultPath, comparisonSettings);
		}

		public static void CompareTextFilesWithSettingStylesOnDelInsComponents()
		{
			string resultPath = @"./../../Settings/testresult/WithSettingStylesOnDelInsComponents/result.txt";
			// Creating settings for comparison of TextFiles
			TextComparisonSettings comparisonSettings = new TextComparisonSettings();
			comparisonSettings.DeletedItemsStyle.BeginSeparatorString = "<begin deleted text>";
			comparisonSettings.DeletedItemsStyle.EndSeparatorString = "<end deleted text>";
			comparisonSettings.InsertedItemsStyle.BeginSeparatorString = "<begin inserted text>";
			comparisonSettings.InsertedItemsStyle.EndSeparatorString = "<end inserted text>";
			Compare(resultPath, comparisonSettings);
		}

		private static void Compare(string resultPath, TextComparisonSettings comparisonSettings)
		{
			string sourcePath = @"Groupdocs.Comparison.Samples.Text.Settings.data.source.txt";
			string targetPath = @"Groupdocs.Comparison.Samples.Text.Settings.data.target.txt";
			// Create to streams of textFiles
			Assembly assembly = Assembly.GetExecutingAssembly();
			Stream sourceStream = assembly.GetManifestResourceStream(sourcePath);
			Stream targetStream = assembly.GetManifestResourceStream(targetPath);
			// Opening two textFiles
			IComparisonTextFile sourcePresentation = new ComparisonTextFile(sourceStream);
			Console.WriteLine("TextFile with source path: " + sourcePath + " was loaded.");
			IComparisonTextFile targetPresentation = new ComparisonTextFile(targetStream);
			Console.WriteLine("TextFile with source path: " + targetPath + " was loaded.");

			// Comparing textFiles
			ITextCompareResult compareResult = sourcePresentation.CompareWith(targetPresentation, comparisonSettings);
			Console.WriteLine("textFiles was compared.");

			// Saving result of comparison to new textFile
			IComparisonTextFile result = compareResult.GetTextFile();
			Stream resultStream = new FileStream(resultPath, FileMode.Create);
			result.Save(resultStream);
			resultStream.Close();
			Console.WriteLine("Result of comparison was saved to textFile with the folloving source path" +
			                  resultPath + ".");
			Console.WriteLine("===============================================");
			Console.WriteLine("");
		}
	}
}