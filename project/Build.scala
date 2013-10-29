import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "mongo-views-examples"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    "mongo-views-plugin" % "mongo-views-plugin_2.10" % "1.0-SNAPSHOT"
  )


  val main = play.Project(appName, appVersion, appDependencies).settings(
		  
            resolvers += Resolver.url("TPTeam Repository", url("http://tpteam.github.io/snapshots/"))(Resolver.ivyStylePatterns)
  )

}
