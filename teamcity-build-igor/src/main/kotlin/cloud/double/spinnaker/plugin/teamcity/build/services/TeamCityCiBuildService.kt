package cloud.double.spinnaker.plugin.teamcity.build.services

import cloud.double.spinnaker.plugin.teamcity.build.properties.TeamCityBuildProperties
import com.netflix.spinnaker.igor.ci.CiBuildService

class TeamCityCiBuildService(config: TeamCityBuildProperties): CiBuildService {
  override fun getBuilds(
    projectKey: String?,
    repoSlug: String?,
    buildNumber: String?,
    commitId: String?,
    completionStatus: String?
  ): MutableList<com.netflix.spinnaker.igor.build.model.GenericBuild> {
    TODO("Not yet implemented")
  }

  override fun getBuildOutput(buildId: String?): MutableMap<String, Any> {
    TODO("Not yet implemented")
  }
}
