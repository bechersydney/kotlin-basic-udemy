package tutorials.kotlin.basics.becher

import tutorials.classes.kotlin.becher.Circle
import tutorials.classes.kotlin.becher.Rectangle
import tutorials.classes.kotlin.becher.Shape
import tutorials.classes.kotlin.becher.UserClass

fun main(args: Array<String>) {
        val name = "Sydney Becher"
    println("Hello $name!")
    val exampleNumber = 1200000.00
    println(exampleNumber.toInt())
//    println(sum(1, 2))
    val c = 3
    val d = 9
    println("sum of a and b = ${c + d}")
    println(d.minus(3))
    ifElse()
    funcParams("sydney")
    defaultNamedParams(
        message = "Hello",
        name = "Sydney"
    )
    val user5 = UserClass(name = "Kamote", age = 24)
    // spread and varargs and name params
    val array = intArrayOf(1, 2, 3, 4, 5, 6)

    println(spreadVarArgs(10, 20, *array, 20, 30, b = 40))

    // classes
    val user1 = UserClass("   Hans   ", 30)
    val user2 = UserClass("  Elfriede   ", 60)
    val user3 = UserClass(age = 60)
    val user4 = UserClass("    ", 20)
    println("Please enter your age:")
    val uInput = readln()
    if (uInput.isNullOrEmpty()) return
    val age = uInput.toInt()
    val message = when(age) {
        in 1..20 -> "You are a boy"
        in 21..60 -> "You are men enough"
        100, 101 -> "You are extra ordinary"
        else -> "You are Legend!"
    }
    println(message)
    val arr = arrayOf("hello", "guys", "how", "are you?")
    for (i in 1..<arr.size) {
        println("${arr[i]} -> with index $i")
    }
    println(arr.joinToString())
    var x = 5
    while (x != 0) {
        println("$x count")
        x--
    }
    for (i in 1..10 step 2) {
        println(i)
    }
    val mayArr = arrayOf(1, 2, 3)
    println(mayArr.max() )
    var tt = 0
    for (i in mayArr) {
        tt += i
    }
    println(tt)
    // get average
    var average = 0.0
    for(i in 1..5) {
        val userInput = readln().toInt()
       average += (userInput / 5.0)
    }
    println("$average")
    println("Please enter your country?")
    val usInput = readln()
    var greet = when(usInput) {
        "Philippines" -> "Mabuhay"
        "USA" -> "long live"
        "India" -> "Mekus mekus na yan"
        else -> "Tanga ka!"
    }
    println(greet)

    var sampleList = mutableListOf(1,2,3,4,5)
    println(sampleList.reversed())

    println("Please input a number to check if it is prime:")
    val userInput = readln()?.toInt()
    val isPrime = if (userInput != null && userInput.isPrime()) {
        "prime"
    } else {
        "even"
    }
    println("$userInput is $isPrime")

    val myArr = listOf(1,2,3,4,5,6)
    println(myArr.getProduct())

//     inheritance and overloading
    val rectangle = Rectangle(width = 20, height = 30)
    println(rectangle.isSquare())
    println(rectangle.getPerimeter())
    println(rectangle.getArea())

    val rectangle2 = Rectangle(2, 2.1)
    rectangle2.getPerimeter()
//    val circle = Circle(3.0)
//    println(circle.getPerimeter())
//    println(circle.getArea())
    // singleton function and object (companion and object)
    val circle = Circle.createRandomCircle()
    println("Companion function ${circle.getPerimeter()}")
    // anonymous functions
    // we have to do this because this is abstract
    val a = 3.0;
    val b = 4.0;
    val height = 2.0
    val parallelogram = object : Shape("Parallelogram", a, b, height) {
        init {
            println("$name is created")
        }
        override fun getPerimeter(): Int = a.times(b).times(height).toInt()
        override fun getArea(): Int = (a.times(b).times(height)).times(2).toInt()
    }
    println("The parallelogram perimeter is ${parallelogram.getPerimeter()}")
    println("The parallelogram area is ${parallelogram.getArea()}")
    // Exception

    tryCatch()
    println(divide(5.0, 1.0))
    lambDa(){
        println("The callback is $it")
    }

    var listInt = listOf(1,2,3,4,5)
    listInt = listInt.customFilter { it > 3 }
    println(listInt)

    val circle1 = Circle(1.0)
    val circle2 = Circle(10.0)
    val rect = Rectangle(23)
    val rect1 = Rectangle(12.0)
    val listOfShape = listOf(circle, circle1, circle2, rect, rect1)
    val transformedList = listOfShape.customFilter{shape -> shape.getArea() > 2}

    var intList = (1..10).toList()
    val sum = intList.getOddSum { it % 2 == 1 }
    println(sum)
    for(shape in transformedList){
        println(shape.name)
    }

    // Custom Generic
    var customGeneric = CustomGeneric<String ,Int ,Shape, Shape>("Hello", 1, circle, rect1)
    customGeneric.printTypes()

    // to check instance of object
    // instanceOf equivalent in java is `is` and `!is`
    val someShapeObject: Any = parallelogram
    if (someShapeObject is Shape) {
//        val newShape = someShapeObject as Shape
        println(someShapeObject.name)
        println("Shape ${someShapeObject.name}")
        println("Shape \${someShapeObject.name}")
        println("Shape $${someShapeObject.name}")
    }
}

fun helloWorld() {
    println("Hello world!")
}

fun typeAliasGetShapeList() : ShapeList {
    return listOf()
}