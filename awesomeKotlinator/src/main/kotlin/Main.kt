/**
 * This comment works as a documentation comment
 * this will appear once you hover the mouse over
 * the function name
 */
fun main() {
    println("Hello, World!")

    // understanding how line comments works

    /*
    Understanding how multiple line
    comments works
     */

    /**
     * Mutable variable example -- var
     */
    var name = "Jhon"

    /**
     * Immutable variable example -- val
     */
    val lastName = "Doe"

    /**
     * string interpolation
     */
    println("Hello, $name $lastName")
    println("Double: ${Double.MAX_VALUE}")

    helloWorld()
    helloWorldOneliner()
    println(sum(1, 2))
    println(sumOneliner(1, 2))

    stringler()
}

/**
 * Understanding Functions in Kotlin
 */

/**
 * This function has no return, which is the same as
 * the return type Unit
 */
fun helloWorld() {
    println("Hello World.")
}

/**
 * This function has a return of the sum of two params
 * of the type Int, so the function type is Int
 */
fun sum(a: Int, b: Int): Int {
    return a + b
}

/**
 * This is a single line function, or commonly called oneliner function
 */
fun sumOneliner(a: Int, b: Int) = (a + b)

fun helloWorldOneliner() = println("Hello World.")

/**
 * Using functions from the String class that gives you the
 * power to modify strings as you need
 */
fun stringler() {
    val myString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit"
    println("The length of the variable myString is: ${myString.length}")
    println("The string starts with Lorem: ${myString.startsWith("Lorem")}")
    println("The string starts with L: ${myString.startsWith('L')}")
    println("The string ends with Lorem: ${myString.endsWith("Lorem")}")
    println("The string ends with L: ${myString.endsWith('L')}")
    println(
        "The substring created starting from the [2] index position and ending on the [4] index position is: ${
            myString.substring(
                2,
                4
            )
        }"
    )
    println("The string with the Lorem replaced to Truck is: ${myString.replace("Lorem", "Truck")}")
    print("The string as lower case is: ${myString.lowercase()}")
    print("\nThe string as upper case is: ${myString.uppercase()}")
    print("\nThe trimmed string is: ${"                      with spaces at the start $myString".trim()}")
}
