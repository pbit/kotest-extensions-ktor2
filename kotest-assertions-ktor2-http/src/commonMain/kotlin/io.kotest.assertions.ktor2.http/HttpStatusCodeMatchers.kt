package io.kotest.assertions.ktor2.http

import io.kotest.matchers.Matcher
import io.kotest.matchers.MatcherResult
import io.kotest.matchers.should
import io.kotest.matchers.shouldNot
import io.ktor.http.HttpStatusCode

infix fun HttpStatusCode.shouldHaveValue(value: Int) = this should haveStatusCodeValue(value)
infix fun HttpStatusCode.shouldNotHaveValue(value: Int) = this shouldNot haveStatusCodeValue(value)

infix fun HttpStatusCode.shouldHaveDescription(description: String) = this should haveStatusCodeDescription(description)
infix fun HttpStatusCode.shouldNotHaveDescription(description: String) = this shouldNot haveStatusCodeDescription(description)


fun haveStatusCodeValue(expected: Int) = object : Matcher<HttpStatusCode> {
  override fun test(value: HttpStatusCode): MatcherResult {
    return MatcherResult(
        value.value == expected,
        { "StatusCode should have value $expected but had value ${value.value}." },
        { "StatusCode should not have value $expected." }
    )
  }
}

fun haveStatusCodeDescription(expected: String) = object : Matcher<HttpStatusCode> {
  override fun test(value: HttpStatusCode): MatcherResult {
    return MatcherResult(
        value.description == expected,
        { "StatusCode should have description $expected but had description ${value.description}." },
        { "StatusCode should not have description $expected." }
    )
  }
}
