package string

fun main() {

    val start = System.currentTimeMillis()
    val string1 = "egg"
    val string2 = "add"
    println(isIsomorphic(string1, string2))
    println((System.currentTimeMillis() - start))
}

//private fun isIsomorphic(s: String, t: String): Boolean {
//    if (s.length != t.length)
//        return false
//
//    val charMap1 = hashMapOf<Char, Int>()
//    var charMap1Length = 1
//    val charMap2 = hashMapOf<Char, Int>()
//    var charMap2Length = 1
//    val orderMap1 = hashMapOf<Int, Int>()
//    val orderMap2 = hashMapOf<Int, Int>()
//
//    for (i in s.indices) {
//        charMap1.putIfAbsent(s[i], charMap1Length++)
//        charMap2.putIfAbsent(t[i], charMap2Length++)
//        charMap1[s[i]]?.let { orderMap1.put(i, it) }
//        charMap2[t[i]]?.let { orderMap2.put(i, it) }
//    }
//
//    return orderMap1 == orderMap2
//}


/**
 * Using hashMap
 * for every index, puting the `s[index]`, `t[index]` in hashmp<Char, Char> if the key is not present.
 * If for an index the value of the key(`s[index]`) is not equal to value from t string(`t[index]`) return false.
 * Otherwise True.
 */
private fun isIsomorphic(s: String, t: String): Boolean {
    if (s.length != t.length)
        return false

    val map = hashMapOf<Char, Char>()

    for (i in s.indices) {
        if (map.containsKey(s[i]) || map.containsValue(t[i])) {
            if (map[s[i]] != t[i]) {
                return false
            }
        } else {
            map[s[i]] = t[i]
        }
    }
    return true
}
