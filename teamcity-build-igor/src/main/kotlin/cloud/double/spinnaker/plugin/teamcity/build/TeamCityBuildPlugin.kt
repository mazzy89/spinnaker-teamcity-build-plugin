package cloud.double.spinnaker.plugin.teamcity.build

import com.netflix.spinnaker.kork.plugins.api.spring.SpringLoaderPlugin
import org.pf4j.PluginWrapper
import org.slf4j.LoggerFactory

class TeamCityBuildPlugin(wrapper: PluginWrapper): SpringLoaderPlugin(wrapper) {
  private val logger = LoggerFactory.getLogger(TeamCityBuildPlugin::class.java)

  override fun getPackagesToScan(): List<String> {
    return listOf(
      "cloud.double.spinnaker.plugin.teamcity.build"
    )
  }

  override fun start() {
    logger.info("TeamCityBuildPlugin.start()")
  }

  override fun stop() {
    logger.info("TeamCityBuildPlugin.stop()")
  }
}
