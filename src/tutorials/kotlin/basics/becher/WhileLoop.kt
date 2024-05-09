package tutorials.kotlin.basics.becher

fun whileLoop(name: String, reps: Int) {
    var repsLeft = reps

    while (repsLeft > 0) {
        println("Hello, $name! Nice to meet you!")
        repsLeft--
    }
}