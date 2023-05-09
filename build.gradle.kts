plugins {
    alias(libs.plugins.spinnaker.bundler)
    alias(libs.plugins.palantir.git)
}

spinnakerBundle {
    pluginId = "DoubleCloud.TeamCityBuildPlugin"
    description = "Provide TeamCity Builds access and logs from Spinnaker UI"
    version = rootProject.version.toString()
}

version = normalizedVersion()

subprojects {
    group = "cloud.double.spinnaker.plugin.teamcity"
    version = rootProject.version.toString()
}

fun normalizedVersion(): String {
    val gitVersion: groovy.lang.Closure<String> by extra

    val fullVersion: String = gitVersion()
    val normalized: String = fullVersion.split("-").first()

    return if (fullVersion.contains("dirty")) {
        return "$normalized-SNAPSHOT"
    } else {
        return normalized
    }
}