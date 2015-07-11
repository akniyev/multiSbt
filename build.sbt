name := "multiSbt"

version := "1.0"

lazy val util = project

lazy val second = project.dependsOn(util)

lazy val root = (project in file(".")).dependsOn(util, second)