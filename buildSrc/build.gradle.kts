
plugins {
  `kotlin-dsl`
}


repositories {
  mavenCentral()
  gradlePluginPortal()
}

java {
  toolchain {
    languageVersion.set(JavaLanguageVersion.of(8))
  }
}

dependencies {
  implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
  //implementation("io.kotest:kotest-framework-multiplatform-plugin-gradle:5.1.0")
}
