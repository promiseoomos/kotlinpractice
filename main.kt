fun addition(a: Int, b:Int): Int{
    return a + b
}

fun main(){
    println("Hello First Program")

    // var Promise = Person()

    var cat = "African Civet Cat"
    
    println("Cat is ${cat}")
    cat = "Primary Saharan Cat"

    println("Cat is ${cat}")

    var additive = addition(4,8)

    println("The Sum of 4 and 8 is ${additive}")

    var rectangle = Rectangle(4.0, 7.0)

    println("The Perimeter of the Rectangle is ${rectangle.Perimeter()}")
    println("The Area of the Rectangle is ${rectangle.Area()}")
}

class Shapes{
    var type : String = ""
    var category : String = ""
}

class Rectangle(var height: Double, var width: Double){

    fun Perimeter(): Double{
        return (height + width) * 2
    }

    fun Area() : Double{
        return height * width
    }
}