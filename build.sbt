name := "scalascrapper"

version := "0.1"

scalaVersion := "2.12.8"

resolvers ++= Seq(
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
  "Maven" at "https://mvnrepository.com/artifact/org.jsoup/jsoup"
)

libraryDependencies ++= Seq(
    "org.jsoup" % "jsoup" % "1.9.1"  
)