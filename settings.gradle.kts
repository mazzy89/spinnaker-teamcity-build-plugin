rootProject.name = "spinnaker-teamcity-build-plugin"

rootDir.listFiles()?.forEach {
  if(it.isDirectory && it.name.startsWith("teamcity-build") && it.list()?.contains("build.gradle.kts") == true) {
    include(it.name)
  }
}

dependencyResolutionManagement {
  repositories {
    mavenCentral()
  }
}
