import sorting.impl.SelectionSort

fun main() {
    val array = arrayOf(5, 2, 3, 1)

    val selectionSort = SelectionSort()
    println(selectionSort(array).asList())
}