fun main() {

}

//part 1 class and inheritance
open class Employee(name: String, age: Int) {
    private var name: String = name;
    private var age: Int = age;
    protected var salary: Double = 0.0;
}

class WebDeveloper(name: String, age: Int, website: String) : Employee(name, age) {
    private fun website(){

    }

}

class AndroidDeveloper(name: String, age: Int, android: String) : Employee(name, age) {
    private fun android(){

    }
}

class IOSDeveloper(name: String, age: Int, iOSApp: String) : Employee(name, age) {
    private fun iOsApp(){
    }
}



//part 2 interface to interface inheritance

interface Dimensions {
    val length : Double
    val breadth : Double
}

interface CalculateParameters : Dimensions {
    fun area()
    fun perimeter()
}

class XYZ : CalculateParameters {
    override val length : Double
        get() = 10.0
    override val breadth : Double
        get()= 15.0

    override fun area()
    {
        println("Area is ${length * breadth}")
    }

    override fun perimeter()
    {
        println("Perimeter is ${2*(length+breadth)}")
    }
}


