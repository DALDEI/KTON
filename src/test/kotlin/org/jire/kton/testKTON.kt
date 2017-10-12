package org.jire.kton
import kotlin.test.assertEquals
import org.junit.Test
import io.kotlintest.specs.*
import io.kotlintest.*
import io.kotlintest.matchers.shouldBe


// test cases in init block
class Test1 : StringSpec() {
  init {
    "kton.array.basic" {
      val array = kton {
        "this" to "that"
        "root"  {
          "child"[
              { "1" to 1; "2" to 2 }
              ]
        }
      }
      println(array.get("this"))
      println(array("root")["child"])
      println(array("root").get("child")!!::class.qualifiedName )

    }

  }
}

// test cases in lambda expression
class MyTests : StringSpec({
   "kton.trivial" {
     val k = kton {
       "trival" to  0
     }
     println(k["trivial"])
     //k["trivial"] shouldBe 0
   }
})
