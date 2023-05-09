plugins {}

spinnakerPlugin {
  serviceName = "igor"
  pluginClass = "cloud.double.spinnaker.plugin.teamcity.TeamCityBuildPlugin"
  requires    = "igor>=0.0.0"
}

dependencies {}