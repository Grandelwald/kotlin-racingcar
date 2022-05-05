package study

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class StringCalculatorTest {
    @Test
    fun `덧셈`(){
        val stringCalculator = StringCalculator()
        assertThat(stringCalculator.calculate("4 + 2")).isEqualTo(6)
    }

    @Test
    fun `뺄셈`(){
        val stringCalculator = StringCalculator()
        assertThat(stringCalculator.calculate("4 - 2")).isEqualTo(2)
    }

    @Test
    fun `나눗셈`(){
        val stringCalculator = StringCalculator()
        assertThat(stringCalculator.calculate("4 / 2")).isEqualTo(2)
    }

    @Test
    fun `곱셈`(){
        val stringCalculator = StringCalculator()
        assertThat(stringCalculator.calculate("4 * 2")).isEqualTo(8)

    }

    @Test
    fun `입력값이 null 또는 빈 공백문자인 경우`(){
        val stringCalculator = StringCalculator()
        //assertThat(stringCalculator)
        //assertThat(stringCalculator.calculate(null))
    }

    @Test
    fun `사칙얀산기호가 아닌 경우`(){
        val stringCalculator = StringCalculator()
        //assertThat(stringCalculator.calculation("4 ^ 2")).is
    }

    @Test
    fun `사칙연산을 모두 포함하는 기능`(){
        val stringCalculator = StringCalculator()
        assertThat(stringCalculator.calculate( "2 + 3 * 4 / 2")).isEqualTo(10)
    }
}