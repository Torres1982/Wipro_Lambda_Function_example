fun main(args: Array<String>) {
	val listOfNumbers: List<Int> = listOf(1, 2, 4, 5, 6, 7, 9, 14, 15, 18, 25, 34, 45, 58)

    println(listOfNumbers.filter({number: Int -> number % 2 == 0 }))
}
