package io.kotest.extensions.ktor2.sample.server

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.Routing
import io.ktor.server.routing.get

fun Routing.registerBasicRoutes() {

  get("/status-code") {
    call.respond(HttpStatusCode.OK)
  }

}
