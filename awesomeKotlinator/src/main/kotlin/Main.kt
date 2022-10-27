import kotlin.math.*

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
    mathematicnator()

    theMightyIf()
    theMightyIfElse(15)
    theMightyIfElse(19)
    println(greetingsWarior(true))
    println(greetingsWarior(false))
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

/**
 * This function will be used to deep dive into math operations
 * in kotlin
 */
fun mathematicnator() {
    println("\nThe max value between 5 and 10 is: ${max(5, 10)}")
    println("The min value between 5 and 10 is: ${min(5, 10)}")
    println("The square root of 45.67 is: ${sqrt(45.67f)}")
    println("The value of PI is: $PI")
    println("The value of E is: $E")
    println("The round value of 21344.897045239078585 is: ${round(21344.897045239078585)}")
}

/**
 * Understanding Logical Operators in Kotlin
 */

/**
 * The logical exclusion based in boolean conditions
 * AKA if
 */
fun theMightyIf() {
    val num = 30
    if (num > 20) {
        println("The the condition num > 20 is: ${num > 20}")
    }
}

/**
 * The logical exclusion based in boolean conditions
 * comparing a true and a false scenario
 * AKA if else
 */
fun theMightyIfElse(number: Int) {
    if (number > 18) {
        println("The the condition number > 18 using the value number = $number is: ${number > 18}")
    } else {
        println("The the condition number > 18 using the value number = $number is: ${number > 18}")
    }
}

/**
 * Using the if to directly return a content to
 * the caller of the function
 */
fun greetingsWarior(day: Boolean) = if (day) {
    "Morning!"
} else {
    "Evening!"
}