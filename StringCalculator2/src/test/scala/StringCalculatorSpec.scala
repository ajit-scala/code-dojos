import java.lang.Exception

import com.example.StringCalculator
import org.scalatest._

class StringCalculatorSpec extends WordSpec with Matchers with ShouldMatchers{
  "String calculator" should {

    "return 0 for the String " in {
      StringCalculator.add("") shouldBe 0
    }

    "return 1 for the String 1" in {
      StringCalculator.add("1") shouldBe 1
    }

    "return 3 for the String 1,2" in {
      StringCalculator.add("1,2") shouldBe 3
    }

    "return 4 for the String 1,3" in {
      StringCalculator.add("1,3") shouldBe 4
    }
    "return 6 for the String 1\\n2,3" in {
      StringCalculator.add("1\n2,3") shouldBe 6
    }

   "Throws exception for the String 1,\\n" in {
      intercept[IllegalArgumentException] {
        StringCalculator.add("1,\n")
      }
    }

    "Throws exception for the String 1,\\n2" in {
      intercept[IllegalArgumentException] {
        StringCalculator.add("1,\n2")
      }
    }

    "Throws exception for the String 1,\\n," in {
      intercept[IllegalArgumentException] {
        StringCalculator.add("1,\n,")
      }
    }
  }
}
