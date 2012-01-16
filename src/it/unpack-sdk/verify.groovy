// Check the sdk structure
assert new File( basedir, "target/it-target/qooxdoo-sdk" ).exists()
assert new File( basedir, "target/it-target/qooxdoo-sdk/application" ).exists()
assert new File( basedir, "target/it-target/qooxdoo-sdk/component" ).exists()
assert new File( basedir, "target/it-target/qooxdoo-sdk/documentation" ).exists()
assert new File( basedir, "target/it-target/qooxdoo-sdk/framework" ).exists()
assert new File( basedir, "target/it-target/qooxdoo-sdk/tool" ).exists()
// Get the qooxdoo-sdk version
def sdkVersion
new File(localRepositoryPath,"org/qooxdoo/qooxdoo-sdk/").eachFile() { file->  
        if (file.isDirectory()) sdkVersion = file.getName()  
}
// Check the version
File version = new File( basedir, "target/it-target/qooxdoo-sdk/version.txt" )
assert version.exists();
assert version.text.contains(sdkVersion);
return true;