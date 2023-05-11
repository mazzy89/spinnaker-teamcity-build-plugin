rootProject.name = "spinnaker-teamcity-build-plugin"

rootDir.listFiles()?.forEach {
  if(it.isDirectory && it.name.startsWith("teamcity-build") && it.list()?.contains("build.gradle.kts") == true) {
    include(it.name)
  }
}

dependencyResolutionManagement {
  repositories {
    mavenCentral()

    maven {
      url = uri("https://packages.jetbrains.team/maven/p/teamcity-rest-client/teamcity-rest-client")
    }
  }
}
