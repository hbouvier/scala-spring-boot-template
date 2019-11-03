scalaVersion := "2.13.1"

name := "ToCloudEvents"
version := "0.0.1"
description := "A REST API to create binary CloudEvents"
organization := "com.ruggedcode"

libraryDependencies ++= Seq(
    "org.springframework.boot" % "spring-boot-starter-web" % "1.5.4.RELEASE"
  , "org.springframework.boot" % "spring-boot-configuration-processor" % "1.5.4.RELEASE"
  //, "io.cloudevents" % "cloudevents-api" % "0.3.1"
)

mainClass in Compile := Some("com.ruggedcode.platform.eventing.api.cloudevent.ToCloudEventApplication")
