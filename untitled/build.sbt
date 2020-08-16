name := "untitled"

version := "0.1"

scalaVersion := "2.12.12"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-sql" % "3.0.0",
  "org.apache.hbase" % "hbase-client" % "2.3.0",
  "org.apache.hbase" % "hbase-mapreduce" % "2.3.0"
)