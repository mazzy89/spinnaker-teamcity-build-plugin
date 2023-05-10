@Suppress("DSL_SCOPE_VIOLATION")
plugins {
  alias(libs.plugins.spinnaker.plugin.bundler)
  alias(libs.plugins.palantir.git)

  alias(libs.plugins.kotlin.jvm) apply false
  alias(libs.plugins.kotlin.kapt) apply false
  alias(libs.plugins.kotlin.plugin.spring) apply false

  alias(libs.plugins.spinnaker.plugin.serviceextension) apply false
}

spinnakerBundle {
  pluginId = "DoubleCloud.TeamCityBuildPlugin"
  description = "Provide TeamCity Builds access and logs from Spinnaker Deck"
  provider = "https://github.com/mazzy89"
  version = rootProject.version.toString()
}

version = normalizedVersion()

subprojects {
  group = "cloud.double.spinnaker.plugin.teamcity.build"
  version = rootProject.version.toString()
}

fun normalizedVersion(): String {
  val gitVersion: groovy.lang.Closure<String> by extra

  val fullVersion: String = gitVersion()
  val normalized: String = fullVersion.split("-").first()

  return if (fullVersion.contains("dirty")) {
    "$normalized-SNAPSHOT"
  } else {
    normalized
  }
}
