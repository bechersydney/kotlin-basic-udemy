package tutorials.kotlin.basics.becher

fun operators() {
    println("2 > 1 is ${2 > 1}")
    println("2 < 1 is ${2 < 1}")
    println("1 >= 1 is ${1 >= 1}")

    println("1 == 1 is ${1 == 1}")
    println("1 == 2 is ${1 == 2}")
    println("1 != 2 is ${1 != 2}")

    println("!(2 > 1) is ${!(2 > 1)}")

    println("true && false = ${true && false}")
    println("true || false = ${true || false}")

    // `or` and `and` and `xor` is used to evaluate all expression even the first is meet/true already

    val condition = (2 > 1) or (3 > 2) or (2 > 3)
    println(condition)
}