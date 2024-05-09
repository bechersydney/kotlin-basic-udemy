package tutorials.kotlin.basics.becher

fun ifElse() {
    for (i in 1..100 step 2 ) {
        val pref = when (i) {
            1 -> "I am one"
            in 2..99 -> {
                println("I am in $i")
                "Kamtoe"
            }

            else -> "I am here"
        }
    }
    for (i in 1..10) {

        val prefix = if (i == 1) {
            "*"
        } else if (i !in 4..7) {
            "-"
        } else {
            print("-")
            ">"
        }

        println("$prefix $i")
    }

    val time = 2
    val greetings = if (time in 1..11) {
        "Good morning"
    } else if (time == 12) {
        "good afternoon"
    } else {
        "Good day!"
    }
    println(greetings)
}