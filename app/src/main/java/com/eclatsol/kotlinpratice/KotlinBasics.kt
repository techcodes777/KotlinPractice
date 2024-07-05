package com.eclatsol.kotlinpratice




class KotlinBasics {

    companion object {

        @JvmStatic
        fun main(args : Array<String>) {
            //This is primitive datatype
            Int
            Long
            Float
            Double
            Boolean
            Char
            Byte
            Short
            //This is Non-Primitive DataType
            //String
            //Enum
            //Array
            //ArrayList

            var name = ""
            var name1 : String = "Male" //Non - nullable datatype che //Question mark nathi
            var names : String? = null//Datatype ni agal Question mark lagavi dav to nullable type kahvay che


            names = "Krishna"
            name = "Jemis"

            println("Hello World! $name Second Name ${names!!.length}")


            val nam = names?.let {
                println()
                it.length
                "Good Morning"
            }
            println("The name is $nam")

            val car = Car(12)
            car.name = "BMW"
            car.price = 120000000
            println("Your car name is ${car.name}")
            println("Your car price is ${car.price}")

            val myClass = MyClass(15)
        }
    }
}


class Car(private val carNo : Int){

    init {
        println("Hello World $carNo")
    }

    var name  : String = ""
    var price : Int = 0
}

class MyClass(val chaisNum: Int) : BrandCar(chaisNum){

    init {
       println("Car manufaturing no $carManufacturing")
       println("The gear is " + super.gear(115))
        println("Accelator with " + super.accelator(15))
        println("Stop car" + super.breaks())
        println("Accelator with " + super.accelator(15))
    }
}

open class BrandCar(val chaisNo : Int) {

    var carManufacturing = 10000
    init {
        println("Chasisno is  $chaisNo")
    }

    fun gear(stage : Int) : String{
        println("Car is first gear $stage")
        return "Your car is best"
    }

    fun accelator(speed : Int) : String{
        println("Press the accelator" + speed + "km/hr speed")
        return "Car is very fast"
    }

    fun breaks() : String{
        println("Car is stop")
        return "ThankYou"
    }
}
