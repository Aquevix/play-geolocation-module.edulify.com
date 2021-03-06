import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "java"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    javaCore,
    javaJdbc,
    javaEbean,
    "com.edulify" % "geolocation_2.10" % "1.1.3"
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here
    resolvers += "Edulify Repository" at "https://edulify.github.io/modules/releases/"
  )

}
