fun countXO(str: String): Boolean {
    val strLowered = str.lowercase()

    var i = 0
    var countX = 0
    var countO = 0

    while (i < strLowered.length) {
        if (strLowered[i] == 'x') {
            countX++
        } else if (strLowered[i] == 'o') {
            countO++
        }
        i++
    }
    return countO == countX && countO != 0
}

fun main() {
    println(countXO("xxoo"))
    println(countXO("xxooo"))
    println(countXO("aa"))
}