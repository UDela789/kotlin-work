// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here
    "Size of 1 is working"{
        median(listOf(1.0f)) shouldBe 1.0
    }

    "Size of 2 is working"{
        median(listOf(1.0f, 2.0f)) shouldBe 1.5
    }

    "Size of 3 is working"{
        median(listOf(1.0f, 2.0f, 1.0f)) shouldBe 1.0
    }

    "Size of 4 is working"{
        median(listOf(1.0f, 2.0f, 5.0f, 7.5f)) shouldBe 3.5
    }
})
