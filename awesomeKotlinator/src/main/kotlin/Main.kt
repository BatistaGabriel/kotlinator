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
