package tutorials.kotlin.basics.becher

// function extension

//fun List<Shape>.customFilter(func: (Shape, String)-> Boolean): List<Shape>{
//    val shapeList = mutableListOf<Shape>()
//    for(shape in this) {
//        if(func(shape, shape.name)){
//            shapeList.add(shape)
//        }
//    }
//    return shapeList
//}

// generic equivalent on top
fun <T> List<T>.customFilter(func: (T)->Boolean):List<T> {
    var resultList = mutableListOf<T>()
    for(item in this) {
        if(func(item)){
            resultList.add(item)
        }
    }
    return resultList
}

fun List<Int>.getOddSum(func: (Int) -> Boolean): Int {
    var sum = 0
    for(i in this) {
        if(func(i)){
            sum +=  i
        }
    }
    return sum
}
fun List<Int>.getProduct(): Int {
    var product = this[0]
    for (i in 1..<this.size) {
        product *= this[i]
    }
    return product
}
// same functionality of .filter
//fun List<Int>.customFilter(customFilterFunction: (Int)-> (Boolean)): List<Int> {
//    val resultList = mutableListOf<Int>()
//    for(i in this) {
//        if(customFilterFunction(i)){
//            resultList.add(i)
//        }
//    }
//    return resultList
//}

fun Int.isPrime(): Boolean {
    for (i in 2..<this) {
        if (this % i == 0) {
            return false
        }
    }
    return true
}