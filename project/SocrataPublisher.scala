import sbt._
import Keys._

import Dependencies._

object SocrataPublisher {
  lazy val settings: Seq[Setting[_]] = BuildSettings.commonProjectSettings() ++ BuildSettings.sonatypeSettings ++ Seq(
    libraryDependencies <++= scalaVersion(libraries(_))
  )

  def libraries(implicit scalaVersion: String) = Seq(
  )
}
