package io.chrisdavenport.jstest

import munit.CatsEffectSuite
import cats.effect._

class MainSpec extends CatsEffectSuite {

  test("Main should exit succesfully") {
    assertEquals(true, true)
  }

}
