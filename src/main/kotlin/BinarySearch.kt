object BinarySearch {

    fun search(list: List<Int>, target: Int): Int {
        return binarySearch(list, target, 0, list.size - 1)
    }

    private tailrec fun binarySearch(list: List<Int>, target: Int, left: Int, right: Int): Int {
        if (left > right) {
            return -1
        }
        val mid = (left + right) / 2
        return when {
            target == list[mid] -> mid
            target < list[mid] -> binarySearch(list, target, left, mid - 1)
            else -> binarySearch(list, target, mid + 1, right)
        }
    }
}