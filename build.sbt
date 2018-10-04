import ReleaseTransformations._

name := "LemPORT"

// libraryDependencies ++= Seq(

// )

lazy val commonSettings = Seq(
  organization := "org.clulab",
  parallelExecution in Test := false,
  crossPaths := false,

  //
  // publishing settings
  //

  // the standard maven repository
  publishTo := {
    val nexus = "https://oss.sonatype.org/"
    if (isSnapshot.value)
      Some("snapshots" at nexus + "content/repositories/snapshots")
    else
      Some("releases" at nexus + "service/local/staging/deploy/maven2")
  },

  // publish to a maven repo
  publishMavenStyle := true,

  publishArtifact in Test := false,

  // let’s remove any repositories for optional dependencies in our artifact
  pomIncludeRepository := { _ => false },

  // mandatory stuff to add to the pom for publishing
  pomExtra :=
    <url>https://github.com/clulab/LemPORT</url>
    <licenses>
      <license>
        <name>GNU Lesser General Public License, Version 3.0</name>
        <url>https://www.gnu.org/licenses/lgpl-3.0.en.html</url>
        <distribution>repo</distribution>
      </license>
    </licenses>
    <scm>
      <url>https://github.com/clulab/LemPORT</url>
      <connection>https://github.com/clulab/LemPORT</connection>
    </scm>
    <developers>
      <developer>
        <id>mihai.surdeanu</id>
        <name>Mihai Surdeanu</name>
        <email>mihai@surdeanu.info</email>
      </developer>
    </developers>

  //
  // end publishing settings
  //
)

lazy val root = (project in file("."))
  .settings(commonSettings: _*)


// release steps
releaseProcess := Seq[ReleaseStep](
  checkSnapshotDependencies,
  inquireVersions,
  runClean,
  runTest,
  setReleaseVersion,
  commitReleaseVersion,
  tagRelease,
  releaseStepCommandAndRemaining("publishSigned"),
  setNextVersion,
  commitNextVersion,
  releaseStepCommandAndRemaining("sonatypeReleaseAll"),
  pushChanges
)