import sorting.impl.BubbleSort

fun main() {
    val array = arrayOf(5, 2, 9, 1, 5, 6)
    val bubbleSort = BubbleSort()
    println(bubbleSort(array).asList())
}