package tutorials.kotlin.basics.becher

fun main() {
    ranges()
}

fun ranges() {
    for (i in 1..10) println(".. $i") // inclusive includes start and ends

    for (i in 1 until 10) println("until $i") // exclusive, disregard last value

    for (i in 10L downTo 1) println("downTo $i") // -- this is also inclusive

    for (i in 'a'..'z' step 2) println("step $i") // with patterns
}