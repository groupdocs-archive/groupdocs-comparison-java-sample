Task("Pack")
.IsDependentOn("Tests::Unit")
.Does(()=> 
{
    var packageDir = @"..\package";
    var artefactsDir = @"..\.artefacts";

    MoveFiles("*.nupkg", packageDir);

    EnsureDirectoryExists(packageDir);
    CleanDirectory(packageDir);

    EnsureDirectoryExists(artefactsDir);
    CleanDirectory(artefactsDir);
    CopyFiles(@"..\Solution\MyProject\bin\" + configuration + @"\*.dll", artefactsDir);
    CopyFiles(@"..\Solution\MyProject\bin\" + configuration + @"\*.pdb", artefactsDir);
    CopyFiles(@"..\Solution\MyProject\bin1\" + configuration + @"\*.dll", artefactsDir);
    CopyFiles(@"..\Solution\MyProject\bin2\" + configuration + @"\*.pdb", artefactsDir);
    CopyFileToDirectory(@".\Solution.nuspec", artefactsDir);
});

RunTarget("Pack");

