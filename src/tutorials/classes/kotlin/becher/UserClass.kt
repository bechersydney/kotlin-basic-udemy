package tutorials.classes.kotlin.becher

// classes
class UserClass(name: String = "No Name", var age: Int) {
    init {
        print("New user created. Age: $age,")
    }

    val name: String

    init {
        if (name.isBlank()) {
            this.name = "No Name"
        } else {
            this.name = name.trim()
        }

        println(" Name: ${this.name}")
    }
}