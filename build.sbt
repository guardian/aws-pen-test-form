name := """aws-pen-test-form"""

version := "1.1"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "com.amazonaws" % "aws-java-sdk" % "1.9.3",
  "com.github.scopt" %% "scopt" % "3.3.0",
  "joda-time" % "joda-time" % "2.9.4",
  "org.joda" % "joda-convert" % "1.8",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)

assemblyJarName in assembly := "pen-test-form.jar"

scalacOptions := Seq("-unchecked", "-deprecation")
