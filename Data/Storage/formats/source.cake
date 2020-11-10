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
    CopyFileToDirectory(@".\Solution.nuspec", artefactsDir);

    NuGetPack(new FilePath(artefactsDir + @"\Solution.nuspec"), new NuGetPackSettings
    {
        OutputDirectory = packageDir
    });
});

RunTarget("Pack");