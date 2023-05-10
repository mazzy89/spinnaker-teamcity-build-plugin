package cloud.double.spinnaker.plugin.teamcity.build.properties

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("teamcity.build")
data class TeamCityBuildProperties(
  var url: String? = null
)
