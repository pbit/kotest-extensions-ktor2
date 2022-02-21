enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")


rootProject.name = "kotest-extensions-ktor2"


include("kotest-assertions-ktor2-http")
include("kotest-assertions-ktor2-client")


include("samples:sample-client")
include("samples:sample-server")

