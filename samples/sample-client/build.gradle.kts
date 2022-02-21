plugins {
  kotlin("multiplatform")
}


group = "io.kotest.extensions.ktor2.samples"
version = "0.0.1"

repositories {
  mavenCentral()
}

kotlin {

  jvm()


  sourceSets {

    val commonMain by getting {
      dependencies {
        implementation("io.ktor:ktor-client-core:2.0.0-beta-1")
      }
    }
    val jvmMain by getting {
      dependencies {
        implementation("io.ktor:ktor-client-cio:2.0.0-beta-1")
      }

    }
  }
}
