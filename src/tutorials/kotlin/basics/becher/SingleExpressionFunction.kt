package tutorials.kotlin.basics.becher

// single expression function, this is like in javascript
// const double = (num) => num * 2
fun singleExp(num: Int) = num * 2
// is equivalent to
fun singleExpEquivalent(num: Int): Int {
    return num * 2
}
fun isPrimeNumber(a: Int) = a % 2 == 0
fun doubleANumber(a: Int): Int = a * 2
