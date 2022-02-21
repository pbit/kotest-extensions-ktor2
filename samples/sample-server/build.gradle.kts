plugins {
  kotlin("jvm")
}

group = "io.kotest.extensions.ktor2.samples"
version = "0.0.1"

repositories {
  mavenCentral()
}


dependencies {
  implementation(libs.ktor.server.core)
  implementation(libs.ktor.server.netty)
  implementation(libs.logback.classic)

  testImplementation(libs.kotest.runner.junit5)
  testImplementation(libs.ktor.server.test.host)

  testImplementation(libs.kotest.assertions.core)
  testImplementation(projects.kotestAssertionsKtor2Client)
}


tasks.test {
  useJUnit()
}
