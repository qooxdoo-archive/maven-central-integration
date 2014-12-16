# maven-central-integration

maven-central-integration provides tooling to be able to release the qooxdoo SDK
at [Maven Central](http://search.maven.org/).

This is an additional step once a qooxdoo SDK is released. It does rely on already
released SDK versions.


## Setup

Make sure you have at least the [Maven](http://maven.apache.org) version 2.2.1 
installed.


## Prerequisites

You have to make sure to adapt the `pom.xml` to the current version of the SDK and the current version of the parent pom. The parent pom file has to be released **before** building the SDK package.


## Usage

The following steps are using the 4.0.2 release of the qooxdoo SDK. Please make sure to adapt the version number before executing the command.

###  Steps

1. adjust the `pom.xml` by setting the right version to the `<version>` field (fill in the version you want to release)
2. Run `mvn clean package`
3. Fill in the passphrase
4. Run `mvn gpg:sign-and-deploy-file -Durl=https://oss.sonatype.org/service/local/staging/deploy/maven2/ -DrepositoryId=sonatype-nexus-staging -DpomFile=pom.xml -Dfile=target/qooxdoo-sdk-4.0.2.jar`
   (this takes some minutes - do not stop this upload process)
5. Login at [Sonatype Nexus](https://oss.sonatype.org/index.html) with the qooxdoo user
6. Click at **Staging Repositories**
7. Select the `org.qooxdoo` Repository, click **Close** and fill a meaningful message
8. If everything is fine and can be released: Click the **Release** button to finally release the SDK (a second dialog appears for the release message)
9. Check at [Maven Central](http://search.maven.org) if the SDK is successfully synced - this may take some time


### Additional information

[Sonatype OSS Maven Repository Usage Guide](https://docs.sonatype.org/display/Repository/Sonatype+OSS+Maven+Repository+Usage+Guide)
