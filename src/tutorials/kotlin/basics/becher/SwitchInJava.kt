package tutorials.kotlin.basics.becher

fun switchInJava() {
    val time = 14
    val isSunday = true
    val greeting = when (time) {
        1 -> "I'm gonna stay in bed all day!"
        5 -> "Why up so early?"
        in 1..11 -> "Good morning!"
        12 -> "Time for lunch!"
        13, 14 -> {
            println("Yawn...")
            "Time for a nap!"
        }

        else -> "Good day!"
    }

//    val greeting = when {
//        isSunday -> "I'm gonna stay in bed all day!"
//        time < 5 -> "Why up so early?"
//        time in 0..11 -> "Good morning!"
//        time == 12 -> "Time for lunch!"
//        time == 13 || time == 14 -> {
//            println("Yawn...")
//            "Time for a nap!"
//        }
//        else -> "Good day!"
//    }

    println(greeting)
}
fun gradeRatingConversion(rating: String): Int {
    val ratingEquivalent = when (rating) {
        "A" -> 99
        "B" -> {
            println("You are almost there")
            return 95
        }

        else -> 65
    }
    return ratingEquivalent
}