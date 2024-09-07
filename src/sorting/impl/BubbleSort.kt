package sorting.impl

import sorting.sort.SortAlgo

/***
 *   Bubble Sort is a simple comparison-based sorting algorithm where adjacent
 *   elements are compared, and if they are in the wrong order, they are swapped.
 *   The process repeats until the array is sorted.
 */
class BubbleSort : SortAlgo {

    override fun invoke(array: Array<Int>): Array<Int> {
        val size = array.size
        for (i in 0..<size - 1) {
            for (j in 0..<size - 1) {
                if (array[j] > array[j + 1]) {
                    val temp = array[j]
                    array[j] = array[j + 1]
                    array[j + 1] = temp
                }
            }
        }
        return array
    }
}