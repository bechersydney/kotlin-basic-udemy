package tutorials.classes.kotlin.becher

abstract class Shape(var name: String) {
    constructor(name: String , vararg dimens: Double): this(name)
    init {
        println("The name is $name")
    }
    fun isParent():Boolean = true
    open fun changeName(newName: String){
        name = newName
    }
    abstract fun getPerimeter():Int
    abstract  fun getArea(): Int
}