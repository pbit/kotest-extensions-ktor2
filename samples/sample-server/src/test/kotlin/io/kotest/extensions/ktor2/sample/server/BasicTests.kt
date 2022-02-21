package io.kotest.extensions.ktor2.sample.server

import io.kotest.assertions.assertSoftly
import io.kotest.assertions.ktor2.client.shouldHaveStatus
import io.kotest.assertions.ktor2.client.shouldNotHaveStatus
import io.kotest.assertions.ktor2.http.shouldHaveDescription
import io.kotest.assertions.ktor2.http.shouldHaveValue
import io.kotest.assertions.ktor2.http.shouldNotHaveDescription
import io.kotest.assertions.ktor2.http.shouldNotHaveValue
import io.kotest.core.spec.style.StringSpec
import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse
import io.ktor.http.HttpStatusCode
import io.ktor.server.testing.testApplication

class BasicTests : StringSpec({


  "test status of HttpStatusCode" {
    testApplication {
      val response: HttpResponse = client.get("/status-code")
      assertSoftly {

        response.status shouldHaveValue 200
        response.status shouldNotHaveValue 404

        response.status shouldHaveDescription "OK"
        response.status shouldNotHaveDescription "NotFound"
      }
    }
  }
  "test status of HttpResponse" {
    testApplication {
      val response: HttpResponse = client.get("/status-code")

      assertSoftly {
        response shouldHaveStatus 200
        response shouldNotHaveStatus 404

        response shouldHaveStatus HttpStatusCode.OK
        response shouldNotHaveStatus HttpStatusCode.NotFound

        response shouldHaveStatus { OK }
        response shouldNotHaveStatus { NotFound }
      }
    }
  }


})
