@Suppress("DSL_SCOPE_VIOLATION")
plugins {
  alias(libs.plugins.kotlin.jvm)
  alias(libs.plugins.kotlin.kapt)
  alias(libs.plugins.spinnaker.plugin.serviceextension)

  id("maven-publish")
}

kotlin {}

spinnakerPlugin {
  serviceName = "igor"
  pluginClass = "cloud.double.spinnaker.plugin.teamcity.build.TeamCityBuildPlugin"
  requires    = "igor>=0.0.0"
}

dependencies {}
