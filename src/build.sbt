name := "spark_dbscan"

organization := "org.alitouka"

version := "0.0.4"

scalaVersion := "2.11.7"

libraryDependencies += "org.apache.spark" % "spark-core_2.11" % "2.2.0" % "provided"

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.1.3" % "test"

libraryDependencies += "org.apache.commons" % "commons-math3" % "3.2"

// https://mvnrepository.com/artifact/com.github.scopt/scopt_2.10
libraryDependencies += "com.github.scopt" % "scopt_2.11" % "3.7.0"







