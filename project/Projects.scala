import com.typesafe.sbt.SbtScalariform.{ ScalariformKeys, scalariformSettings }
import org.scalajs.sbtplugin.ScalaJSPlugin
import bintray.BintrayKeys._
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt.Keys._
import sbt._

object Projects {
  val projectId = "scala-js-algoliasearch"
  val projectName = "scala-js-algoliasearch"

  object Versions {
    val app = "1.0.0"
    val scala = "2.11.8"
  }

  private[this] val commonSettings = Seq(
    version := Versions.app,
    scalaVersion := Versions.scala,
    scalacOptions ++= Seq(
      "-encoding", "UTF-8", "-feature", "-deprecation", "-unchecked", "–Xcheck-null", "-Xfatal-warnings", "-Xlint",
      "-Ywarn-adapted-args", /* "-Ywarn-dead-code", */ "-Ywarn-inaccessible", "-Ywarn-nullary-override", "-Ywarn-numeric-widen"
    ),
    scalacOptions in (Compile, doc) := Seq("-encoding", "UTF-8", "-feature", "-deprecation", "-unchecked"),
    scalacOptions in Test ++= Seq("-Yrangepos"),

    shellPrompt := { state => s"[${Project.extract(state).currentProject.id}] $$ " },
    resolvers += Resolver.jcenterRepo,
    ScalariformKeys.preferences := ScalariformKeys.preferences.value
  ) ++ scalariformSettings

  private[this] val scalaJsSettings = Seq(
    name := projectName,
    organization := "com.definitelyscala",
    homepage := Some(url("https://github.com/DefinitelyScala/scala-js-algoliasearch")),
    scmInfo := Some(ScmInfo(
      url("https://github.com/DefinitelyScala/scala-js-algoliasearch"),
      "scm:git:git@github.com:DefinitelyScala/scala-js-algoliasearch.git",
      Some("scm:git:git@github.com:DefinitelyScala/scala-js-algoliasearch.git")
    )),
    bintrayOrganization := Some("definitelyscala"),
    bintrayPackageLabels := Seq("scala", "scala.js"),
    bintrayPackage := "scala-js-algoliasearch",
    bintrayRepository := "maven",
    bintrayVcsUrl := Some("git:git@github.com:DefinitelyScala/scala-js-algoliasearch.git"),
    publishMavenStyle := true,
    licenses += ("MIT", url("http://opensource.org/licenses/MIT")),
    libraryDependencies ++= Seq("org.scala-js" %%% "scalajs-dom" % "0.8.1"),
    scalaJSStage in Global := FastOptStage
  )

  lazy val algoliasearch: Project = Project(id = projectId, base = file(".")).settings(commonSettings ++ scalaJsSettings).enablePlugins(ScalaJSPlugin)
}
