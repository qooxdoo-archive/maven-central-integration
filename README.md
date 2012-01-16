# maven-central-integration

maven-central-integration provides tooling to be able to release the qooxdoo SDK
at [Maven Central](http://search.maven.org/).

This is an additional step once a qooxdoo SDK is released. It does rely on already
released SDK versions.


## Setup

Make sure you have at least the [Maven](http://maven.apache.org) version 2.2.1 
installed.

Download the qooxdoo SDK you'd like to publish at Maven Central and put it in
the 

    src/main/resources

folder as 

    qooxdoo-sdk

subdirectory.


## Prerequisites

You have to make sure to adapt the 'pom.xml' to the current version of the SDK and the current version of the parent pom. The parent pom file has to be released **before** building the SDK package.


## Usage

Run the command

    $ mvn package

and to create the JAR file for the qooxdoo SDK.