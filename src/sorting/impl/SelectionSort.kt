package sorting.impl

import sorting.sort.SortAlgo

class SelectionSort : SortAlgo {

    override fun invoke(array: Array<Int>): Array<Int> {
        val size = array.size
        for (i in 0..<size) {
            var minIndex = i
            for (j in i + 1..<size) {
                if (array[j] < array[minIndex]) {
                    minIndex = j
                }
            }
            val temp = array[minIndex]
            array[minIndex] = array[i]
            array[i] = temp
        }
        return array
    }
}
