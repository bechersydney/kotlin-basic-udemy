package tutorials.kotlin.basics.becher

import java.lang.Exception

// Exception
// Custom Exception
class DivideByZeroException : Exception("divisor cannot be zero")

fun tryCatch() {
//    println("Please Enter a number: ")
//    val input = try{
//        readln()?.toInt()
//    }catch (e: Exception) {
//        0
//    }finally {
//        println("Finally executed!")
//    }
//    println("Exception entered $input")
    val quotient = try {
        divide(3.0, 0.0)
    }catch (e: DivideByZeroException){
        0
    }
    println("Output is $quotient")
}

fun divide(a: Double, b: Double): Double {
    if(b == 0.0) throw DivideByZeroException()
    return a / b
}