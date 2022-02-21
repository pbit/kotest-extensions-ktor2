package io.kotest.extensions.ktor2.sample.server

import io.ktor.server.application.Application
import io.ktor.server.routing.routing


fun main(args: Array<String>) = io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
  routing {
    registerBasicRoutes()
  }
}
