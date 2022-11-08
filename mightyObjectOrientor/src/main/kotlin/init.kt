class Animal(var type: String) {
    var sound: String = ""

    /**
     * This will be executed every time the class is created
     *
     * you can have more than one init block, but remember
     * they are executed in sequence
     */
    init {
        println("Hello there")
    }

    init {
        sound = when (type) {
            "Dog" -> {
                "Wof"
            }

            "Cat" -> {
                "Meow"
            }

            else -> {
                "..."
            }
        }
    }

    fun speaks(): String {
        return this.sound
    }
}

fun main() {
    println("this animal sound is: ${Animal("Dog").speaks()}")
}