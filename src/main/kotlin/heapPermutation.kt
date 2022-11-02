import java.util.Collections.swap

fun main() {
    val start = System.currentTimeMillis()
    val a = listOf(1, 2, 3, 4)
    val b = a.perumtations()
    println(b.toString())
    println(b.size)
    println(System.currentTimeMillis() - start)
}


fun <V> List<V>.perumtations(): List<List<V>> {
    val returnVal: MutableList<List<V>> = mutableListOf()

     tailrec fun generate(k: Int, list: List<V>) {
        if (k == 1) {
            returnVal.add(list.toList())
        } else {
            for (i in 0 until k) {
                generate(k - 1, list)
                if (k % 2 == 0) {
                    swap(list, i, k - 1)
                } else {
                    swap(list, 0, k-1)
                }
            }
        }
    }

    generate(this.count(), this.toList())
    return returnVal
}