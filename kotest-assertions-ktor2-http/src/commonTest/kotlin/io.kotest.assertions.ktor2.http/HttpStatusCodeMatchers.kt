package io.kotest.assertions.ktor2.http

import io.kotest.core.spec.style.StringSpec
import io.kotest.property.Exhaustive
import io.kotest.property.checkAll
import io.kotest.property.exhaustive.collection
import io.ktor.http.HttpStatusCode

class HttpStatusCodeMatchers : StringSpec({

  "shouldHaveValue" {
    checkAll(Exhaustive.collection(HttpStatusCode.allStatusCodes)) { code ->
      code shouldHaveValue code.value
    }
  }

  "shouldNotHaveStatusValue" {
    checkAll(Exhaustive.collection(HttpStatusCode.allStatusCodes)) { code ->
      code shouldNotHaveValue -1
    }
  }

  "shouldHaveDescription" {
    checkAll(Exhaustive.collection(HttpStatusCode.allStatusCodes)) { code ->
      code shouldHaveDescription code.description
    }
  }

  "shouldNotHaveDescription" {
    checkAll(Exhaustive.collection(HttpStatusCode.allStatusCodes)) { code ->
      code shouldNotHaveDescription "test"
    }
  }


})
