package tutorials.kotlin.basics.becher

fun doWhileLoop() {
    var i = 0

    outer@ do {
        println(i)
        i++
        //continue

        var j = 0

        while (j < 5) {
            println("---$j")
            j++
            break@outer //break the outer loop as well
            println("I'm not printed")
        }

        println("I'm printed")

    } while (i < 5)

    var number = 8

}