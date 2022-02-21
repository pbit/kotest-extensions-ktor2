package io.kotest.assertions.ktor2.client

import io.kotest.assertions.ktor2.http.haveStatusCodeValue
import io.kotest.matchers.should
import io.kotest.matchers.shouldNot
import io.ktor.client.statement.HttpResponse
import io.ktor.http.HttpStatusCode


infix fun HttpResponse.shouldHaveStatus(statusCode: HttpStatusCode.Companion.() -> HttpStatusCode) = status should haveStatusCodeValue(HttpStatusCode.Companion.run(statusCode).value)
infix fun HttpResponse.shouldNotHaveStatus(statusCode: HttpStatusCode.Companion.() -> HttpStatusCode) = status shouldNot haveStatusCodeValue(HttpStatusCode.Companion.run(statusCode).value)

infix fun HttpResponse.shouldHaveStatus(statusCode: HttpStatusCode) = status should haveStatusCodeValue(statusCode.value)
infix fun HttpResponse.shouldNotHaveStatus(statusCode: HttpStatusCode) = status shouldNot haveStatusCodeValue(statusCode.value)

infix fun HttpResponse.shouldHaveStatus(statusCode: Int) = status should haveStatusCodeValue(statusCode)
infix fun HttpResponse.shouldNotHaveStatus(statusCode: Int) = status shouldNot haveStatusCodeValue(statusCode)

