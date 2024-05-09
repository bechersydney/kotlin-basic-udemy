package tutorials.kotlin.basics.becher

fun main() {
    defaultNamedParams("kamote")
}
// default and named parameter
fun defaultNamedParams(message: String, name: String = "User", reps: Int = 1) {
    for (i in 0 until reps) println("Hello, $name! $message")
}