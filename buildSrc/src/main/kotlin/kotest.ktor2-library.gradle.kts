plugins {
  kotlin("multiplatform")
  //id("io.kotest.multiplatform")
}

group = "io.kotest.extensions.ktor2"
version = Ci.version

repositories {
  mavenCentral()
}


java {
  toolchain {
    languageVersion.set(JavaLanguageVersion.of(8))
  }
}


kotlin {
  jvm { }
  js(IR) {
    browser()
    nodejs()
  }
  linuxX64 {}
}


tasks.withType<Test> {
  useJUnitPlatform()
}
