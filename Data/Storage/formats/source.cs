using System;
using System.Drawing;
namespace ImageCrop
{
    class Program
    {

        public static void Test1()
        {
            var file =
                @"C:\Projects\comparisonfornet\test\GroupDocs.Comparison.Integration.Tests\testdata\Html\Test20\image\result_1.png";
            var croppedBitMap = new Bitmap(file);
            croppedBitMap =
                croppedBitMap.Clone(new Rectangle(0, 10, croppedBitMap.Width / 16, croppedBitMap.Height / 50),
                    System.Drawing.Imaging.PixelFormat.DontCare);
            Color[,] arr = new Color[croppedBitMap.Height, croppedBitMap.Width];
            // Loop through the images pixels to reset color.
            for (int x = 0; x < croppedBitMap.Width; x++)
            {
                for (int y = 0; y < croppedBitMap.Height; y++)
                {
                    Color pixelColor = croppedBitMap.GetPixel(x, y);
                    if (pixelColor == Color.Green)
                    {
                        Color newColor = Color.Yellow;
                        croppedBitMap.SetPixel(x, y, newColor);
                    }
                    arr[y, x] = pixelColor;
                }
            }

            DisplayPixel(arr);
            croppedBitMap.Save(@"C:\Projects\Oscar's Notes\Example projects\test_html.png");
            croppedBitMap.Dispose();
        }

        public static void Test2()
        {
            var file =
                @"C:\Projects\comparisonfornet\test\GroupDocs.Comparison.Integration.Tests\testdata\Words\big documents\Test2\Document Pages\Target Pages\result_0.png";
            var bitmap = new Bitmap(file);
            using (Graphics gr = Graphics.FromImage(bitmap))
            {
                gr.DrawImage(bitmap, new Rectangle(0, 0, bitmap.Width, bitmap.Height));
                gr.DrawRectangle(new Pen(Brushes.DeepSkyBlue), new Rectangle(323, 284, 17, 17));
            }
            bitmap.Save(@"C:\Projects\Oscar's Notes\ImageHighlighting\test.png");
            bitmap.Dispose();
        }

        static void Main(string[] args)
        {
            Test4();
            Console.WriteLine("Done.");
            Console.ReadKey();
        }
    }
}
