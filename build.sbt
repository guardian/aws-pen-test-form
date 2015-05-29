name := """aws-pen-test-form"""

version := "1.0"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "com.amazonaws" % "aws-java-sdk" % "1.9.3",
  "com.github.scopt" %% "scopt" % "3.3.0",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)

assemblyJarName in assembly := "pen-test-form.jar"
