package tutorials.kotlin.basics.becher



fun arrays() {
    val names = arrayOf("sydn", "bech", "kato", "tets")
    for (i in names.indices) {
        println("index $i : element: ${names[i]}")
    }
    // get the last element
    println(names.last())
    // get size
    println(names.size)

    //for (name in names) println(name)


    names[0] = "Jeremy"
    println("Number of elements: ${names.size}")
    println("First element: ${names[0]}")
    println("Last element: ${names[2]}")
}
