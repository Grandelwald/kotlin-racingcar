package study.stringCalculator

class StringCalculator {

    fun calculate(mathExpression: String): Int {
        val stringList = mathExpression.checkEmptyOrNull().split(" ")
        val numberList = stringList.filterIndexed { index, _ -> index % 2 == 0 }.map { it.toInt() }
        val operatorList = stringList.filterIndexed { index, _ -> index % 2 != 0 }.toList()

        val numberListToOperate = numberList.drop(1)
        val pairList = operatorList.zip(numberListToOperate).map { (operator, number) -> Pair(operator, number) }

        return calculateEveryPair(pairList, numberList[0])
    }

    private fun String.checkEmptyOrNull(): String {
        require(!this.isNullOrBlank()) { "입력값이 null 이거나 빈 공백 문자일 경우" }
        return this
    }

    private fun calculateEveryPair(pairList: List<Pair<String, Int>>, initValue: Int): Int {

        return pairList.fold(initValue) { acc, pair ->
            val operator = Operator.reverseMap(pair.first) ?: throw IllegalArgumentException("사칙연산 기호가 아닙니다“")
            operator.work(acc, pair.second)
        }
    }
}
