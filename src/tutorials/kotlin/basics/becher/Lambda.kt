package tutorials.kotlin.basics.becher

// lambda (mostly used in callback and array methods(map, filter))
fun lambDa(callback: (Int)-> Unit) {
    var list = (1..20).toList()
    list.map {
        println(it)
    }
    callback(list[0])
}