plugins {
  id("kotest.ktor2-library")
}




kotlin {
  sourceSets {
    commonMain {
      dependencies {
        implementation(libs.kotest.assertions.core)
        implementation(libs.ktor.http)
      }
    }
    commonTest {
      dependencies {
        implementation(libs.kotest.framework.engine)
        implementation(libs.kotest.property)
      }
    }
    jvmTest {
      dependencies {
        implementation(libs.kotest.runner.junit5)
      }
    }
  }
}
