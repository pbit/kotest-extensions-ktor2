plugins {
  id("kotest.ktor2-library")
}



kotlin {
  sourceSets {
    val commonMain by getting {
      dependencies {
        api(projects.kotestAssertionsKtor2Http)

        implementation(libs.kotest.assertions.core)
        implementation(libs.ktor.client.core)
      }
    }
  }
}
