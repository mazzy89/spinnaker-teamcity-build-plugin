import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.dsl.KotlinVersion

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
  alias(libs.plugins.kotlin.jvm)
  alias(libs.plugins.kotlin.kapt)
  alias(libs.plugins.kotlin.plugin.spring)

  alias(libs.plugins.spinnaker.plugin.serviceextension)

  id("maven-publish")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
  compilerOptions {
    jvmTarget.set(JvmTarget.JVM_11)
    languageVersion.set(KotlinVersion.KOTLIN_1_8)
  }
}

spinnakerPlugin {
  serviceName = "igor"
  pluginClass = "cloud.double.spinnaker.plugin.teamcity.build.TeamCityBuildPlugin"
  requires    = "igor>=0.0.0"
}

dependencies {
  annotationProcessor(libs.spring.boot.configuration.processor)

  compileOnly(libs.jackson.module.kotlin)

  compileOnly(libs.kotlin.gradle.plugin)
  compileOnly(libs.kotlin.all.open)

  compileOnly(libs.kork.api)
  compileOnly(libs.kork.plugins.spring.api)
  compileOnly(libs.kork.plugins)

  compileOnly(libs.igor.web)
  compileOnly(libs.igor.core)

  implementation(libs.teamcity.rest.client)
}
