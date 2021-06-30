name := "spark-sftp"

version := "1.1.4-modak"

organization := "com.springml"

scalaVersion := "2.11.12"
val sparkVersion = "2.4.5"

crossScalaVersions := Seq("2.11.12")

resolvers += "central" at "https://repo1.maven.org/maven2/"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion % "provided",
  "org.apache.spark" %% "spark-sql" % sparkVersion % "provided",
  "com.springml" % "sftp.client" % "1.0.3",
  "org.mockito" % "mockito-core" % "2.0.31-beta",
  "com.databricks" % "spark-xml_2.11" % "0.4.1",
  "com.databricks" %% "spark-avro" % "3.2.0",
  "org.scalatest" %% "scalatest" % "2.2.1" % "test",
  "org.apache.avro" % "avro-mapred" % "1.7.7" % "test" exclude("org.mortbay.jetty", "servlet-api"),
  "org.apache.spark" %% "spark-hive" % sparkVersion % "test"
)
