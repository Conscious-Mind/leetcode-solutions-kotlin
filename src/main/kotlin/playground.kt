fun main() {

    println(charWithCount("aaabbcdd"))

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


//Write a program to compress the given string by using the below rules,
//i) Replace all the consecutive occurrence of a character with that character followed by
//count.
//ii) If the consecutive occurrence not found, then use the character alone.(if the character
//present only once, then don't include the count)
//Examples:
//Input: aaabbcdd
//Output: a3b2cd2
//Input: xyyyzzzabb
//Output: xy3z3ab2