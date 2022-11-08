class Person(yearOfBirth: String, name: String){
    /**
     * This is an attribute of this class
     */
    var document: String? = null

    /**
     * This is a secondary constructor for this class
     */
    constructor(yearOfBirth: String, name: String, document: String): this(yearOfBirth, name){
        this.document = document
    }

    /**
     * These are methods of this class
     */
    fun sleep(){}
    fun wakeUp(){}
}

fun main(){
    // definition of class = defines methods and attributes
    // a class also does the instance of objects
    var person: Person = Person("2000", "Jhon Doe", "1231565767")

    person.sleep()
    person.wakeUp()
    person.document
}