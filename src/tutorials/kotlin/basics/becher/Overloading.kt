package tutorials.kotlin.basics.becher

fun funOverload(a: Int, b: Int) = if (a >  b) a else b

fun funOverload(a: Double, b: Double) = if (a > b) a else b

fun funOverload(a: Int, b: Int, c: Int) =
    when {
        a >= b && a >= c -> a
        b >= a && b >= c -> b
        else -> c
    }