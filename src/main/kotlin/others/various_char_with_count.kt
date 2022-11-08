package others

fun main() {

    val input = "aaabbcdd"

    println(charWithCount(input))

}

private fun charWithCount(string: String): String {
    val sb = StringBuilder()
    var number = 1
    for (i in string.indices) {
        if (  i+1 < string.length && string[i] == string[i + 1]) {
            number++
        } else if (number > 1) {
            sb.append(string[i - 1])
            sb.append(number)
            number = 1
        } else {
            sb.append(string[i])
        }
    }
    return sb.toString()
}
