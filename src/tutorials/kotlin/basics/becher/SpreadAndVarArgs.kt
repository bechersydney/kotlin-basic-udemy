package tutorials.kotlin.basics.becher

// spread and varargs
fun spreadVarArgs(a: Int, vararg numbers: Int, b: Int): Int {
    var sum = a + b

    for (number in numbers) sum += number

    return sum
}

fun spreadVarArgs1(first: Int, vararg remaining: Int): Int {
    var max = first

    for (i in remaining) {
        if (i > max) max = i
    }

    return max
}