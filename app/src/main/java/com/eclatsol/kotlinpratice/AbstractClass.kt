package com.eclatsol.kotlinpratice



fun main(){

    var company = Company()
    println("${company.productName}")
    println("${company.product(5)}")
    println("${company.product(5,15)}")
    println("${company.data(15,5)}")
}

class Company : AbstractClass(),Add,Data{
    override var productName: String = "Modi"

    override fun product(a: Int): Int {
        return a*a
    }

    override fun product(a: Int, b: Int): Int {
        println("Hello ")
        return a + b
    }

    override fun data(a: Int, b: Int): Int {
        return super.data(a, b)
    }

}
abstract class AbstractClass {

    var name = ""

    fun  add(a: Int,b:Int) : Int{
        return a+ b
    }

    abstract var productName : String

    abstract fun product(a : Int) : Int

}

interface Add{
    fun product(a : Int, b : Int) : Int
}

interface Data{
    fun data(a : Int,b : Int) : Int{
        return a - b //Default Definition pan api shako
    }
}