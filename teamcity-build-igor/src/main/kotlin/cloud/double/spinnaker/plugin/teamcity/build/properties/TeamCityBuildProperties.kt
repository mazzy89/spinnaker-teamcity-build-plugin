package cloud.double.spinnaker.plugin.teamcity.build.properties

import com.netflix.spinnaker.kork.plugins.api.PluginConfiguration

@PluginConfiguration
data class TeamCityBuildProperties(var url: String)
